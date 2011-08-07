package ch.vorburger.elang.engine.tests;

import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.ScriptException;

/**
 * Script Tests with Variables.
 *
 * @author Michael Vorburger
 */
public class VariablesTest extends AbstractScriptTestBase {

//	@Test
//	public void testPassFlatVariableWithoutNavigationFixedValueNoObject() throws ScriptException {
//		Map<String,Object> variables = new HashMap<String, Object>();
//		variables.put("avar", 27);
//		checkNumericExpressionScript("avar", variables, 27.0);
//	}
	
	@Test
	public void testPassFlatVariableWithoutNavigationEntityObject() throws ScriptException {
		SomeEntity e = new SomeEntity();
		e.setNumericAttribute(286);
		e.setStringAttribute("Hello World");
		e.setBooleanAttribute(true);
		e.setCalendarAttribute(new GregorianCalendar(2008,06-1,15));
		
		TestBeanDataObjectWrapper bo = new TestBeanDataObjectWrapper(e);
		checkNumericExpressionScript("numericAttribute", bo, 286.0);
		checkStringExpressionScript("stringAttribute", bo, "Hello World");
		checkBooleanExpressionScript("booleanAttribute", bo, true);
		checkDateExpressionScript("calendarAttribute", bo, new GregorianCalendar(2008,06-1,15));
		
		checkNumericExpressionScript("-numericAttribute", bo, -286.0);
		checkNumericExpressionScript("-numericAttribute*2", bo, -286.0 * 2);
		checkNumericExpressionScript("- numericAttribute * 2", bo, -286.0 * 2);
	}

	@Test
	public void testPassSingleVariableNavigation() throws ScriptException {
		SomeOtherEntity someOtherEntity = new SomeOtherEntity("Hello another World");
		SomeEntity e = new SomeEntity();
		e.setAnotherEntity(someOtherEntity);
		
		TestBeanDataObjectWrapper bo = new TestBeanDataObjectWrapper(e);
		checkStringExpressionScript("anotherEntity.anotherStringAttribute", bo, "Hello another World");
		checkStringExpressionScript("anotherEntity . anotherStringAttribute", bo, "Hello another World");
	}

	@Test
	public void testPassDoubleVariableNavigation() throws ScriptException {
		SomeEntity e1 = new SomeEntity();
		SomeOtherEntity e2 = new SomeOtherEntity("Hello another World");
		SomeOtherEntity e3 = new SomeOtherEntity("Yet another world");
		e1.setAnotherEntity(e2);
		e2.setSomeOtherEntity(e3);
		TestBeanDataObjectWrapper bo = new TestBeanDataObjectWrapper(e1);
		checkStringExpressionScript("anotherEntity.someOtherEntity.anotherStringAttribute", bo, "Yet another world");
		
		// TODO Separate test, will fail, but error message should say "xxx" of "anotherEntity" (SomeEntity), with correct column...
		// checkStringExpressionScript("anotherEntity.xxxxx.anotherStringAttribute", bo, "Hello another World");
	}

	@Test
	@Ignore
	public void testVariableNavigationUnknownFieldErrorHandling() throws ScriptException {
		// TODO testVariableNavigationUnknownFieldErrorHandling
	}
	
	@Test
	public void testPassVariableNavigationErrorHandling() throws ScriptException {
		try {
			checkNumericExpressionScript("(1 + 2).someattribute", null, 0);
			Assert.fail("This should have failed...");
		} catch (ScriptExcecutionException e) {
			// Thanks.
		}
	}
	
	@Test 
	@Ignore
	public void testVariableAccessFromFunctionReturningStruct() throws Exception {
		// TODO testVariableAccessFromFunctionReturningStruct!!!
		checkNumericExpressionScript("SOMEENTITY_FOO().someattribute", null, 27);
	}

	@Test
	@Ignore
	public void testObjectVariablesComparison() {
	}

	@Test
	@Ignore
	public void testVariableWithStringComparison() {
		// TODO testVariableWithStringComparison
	}
}
