// generated with ast extension for cup
// version 0.8
// 25/11/2022 1:1:56


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclDef extends ConstDecl {

    private Type Type;
    private ConstsList ConstsList;

    public ConstDeclDef (Type Type, ConstsList ConstsList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.ConstsList=ConstsList;
        if(ConstsList!=null) ConstsList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public ConstsList getConstsList() {
        return ConstsList;
    }

    public void setConstsList(ConstsList ConstsList) {
        this.ConstsList=ConstsList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ConstsList!=null) ConstsList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ConstsList!=null) ConstsList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ConstsList!=null) ConstsList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclDef(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstsList!=null)
            buffer.append(ConstsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclDef]");
        return buffer.toString();
    }
}