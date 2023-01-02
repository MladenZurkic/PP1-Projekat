// generated with ast extension for cup
// version 0.8
// 2/0/2023 22:54:39


package rs.ac.bg.etf.pp1.ast;

public class GlobalVarDeclIdent implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String ident;
    private AngleBrackets AngleBrackets;

    public GlobalVarDeclIdent (String ident, AngleBrackets AngleBrackets) {
        this.ident=ident;
        this.AngleBrackets=AngleBrackets;
        if(AngleBrackets!=null) AngleBrackets.setParent(this);
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident=ident;
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
        if(AngleBrackets!=null) AngleBrackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AngleBrackets!=null) AngleBrackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AngleBrackets!=null) AngleBrackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GlobalVarDeclIdent(\n");

        buffer.append(" "+tab+ident);
        buffer.append("\n");

        if(AngleBrackets!=null)
            buffer.append(AngleBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GlobalVarDeclIdent]");
        return buffer.toString();
    }
}
