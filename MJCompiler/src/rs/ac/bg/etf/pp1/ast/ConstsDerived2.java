// generated with ast extension for cup
// version 0.8
// 23/11/2022 15:42:6


package rs.ac.bg.etf.pp1.ast;

public class ConstsDerived2 extends Consts {

    public ConstsDerived2 () {
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
        buffer.append("ConstsDerived2(\n");

        buffer.append(tab);
        buffer.append(") [ConstsDerived2]");
        return buffer.toString();
    }
}
