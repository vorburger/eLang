package ch.vorburger.el.engine.tests;



import java.math.BigDecimal;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import ch.vorburger.el.engine.ExpressionException;
import ch.vorburger.el.engine.ExpressionExecutionException;
import ch.vorburger.el.engine.ExpressionParsingException;


/**
 * Basic Tests for the Script Engine.
 * 
 * @author Michael Vorburger
 */
public class BasicExpressionTest extends AbstractExpressionTestBase {
	
	@Test
	public void testFixedNumericLiterals() throws Exception {
		checkNumericExpression("1", 1);
		checkNumericExpression("1", 1);
		checkNumericExpression("23.7", new BigDecimal("23.7"));
		checkNumericExpression("81.5e2", 8150);
		checkNumericExpression(".5", new BigDecimal(0.5));
		
		// TODO What does the d notation mean?  Test it: checkNumericExpressionScript("1d2", ???);
		
		// TODO Test more numeric literal string formats?  Do some negative testing also, what should fail?
	}
	
	@Test
	public void testFixedDateLiterals() throws Exception {
		checkDateExpression("15.06.2008", new GregorianCalendar(2008,06-1,15));
		checkDateExpression("15/06/2008", new GregorianCalendar(2008,06-1,15));

		checkDateExpression("15.06.08", new GregorianCalendar(2008,06-1,15));
		// TODO Test the two-digit year format interpretation well!!!  y = y<100 ? y<50 ? y+2000 : y+1900 : y;

		checkDateExpression("15.06.2008 18:23:53", new GregorianCalendar(2008,06-1,15,18,23,53));
		checkDateExpression("15.06.08 18:23:53", new GregorianCalendar(2008,06-1,15,18,23,53));

		// TODO Test more numeric literal date and dateTime formats?  Do some negative testing also, what should fail?

		// TODO: Timezones are missing in DATE/DATE_TIME!!!  This extension should be added IMHO.
	}
	
	@Test
	public void testFixedStringLiteral() throws Exception {
		checkStringExpression("\"Hello World!\"", "Hello World!");
	}
	
	@Test
	public void testStringConcatenation() throws Exception {
		checkStringExpression("\"Hello \" + \"World!\"", "Hello World!");
	}
	
	@Test
	public void testSomeNumericExpressionsWithoutPrecedence() throws Exception {
		checkNumericExpression("1+1", 2);
		checkNumericExpression("1 + 1", 2);
		checkNumericExpression("0 + 2 * 3", 6);
		checkNumericExpression("27-13", 14);
		checkNumericExpression("27 - 13", 14);
		checkNumericExpression("5.0/2.0", new BigDecimal("2.5"));

		// More than two, with mixed operators (of same precedence)
		checkNumericExpression("1 + 1+7 - 3", 6);
		checkNumericExpression("2 * 3 /2", 3);
		
		// These are deliberately in an order of correct precedence:
		checkNumericExpression("2 * 3 + 1", 7);
		checkNumericExpression("3 / 2 - 0.5", 1);
	}

	@Test
	public void testSomeNumericExpressionsWithBrackets() throws Exception {
		checkNumericExpression("12 + ( 3 * 5 )", 27);
		checkNumericExpression("12 + ( 3 * 5 ) - ( ( 2 / 5 ) * 8 )", new BigDecimal("23.8"));
		
		checkNumericExpression("(12 + 3) * 5 ", 75);
		checkNumericExpression("(12 + 3 * (5 - ( ( 2 + 5 ) * 8 )))", -141);
	}

	@Test
	public void testMissingBracketErrorHandling() throws ExpressionException {
		try {
			checkNumericExpression("(12 + 3 * (5 - ( ( 2 + 5 ) * 8 ))", -141);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			if (!e.toString().contains("expecting ')'")) 
				throw e;
		}
	}

	@Test
	public void testSomeNumericExpressionsWhichRequireCorrectPrecedence() throws Exception {
		checkNumericExpression("12+3*5", 27);
		checkNumericExpression("12 + 3 * 5", 27);
		// Copy/paste from the TripleA_ScriptLanguage_Reference_Guide.pdf ;-) :
		checkNumericExpression("12 + 3 * 5 - 2 / 5 * 8", new BigDecimal("23.8"));
	}
	
	@Test
	public void testNumericBooleanComparisonExpressionsAndOperators() throws Exception {
		checkBooleanExpression("27 < 30", 27 < 30 /* true */);
		checkBooleanExpression("30 < 27", 30 < 27 /* false */);

		checkBooleanExpression("27 > 30", 27 > 30 /* false */);
		checkBooleanExpression("30 > 27", 30 > 27 /* true */);

		checkBooleanExpression("27 == 27", true);
		checkBooleanExpression("27 == 28", false);

		checkBooleanExpression("27 != 27", false);
		checkBooleanExpression("27 != 28", true);

		checkBooleanExpression("27 <= 28", true);
		checkBooleanExpression("27 <= 27", true);
		checkBooleanExpression("27 <= 26", false);

		checkBooleanExpression("28 >= 27", true);
		checkBooleanExpression("27 >= 27", true);
		checkBooleanExpression("26 >= 27", false);
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
	public void testEmptyScript() throws Exception {
		try {
			checkNumericExpression("", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			// OK
		}

		try {
			checkBooleanExpression("\n;\n", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			// OK
		}
	}
	
	@Test
	public void testWhitespaceAndCommentAroundExpressions() throws Exception {
		checkNumericExpression(" \n.5", new BigDecimal("0.5"));
	}

	@Test
	public void testNegatingNumericLiteralsAndExpressions() throws Exception {
		checkNumericExpression("-1", -1);
		checkNumericExpression("- 1", -1);
		checkNumericExpression("-23.7", new BigDecimal("-23.7"));
		checkNumericExpression("-81.5e2", -8150);
		checkNumericExpression("-.5", new BigDecimal("-0.5"));

		// With WS etc. (Tokenizer will not pick it up; leads to a NegationExpression)
		checkNumericExpression("-   1", -1);
		
		// NegatedExpressions... depending on the parsing implementation, not the same as above..
		checkNumericExpression("-(1+1)", -2);
		
		// I initially had some trouble with NegatedExpression, this should work as well of course:
		checkNumericExpression("5-1", 4);
		checkNumericExpression("5 -1", 4);
		
		// TODO Grammar should support +(1+1) now... fix interpreter.
		// TODO An expression like "+(1+1)" is not supported yet... I think.  Could be added, but very low priority.
		// UNSUPPORTED: checkNumericExpressionScript("+(1+1)", Integer.valueOf( +(1+1) ));
	}
	
	@Test
	public void testTypeMismatchErrorHandlingStringInsteadOfNumberInNegation() throws Exception {
		try {
			checkNumericExpression("- (\"Hello\")", Integer.valueOf(-1));
			Assert.fail("This should have failed...");
		}
		catch (ExpressionParsingException e) {
 			// TODO Column Number does not seem to be working!  Assert.assertEquals(3, e.getErrors().get(0).getColumnNumber());
		}
	}
	
	@Test
	public void testTypeMismatchErrorHandlingDateInsteadOfNumberInAddition() throws Exception {
		try {
			checkNumericExpression("1+2+3+15.06.2008", Integer.valueOf(-1));
			Assert.fail("This should have failed...");
		}
		catch (ExpressionParsingException e) {
//			System.out.println("OK: " + e.getMessage());
			Assert.assertTrue("Exception message does not contain '.2008', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains(".2008"));
			// TODO Column Number does not seem to be working! Assert.assertEquals(6, e.getErrors().get(0).getColumnNumber());
		}
	}

	@Test
	public void testNumberInterpretedAsBoolean() throws Exception {
		checkBooleanExpression("123", true);
		checkBooleanExpression("1", true);
		checkBooleanExpression("-1", true);
		checkBooleanExpression("0", false);
	}
	
	@Test
	public void testTrueFalseLiteralsInterpretedAsBoolean() throws Exception {
		checkBooleanExpression("TRUE", true);
		checkBooleanExpression("FALSE", false);
	}
	
	@Test
	public void testNulllLiteral() throws Exception {
		checkBooleanExpression("NULL", null);
		checkDateExpression("NULL", null);
		checkNumericExpression("NULL", null);
		checkStringExpression("NULL", null);
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
			checkDateExpression("\"Hello\"", null);
			Assert.fail("This should have failed...");
		}
		catch (ExpressionExecutionException e) {
		}
	}

	@Test
	public void testTypeCoercionHandlingNumberAsString() throws Exception {
		checkStringExpression("1+2+3", "6");
	}
}
