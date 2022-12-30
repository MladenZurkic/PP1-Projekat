// generated with ast extension for cup
// version 0.8
// 30/11/2022 15:43:20


package rs.ac.bg.etf.pp1.ast;

public class ClassDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private ExtendsOptional ExtendsOptional;
    private VarDeclList VarDeclList;
    private ClassConstrMethodDecl ClassConstrMethodDecl;

    public ClassDecl (ExtendsOptional ExtendsOptional, VarDeclList VarDeclList, ClassConstrMethodDecl ClassConstrMethodDecl) {
        this.ExtendsOptional=ExtendsOptional;
        if(ExtendsOptional!=null) ExtendsOptional.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.ClassConstrMethodDecl=ClassConstrMethodDecl;
        if(ClassConstrMethodDecl!=null) ClassConstrMethodDecl.setParent(this);
    }

    public ExtendsOptional getExtendsOptional() {
        return ExtendsOptional;
    }

    public void setExtendsOptional(ExtendsOptional ExtendsOptional) {
        this.ExtendsOptional=ExtendsOptional;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public ClassConstrMethodDecl getClassConstrMethodDecl() {
        return ClassConstrMethodDecl;
    }

    public void setClassConstrMethodDecl(ClassConstrMethodDecl ClassConstrMethodDecl) {
        this.ClassConstrMethodDecl=ClassConstrMethodDecl;
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
        if(ExtendsOptional!=null) ExtendsOptional.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(ClassConstrMethodDecl!=null) ClassConstrMethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExtendsOptional!=null) ExtendsOptional.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(ClassConstrMethodDecl!=null) ClassConstrMethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExtendsOptional!=null) ExtendsOptional.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(ClassConstrMethodDecl!=null) ClassConstrMethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDecl(\n");

        if(ExtendsOptional!=null)
            buffer.append(ExtendsOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassConstrMethodDecl!=null)
            buffer.append(ClassConstrMethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDecl]");
        return buffer.toString();
    }
}
