// generated with ast extension for cup
// version 0.8
// 31/11/2022 15:19:34


package rs.ac.bg.etf.pp1.ast;

public class VarDeclEndDef extends VarDeclEnd {

    private VarDeclIdent VarDeclIdent;

    public VarDeclEndDef (VarDeclIdent VarDeclIdent) {
        this.VarDeclIdent=VarDeclIdent;
        if(VarDeclIdent!=null) VarDeclIdent.setParent(this);
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
        if(VarDeclIdent!=null) VarDeclIdent.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclIdent!=null) VarDeclIdent.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclIdent!=null) VarDeclIdent.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclEndDef(\n");

        if(VarDeclIdent!=null)
            buffer.append(VarDeclIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclEndDef]");
        return buffer.toString();
    }
}
