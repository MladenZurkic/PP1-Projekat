// generated with ast extension for cup
// version 0.8
// 5/1/2023 16:35:35


package rs.ac.bg.etf.pp1.ast;

public class ForEachStmt extends Statement {

    private Designator Designator;
    private EnteredLoop EnteredLoop;
    private String ident;
    private Statement Statement;

    public ForEachStmt (Designator Designator, EnteredLoop EnteredLoop, String ident, Statement Statement) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.EnteredLoop=EnteredLoop;
        if(EnteredLoop!=null) EnteredLoop.setParent(this);
        this.ident=ident;
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public EnteredLoop getEnteredLoop() {
        return EnteredLoop;
    }

    public void setEnteredLoop(EnteredLoop EnteredLoop) {
        this.EnteredLoop=EnteredLoop;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident=ident;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(EnteredLoop!=null) EnteredLoop.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(EnteredLoop!=null) EnteredLoop.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(EnteredLoop!=null) EnteredLoop.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ForEachStmt(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(EnteredLoop!=null)
            buffer.append(EnteredLoop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+ident);
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ForEachStmt]");
        return buffer.toString();
    }
}
