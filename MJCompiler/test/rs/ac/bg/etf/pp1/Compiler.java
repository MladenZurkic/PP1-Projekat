package rs.ac.bg.etf.pp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import java_cup.runtime.Symbol;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import rs.ac.bg.etf.pp1.ast.Program;
import rs.ac.bg.etf.pp1.util.Log4JUtils;
import rs.etf.pp1.mj.runtime.Code;

public class Compiler {

	static {
		DOMConfigurator.configure(Log4JUtils.instance().findLoggerConfigFile());
		Log4JUtils.instance().prepareLogFile(Logger.getRootLogger());
	}
	
	public static void main(String[] args) throws Exception {
		
		Logger log = Logger.getLogger(MJParserTest.class);
		
		Reader br = null;
		try {
			File sourceCode = new File(args[0]);
			log.info("Compiling source file: " + sourceCode.getAbsolutePath());
			
			br = new BufferedReader(new FileReader(sourceCode));
			Yylex lexer = new Yylex(br);
			
			MJParser p = new MJParser(lexer);
	        Symbol s = p.parse();  //pocetak parsiranja
	        
	        Program prog = (Program)(s.value); 
	        ExTab.init();
	        
			// ispis sintaksnog stabla
			log.info(prog.toString(""));
			log.info("===================================");

			// ispis prepoznatih programskih konstrukcija
			SemanticAnalyzer v = new SemanticAnalyzer();
			prog.traverseBottomUp(v); 
	      
			log.info("");
			log.info("==============SUMMARY==============");
			
			
			//print deo
			log.info(" Print count calls = " + v.printCallCount);
			log.info(" Deklarisanih kostanti ima = " + v.constCount);
			log.info(" Lokalno deklarisanih promenljivih ima = " + v.localVarDeclCount);
			log.info(" Globalno deklarisanih promenljivih ima = " + v.globalVarDeclCount);
			log.info(" Deklarisanih metoda ima = " + v.methodCount);
			log.info(" Deklarisanih klasa ima = " + v.classCount);
			log.info(" Deklarisanih nizova ima = " + v.arraysCount);
			log.info(" Deklarisanih statementa ima = " + v.statementCount);
			
			//log.info("===================================");
			
			ExTab.dump();
			
			System.out.println(p.errorDetected);
			System.out.println(v.passed());
			
			if(!p.errorDetected && v.passed()) {
				
				File objFile = new File(args[1]);
				if(objFile.exists()) objFile.delete();
				
				CodeGenerator codeGenerator = new CodeGenerator();
				prog.traverseBottomUp(codeGenerator);
				
				Code.dataSize = v.nVars;
				Code.mainPc = codeGenerator.getMainPc();
				Code.write(new FileOutputStream(objFile));
				
				log.info("Parisanje uspesno zavrseno!");
			}
			else {
				log.error("Parsiranje NIJE uspesno zavrseno.");
			}
		}
		finally {
			if (br != null) try { br.close(); } catch (IOException e1) { log.error(e1.getMessage(), e1); }
		}
	}
}