// generated with ast extension for cup
// version 0.8
// 7/1/2023 17:51:1


package rs.ac.bg.etf.pp1.ast;

public class ElseStmtEpsilon extends ElseStatementOptional {

    public ElseStmtEpsilon () {
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
        buffer.append("ElseStmtEpsilon(\n");

        buffer.append(tab);
        buffer.append(") [ElseStmtEpsilon]");
        return buffer.toString();
    }
}
