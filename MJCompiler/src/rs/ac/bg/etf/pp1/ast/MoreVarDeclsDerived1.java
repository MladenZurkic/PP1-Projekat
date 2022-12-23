// generated with ast extension for cup
// version 0.8
// 23/11/2022 3:33:9


package rs.ac.bg.etf.pp1.ast;

public class MoreVarDeclsDerived1 extends MoreVarDecls {

    private MoreVarDecls MoreVarDecls;
    private AngleBrackets AngleBrackets;

    public MoreVarDeclsDerived1 (MoreVarDecls MoreVarDecls, AngleBrackets AngleBrackets) {
        this.MoreVarDecls=MoreVarDecls;
        if(MoreVarDecls!=null) MoreVarDecls.setParent(this);
        this.AngleBrackets=AngleBrackets;
        if(AngleBrackets!=null) AngleBrackets.setParent(this);
    }

    public MoreVarDecls getMoreVarDecls() {
        return MoreVarDecls;
    }

    public void setMoreVarDecls(MoreVarDecls MoreVarDecls) {
        this.MoreVarDecls=MoreVarDecls;
    }

    public AngleBrackets getAngleBrackets() {
        return AngleBrackets;
    }

    public void setAngleBrackets(AngleBrackets AngleBrackets) {
        this.AngleBrackets=AngleBrackets;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MoreVarDecls!=null) MoreVarDecls.accept(visitor);
        if(AngleBrackets!=null) AngleBrackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MoreVarDecls!=null) MoreVarDecls.traverseTopDown(visitor);
        if(AngleBrackets!=null) AngleBrackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MoreVarDecls!=null) MoreVarDecls.traverseBottomUp(visitor);
        if(AngleBrackets!=null) AngleBrackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MoreVarDeclsDerived1(\n");

        if(MoreVarDecls!=null)
            buffer.append(MoreVarDecls.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AngleBrackets!=null)
            buffer.append(AngleBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MoreVarDeclsDerived1]");
        return buffer.toString();
    }
}
