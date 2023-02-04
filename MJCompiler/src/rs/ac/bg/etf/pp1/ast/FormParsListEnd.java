// generated with ast extension for cup
// version 0.8
// 4/1/2023 3:12:38


package rs.ac.bg.etf.pp1.ast;

public class FormParsListEnd extends FormPars {

    private FormParsEnd FormParsEnd;

    public FormParsListEnd (FormParsEnd FormParsEnd) {
        this.FormParsEnd=FormParsEnd;
        if(FormParsEnd!=null) FormParsEnd.setParent(this);
    }

    public FormParsEnd getFormParsEnd() {
        return FormParsEnd;
    }

    public void setFormParsEnd(FormParsEnd FormParsEnd) {
        this.FormParsEnd=FormParsEnd;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormParsEnd!=null) FormParsEnd.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormParsEnd!=null) FormParsEnd.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormParsEnd!=null) FormParsEnd.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParsListEnd(\n");

        if(FormParsEnd!=null)
            buffer.append(FormParsEnd.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParsListEnd]");
        return buffer.toString();
    }
}
