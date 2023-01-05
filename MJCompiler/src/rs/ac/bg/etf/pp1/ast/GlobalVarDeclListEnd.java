// generated with ast extension for cup
// version 0.8
// 5/0/2023 0:53:28


package rs.ac.bg.etf.pp1.ast;

public class GlobalVarDeclListEnd extends GlobalVarDeclList {

    private VarDeclEnd VarDeclEnd;

    public GlobalVarDeclListEnd (VarDeclEnd VarDeclEnd) {
        this.VarDeclEnd=VarDeclEnd;
        if(VarDeclEnd!=null) VarDeclEnd.setParent(this);
    }

    public VarDeclEnd getVarDeclEnd() {
        return VarDeclEnd;
    }

    public void setVarDeclEnd(VarDeclEnd VarDeclEnd) {
        this.VarDeclEnd=VarDeclEnd;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclEnd!=null) VarDeclEnd.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclEnd!=null) VarDeclEnd.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclEnd!=null) VarDeclEnd.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GlobalVarDeclListEnd(\n");

        if(VarDeclEnd!=null)
            buffer.append(VarDeclEnd.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GlobalVarDeclListEnd]");
        return buffer.toString();
    }
}
