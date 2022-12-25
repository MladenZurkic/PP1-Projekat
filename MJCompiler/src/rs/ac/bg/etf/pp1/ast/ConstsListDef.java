// generated with ast extension for cup
// version 0.8
// 25/11/2022 1:1:56


package rs.ac.bg.etf.pp1.ast;

public class ConstsListDef extends ConstsList {

    private ConstsList ConstsList;
    private ConstsListElem ConstsListElem;

    public ConstsListDef (ConstsList ConstsList, ConstsListElem ConstsListElem) {
        this.ConstsList=ConstsList;
        if(ConstsList!=null) ConstsList.setParent(this);
        this.ConstsListElem=ConstsListElem;
        if(ConstsListElem!=null) ConstsListElem.setParent(this);
    }

    public ConstsList getConstsList() {
        return ConstsList;
    }

    public void setConstsList(ConstsList ConstsList) {
        this.ConstsList=ConstsList;
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
        if(ConstsList!=null) ConstsList.accept(visitor);
        if(ConstsListElem!=null) ConstsListElem.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstsList!=null) ConstsList.traverseTopDown(visitor);
        if(ConstsListElem!=null) ConstsListElem.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstsList!=null) ConstsList.traverseBottomUp(visitor);
        if(ConstsListElem!=null) ConstsListElem.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstsListDef(\n");

        if(ConstsList!=null)
            buffer.append(ConstsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstsListElem!=null)
            buffer.append(ConstsListElem.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstsListDef]");
        return buffer.toString();
    }
}
