package ch.vorburger.elang.engine.tests;


import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import ch.vorburger.elang.engine.EmptyScriptEvaluationException;
import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.ScriptException;
import ch.vorburger.elang.engine.ScriptParsingException;


/**
 * Basic Tests for the Script Engine.
 * 
 * @author Michael Vorburger
 */
public class ScriptBasicTest extends AbstractScriptTestBase {
	
	@Test
	public void testFixedNumericLiterals() throws Exception {
		checkNumericExpressionScript("1", 1.0);
		checkNumericExpressionScript("1", 1.0);
		checkNumericExpressionScript("23.7", new Double(23.7));
		checkNumericExpressionScript("81.5e2", 8150.0);
		checkNumericExpressionScript(".5", new Double(0.5));
		
		// TODO What does the d notation mean?  Test it: checkNumericExpressionScript("1d2", ???);
		
		// TODO Test more numeric literal string formats?  Do some negative testing also, what should fail?
	}
	
	@Test
	public void testFixedDateLiterals() throws Exception {
		checkDateExpressionScript("15.06.2008", new GregorianCalendar(2008,06-1,15));
		checkDateExpressionScript("15/06/2008", new GregorianCalendar(2008,06-1,15));
		checkDateExpressionScript("15-06-2008", new GregorianCalendar(2008,06-1,15));

		checkDateExpressionScript("15.06.08", new GregorianCalendar(2008,06-1,15));
		// TODO Test the two-digit year format interpretation well!!!  y = y<100 ? y<50 ? y+2000 : y+1900 : y;

		checkDateExpressionScript("15.06.2008 18:23:53", new GregorianCalendar(2008,06-1,15,18,23,53));
		checkDateExpressionScript("15.06.08 18:23:53", new GregorianCalendar(2008,06-1,15,18,23,53));

		// TODO Test more numeric literal date and dateTime formats?  Do some negative testing also, what should fail?

		// TODO: Timezones are missing in DATE/DATE_TIME!!!  This extension should be added IMHO.
	}
	
	@Test
	public void testFixedStringLiteral() throws Exception {
		checkStringExpressionScript("\"Hello World!\"", "Hello World!");
	}
	
//  TODO Support String concatenation via '+' in grammar?  
//	@Test
//	public void testStringConcatenation() throws Exception {
//		checkStringExpressionScript("\"Hello \" + \"World!\"", "Hello World!");
//		// TODO Concat String variable with String literal
//	}
	
	@Test
	public void testSomeNumericExpressionsWithoutPrecedence() throws Exception {
		checkNumericExpressionScript("1 + 1", 2.0);
		checkNumericExpressionScript("27 - 13", 14.0);
		checkNumericExpressionScript("2 * 3", 6.0);
		checkNumericExpressionScript("5/2", new Double(2.5));

		// More than two, with mixed operators (of same precedence)
		checkNumericExpressionScript("1 + 1+7 - 3", 6.0);
		checkNumericExpressionScript("2 * 3 /2", 3.0);
		
		// These are deliberately in an order of correct precedence:
		checkNumericExpressionScript("2 * 3 + 1", 7.0);
		checkNumericExpressionScript("3 / 2 - 0.5", 1.0);
	}

	@Test
	public void testSomeNumericExpressionsWithBrackets() throws Exception {
		checkNumericExpressionScript("12 + ( 3 * 5 )", 27.0);
		checkNumericExpressionScript("12 + ( 3 * 5 ) - ( ( 2 / 5 ) * 8 )", new Double(23.8));
		
		checkNumericExpressionScript("(12 + 3) * 5 ", 75.0);
		checkNumericExpressionScript("(12 + 3 * (5 - ( ( 2 + 5 ) * 8 )))", new Double(-141));
	}

	@Test
	public void testMissingBracketErrorHandling() throws ScriptException {
		try {
			checkNumericExpressionScript("(12 + 3 * (5 - ( ( 2 + 5 ) * 8 ))", -141.0);
			Assert.fail("This should have failed...");
		} catch (ScriptParsingException e) {
			if (!e.toString().contains("expecting ')'")) 
				throw e;
		}
	}

	@Test
	public void testSomeNumericExpressionsWhichRequireCorrectPrecedence() throws Exception {
		checkNumericExpressionScript("12+3*5", 27.0);
		checkNumericExpressionScript("12 + 3 * 5", 27.0);
		// Copy/paste from the TripleA_ScriptLanguage_Reference_Guide.pdf ;-) :
		checkNumericExpressionScript("12 + 3 * 5 - 2 / 5 * 8", new Double(23.8));
	}
	
	@Test
	public void testNumericBooleanComparisonExpressionsAndOperators() throws Exception {
		checkBooleanExpressionScript("27 < 30", 27 < 30 /* true */);
		checkBooleanExpressionScript("30 < 27", 30 < 27 /* false */);

		checkBooleanExpressionScript("27 > 30", 27 > 30 /* false */);
		checkBooleanExpressionScript("30 > 27", 30 > 27 /* true */);

		checkBooleanExpressionScript("27 = 27", true);
		checkBooleanExpressionScript("27 = 28", false);
		checkBooleanExpressionScript("27 == 27", true);
		checkBooleanExpressionScript("27 == 28", false);

		checkBooleanExpressionScript("27 != 27", false);
		checkBooleanExpressionScript("27 != 28", true);
		checkBooleanExpressionScript("27 <> 27", false);
		checkBooleanExpressionScript("27 <> 28", true);

		checkBooleanExpressionScript("27 <= 28", true);
		checkBooleanExpressionScript("27 <= 27", true);
		checkBooleanExpressionScript("27 <= 26", false);

		checkBooleanExpressionScript("27 !> 28", true);
		checkBooleanExpressionScript("27 !> 27", true);
		checkBooleanExpressionScript("27 !> 26", false);
		
		checkBooleanExpressionScript("28 >= 27", true);
		checkBooleanExpressionScript("27 >= 27", true);
		checkBooleanExpressionScript("26 >= 27", false);

		checkBooleanExpressionScript("28 !< 27", true);
		checkBooleanExpressionScript("27 !< 27", true);
		checkBooleanExpressionScript("26 !< 27", false);

		checkBooleanExpressionScript("NOT 27 < 30", !(27 < 30) /* false */);
		checkBooleanExpressionScript("NOT (30 < 27)", !(30 < 27) /* true */);

		checkBooleanExpressionScript("NOT NOT 27 < 30", !!(27 < 30) /* true */);

		checkBooleanExpressionScript("(27 < 30) AND (30 < 27)", (27 < 30) && (30 < 27) /* false */);
		checkBooleanExpressionScript("(27 < 30) AND (30 > 27)", (27 < 30) && (30 > 27) /* true */);
		checkBooleanExpressionScript("(27 < 30) OR (30 < 27)", (27 < 30) /* || (30 < 27) true */);
		checkBooleanExpressionScript("(27 > 30) OR (30 < 27)", (27 > 30) || (30 < 27) /* false */);

		checkBooleanExpressionScript("(27 < 30) AND (30 > 27) AND (1 < 2)", (27 < 30) && (30 > 27) && (1 < 2) /* true */);
		checkBooleanExpressionScript("(27 < 30) AND (30 > 27) AND (1 > 2)", (27 < 30) && (30 > 27) && (1 > 2) /* false */);
		checkBooleanExpressionScript("(27 < 30) OR (30 < 27) OR (1 < 2)", (27 < 30) /* || (30 < 27) || (1 < 2) true */);
		checkBooleanExpressionScript("(27 > 30) OR (30 < 27) OR (1 < 2)", (27 > 30) || (30 < 27) || (1 < 2) /* true */);

		// Copy/paste from the TripleA_ScriptLanguage_Reference_Guide.pdf ;-) :
		checkBooleanExpressionScript("(27 < 30) AND (30 < 27) OR NOT (27 < 30) AND (30 < 27)", true);
		
		// TODO Important: More tests for validating boolean precedence - IT'S PROBABLY WRONG!!
		// 	 The NOT operator has a higher precedence than the AND operator which has a higher precedence than OR.
		//	 Example: ... AND ... OR NOT ... AND ... is equivalent to ( ... AND ... ) OR ( ( NOT ... ) AND ... )
	}

	// TODO Is String comparison with =/==/!=/<> required/supported, or only LIKE?
//	@Test
//	public void testStringBooleanOperators() throws Exception {
//		checkBooleanExpressionScript("\"ABC\" = \"ABC\"", true);
//		checkBooleanExpressionScript("\"ABC\" = \"CBA\"", false);
//		checkBooleanExpressionScript("\"ABC\" == \"ABC\"", true);
//		checkBooleanExpressionScript("\"ABC\" == \"CBA\"", false);
//		
//		checkBooleanExpressionScript("\"ABC\" != \"ABC\"", false);
//		checkBooleanExpressionScript("\"ABC\" != \"CBA\"", true);
//		checkBooleanExpressionScript("\"ABC\" <> \"ABC\"", false);
//		checkBooleanExpressionScript("\"ABC\" <> \"CBA\"", true);
//
//	}

	// TODO Is String less-than/greater-than comparison (</>/>=/<=) required/supported?  (e.g. "\"ABC\" < \"ABC\"", etc.)
	
	// TODO Negative testing, and testing of error handling for unsupported comparison types (e.g. String literal and numeric "Hello" == 123, or 1 + 1 OR 2, etc.)
	
	// TODO testDateBooleanComparison() - presumably, =/==/!=/<>/<=/>=/!</!> can be used on DATE literal (and variables), too?
	
	// TODO testNULLValueComparison: "The NULL value can only be used with the = ( == ) or != ( <> ) operators. Any attempt to use another operator returns the value 0 (false)."
	
	@Test
	@Ignore // TODO Reactivate this.. it used to work
	public void testEmptyScript() throws Exception {
		try {
			checkNumericExpressionScript("", null);
			Assert.fail("This should have failed...");
		} catch (EmptyScriptEvaluationException e) {
			// OK
		}
		
		try {
			checkNumericExpressionScript("\n { Only Comment }\t\n", null);
			Assert.fail("This should have failed...");
		} catch (EmptyScriptEvaluationException e) {
			// OK
		}

		try {
			checkStringExpressionScript("{ Only Comment }", null);	
			Assert.fail("This should have failed...");
		} catch (EmptyScriptEvaluationException e) {
			// OK
		}

		try {
			checkNumericExpressionScript("{ Only Comment } {Another\nComment!}", null);		
			Assert.fail("This should have failed...");
		} catch (EmptyScriptEvaluationException e) {
			// OK
		}

		try {
			checkBooleanExpressionScript("\n;\n", null);
			Assert.fail("This should have failed...");
		} catch (EmptyScriptEvaluationException e) {
			// OK
		}

		try {
			checkBooleanExpressionScript("{Nada {fucking nesting!} }", null);
			Assert.fail("This should have failed...");
		} catch (EmptyScriptEvaluationException e) {
			// OK
		}
	}
	
	@Test
	public void testWhitespaceAndCommentAroundExpressions() throws Exception {
		checkNumericExpressionScript(" \n.5", new Double(0.5));
		checkNumericExpressionScript(" { Comment! } 2.0\t\n +1 { Add One }\n\n", 3.0);
		checkStringExpressionScript(" \"Hello\"\n{ Comment\n\tNextLine! } \t\n\n", "Hello");
		checkNumericExpressionScript("1 {Nada {fucking nesting!} }", 1.0);
		
		try {
			checkNumericExpressionScript("a + { Comment }", null);
			Assert.fail("Should not have reached here, script parsing should have failed!");
		} catch (ScriptParsingException e) {
			// OK, as expected
		}
		
		try {
			checkNumericExpressionScript("{ Comment } / 7", null);
			Assert.fail("Should not have reached here, script parsing should have failed!");
		} catch (ScriptParsingException e) {
			// OK, as expected
		}
	}

	@Test
	public void testNegatingNumericLiteralsAndExpressions() throws Exception {
		checkNumericExpressionScript("-1", -1.0);
		checkNumericExpressionScript("- 1", -1.0);
		checkNumericExpressionScript("-23.7", new Double(-23.7));
		checkNumericExpressionScript("-81.5e2", -8150.0);
		checkNumericExpressionScript("-.5", new Double(-0.5));

		// With WS etc. (Tokenizer will not pick it up; leads to a NegationExpression)
		checkNumericExpressionScript("-   1", -1.0);
		checkNumericExpressionScript("- {Comment\nLine} 1", -1.0);
		checkNumericExpressionScript(" - - 1", 1.0);
		
		// NegatedExpressions... depending on the parsing implementation, not the same as above..
		checkNumericExpressionScript("-(1+1)", Double.valueOf( -(1+1) ));
		
		// I initially had some trouble with NegatedExpression, this should work as well of course:
		checkNumericExpressionScript("5-1", 4.0);
		checkNumericExpressionScript("5 -1", 4.0);
		
		// TODO Grammar should support +(1+1) now... fix interpreter.
		// TODO An expression like "+(1+1)" is not supported yet... I think.  Could be added, but very low priority.
		// UNSUPPORTED: checkNumericExpressionScript("+(1+1)", Integer.valueOf( +(1+1) ));
	}
	
	@Test
	public void testTypeMismatchErrorHandlingStringInsteadOfNumberInNegation() throws Exception {
		try {
			checkNumericExpressionScript("- (\"Hello\")", Integer.valueOf(-1));
			Assert.fail("This should have failed...");
		}
		catch (ScriptExcecutionException e) {
//			System.out.println("OK: " + e.getMessage());
			Assert.assertTrue("Exception message does not contain 'Hello', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("Hello"));
 			// TODO Column Number does not seem to be working!  Assert.assertEquals(3, e.getErrors().get(0).getColumnNumber());
		}
	}
	
	@Test
	public void testTypeMismatchErrorHandlingDateInsteadOfNumberInAddition() throws Exception {
		try {
			checkNumericExpressionScript("1+2+3+15.06.2008", Integer.valueOf(-1));
			Assert.fail("This should have failed...");
		}
		catch (ScriptExcecutionException e) {
//			System.out.println("OK: " + e.getMessage());
			Assert.assertTrue("Exception message does not contain '15.06.2008', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("15.06.2008"));
			// TODO Column Number does not seem to be working! Assert.assertEquals(6, e.getErrors().get(0).getColumnNumber());
		}
	}

	@Test
	public void testNumberInterpretedAsBoolean() throws Exception {
		checkBooleanExpressionScript("123", true);
		checkBooleanExpressionScript("1", true);
		checkBooleanExpressionScript("-1", true);
		checkBooleanExpressionScript("0", false);
	}
	
	@Test
	public void testTrueFalseLiteralsInterpretedAsBoolean() throws Exception {
		checkBooleanExpressionScript("TRUE", true);
		checkBooleanExpressionScript("FALSE", false);
	}
	
	@Test
	public void testNulllLiteral() throws Exception {
		checkBooleanExpressionScript("NULL", null);
		checkDateExpressionScript("NULL", null);
		checkNumericExpressionScript("NULL", null);
		checkStringExpressionScript("NULL", null);
	}
	
	
//	@Test
//	public void testTypeMismatchErrorHandlingNumberInsteadOfBoolean() throws Exception {
//		try {
//			checkBooleanExpressionScript("123", true);
//			Assert.fail("This should have failed...");
//		}
//		catch (ScriptExcecutionException e) {
//			Assert.assertTrue("Exception message does not contain '123', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("123"));
//			// System.out.println("OK: " + e.getMessage());
//		}
//	}

	@Test
	public void testTypeMismatchErrorHandlingStringInsteadOfDate() throws Exception {
		try {
			checkDateExpressionScript("\"Hello\"", null);
			Assert.fail("This should have failed...");
		}
		catch (ScriptExcecutionException e) {
			Assert.assertTrue("Exception message does not contain 'Hello', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("Hello"));
			// System.out.println("OK: " + e.getMessage());
		}
	}

	@Test
	public void testTypeCoercionHandlingNumberAsString() throws Exception {
		checkStringExpressionScript("1+2+3", "6.0");
	}
}
