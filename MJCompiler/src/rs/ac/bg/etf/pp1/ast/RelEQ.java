// generated with ast extension for cup
// version 0.8
// 14/0/2023 23:29:56


package rs.ac.bg.etf.pp1.ast;

public class RelEQ extends RelOp {

    public RelEQ () {
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
        buffer.append("RelEQ(\n");

        buffer.append(tab);
        buffer.append(") [RelEQ]");
        return buffer.toString();
    }
}
