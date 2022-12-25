// generated with ast extension for cup
// version 0.8
// 25/11/2022 16:53:39


package rs.ac.bg.etf.pp1.ast;

public class FormParsIdent implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Type Type;
    private AngleBrackets AngleBrackets;

    public FormParsIdent (Type Type, AngleBrackets AngleBrackets) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.AngleBrackets=AngleBrackets;
        if(AngleBrackets!=null) AngleBrackets.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public AngleBrackets getAngleBrackets() {
        return AngleBrackets;
    }

    public void setAngleBrackets(AngleBrackets AngleBrackets) {
        this.AngleBrackets=AngleBrackets;
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
        if(AngleBrackets!=null) AngleBrackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(AngleBrackets!=null) AngleBrackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(AngleBrackets!=null) AngleBrackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParsIdent(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AngleBrackets!=null)
            buffer.append(AngleBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParsIdent]");
        return buffer.toString();
    }
}
