package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.FormParsListEnd;
import rs.ac.bg.etf.pp1.ast.FormParsWithList;
import rs.ac.bg.etf.pp1.ast.VarDecl;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

public class CounterVisitor extends VisitorAdaptor {

	protected int count;
	
	public int getCount() {
		return this.count;
	}
	
	public static class FormParamCounter extends CounterVisitor {
		
		public void visit(FormParsWithList formParsWithList) {
			count++;
		}
		public void visit(FormParsListEnd formParsListEnd) {
			count++;
		}
	}
	
	public static class VarCounter extends CounterVisitor {
		
		public void visit(VarDecl varDecl) {
			count++;
		}
	}
}
