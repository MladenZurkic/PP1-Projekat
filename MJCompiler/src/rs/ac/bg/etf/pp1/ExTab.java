package rs.ac.bg.etf.pp1;

import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Scope;
import rs.etf.pp1.symboltable.concepts.Struct;

public class ExTab extends Tab {

	
	public static final Struct boolType = new Struct(Struct.Bool);
	public static Obj boolObj;
	private static int currentLevel; // nivo ugnezdavanja tekuceg opsega
	
	
	//?????
	public static void init() {
		Tab.init(); // Check da li moze ovako?
		currentScope.addToLocals(new Obj(Obj.Type, "bool", boolType));
	}
}
