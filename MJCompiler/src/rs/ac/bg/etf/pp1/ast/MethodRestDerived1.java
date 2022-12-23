// generated with ast extension for cup
// version 0.8
// 23/11/2022 15:42:6


package rs.ac.bg.etf.pp1.ast;

public class MethodRestDerived1 extends MethodRest {

    private ConstMethodSecondPart ConstMethodSecondPart;
    private MethodRest MethodRest;

    public MethodRestDerived1 (ConstMethodSecondPart ConstMethodSecondPart, MethodRest MethodRest) {
        this.ConstMethodSecondPart=ConstMethodSecondPart;
        if(ConstMethodSecondPart!=null) ConstMethodSecondPart.setParent(this);
        this.MethodRest=MethodRest;
        if(MethodRest!=null) MethodRest.setParent(this);
    }

    public ConstMethodSecondPart getConstMethodSecondPart() {
        return ConstMethodSecondPart;
    }

    public void setConstMethodSecondPart(ConstMethodSecondPart ConstMethodSecondPart) {
        this.ConstMethodSecondPart=ConstMethodSecondPart;
    }

    public MethodRest getMethodRest() {
        return MethodRest;
    }

    public void setMethodRest(MethodRest MethodRest) {
        this.MethodRest=MethodRest;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstMethodSecondPart!=null) ConstMethodSecondPart.accept(visitor);
        if(MethodRest!=null) MethodRest.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstMethodSecondPart!=null) ConstMethodSecondPart.traverseTopDown(visitor);
        if(MethodRest!=null) MethodRest.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstMethodSecondPart!=null) ConstMethodSecondPart.traverseBottomUp(visitor);
        if(MethodRest!=null) MethodRest.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodRestDerived1(\n");

        if(ConstMethodSecondPart!=null)
            buffer.append(ConstMethodSecondPart.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodRest!=null)
            buffer.append(MethodRest.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodRestDerived1]");
        return buffer.toString();
    }
}