// generated with ast extension for cup
// version 0.8
// 5/1/2023 3:22:54


package rs.ac.bg.etf.pp1.ast;

public class NoDesignatorCommaList extends DesignatorCommaList {

    public NoDesignatorCommaList () {
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
        buffer.append("NoDesignatorCommaList(\n");

        buffer.append(tab);
        buffer.append(") [NoDesignatorCommaList]");
        return buffer.toString();
    }
}
