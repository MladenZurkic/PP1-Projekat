// generated with ast extension for cup
// version 0.8
// 30/11/2022 15:43:20


package rs.ac.bg.etf.pp1.ast;

public class ErrorDesignatorStmtSEMI extends DesignatorStatement {

    public ErrorDesignatorStmtSEMI () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ErrorDesignatorStmtSEMI(\n");

        buffer.append(tab);
        buffer.append(") [ErrorDesignatorStmtSEMI]");
        return buffer.toString();
    }
}