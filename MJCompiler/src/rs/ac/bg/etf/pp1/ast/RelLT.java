// generated with ast extension for cup
// version 0.8
// 4/1/2023 3:12:38


package rs.ac.bg.etf.pp1.ast;

public class RelLT extends RelOp {

    public RelLT () {
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
        buffer.append("RelLT(\n");

        buffer.append(tab);
        buffer.append(") [RelLT]");
        return buffer.toString();
    }
}
