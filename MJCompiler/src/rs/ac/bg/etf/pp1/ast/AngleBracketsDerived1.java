// generated with ast extension for cup
// version 0.8
// 23/11/2022 3:33:9


package rs.ac.bg.etf.pp1.ast;

public class AngleBracketsDerived1 extends AngleBrackets {

    public AngleBracketsDerived1 () {
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
        buffer.append("AngleBracketsDerived1(\n");

        buffer.append(tab);
        buffer.append(") [AngleBracketsDerived1]");
        return buffer.toString();
    }
}
