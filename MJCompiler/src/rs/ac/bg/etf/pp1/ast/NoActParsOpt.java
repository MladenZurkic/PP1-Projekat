// generated with ast extension for cup
// version 0.8
// 5/1/2023 16:35:35


package rs.ac.bg.etf.pp1.ast;

public class NoActParsOpt extends ActParsOptional {

    public NoActParsOpt () {
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
        buffer.append("NoActParsOpt(\n");

        buffer.append(tab);
        buffer.append(") [NoActParsOpt]");
        return buffer.toString();
    }
}
