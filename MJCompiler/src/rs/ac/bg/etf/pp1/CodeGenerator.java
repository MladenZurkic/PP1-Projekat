package rs.ac.bg.etf.pp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CodeGenerator extends VisitorAdaptor {

	
	private int mainPc;
	
	List<Obj> designatorsForArrayAssign = new ArrayList<Obj>();
	Obj NoDesignator = new Obj(Obj.Var, "noDesignator", new Struct(Struct.None));
	
	public int getMainPc() {
		return mainPc;
	}
	
	
	public void visit(MethodTypeName methodTypeName) {
		if("main".equalsIgnoreCase(methodTypeName.getMethName())) {
			mainPc = Code.pc;
		}
		methodTypeName.obj.setAdr(Code.pc);
		
		//Dohvatanje argumenta i lokalnih varijabli
		SyntaxNode methodNode =  methodTypeName.getParent();
		
		VarCounter varCnt = new VarCounter();
		methodNode.traverseTopDown(varCnt);
		
		FormParamCounter fpCnt = new FormParamCounter();
		methodNode.traverseTopDown(fpCnt);
		
		// Generate the entry
		
		Code.put(Code.enter);
		Code.put(fpCnt.getCount());
		Code.put(varCnt.getCount()+fpCnt.getCount());
		
	}
	
	public void visit(MethodDecl methodDecl) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	public void visit(PrintStmtNoNum print) {
		if(print.getExpr().struct == ExTab.charType) {
			Code.loadConst(1);
			Code.put(Code.bprint);
		}
		else if(print.getExpr().struct == ExTab.boolType) {
			Code.loadConst(5);
			Code.put(Code.print);
		}
		else {
			Code.loadConst(5);
			Code.put(Code.print);
		}
	}
	
	public void visit(PrintStmtWithNum print) {
		Code.loadConst(print.getN1());
		
		if(print.getExpr().struct == ExTab.charType) {
			Code.put(Code.bprint);
		}
		else if(print.getExpr().struct == ExTab.boolType) {
			Code.put(Code.print);
		}
		else {
			Code.put(Code.print);
		}
	}
	
	public void visit(ReadStmt readStmt) {
		if(readStmt.getDesignator().obj.getType() == ExTab.charType) {
			Code.put(Code.bread);
		}
		else {
			Code.put(Code.read);
		}
		
		Code.store(readStmt.getDesignator().obj);
	}
	
	public void visit(ReturnExpr returnExpr) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}

	public void visit(ReturnNoExpr returnNoExpr) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	

	//Bottom up way
	//MulOp - EDIT to TermMulFactor - Better way?
	
	public void visit(TermMulFactor mul) {
		if(mul.getMulOp() instanceof MulMUL) {
			Code.put(Code.mul);
		}
		else if(mul.getMulOp() instanceof MulDIV) {
			Code.put(Code.div);
		}
		else {
			//MOD
			Code.put(Code.rem);
		}
	}

	//AddOp - EDIT To EXPR - Better ag?
	
	public void visit(ExprPlusTerm addOp) {
		if(addOp.getAddOp() instanceof AddMINUS) {
			Code.put(Code.sub);
		}
		else {
			Code.put(Code.add);
		}
	}

	public void visit(ExprMinusTerm negativ) {
		Code.put(Code.neg);
	}
	
	
	//FACTOR deo 
	
	public void visit(FactorDesignator fd) {
		Code.load(fd.getDesignator().obj);
	}
	
	public void visit(FactorDesignatorWithParen funcCall) {
		Obj designator = funcCall.getDesignatorForActPars().obj;
		String functionName = designator.getName();
		
		
		if(functionName == "ord" ) {
			return;
		}
		else if(functionName == "chr") {
			return;
		}
		else if(functionName == "len") {
			Code.put(Code.arraylength);
			return;
		}
		
		//Offset - koliko se pomeramo od trenutnog mesta da dodjemo do fje
		
		int offset = designator.getAdr() - Code.pc;
		Code.put(Code.call);
		Code.put2(offset);
		
	}
	
	public void visit(FactorNumber fn) {
		Obj constant = ExTab.insert(Obj.Con, "$", ExTab.intType);
		constant.setAdr(fn.getNum());
		constant.setLevel(0);
		
		Code.load(constant);
	}
	
	public void visit(FactorChar fc) {
		Obj charConst = ExTab.insert(Obj.Con, "$", ExTab.charType);
		charConst.setAdr(fc.getCharConst());
		charConst.setLevel(0);
		
		Code.load(charConst);
	}
	
	public void visit(FactorBool fb) {
		Obj boolConst = ExTab.insert(Obj.Con, "$", ExTab.boolType);
		
		if(fb.getBool() == true) {
			boolConst.setAdr(1);
		}
		else {
			boolConst.setAdr(0);
		}
		boolConst.setLevel(0);
		
		Code.load(boolConst);
	}
	
	public void visit(FactorNewExpr newArray) {
		
		Code.put(Code.newarray);
		if(newArray.getType().struct == ExTab.charType) {
			Code.put(0);
		}
		else {
			Code.put(1);
		}
	}
	
	//Factor end
	
	//DESIGNATOR STATEMENT START --------------------------------------------------------------
	
	
	public void visit(DesignatorStmtOptAssign assign) {
		Code.store(assign.getDesignator().obj); // assign treba da se odradi pa se radi store
	}
	
	public void visit(DesignatorStmtActPars funcMethCallDesStmt) {
		
		Obj designator = funcMethCallDesStmt.getDesignatorForActPars().getDesignator().obj;
		String functionName = designator.getName();
		
		if(functionName == "ord") {
			return;
		}
		else if(functionName == "chr") {
			return;
		}
		else if(functionName == "len") {
			Code.put(Code.arraylength);
			return;
		}
		
		int offset = designator.getAdr() - Code.pc;
		Code.put(Code.call);
		Code.put2(offset);
		
		//If method returns something pop it
		if(designator.getType() != ExTab.noType) Code.put(Code.pop);
	}
	
	
	//inc and dec
	
	public void visit(DesignatorStmtOptINC inc) {
		Obj designatorForInc = inc.getDesignator().obj;
		
		if(designatorForInc.getKind() == Obj.Var) {
			Code.load(designatorForInc);
		}
		else if(designatorForInc.getKind() == Obj.Elem) {
			Code.put(Code.dup2);
			Code.load(designatorForInc);
		}
		
		Code.loadConst(1);
		Code.put(Code.add);
		Code.store(designatorForInc);
	}
	
	public void visit(DesignatorStmtOptDEC dec) {
		Obj designatorForDec = dec.getDesignator().obj;
		
		if(designatorForDec.getKind() == Obj.Var) {
			Code.load(designatorForDec);
		}
		else if(designatorForDec.getKind() == Obj.Elem) {
			Code.put(Code.dup2);
			Code.load(designatorForDec);
		}
		
		Code.loadConst(1);
		Code.put(Code.sub);
		Code.store(designatorForDec);
	}
	
	//important!
	//Add after the assignment for array in []
	//idea on paper num 7.
	
	
	//Designator start
	
	//Array help
	
	public void visit(DesignatorArrayHelp arrayHelp) {
		Code.load(arrayHelp.getDesignator().obj);
	}
	
	/* not using, for level C
	public void visit(DesignatorDotIdent classField) {
		Code.load(classField.getDesignator().obj);
	}
	*/
	
	//also DesignatorIdent?
	
	//Designator FOR LIST!
	
	/*
	public void visit(DesignatorCommaListDef designatorCommaList) {
		
	}
	*/
	
	
	
	public void visit(DesignatorCommaListSingle singleOrFirstDesignator) {
		designatorsForArrayAssign.add(singleOrFirstDesignator.getDesignator().obj);
	}
	
	public void visit(NoDesignatorCommaList noDesignatorCommaList) {
		designatorsForArrayAssign.add(this.NoDesignator);
	}
	
	
	public void visit(DesignatorOpt designatorOpt) {
		designatorsForArrayAssign.add(designatorOpt.getDesignator().obj);
	}
	
	public void visit(NoDesignatorOpt noDesignatorOpt) {
		designatorsForArrayAssign.add(this.NoDesignator);
	}
	
	//important
	public void visit(DesignatorStmtAngleBrack arrayAssign) {
		int numOfItems = arrayAssign.obj.getLevel();

		Obj array = arrayAssign.getDesignator().obj;
		
		//testing
		//System.out.println("BROJ:" + numOfItems);
		//System.out.println("NIZ: " + array.getName());
		
		
		Code.loadConst(numOfItems);

		Code.load(array);
		Code.put(Code.arraylength);
		
		int jump = Code.pc + 1;
		
		Code.putFalseJump(Code.gt, 0);
		
		Code.put(Code.trap);
		Code.fixup(jump);
		
		//Collections.reverse(designatorsForArrayAssign);
		
		//PROBLEM WITH ARRAY ?
		//nizTmp[2], nizTmp[1], nizTmp[0]
		// stack example: 8 2 8 1 8 0 - addresses and index
		//nizTmp[0] gets first value, but it should be last?
		//reverse for?
		
		//Yes, mora reverse da ide
		for(int i = numOfItems - 1; i >= 0 ; i--) {
			if(designatorsForArrayAssign.get(i).getName() == "noDesignator") {
				continue;
			}
			Code.load(array);
			Code.loadConst(i);
			Code.put(Code.aload);
			Code.store(designatorsForArrayAssign.get(i));
		}
		
		designatorsForArrayAssign = new ArrayList<Obj>();
		
	}
	
}