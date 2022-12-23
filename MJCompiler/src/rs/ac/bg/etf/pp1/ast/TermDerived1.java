// generated with ast extension for cup
// version 0.8
// 23/11/2022 3:33:9


package rs.ac.bg.etf.pp1.ast;

public class TermDerived1 extends Term {

    private Factor Factor;
    private MulOpFactorList MulOpFactorList;

    public TermDerived1 (Factor Factor, MulOpFactorList MulOpFactorList) {
        this.Factor=Factor;
        if(Factor!=null) Factor.setParent(this);
        this.MulOpFactorList=MulOpFactorList;
        if(MulOpFactorList!=null) MulOpFactorList.setParent(this);
    }

    public Factor getFactor() {
        return Factor;
    }

    public void setFactor(Factor Factor) {
        this.Factor=Factor;
    }

    public MulOpFactorList getMulOpFactorList() {
        return MulOpFactorList;
    }

    public void setMulOpFactorList(MulOpFactorList MulOpFactorList) {
        this.MulOpFactorList=MulOpFactorList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Factor!=null) Factor.accept(visitor);
        if(MulOpFactorList!=null) MulOpFactorList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Factor!=null) Factor.traverseTopDown(visitor);
        if(MulOpFactorList!=null) MulOpFactorList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Factor!=null) Factor.traverseBottomUp(visitor);
        if(MulOpFactorList!=null) MulOpFactorList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("TermDerived1(\n");

        if(Factor!=null)
            buffer.append(Factor.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MulOpFactorList!=null)
            buffer.append(MulOpFactorList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TermDerived1]");
        return buffer.toString();
    }
}
