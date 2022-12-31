// generated with ast extension for cup
// version 0.8
// 31/11/2022 15:19:34


package rs.ac.bg.etf.pp1.ast;

public class FormParsIdent implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Type Type;
    private String formName;
    private AngleBrackets AngleBrackets;

    public FormParsIdent (Type Type, String formName, AngleBrackets AngleBrackets) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.formName=formName;
        this.AngleBrackets=AngleBrackets;
        if(AngleBrackets!=null) AngleBrackets.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName=formName;
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

        buffer.append(" "+tab+formName);
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
