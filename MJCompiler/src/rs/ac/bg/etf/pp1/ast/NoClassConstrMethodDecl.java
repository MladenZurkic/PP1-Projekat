// generated with ast extension for cup
// version 0.8
// 29/0/2023 22:36:58


package rs.ac.bg.etf.pp1.ast;

public class NoClassConstrMethodDecl extends ClassConstrMethodDecl {

    public NoClassConstrMethodDecl () {
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
        buffer.append("NoClassConstrMethodDecl(\n");

        buffer.append(tab);
        buffer.append(") [NoClassConstrMethodDecl]");
        return buffer.toString();
    }
}
