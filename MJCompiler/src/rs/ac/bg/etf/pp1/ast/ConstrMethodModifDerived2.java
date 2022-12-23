// generated with ast extension for cup
// version 0.8
// 23/11/2022 3:33:9


package rs.ac.bg.etf.pp1.ast;

public class ConstrMethodModifDerived2 extends ConstrMethodModif {

    private MethodDeclModif MethodDeclModif;

    public ConstrMethodModifDerived2 (MethodDeclModif MethodDeclModif) {
        this.MethodDeclModif=MethodDeclModif;
        if(MethodDeclModif!=null) MethodDeclModif.setParent(this);
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
        if(MethodDeclModif!=null) MethodDeclModif.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodDeclModif!=null) MethodDeclModif.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodDeclModif!=null) MethodDeclModif.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstrMethodModifDerived2(\n");

        if(MethodDeclModif!=null)
            buffer.append(MethodDeclModif.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstrMethodModifDerived2]");
        return buffer.toString();
    }
}
