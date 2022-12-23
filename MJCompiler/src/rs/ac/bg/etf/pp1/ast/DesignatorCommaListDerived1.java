// generated with ast extension for cup
// version 0.8
// 23/11/2022 15:42:6


package rs.ac.bg.etf.pp1.ast;

public class DesignatorCommaListDerived1 extends DesignatorCommaList {

    private DesignatorCommaList DesignatorCommaList;
    private DesignatorOptional DesignatorOptional;

    public DesignatorCommaListDerived1 (DesignatorCommaList DesignatorCommaList, DesignatorOptional DesignatorOptional) {
        this.DesignatorCommaList=DesignatorCommaList;
        if(DesignatorCommaList!=null) DesignatorCommaList.setParent(this);
        this.DesignatorOptional=DesignatorOptional;
        if(DesignatorOptional!=null) DesignatorOptional.setParent(this);
    }

    public DesignatorCommaList getDesignatorCommaList() {
        return DesignatorCommaList;
    }

    public void setDesignatorCommaList(DesignatorCommaList DesignatorCommaList) {
        this.DesignatorCommaList=DesignatorCommaList;
    }

    public DesignatorOptional getDesignatorOptional() {
        return DesignatorOptional;
    }

    public void setDesignatorOptional(DesignatorOptional DesignatorOptional) {
        this.DesignatorOptional=DesignatorOptional;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorCommaList!=null) DesignatorCommaList.accept(visitor);
        if(DesignatorOptional!=null) DesignatorOptional.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorCommaList!=null) DesignatorCommaList.traverseTopDown(visitor);
        if(DesignatorOptional!=null) DesignatorOptional.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorCommaList!=null) DesignatorCommaList.traverseBottomUp(visitor);
        if(DesignatorOptional!=null) DesignatorOptional.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorCommaListDerived1(\n");

        if(DesignatorCommaList!=null)
            buffer.append(DesignatorCommaList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorOptional!=null)
            buffer.append(DesignatorOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorCommaListDerived1]");
        return buffer.toString();
    }
}
