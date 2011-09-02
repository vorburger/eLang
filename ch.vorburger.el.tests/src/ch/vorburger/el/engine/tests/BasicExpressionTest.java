package ch.vorburger.el.engine.tests;



import java.math.BigDecimal;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import ch.vorburger.el.engine.ExpressionException;
import ch.vorburger.el.engine.ExpressionExecutionException;
import ch.vorburger.el.engine.ExpressionFactory;
import ch.vorburger.el.engine.ExpressionParsingException;


/**
 * Basic Tests for the Expression Engine.
 * 
 * @author Michael Vorburger
 * @author Kai Kreuzer
*/
public class BasicExpressionTest extends AbstractExpressionTestBase {
	
	public BasicExpressionTest() {
		super(new ExpressionFactory());
	}

	protected BasicExpressionTest(ExpressionFactory expressionFactory) {
		super(expressionFactory);
	}

	@Test
	public void testFixedNumericLiterals() throws Exception {
		checkNumericExpression("1", 1);
		checkNumericExpression("1", 1);
		checkNumericExpression("23.7", new BigDecimal("23.7"));
		checkNumericExpression("23.73", new BigDecimal("23.73"));
		checkNumericExpression("81.5e2", 8150);
		checkNumericExpression(".5", new BigDecimal(0.5));		
	}
	
	@Test
	public void testFixedDateLiterals() throws Exception {
		checkDateExpression("15.06.2008", new GregorianCalendar(2008,06-1,15));
		checkDateExpression("15.06.2008 18:23:53", new GregorianCalendar(2008,06-1,15,18,23,53));
		checkDateExpression("9.1.2008", new GregorianCalendar(2008,01-1,9));
		checkDateExpression("9.1.2008 18:23:53", new GregorianCalendar(2008,01-1,9,18,23,53));

		try {
			checkDateExpression("15.13.2008", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			Assert.assertTrue("Exception message does not contain '13', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("13"));
		}
		try {
			checkDateExpression("15.00.2008", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			Assert.assertTrue("Exception message does not contain '00', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("00"));
		}
		try {
			checkDateExpression("00.10.2008", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			Assert.assertTrue("Exception message does not contain '00', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("00"));
		}
		try {
			checkDateExpression("32.10.2008", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			Assert.assertTrue("Exception message does not contain '32', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("32"));
		}
		try {
			checkDateExpression("01.10.2008 24:00:00", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			Assert.assertTrue("Exception message does not contain '24', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("24"));
		}
		try {
			checkDateExpression("01.10.2008 00:60:00", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			Assert.assertTrue("Exception message does not contain '60', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("60"));
		}
		try {
			checkDateExpression("01.10.2008 00:00:60", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			Assert.assertTrue("Exception message does not contain '60', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("60"));
		}

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
		checkNumericExpression("26/13", 2);
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

	@Test
	public void testStringBooleanOperators() throws Exception {
		checkBooleanExpression("\"ABC\" == \"ABC\"", true);
		checkBooleanExpression("\"ABC\" == \"CBA\"", false);
		
		checkBooleanExpression("\"ABC\" != \"ABC\"", false);
		checkBooleanExpression("\"ABC\" != \"CBA\"", true);

		checkBooleanExpression("\"ABC\" < \"ABC\"", false);
		checkBooleanExpression("\"ABC\" <= \"ABC\"", true);
		checkBooleanExpression("\"ABC\" > \"ABC\"", false);
		checkBooleanExpression("\"ABC\" >= \"ABC\"", true);
		checkBooleanExpression("\"ABC\" < \"CBA\"", true);
		checkBooleanExpression("\"ABC\" > \"CBA\"", false);
	}

	@Test
	public void testInvalidTypeComparison() throws Exception {
		try {
			checkBooleanExpression("\"ABC\" > 0", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			// OK
		}

		try {
			checkBooleanExpression("\"ABC\" < 0", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			// OK
		}

		try {
			checkBooleanExpression("\"ABC\" > 01.01.2011", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			// OK
		}

		try {
			checkBooleanExpression("\"ABC\" > true", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			// OK
		}

		try {
			checkBooleanExpression("1+1 || 2", null);
			Assert.fail("This should have failed...");
		} catch (ExpressionParsingException e) {
			// OK
		}

	}

	@Test
	public void testDateComparison() throws Exception {
		checkBooleanExpression("01.01.2011>31.12.2010", true);		
		checkBooleanExpression("01.01.2011<31.12.2010", false);		
		checkBooleanExpression("01.01.2011 < 31.12.2010", false);		
		checkBooleanExpression("01.01.2011==31.12.2010", false);		
		checkBooleanExpression("01.01.2011!=31.12.2010", true);		

		checkBooleanExpression("01.01.2011 00:00:00==01.01.2011", true);		
		checkBooleanExpression("01.01.2011 00:00:00<01.01.2011 01:01:01", true);		
		checkBooleanExpression("01.01.2011 00:00:00 < 01.01.2011 01:01:01", true);		
		checkBooleanExpression("01.01.2011>01.01.2011 01:01:01", false);		
		checkBooleanExpression("01.01.2011 > 01.01.2011 01:01:01", false);		
	}
	
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
	public void testWhitespaceAroundExpressions() throws Exception {
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
	}
	
	@Test
	public void testTypeMismatchErrorHandlingStringInsteadOfNumberInNegation() throws Exception {
		try {
			checkNumericExpression("- (\"Hello\")", Integer.valueOf(-1));
			Assert.fail("This should have failed...");
		}
		catch (ExpressionParsingException e) {
 			Assert.assertEquals(0, e.getErrors().get(0).getColumnNumber());
		}
	}
	
	@Test
	public void testTypeMismatchErrorHandlingDateInsteadOfNumberInAddition() throws Exception {
		try {
			checkNumericExpression("1.4+16.06.2008", Integer.valueOf(-1));
			Assert.fail("This should have failed...");
		}
		catch (ExpressionParsingException e) {
			Assert.assertTrue("Exception message does not contain '.2008', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("16.06.2008"));
			Assert.assertEquals(4, e.getErrors().get(0).getColumnNumber());
			Assert.assertEquals(10, e.getErrors().get(0).getLength());
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
	
	
	@Test
	@Ignore
	// This one contradicts the test testNumberInterpretedAsBoolean
	public void testTypeMismatchErrorHandlingNumberInsteadOfBoolean() throws Exception {
		try {
			checkBooleanExpression("123", true);
			Assert.fail("This should have failed...");
		}
		catch (ExpressionExecutionException e) {
			Assert.assertTrue("Exception message does not contain '123', the faulty part of the expression, as expected, but instead: " + e.getMessage(), e.getMessage().contains("123"));
			// System.out.println("OK: " + e.getMessage());
		}
	}

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
