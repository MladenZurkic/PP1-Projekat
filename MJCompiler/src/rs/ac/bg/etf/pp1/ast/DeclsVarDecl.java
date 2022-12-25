// generated with ast extension for cup
// version 0.8
// 25/11/2022 1:1:56


package rs.ac.bg.etf.pp1.ast;

public class DeclsVarDecl extends Decls {

    private VarDeclErrorPossible VarDeclErrorPossible;

    public DeclsVarDecl (VarDeclErrorPossible VarDeclErrorPossible) {
        this.VarDeclErrorPossible=VarDeclErrorPossible;
        if(VarDeclErrorPossible!=null) VarDeclErrorPossible.setParent(this);
    }

    public VarDeclErrorPossible getVarDeclErrorPossible() {
        return VarDeclErrorPossible;
    }

    public void setVarDeclErrorPossible(VarDeclErrorPossible VarDeclErrorPossible) {
        this.VarDeclErrorPossible=VarDeclErrorPossible;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclErrorPossible!=null) VarDeclErrorPossible.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclErrorPossible!=null) VarDeclErrorPossible.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclErrorPossible!=null) VarDeclErrorPossible.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DeclsVarDecl(\n");

        if(VarDeclErrorPossible!=null)
            buffer.append(VarDeclErrorPossible.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DeclsVarDecl]");
        return buffer.toString();
    }
}
