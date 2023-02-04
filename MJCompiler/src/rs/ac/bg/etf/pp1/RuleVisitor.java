package rs.ac.bg.etf.pp1;
import org.apache.log4j.Logger;
import rs.ac.bg.etf.pp1.ast.*;

public class RuleVisitor extends VisitorAdaptor{

	int printCallCount = 0;
	int varDeclCount = 0;
	
	Logger log = Logger.getLogger(getClass());

	public void visit(VarDeclIdent vardeclident){
		varDeclCount++;
	}
	
    public void visit(PrintStmtNoNum print) {
		printCallCount++;
	}
    
    public void visit(PrintStmtWithNum print) {
		printCallCount++;
	}
	
}
