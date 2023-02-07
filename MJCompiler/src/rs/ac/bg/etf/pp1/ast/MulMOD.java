// generated with ast extension for cup
// version 0.8
// 7/1/2023 17:51:1


package rs.ac.bg.etf.pp1.ast;

public class MulMOD extends MulOp {

    public MulMOD () {
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
        buffer.append("MulMOD(\n");

        buffer.append(tab);
        buffer.append(") [MulMOD]");
        return buffer.toString();
    }
}
