// generated with ast extension for cup
// version 0.8
// 7/1/2023 17:3:27


package rs.ac.bg.etf.pp1.ast;

public class ErrorVarDeclEnd extends VarDeclEnd {

    public ErrorVarDeclEnd () {
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
        buffer.append("ErrorVarDeclEnd(\n");

        buffer.append(tab);
        buffer.append(") [ErrorVarDeclEnd]");
        return buffer.toString();
    }
}
