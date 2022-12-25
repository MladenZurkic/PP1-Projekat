// generated with ast extension for cup
// version 0.8
// 25/11/2022 16:53:39


package rs.ac.bg.etf.pp1.ast;

public class VarDeclListBasicDef extends VarDeclListBasic {

    private VarDeclComma VarDeclComma;
    private VarDeclListBasic VarDeclListBasic;

    public VarDeclListBasicDef (VarDeclComma VarDeclComma, VarDeclListBasic VarDeclListBasic) {
        this.VarDeclComma=VarDeclComma;
        if(VarDeclComma!=null) VarDeclComma.setParent(this);
        this.VarDeclListBasic=VarDeclListBasic;
        if(VarDeclListBasic!=null) VarDeclListBasic.setParent(this);
    }

    public VarDeclComma getVarDeclComma() {
        return VarDeclComma;
    }

    public void setVarDeclComma(VarDeclComma VarDeclComma) {
        this.VarDeclComma=VarDeclComma;
    }

    public VarDeclListBasic getVarDeclListBasic() {
        return VarDeclListBasic;
    }

    public void setVarDeclListBasic(VarDeclListBasic VarDeclListBasic) {
        this.VarDeclListBasic=VarDeclListBasic;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclComma!=null) VarDeclComma.accept(visitor);
        if(VarDeclListBasic!=null) VarDeclListBasic.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclComma!=null) VarDeclComma.traverseTopDown(visitor);
        if(VarDeclListBasic!=null) VarDeclListBasic.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclComma!=null) VarDeclComma.traverseBottomUp(visitor);
        if(VarDeclListBasic!=null) VarDeclListBasic.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclListBasicDef(\n");

        if(VarDeclComma!=null)
            buffer.append(VarDeclComma.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclListBasic!=null)
            buffer.append(VarDeclListBasic.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclListBasicDef]");
        return buffer.toString();
    }
}
