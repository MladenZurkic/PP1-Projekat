// generated with ast extension for cup
// version 0.8
// 7/1/2023 17:3:27


package rs.ac.bg.etf.pp1.ast;

public class BoolConst extends Consts {

    private Boolean bool;

    public BoolConst (Boolean bool) {
        this.bool=bool;
    }

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool=bool;
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
        buffer.append("BoolConst(\n");

        buffer.append(" "+tab+bool);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BoolConst]");
        return buffer.toString();
    }
}
