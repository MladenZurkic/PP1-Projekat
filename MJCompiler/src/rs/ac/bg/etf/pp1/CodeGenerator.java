package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.MethodDecl;
import rs.ac.bg.etf.pp1.ast.MethodTypeName;
import rs.ac.bg.etf.pp1.ast.PrintStmt;
import rs.ac.bg.etf.pp1.ast.SyntaxNode;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;
import rs.etf.pp1.mj.runtime.Code;

public class CodeGenerator extends VisitorAdaptor {

	
	private int mainPc;
	
	public int getMainPc() {
		return mainPc;
	}
	
	public void visit(PrintStmt print) {
		//add?
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
}






