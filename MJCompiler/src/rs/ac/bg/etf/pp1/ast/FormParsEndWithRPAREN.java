// generated with ast extension for cup
// version 0.8
// 5/1/2023 16:35:35


package rs.ac.bg.etf.pp1.ast;

public class FormParsEndWithRPAREN extends FormParsEnd {

    private FormParsIdent FormParsIdent;

    public FormParsEndWithRPAREN (FormParsIdent FormParsIdent) {
        this.FormParsIdent=FormParsIdent;
        if(FormParsIdent!=null) FormParsIdent.setParent(this);
    }

    public FormParsIdent getFormParsIdent() {
        return FormParsIdent;
    }

    public void setFormParsIdent(FormParsIdent FormParsIdent) {
        this.FormParsIdent=FormParsIdent;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormParsIdent!=null) FormParsIdent.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormParsIdent!=null) FormParsIdent.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormParsIdent!=null) FormParsIdent.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParsEndWithRPAREN(\n");

        if(FormParsIdent!=null)
            buffer.append(FormParsIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParsEndWithRPAREN]");
        return buffer.toString();
    }
}
