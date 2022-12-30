// generated with ast extension for cup
// version 0.8
// 30/11/2022 15:43:20


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStmtAngleBrack extends DesignatorStatement {

    private DesignatorOptional DesignatorOptional;
    private DesignatorCommaList DesignatorCommaList;
    private Designator Designator;

    public DesignatorStmtAngleBrack (DesignatorOptional DesignatorOptional, DesignatorCommaList DesignatorCommaList, Designator Designator) {
        this.DesignatorOptional=DesignatorOptional;
        if(DesignatorOptional!=null) DesignatorOptional.setParent(this);
        this.DesignatorCommaList=DesignatorCommaList;
        if(DesignatorCommaList!=null) DesignatorCommaList.setParent(this);
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
    }

    public DesignatorOptional getDesignatorOptional() {
        return DesignatorOptional;
    }

    public void setDesignatorOptional(DesignatorOptional DesignatorOptional) {
        this.DesignatorOptional=DesignatorOptional;
    }

    public DesignatorCommaList getDesignatorCommaList() {
        return DesignatorCommaList;
    }

    public void setDesignatorCommaList(DesignatorCommaList DesignatorCommaList) {
        this.DesignatorCommaList=DesignatorCommaList;
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorOptional!=null) DesignatorOptional.accept(visitor);
        if(DesignatorCommaList!=null) DesignatorCommaList.accept(visitor);
        if(Designator!=null) Designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorOptional!=null) DesignatorOptional.traverseTopDown(visitor);
        if(DesignatorCommaList!=null) DesignatorCommaList.traverseTopDown(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorOptional!=null) DesignatorOptional.traverseBottomUp(visitor);
        if(DesignatorCommaList!=null) DesignatorCommaList.traverseBottomUp(visitor);
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStmtAngleBrack(\n");

        if(DesignatorOptional!=null)
            buffer.append(DesignatorOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorCommaList!=null)
            buffer.append(DesignatorCommaList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStmtAngleBrack]");
        return buffer.toString();
    }
}
