package rs.ac.bg.etf.pp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;


public class SemanticAnalyzer extends VisitorAdaptor {

	Logger log = Logger.getLogger(getClass());

	public void report_error(String message, SyntaxNode info) {
		errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.error(msg.toString());
	}

	public void report_info(String message, SyntaxNode info) {
		StringBuilder msg = new StringBuilder(message); 
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.info(msg.toString());
	}
	
	int printCallCount = 0;
	int localVarDeclCount = 0;
	boolean returnFound = false;
	boolean mainExists = false;
	Obj currentMethod = null;
	Obj currentType = null;
	boolean errorDetected = false;
	int currentConstValue = 0;
	boolean relOpClassArrayCompatible = false;
	boolean isConditionBool = true;
	int nVars;
	
	
	List<Expr> actPars = new ArrayList<Expr>();
	Obj designatorForActPars = null;
	
	boolean angleBrackets = false;
	int numOfActPars = 0;
	Obj currentClass = null;
	
    public boolean passed() {
    	return !errorDetected;
    }
    
    
    //LOCAL VARIABLE DECLARATION
	public void visit(VarDeclIdent localVar) {
		localVarDeclCount++;
		if(ExTab.currentScope.findSymbol(localVar.getIdent()) != null) {
    		report_error("Greska na " + localVar.getLine() + " :Ime localne promenljive " + localVar.getIdent() +
    				" je vec deklarisano u ovom opsegu - globalVar", null);
    	}
    	else {
    		if(!angleBrackets) {
    			if(currentClass == null)
    				ExTab.insert(Obj.Var, localVar.getIdent(), currentType.getType());
    			else
    				ExTab.insert(Obj.Fld, localVar.getIdent(), currentType.getType());
    		}
    		else {
    			if(currentClass == null)
    				ExTab.insert(Obj.Var, localVar.getIdent(), new Struct(Struct.Array, currentType.getType()));
    			else
    				ExTab.insert(Obj.Fld, localVar.getIdent(), new Struct(Struct.Array, currentType.getType()));
    		}
    	}
	}
	
    public void visit(PrintStmt print) {
		printCallCount++;
	}
    
    
    
    
    public void visit(ProgName progName) {
    	progName.obj = ExTab.insert(Obj.Prog, progName.getProgName(), ExTab.noType);
    	ExTab.openScope();
    }
    
    public void visit(Program program) {
    	nVars = Tab.currentScope.getnVars();
    	if(!mainExists)
    		report_error("Greska: main metoda ne postoji!", null);
    	ExTab.chainLocalSymbols(program.getProgName().obj);
    	ExTab.closeScope();
    }
    
    public void visit(Type type) {
    	currentType = ExTab.find(type.getTypeName());
    	if(currentType == ExTab.noObj) {
    		report_error("Nije pronadjen tip " + type.getTypeName() + " u tabeli simbola!", null);
    		type.struct = ExTab.noType;
    	}
    	else {
    		if(currentType.getKind() == Obj.Type) {
    			type.struct = currentType.getType();
    		}
    		else {
    			report_error("Greska: Ime " + type.getTypeName() + " ne predstavlja tip!", type);
    			type.struct = ExTab.noType;
    		}
    	}
    }
    
    public void visit(MethodTypeName methodTypeName) {
    	Obj existingMethod = ExTab.find(methodTypeName.getMethName());
    	
    	if(existingMethod != ExTab.noObj) {
    		report_error("Greska na " + methodTypeName.getLine() + ": Metoda sa imenom " +
    	methodTypeName.getMethName() + " je vec deklarisana", null);
    	}
    	else {
    		currentMethod = ExTab.insert(Obj.Meth, methodTypeName.getMethName(), methodTypeName.getTypeOrVoid().struct);
        	methodTypeName.obj = currentMethod;
        	if(methodTypeName.getMethName() == "main") {
        		mainExists = true;
        		if(methodTypeName.getTypeOrVoid().struct.getKind() != Struct.None)
        			report_error("Greska na " + methodTypeName.getLine() + ": main metoda mora imati povratnu vrednost void!", null);
        	}
    	}
    	ExTab.openScope();
    	
    	if(currentClass != null) {
    		ExTab.insert(Obj.Var, "this", currentClass.getType());
    	}
    	
    	report_info("Obradjuje se funkcija " + methodTypeName.getMethName(), methodTypeName);
    }
    
    
    public void visit(MethodDecl methodDecl) {
    	if(!returnFound && currentMethod.getType() != ExTab.noType) {
			report_error("Semanticka greska na liniji " + methodDecl.getLine() + 
					": funkcija " + currentMethod.getName() + " nema return iskaz!", null);
    	}
    	ExTab.chainLocalSymbols(currentMethod);
    	ExTab.closeScope();
    	
    	returnFound = false;
    	currentMethod = null;
    }
    
    public void visit(ReturnExpr returnExpr) {
    	returnFound = true;
    	if(currentMethod == null) {
    		report_error("Greska na liniji" + returnExpr.getLine() + "Return moze da se pozove samo iz metode!", null);
    	}
    	else {
    		if(!currentMethod.getType().compatibleWith(returnExpr.getExpr().struct)) {
    			report_error("Greska na liniji " + returnExpr.getLine() + " : " + 
    					"tip izraza u return naredbi ne slaze se sa tipom povratne vrednosti funkcije " + 
    					currentMethod.getName(), null);
    		}
    	}
    }
    
    public void visit(ReturnNoExpr returnNoExpr) {
    	returnFound = true;
    	if(currentMethod == null) {
    		report_error("Greska na liniji" + returnNoExpr.getLine() + "Return moze da se pozove samo iz metode!", null);
    	}
    	else {
    		if(currentMethod.getType() != ExTab.noType) {
    			report_error("Greska na liniji " + returnNoExpr.getLine() + " : " + 
    					"metoda nije void a return naredba nema izraz koji je potreban ", null);
    		}
    	}
    }
    
    public void visit(ClassDeclName classDeclName) {
    	Obj existingClass = ExTab.find(classDeclName.getClassName());
    	if (existingClass != ExTab.noObj) {
    		report_error("Greska na liniji " + classDeclName.getLine() + 
    				" klasa sa imenom " + classDeclName.getClassName() + " je vec deklarisana!", null);
    		currentClass = existingClass;
    	}
    	else {
    		currentClass = ExTab.insert(Obj.Type, classDeclName.getClassName() , ExTab.nullType);
    		classDeclName.obj = currentClass;
    	}
    	ExTab.openScope();
    	
    }
    
    public void visit(ClassDecl classDecl) {
    	ExTab.chainLocalSymbols(currentClass.getType());
    	//currentClass.getType().setMembers(ExTab.currentScope.getLocals());
    	ExTab.closeScope();
    	currentClass = null;
    	/*provera neka?*/
    }
    
    
    public void visit(TypeOrVoidVoid ToVVoid) {
    	ToVVoid.struct = ExTab.noType;
    	currentType = new Obj(Obj.Type, "void", Tab.noType);
    }
    
    public void visit(TypeOrVoidType ToVType) {
    	ToVType.struct = ToVType.getType().struct;
    }

    
    
    public void visit(FactorNumber fn) {
    	fn.struct = ExTab.intType;
    	currentConstValue = fn.getNum();
    }
    
    public void visit(FactorChar fc) {
    	fc.struct = ExTab.charType;
    	currentConstValue = (int) fc.getCharConst();
    }
    
    public void visit(FactorBool fb) {
    	fb.struct = ExTab.boolType;
    	if(fb.getBool())
    		currentConstValue = 1;
    	else
    		currentConstValue = 0;
    }
    
    public void visit(TermFactor tr) {
    	tr.struct = tr.getFactor().struct;
    }
    
    public void visit(TermMulFactor termMulFactor) {
    	Struct termStruct = termMulFactor.getTerm().struct;
    	Struct factorStruct = termMulFactor.getFactor().struct;
    	if(termStruct == factorStruct && termStruct == ExTab.intType) {
    		termMulFactor.struct = termStruct;
    	}
    	else {
    		report_error("Greska na " + termMulFactor.getLine() + " : Moguce je mnozenje/deljenje/moduo samo int tipova! - termMulFactor", null);
    		termMulFactor.struct = ExTab.noType;
    	}
    	
    }
    
    public void visit(ExprTerm exprTerm) {
    	exprTerm.struct = exprTerm.getTerm().struct;
    }
    	
    public void visit(ExprMinusTerm exprMinusTerm) {
    	if(exprMinusTerm.getTerm().struct != ExTab.intType) {
    		report_error("Greska na " + exprMinusTerm.getLine() + " :Samo int tip moze biti negativan - exprMinus", null);
    	}
    	else {
    		exprMinusTerm.struct = exprMinusTerm.getTerm().struct;
    	}
    }
    
    public void visit(ExprPlusTerm exprPlusTerm) {
    	Struct exprStruct = exprPlusTerm.getExpr().struct;
    	Struct termStruct = exprPlusTerm.getTerm().struct;
    	if(exprStruct == termStruct && termStruct == ExTab.intType) {
    		exprPlusTerm.struct = termStruct;
    	}
    	else {
    		report_error("Greska na " + exprPlusTerm.getLine() + " : Moguce je sabirati/oduzimati samo tipove int! - exprPlusTerm", null);
    		exprPlusTerm.struct = ExTab.noType;
    	}
    }
    
    public void visit(CondFactExprRelOpExpr condFactComplete) {
    	Struct expr1Struct = condFactComplete.getExpr().struct;
    	Struct expr2Struct = condFactComplete.getExpr1().struct;
    	if(expr1Struct.compatibleWith(expr2Struct)) {
    		if(expr1Struct.getKind() == Struct.Class || expr1Struct.getKind() == Struct.Array ||
    				expr2Struct.getKind() == Struct.Class || expr2Struct.getKind() == Struct.Array) {
    			if(!relOpClassArrayCompatible) {
    				report_error("Greska na " + condFactComplete.getLine() + " : Kod klasa ili niza"
    						+ " moze se koristiti samo == ili != - CondFact", null);
    				isConditionBool = false;
    			}
    		}
    	}
    	else {
    		report_error("Greska na " + condFactComplete.getLine() + " : Izrazi moraju biti kompatibilni! - CondFact", null);
    	}
    }
    
    public void visit(CondFactExpr condFactExpr) {
    	if(condFactExpr.getExpr().struct.getKind() != Struct.Bool) {
    		report_error("Greska na " + condFactExpr.getLine() + " :Expr u uslovu mora biti bool tipa! - CondFact", null);
    		isConditionBool = false;
    	}
    }
    
    public void visit(RelEQ RelEQ) {
    	relOpClassArrayCompatible = true;
    }
    
    public void visit(RelNEQ RelNEQ) {
    	relOpClassArrayCompatible = true;
    }
    
    public void visit(RelGT RelGT) {
    	relOpClassArrayCompatible = false;
    }
    
    public void visit(RelGEQ RelGEQ) {
    	relOpClassArrayCompatible = false;
    }
    
    public void visit(RelLT RelLT) {
    	relOpClassArrayCompatible = false;
    }
    
    public void visit(RelLEQ RelLEQ) {
    	relOpClassArrayCompatible = false;
    }
    
    
    public void visit(NumberConst numberConst) {
    	numberConst.struct = ExTab.intType;
    	currentConstValue = numberConst.getNum();
    }
    
    public void visit(CharConst charConst) {
    	charConst.struct = ExTab.charType;
    	currentConstValue = charConst.getCharConst();
    }
    
    public void visit(BoolConst boolConst) {
    	boolConst.struct = ExTab.boolType;
    	if(boolConst.getBool())
    		currentConstValue = 1;
    	else
    		currentConstValue = 0;
    }
    
    public void visit(ConstsListElem constsListElem) {
    	if(ExTab.currentScope.findSymbol(constsListElem.getId()) != null) {
    		report_error("Greska na " + constsListElem.getLine() + " :Ime konstante " + constsListElem.getId() +
    				" je vec deklarisano u ovom opsegu - constsListElem", null);
    	}
    	else {
    		if(constsListElem.getConsts().struct != currentType.getType()) {
    			report_error("Greska na " + constsListElem.getLine() + " :Vrednost konstante ne odgovara" + 
    		"tipu - constsListElem", null);
    		}
    		else {
    			constsListElem.obj = ExTab.insert(Obj.Con, constsListElem.getId(), currentType.getType());
    			constsListElem.obj.setAdr(currentConstValue);
    		}
    	}
    }
    
    
    //GLOBAL VARIABLE DECLARATION
    public void visit(GlobalVarDeclIdent globalVar) {
    	if(ExTab.currentScope.findSymbol(globalVar.getIdent()) != null) {
    		report_error("Greska na " + globalVar.getLine() + " :Ime globalne promenljive " + globalVar.getIdent() +
    				" je vec deklarisano u ovom opsegu - globalVar", null);
    	}
    	else {
    		if(!angleBrackets) {
    			ExTab.insert(Obj.Var, globalVar.getIdent(), currentType.getType());
    		}
    		else {
    			ExTab.insert(Obj.Var, globalVar.getIdent(), new Struct(Struct.Array, currentType.getType()));
    		}
    	}
    }
    
    public void visit(AngleBrackets ag) {
    	angleBrackets = true;
    }
    
    public void visit(NoAngleBrackets nag) {
    	angleBrackets = false;
    }
    
    public void visit(ExtendsOptionalDef extendsDef) {
    	if(ExTab.find(extendsDef.getType().getTypeName()).getType().getKind() != Struct.Class) {
    		report_error("Greska - izvodi se iz nepostojece klase!", extendsDef);
    	}
    }
    
    public void visit(DesignatorIdent designatorIdent) {
    	Obj object = ExTab.find(designatorIdent.getIdent());
    	if(object == ExTab.noObj) {
    		report_error("Greska - Ime " + designatorIdent.getIdent() + " nije pronadjeno (nije definisano)", designatorIdent);
    	}
    	else {
    		if(object.getKind() == Obj.Var) {
    			if(object.getLevel() == 0)
    				report_info("Pronadjena globalna varijabla! - " + designatorIdent.getIdent(), designatorIdent);
    			else
    				report_info("Pronadjena lokalna varijabla! - " + designatorIdent.getIdent(), designatorIdent);
    		}
    		if(object.getKind() == Obj.Con) {
    			report_info("Pronadjena konstanta! - " + designatorIdent.getIdent(), designatorIdent);
    		}
    	}
    	designatorIdent.obj = object;
    }
    
    public void visit(DesignatorExpr designatorExpr) {
    	Obj designator = designatorExpr.getDesignator().obj;
    	designatorExpr.obj = designator;
    	if(designator == ExTab.noObj) {
    		report_error("Greska - Ime " + designator.getName() + " nije pronadjeno (nije definisano)", designatorExpr);
    	}
    	else {
    		if(designator.getType().getKind() != Struct.Array) {
        		report_error("Greska na "+designatorExpr.getLine()+" :"+designator.getName()+" mora biti niz"
        				+ " - designatorExpr" , null);
        	}
        	else {
        		if(designatorExpr.getExpr().struct != ExTab.intType) {
        			report_error("Greska na "+ designatorExpr.getLine() +" vrednost unutar [] mora biti int!"
            				+ " - designatorExpr" , null);
        		}
        		else {
        			report_info("Pristup elementu niza - " + designator.getName(), designatorExpr);
        			designatorExpr.obj = new Obj(Obj.Elem, "Elem - " + designator.getName(), designator.getType().getElemType());
        		}
        	}
    	}
    }
    
    public void visit(DesignatorDotIdent designatorDotIdent) {
    	Obj designator = designatorDotIdent.getDesignator().obj;
    	if(designator == ExTab.noObj) {
    		report_error("Greska - Ime " + designator.getName() + " nije pronadjeno (nije definisano)", designatorDotIdent);
    	}
    	else {
    		if(designator.getType().getKind() != Struct.Class) {
    			report_error("Greska na " + designatorDotIdent.getLine() + " : " + designator.getName()
    					+ " nije klasa!", null);
    		}
    		else {
    			boolean found = false;
    			Collection<Obj> fields = designator.getType().getMembers();
    			for(Obj field : fields) {
    				if(field.getName().equals(designatorDotIdent.getIdent())) {
    					found = true;
    					designatorDotIdent.obj = field;
    					break;
    				}	
    			}
    			if(!found) {
    				report_error("Greska na " + designatorDotIdent.getLine() + " : " + designatorDotIdent.getIdent()
					+ " ne postoji kao polje ili metoda klase!", null);
    				designatorDotIdent.obj = ExTab.noObj;
    			}
    			else {
    				//designatorDotIdent.obj = fields.find(designatorDotIdent.getIdent());
    			}
    		}
    	}
    }
    
    public void visit(FactorDesignator fd) {
    	fd.struct = fd.getDesignator().obj.getType();
    }
    
    public void visit(FactorExpr fe) {
    	fe.struct = fe.getExpr().struct;
    }
    
    /*edit! DA LI TREBA PROVERA FORMALNIH/STVARNIH PARAMETARA? edit:da*/ 
    public void visit(FactorDesignatorWithParen factorDesignatorWithParen) {
    	//Provera parametara posle!
    	designatorForActPars = factorDesignatorWithParen.getDesignator().obj;
    	
    	if(factorDesignatorWithParen.getDesignator().obj.getKind() != Obj.Meth) {
    		report_error("Greska - " + factorDesignatorWithParen.getDesignator().obj.getName() + 
    				" nije funkcija (metoda)", factorDesignatorWithParen);
    	}
    	else {
    		factorDesignatorWithParen.struct = factorDesignatorWithParen.getDesignator().obj.getType();
    	}
    }
    
    public void visit(FactorNewActPars factorNewActPars) {
    	if(factorNewActPars.getType().struct.getKind() != Struct.Class) {
    		report_error("Greska - tip mora biti klasni! - factorNewActPars", factorNewActPars);
    	}
    	else {
    		factorNewActPars.struct = factorNewActPars.getType().struct;
    	}
    }
    
    public void visit(FactorNewExpr factorNewExpr) {
    	if(factorNewExpr.getExpr().struct.getKind() != Struct.Int) {
    		report_error("Greska - tip mora biti int! - factorNewExpr", factorNewExpr);
    	}
    	else {
    		factorNewExpr.struct = new Struct(Struct.Array, factorNewExpr.getType().struct);
    	}
    }
    
    public void visit(NoActParsOpt noActPars) {
    	numOfActPars = 0;
    }
    
    public void visit(ActParsExprOnly actParsExprOnly) {
    	numOfActPars += 1;
    	actPars.add(actParsExprOnly.getExpr());
    }
    
    public void visit(ActParsExprList actParsExprList) {
    	numOfActPars += 1;
    	actPars.add(actParsExprList.getExpr());
    }
    
    public void visit(ActParsOpt actParsOpt) {
    	if(designatorForActPars.getLevel() != numOfActPars) {
    		report_error("Greska - Broj stvarnih i formalnih parametara nije isti! - actParsOpt", actParsOpt);
    	}
    	else {
    		Collection<Obj> formPars = designatorForActPars.getLocalSymbols();
    		int counter = 0;
    		for(Obj formPar : formPars) {
    			if(formPar.getType().getKind() != actPars.get(counter).struct.getKind()) {
    				report_error("Greska - Stvarni argument nije istog tipa kao formalni! - actParsOpt", actParsOpt);
    				break;
    			}
    			counter++;
    		}
    	}
    }
    
    //public void visit()
}
