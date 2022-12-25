// generated with ast extension for cup
// version 0.8
// 25/11/2022 16:53:39


package rs.ac.bg.etf.pp1.ast;

public class VarDeclErrorPossible implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Type Type;
    private VarDeclListBasic VarDeclListBasic;

    public VarDeclErrorPossible (Type Type, VarDeclListBasic VarDeclListBasic) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.VarDeclListBasic=VarDeclListBasic;
        if(VarDeclListBasic!=null) VarDeclListBasic.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public VarDeclListBasic getVarDeclListBasic() {
        return VarDeclListBasic;
    }

    public void setVarDeclListBasic(VarDeclListBasic VarDeclListBasic) {
        this.VarDeclListBasic=VarDeclListBasic;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(VarDeclListBasic!=null) VarDeclListBasic.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(VarDeclListBasic!=null) VarDeclListBasic.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(VarDeclListBasic!=null) VarDeclListBasic.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclErrorPossible(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclListBasic!=null)
            buffer.append(VarDeclListBasic.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclErrorPossible]");
        return buffer.toString();
    }
}
