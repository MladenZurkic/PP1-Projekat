// generated with ast extension for cup
// version 0.8
// 25/11/2022 1:1:56


package rs.ac.bg.etf.pp1.ast;

public class NoAngleBrackets extends AngleBrackets {

    public NoAngleBrackets () {
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
        buffer.append("NoAngleBrackets(\n");

        buffer.append(tab);
        buffer.append(") [NoAngleBrackets]");
        return buffer.toString();
    }
}