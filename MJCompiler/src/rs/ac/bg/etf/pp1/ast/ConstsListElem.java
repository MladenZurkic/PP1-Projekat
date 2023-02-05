// generated with ast extension for cup
// version 0.8
// 5/1/2023 3:22:54


package rs.ac.bg.etf.pp1.ast;

public class ConstsListElem implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private String id;
    private Consts Consts;

    public ConstsListElem (String id, Consts Consts) {
        this.id=id;
        this.Consts=Consts;
        if(Consts!=null) Consts.setParent(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public Consts getConsts() {
        return Consts;
    }

    public void setConsts(Consts Consts) {
        this.Consts=Consts;
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
        if(Consts!=null) Consts.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Consts!=null) Consts.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Consts!=null) Consts.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstsListElem(\n");

        buffer.append(" "+tab+id);
        buffer.append("\n");

        if(Consts!=null)
            buffer.append(Consts.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstsListElem]");
        return buffer.toString();
    }
}
