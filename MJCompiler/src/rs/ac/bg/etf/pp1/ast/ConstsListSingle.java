// generated with ast extension for cup
// version 0.8
// 30/11/2022 15:43:20


package rs.ac.bg.etf.pp1.ast;

public class ConstsListSingle extends ConstsList {

    private ConstsListElem ConstsListElem;

    public ConstsListSingle (ConstsListElem ConstsListElem) {
        this.ConstsListElem=ConstsListElem;
        if(ConstsListElem!=null) ConstsListElem.setParent(this);
    }

    public ConstsListElem getConstsListElem() {
        return ConstsListElem;
    }

    public void setConstsListElem(ConstsListElem ConstsListElem) {
        this.ConstsListElem=ConstsListElem;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstsListElem!=null) ConstsListElem.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstsListElem!=null) ConstsListElem.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstsListElem!=null) ConstsListElem.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstsListSingle(\n");

        if(ConstsListElem!=null)
            buffer.append(ConstsListElem.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstsListSingle]");
        return buffer.toString();
    }
}
