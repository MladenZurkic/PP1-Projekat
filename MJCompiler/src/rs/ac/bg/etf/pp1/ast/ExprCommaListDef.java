// generated with ast extension for cup
// version 0.8
// 25/11/2022 16:53:39


package rs.ac.bg.etf.pp1.ast;

public class ExprCommaListDef extends ExprCommaList {

    private ExprCommaList ExprCommaList;
    private Expr Expr;

    public ExprCommaListDef (ExprCommaList ExprCommaList, Expr Expr) {
        this.ExprCommaList=ExprCommaList;
        if(ExprCommaList!=null) ExprCommaList.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public ExprCommaList getExprCommaList() {
        return ExprCommaList;
    }

    public void setExprCommaList(ExprCommaList ExprCommaList) {
        this.ExprCommaList=ExprCommaList;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprCommaList!=null) ExprCommaList.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprCommaList!=null) ExprCommaList.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprCommaList!=null) ExprCommaList.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprCommaListDef(\n");

        if(ExprCommaList!=null)
            buffer.append(ExprCommaList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprCommaListDef]");
        return buffer.toString();
    }
}
