// generated with ast extension for cup
// version 0.8
// 23/11/2022 3:33:9


package rs.ac.bg.etf.pp1.ast;

public class ConstrMethodModifDerived1 extends ConstrMethodModif {

    private ConstrDeclModif ConstrDeclModif;
    private MethodDeclModif MethodDeclModif;

    public ConstrMethodModifDerived1 (ConstrDeclModif ConstrDeclModif, MethodDeclModif MethodDeclModif) {
        this.ConstrDeclModif=ConstrDeclModif;
        if(ConstrDeclModif!=null) ConstrDeclModif.setParent(this);
        this.MethodDeclModif=MethodDeclModif;
        if(MethodDeclModif!=null) MethodDeclModif.setParent(this);
    }

    public ConstrDeclModif getConstrDeclModif() {
        return ConstrDeclModif;
    }

    public void setConstrDeclModif(ConstrDeclModif ConstrDeclModif) {
        this.ConstrDeclModif=ConstrDeclModif;
    }

    public MethodDeclModif getMethodDeclModif() {
        return MethodDeclModif;
    }

    public void setMethodDeclModif(MethodDeclModif MethodDeclModif) {
        this.MethodDeclModif=MethodDeclModif;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstrDeclModif!=null) ConstrDeclModif.accept(visitor);
        if(MethodDeclModif!=null) MethodDeclModif.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstrDeclModif!=null) ConstrDeclModif.traverseTopDown(visitor);
        if(MethodDeclModif!=null) MethodDeclModif.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstrDeclModif!=null) ConstrDeclModif.traverseBottomUp(visitor);
        if(MethodDeclModif!=null) MethodDeclModif.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstrMethodModifDerived1(\n");

        if(ConstrDeclModif!=null)
            buffer.append(ConstrDeclModif.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDeclModif!=null)
            buffer.append(MethodDeclModif.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstrMethodModifDerived1]");
        return buffer.toString();
    }
}
