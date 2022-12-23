// generated with ast extension for cup
// version 0.8
// 23/11/2022 15:42:6


package rs.ac.bg.etf.pp1.ast;

public class StatementDerived8 extends Statement {

    private Expr Expr;
    private NumConstOptional NumConstOptional;

    public StatementDerived8 (Expr Expr, NumConstOptional NumConstOptional) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.NumConstOptional=NumConstOptional;
        if(NumConstOptional!=null) NumConstOptional.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public NumConstOptional getNumConstOptional() {
        return NumConstOptional;
    }

    public void setNumConstOptional(NumConstOptional NumConstOptional) {
        this.NumConstOptional=NumConstOptional;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(NumConstOptional!=null) NumConstOptional.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(NumConstOptional!=null) NumConstOptional.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(NumConstOptional!=null) NumConstOptional.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDerived8(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(NumConstOptional!=null)
            buffer.append(NumConstOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDerived8]");
        return buffer.toString();
    }
}
