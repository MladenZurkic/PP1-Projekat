// generated with ast extension for cup
// version 0.8
// 5/1/2023 16:35:35


package rs.ac.bg.etf.pp1.ast;

public class MoreVarDeclsDef extends MoreVarDecls {

    private MoreVarDecls MoreVarDecls;
    private VarDeclIdent VarDeclIdent;

    public MoreVarDeclsDef (MoreVarDecls MoreVarDecls, VarDeclIdent VarDeclIdent) {
        this.MoreVarDecls=MoreVarDecls;
        if(MoreVarDecls!=null) MoreVarDecls.setParent(this);
        this.VarDeclIdent=VarDeclIdent;
        if(VarDeclIdent!=null) VarDeclIdent.setParent(this);
    }

    public MoreVarDecls getMoreVarDecls() {
        return MoreVarDecls;
    }

    public void setMoreVarDecls(MoreVarDecls MoreVarDecls) {
        this.MoreVarDecls=MoreVarDecls;
    }

    public VarDeclIdent getVarDeclIdent() {
        return VarDeclIdent;
    }

    public void setVarDeclIdent(VarDeclIdent VarDeclIdent) {
        this.VarDeclIdent=VarDeclIdent;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MoreVarDecls!=null) MoreVarDecls.accept(visitor);
        if(VarDeclIdent!=null) VarDeclIdent.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MoreVarDecls!=null) MoreVarDecls.traverseTopDown(visitor);
        if(VarDeclIdent!=null) VarDeclIdent.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MoreVarDecls!=null) MoreVarDecls.traverseBottomUp(visitor);
        if(VarDeclIdent!=null) VarDeclIdent.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MoreVarDeclsDef(\n");

        if(MoreVarDecls!=null)
            buffer.append(MoreVarDecls.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclIdent!=null)
            buffer.append(VarDeclIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MoreVarDeclsDef]");
        return buffer.toString();
    }
}
