// generated with ast extension for cup
// version 0.8
// 31/11/2022 15:19:34


package rs.ac.bg.etf.pp1.ast;

public class Expr implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Struct struct = null;

    private MinusOptional MinusOptional;
    private Term Term;
    private AddOpTermList AddOpTermList;

    public Expr (MinusOptional MinusOptional, Term Term, AddOpTermList AddOpTermList) {
        this.MinusOptional=MinusOptional;
        if(MinusOptional!=null) MinusOptional.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
        this.AddOpTermList=AddOpTermList;
        if(AddOpTermList!=null) AddOpTermList.setParent(this);
    }

    public MinusOptional getMinusOptional() {
        return MinusOptional;
    }

    public void setMinusOptional(MinusOptional MinusOptional) {
        this.MinusOptional=MinusOptional;
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public AddOpTermList getAddOpTermList() {
        return AddOpTermList;
    }

    public void setAddOpTermList(AddOpTermList AddOpTermList) {
        this.AddOpTermList=AddOpTermList;
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
        if(MinusOptional!=null) MinusOptional.accept(visitor);
        if(Term!=null) Term.accept(visitor);
        if(AddOpTermList!=null) AddOpTermList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MinusOptional!=null) MinusOptional.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
        if(AddOpTermList!=null) AddOpTermList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MinusOptional!=null) MinusOptional.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        if(AddOpTermList!=null) AddOpTermList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Expr(\n");

        if(MinusOptional!=null)
            buffer.append(MinusOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddOpTermList!=null)
            buffer.append(AddOpTermList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Expr]");
        return buffer.toString();
    }
}
