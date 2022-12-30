// generated with ast extension for cup
// version 0.8
// 29/11/2022 18:48:27


package rs.ac.bg.etf.pp1.ast;

public class CondFact implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Expr Expr;
    private RelOpExprOptional RelOpExprOptional;

    public CondFact (Expr Expr, RelOpExprOptional RelOpExprOptional) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.RelOpExprOptional=RelOpExprOptional;
        if(RelOpExprOptional!=null) RelOpExprOptional.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public RelOpExprOptional getRelOpExprOptional() {
        return RelOpExprOptional;
    }

    public void setRelOpExprOptional(RelOpExprOptional RelOpExprOptional) {
        this.RelOpExprOptional=RelOpExprOptional;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(RelOpExprOptional!=null) RelOpExprOptional.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(RelOpExprOptional!=null) RelOpExprOptional.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(RelOpExprOptional!=null) RelOpExprOptional.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondFact(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(RelOpExprOptional!=null)
            buffer.append(RelOpExprOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondFact]");
        return buffer.toString();
    }
}
