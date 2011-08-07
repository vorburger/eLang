package ch.vorburger.elang.engine.tests;


import org.junit.Test;

import ch.vorburger.elang.engine.ScriptEngine;
import ch.vorburger.elang.engine.ScriptFactory;


/**
 * Test the grammar for the parsing of functions.
 * These tests don't actually execute (evaluate) anything (yet?)
 * 
 * @author Michael Vorburger
 */
public class ScriptFunctionsTest extends AbstractScriptTestBase {
	
	protected ScriptFactory scriptFactory = new ScriptFactory();
	protected ScriptEngine engine = new ScriptEngine();
	
	@Test
	public void testIf() throws Exception {
		checkNumericExpressionScript("if(TRUE, 123)", 123.0);
		
		checkNumericExpressionScript("if(TRUE, 123, 456)", 123.0);
		checkNumericExpressionScript("if(FALSE, 123, 456)", 456.0);

		checkNumericExpressionScript("if(FALSE, 123)", null);
	}
	
}
