package ch.vorburger.elang.engine.tests;

import java.util.GregorianCalendar;

import org.junit.Assert;

import ch.vorburger.elang.engine.ScriptEngine;
import ch.vorburger.elang.engine.ScriptException;
import ch.vorburger.elang.engine.ScriptFactory;
import ch.vorburger.elang.engine.Script;
import ch.vorburger.elang.engine.data.DataObject;


public abstract class AbstractScriptTestBase {

	protected ScriptFactory scriptFactory = new ScriptFactory();
	protected ScriptEngine engine = new ScriptEngine();

	public AbstractScriptTestBase() {
		super();
	}

	protected void checkNumericExpressionScript(String scriptText, Number expectedNumber) throws ScriptException {
		checkNumericExpressionScript(scriptText, null, expectedNumber);
	}
	protected void checkNumericExpressionScript(String scriptText, DataObject rootObj, Number expectedNumber) throws ScriptException {
		Script script = scriptFactory.newScriptFromString(scriptText);
		Number numericResult = engine.evaluateExpressionScriptExpectingNumber(script, rootObj);
		Assert.assertEquals(expectedNumber, numericResult);
	}
	
	protected void checkStringExpressionScript(String scriptText, String expectedText) throws ScriptException {
		checkStringExpressionScript(scriptText, null, expectedText);
	}
	protected void checkStringExpressionScript(String scriptText, DataObject rootObj, String expectedText) throws ScriptException {
		Script script = scriptFactory.newScriptFromString(scriptText);
		String stringResult = engine.evaluateExpressionScriptExpectingString(script, rootObj);
		Assert.assertEquals(expectedText, stringResult);
	}

	protected void checkDateExpressionScript(String scriptText, GregorianCalendar expectedDateTime) throws ScriptException {
		checkDateExpressionScript(scriptText, null, expectedDateTime);
	}
	protected void checkDateExpressionScript(String scriptText, DataObject rootObj, GregorianCalendar expectedDateTime) throws ScriptException {
		Script script = scriptFactory.newScriptFromString(scriptText);
		GregorianCalendar dateResult = engine.evaluateExpressionScriptExpectingGregorianCalendar(script, rootObj);
		Assert.assertEquals(expectedDateTime, dateResult);
	}

	protected void checkBooleanExpressionScript(String scriptText, Boolean expectedBoolean) throws ScriptException {
		checkBooleanExpressionScript(scriptText, null, expectedBoolean);
	}
	protected void checkBooleanExpressionScript(String scriptText, DataObject rootObj, Boolean expectedBoolean) throws ScriptException {
		Script script = scriptFactory.newScriptFromString(scriptText);
		Boolean boolResult = engine.evaluateExpressionScriptExpectingBoolean(script, rootObj);
		Assert.assertEquals(expectedBoolean, boolResult);
	}
}