// generated with ast extension for cup
// version 0.8
// 14/0/2023 23:29:56


package rs.ac.bg.etf.pp1.ast;

public class FormParsIdentNoBrackets extends FormParsIdent {

    private Type Type;
    private String formName;

    public FormParsIdentNoBrackets (Type Type, String formName) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.formName=formName;
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

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParsIdentNoBrackets(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+formName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParsIdentNoBrackets]");
        return buffer.toString();
    }
}
