// generated with ast extension for cup
// version 0.8
// 5/0/2023 0:53:28


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStmtAngleBrack extends DesignatorStatement {

    private DesignatorForActPars DesignatorForActPars;
    private DesignatorCommaList DesignatorCommaList;
    private Designator Designator;

    public DesignatorStmtAngleBrack (DesignatorForActPars DesignatorForActPars, DesignatorCommaList DesignatorCommaList, Designator Designator) {
        this.DesignatorForActPars=DesignatorForActPars;
        if(DesignatorForActPars!=null) DesignatorForActPars.setParent(this);
        this.DesignatorCommaList=DesignatorCommaList;
        if(DesignatorCommaList!=null) DesignatorCommaList.setParent(this);
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
    }

    public DesignatorForActPars getDesignatorForActPars() {
        return DesignatorForActPars;
    }

    public void setDesignatorForActPars(DesignatorForActPars DesignatorForActPars) {
        this.DesignatorForActPars=DesignatorForActPars;
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
        if(DesignatorForActPars!=null) DesignatorForActPars.accept(visitor);
        if(DesignatorCommaList!=null) DesignatorCommaList.accept(visitor);
        if(Designator!=null) Designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorForActPars!=null) DesignatorForActPars.traverseTopDown(visitor);
        if(DesignatorCommaList!=null) DesignatorCommaList.traverseTopDown(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorForActPars!=null) DesignatorForActPars.traverseBottomUp(visitor);
        if(DesignatorCommaList!=null) DesignatorCommaList.traverseBottomUp(visitor);
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStmtAngleBrack(\n");

        if(DesignatorForActPars!=null)
            buffer.append(DesignatorForActPars.toString("  "+tab));
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
