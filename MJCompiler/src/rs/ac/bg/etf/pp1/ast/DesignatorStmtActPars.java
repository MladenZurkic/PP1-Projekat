// generated with ast extension for cup
// version 0.8
// 7/1/2023 17:3:27


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStmtActPars extends DesignatorStatement {

    private DesignatorForActPars DesignatorForActPars;
    private ActParsOptional ActParsOptional;

    public DesignatorStmtActPars (DesignatorForActPars DesignatorForActPars, ActParsOptional ActParsOptional) {
        this.DesignatorForActPars=DesignatorForActPars;
        if(DesignatorForActPars!=null) DesignatorForActPars.setParent(this);
        this.ActParsOptional=ActParsOptional;
        if(ActParsOptional!=null) ActParsOptional.setParent(this);
    }

    public DesignatorForActPars getDesignatorForActPars() {
        return DesignatorForActPars;
    }

    public void setDesignatorForActPars(DesignatorForActPars DesignatorForActPars) {
        this.DesignatorForActPars=DesignatorForActPars;
    }

    public ActParsOptional getActParsOptional() {
        return ActParsOptional;
    }

    public void setActParsOptional(ActParsOptional ActParsOptional) {
        this.ActParsOptional=ActParsOptional;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorForActPars!=null) DesignatorForActPars.accept(visitor);
        if(ActParsOptional!=null) ActParsOptional.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorForActPars!=null) DesignatorForActPars.traverseTopDown(visitor);
        if(ActParsOptional!=null) ActParsOptional.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorForActPars!=null) DesignatorForActPars.traverseBottomUp(visitor);
        if(ActParsOptional!=null) ActParsOptional.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStmtActPars(\n");

        if(DesignatorForActPars!=null)
            buffer.append(DesignatorForActPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ActParsOptional!=null)
            buffer.append(ActParsOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStmtActPars]");
        return buffer.toString();
    }
}
