// generated with ast extension for cup
// version 0.8
// 25/11/2022 16:53:39


package rs.ac.bg.etf.pp1.ast;

public class ConstrMethodBothConstrPart extends ConstrMethodBothOptional {

    private ConstMethodSecondPart ConstMethodSecondPart;
    private ConstrMethodBothOptional ConstrMethodBothOptional;

    public ConstrMethodBothConstrPart (ConstMethodSecondPart ConstMethodSecondPart, ConstrMethodBothOptional ConstrMethodBothOptional) {
        this.ConstMethodSecondPart=ConstMethodSecondPart;
        if(ConstMethodSecondPart!=null) ConstMethodSecondPart.setParent(this);
        this.ConstrMethodBothOptional=ConstrMethodBothOptional;
        if(ConstrMethodBothOptional!=null) ConstrMethodBothOptional.setParent(this);
    }

    public ConstMethodSecondPart getConstMethodSecondPart() {
        return ConstMethodSecondPart;
    }

    public void setConstMethodSecondPart(ConstMethodSecondPart ConstMethodSecondPart) {
        this.ConstMethodSecondPart=ConstMethodSecondPart;
    }

    public ConstrMethodBothOptional getConstrMethodBothOptional() {
        return ConstrMethodBothOptional;
    }

    public void setConstrMethodBothOptional(ConstrMethodBothOptional ConstrMethodBothOptional) {
        this.ConstrMethodBothOptional=ConstrMethodBothOptional;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstMethodSecondPart!=null) ConstMethodSecondPart.accept(visitor);
        if(ConstrMethodBothOptional!=null) ConstrMethodBothOptional.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstMethodSecondPart!=null) ConstMethodSecondPart.traverseTopDown(visitor);
        if(ConstrMethodBothOptional!=null) ConstrMethodBothOptional.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstMethodSecondPart!=null) ConstMethodSecondPart.traverseBottomUp(visitor);
        if(ConstrMethodBothOptional!=null) ConstrMethodBothOptional.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstrMethodBothConstrPart(\n");

        if(ConstMethodSecondPart!=null)
            buffer.append(ConstMethodSecondPart.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstrMethodBothOptional!=null)
            buffer.append(ConstrMethodBothOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstrMethodBothConstrPart]");
        return buffer.toString();
    }
}
