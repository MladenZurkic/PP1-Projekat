// generated with ast extension for cup
// version 0.8
// 7/1/2023 17:51:1


package rs.ac.bg.etf.pp1.ast;

public class GlobalVarDeclLists extends GlobalVarDeclList {

    private VarDeclComma VarDeclComma;
    private GlobalVarDeclList GlobalVarDeclList;

    public GlobalVarDeclLists (VarDeclComma VarDeclComma, GlobalVarDeclList GlobalVarDeclList) {
        this.VarDeclComma=VarDeclComma;
        if(VarDeclComma!=null) VarDeclComma.setParent(this);
        this.GlobalVarDeclList=GlobalVarDeclList;
        if(GlobalVarDeclList!=null) GlobalVarDeclList.setParent(this);
    }

    public VarDeclComma getVarDeclComma() {
        return VarDeclComma;
    }

    public void setVarDeclComma(VarDeclComma VarDeclComma) {
        this.VarDeclComma=VarDeclComma;
    }

    public GlobalVarDeclList getGlobalVarDeclList() {
        return GlobalVarDeclList;
    }

    public void setGlobalVarDeclList(GlobalVarDeclList GlobalVarDeclList) {
        this.GlobalVarDeclList=GlobalVarDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclComma!=null) VarDeclComma.accept(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclComma!=null) VarDeclComma.traverseTopDown(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclComma!=null) VarDeclComma.traverseBottomUp(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GlobalVarDeclLists(\n");

        if(VarDeclComma!=null)
            buffer.append(VarDeclComma.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(GlobalVarDeclList!=null)
            buffer.append(GlobalVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GlobalVarDeclLists]");
        return buffer.toString();
    }
}
