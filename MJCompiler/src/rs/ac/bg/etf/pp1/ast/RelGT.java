// generated with ast extension for cup
// version 0.8
// 5/0/2023 0:53:28


package rs.ac.bg.etf.pp1.ast;

public class RelGT extends RelOp {

    public RelGT () {
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
        buffer.append("RelGT(\n");

        buffer.append(tab);
        buffer.append(") [RelGT]");
        return buffer.toString();
    }
}
