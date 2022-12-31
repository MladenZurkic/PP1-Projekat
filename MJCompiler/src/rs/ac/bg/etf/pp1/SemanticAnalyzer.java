package rs.ac.bg.etf.pp1;

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
	int varDeclCount = 0;
	boolean returnFound = false;
	boolean mainExists = false;
	Obj currentMethod = null;
	boolean errorDetected = false;
	int nVars;
	
	Obj currentClass = null;
	
    public boolean passed() {
    	return !errorDetected;
    }
	
    public void visit(ProgName progName) {
    	ExTab.insert(Obj.Prog, progName.getProgName(), ExTab.noType);
    	ExTab.openScope();
    }
    
    public void visit(Program program) {
    	nVars = Tab.currentScope.getnVars();
    	ExTab.chainLocalSymbols(program.getProgName().obj);
    	ExTab.closeScope();
    }
    
    public void visit(Type type) {
    	Obj typeNode = ExTab.find(type.getTypeName());
    	if(typeNode == ExTab.noObj) {
    		report_error("Nije pronadjen tip " + type.getTypeName() + " u tabeli simbola!", null);
    		type.struct = ExTab.noType;
    	}
    	else {
    		if(typeNode.getKind() == Obj.Type) {
    			type.struct = typeNode.getType();
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
    
    
    
    
    
    
    
	public void visit(VarDeclIdent vardeclident) {
		varDeclCount++;
	}
	
    public void visit(PrintStmt print) {
		printCallCount++;
	}
    
    
    
    
}
