// generated with ast extension for cup
// version 0.8
// 23/11/2022 15:42:6


package rs.ac.bg.etf.pp1.ast;

public class ClassConstrMethodDeclDerived1 extends ClassConstrMethodDecl {

    private ConstrMethodBothOptional ConstrMethodBothOptional;

    public ClassConstrMethodDeclDerived1 (ConstrMethodBothOptional ConstrMethodBothOptional) {
        this.ConstrMethodBothOptional=ConstrMethodBothOptional;
        if(ConstrMethodBothOptional!=null) ConstrMethodBothOptional.setParent(this);
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
        if(ConstrMethodBothOptional!=null) ConstrMethodBothOptional.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstrMethodBothOptional!=null) ConstrMethodBothOptional.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstrMethodBothOptional!=null) ConstrMethodBothOptional.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassConstrMethodDeclDerived1(\n");

        if(ConstrMethodBothOptional!=null)
            buffer.append(ConstrMethodBothOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassConstrMethodDeclDerived1]");
        return buffer.toString();
    }
}
