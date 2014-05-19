package ch.vorburger.el.engine.tests;

import java.math.BigDecimal;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.vorburger.el.ELInjectorProvider;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.engine.ExpressionFactory;

/**
 * Basic Tests for the Expression Engine.
 * These tests will assert corrected of Java Code generated from EL expressions.
 * 
 * @author Michael Vorburger
 */
@RunWith(XtextRunner.class)
@InjectWith(ELInjectorProvider.class)
public class BasicExpressionGeneratorTest extends AbstractExpressionGeneratorTestBase {

	private ExpressionContext context;

	public BasicExpressionGeneratorTest() {
		super(new ExpressionFactory());
		
		XtextResourceSet resourceSet = expressionFactory.getInjector().getInstance(XtextResourceSet.class);
		context = new ExpressionContext(resourceSet);
	}

	@Test
	public void testNumberLiteral() throws Exception {
		checkGeneration("23.7", BigDecimal.class, context, "new org.eclipse.xtext.xbase.lib.Functions.Function0<java.math.BigDecimal>() {\n  public java.math.BigDecimal apply() {\n    return new java.math.BigDecimal(\"23.7\");\n  }\n}.apply()");
	}

	@Test
	public void testNotNull() throws Exception {
		checkGeneration("\"Saluton\" == null", Boolean.class, context, "com.google.common.base.Objects.equal(\"Saluton\", null)");
	}

	@Test
	public void testIfExpression() throws Exception {
		checkGeneration("if (true) true else false", Boolean.class, context, "new org.eclipse.xtext.xbase.lib.Functions.Function0<Boolean>() {\n  public Boolean apply() {\n    boolean _xifexpression = false;\n    if (true) {\n      _xifexpression = true;\n    } else {\n      _xifexpression = false;\n    }\n    return _xifexpression;\n  }\n}.apply()");
	}

}
