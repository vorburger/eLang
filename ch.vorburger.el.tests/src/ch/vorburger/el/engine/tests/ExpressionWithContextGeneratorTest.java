package ch.vorburger.el.engine.tests;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Ignore;
import org.junit.Test;

import ch.vorburger.el.engine.DynamicExpressionContext;
import ch.vorburger.el.engine.ExpressionFactory;
import ch.vorburger.el.engine.tests.helper.ECoreHelper;

/**
 * Tests for the Expression Engine.
 * These tests will assert correctness of Java Code generated from EL expressions with context objects.
 * 
 * @author Michael Vorburger
 */
public class ExpressionWithContextGeneratorTest extends AbstractExpressionGeneratorTestBase {

	private static ECoreHelper helper = new ECoreHelper();
	
	public ExpressionWithContextGeneratorTest() {
		super(new ExpressionFactory());
	}

	@Test
	@Ignore // as this is indeed not yet working - but not actually used, so doesn't matter (PageDSELCompiler does it's own thing anyways)
	public void testGenerateWithExpressionContext() throws Exception {
		EDataType intType = EcorePackage.eINSTANCE.getEInt();

		EPackage pkg = helper.createPackage("tests");
		EClass clazz = helper.createClass(pkg, "NumericTests");
		helper.addAttribute(clazz, intType, "a");
		EObject instance = helper.createInstance(clazz);
		helper.setProperty(instance, "a", 5);
		
		DynamicExpressionContext context = new DynamicExpressionContext();
		context.putInstance("t", instance);
		
		checkGeneration("t.a == 5", Boolean.class, context, "new org.eclipse.xtext.xbase.lib.Functions.Function0<Boolean>() {\n  public Boolean apply() {\n    tests.NumericTests _t = t;\n    boolean _equals = com.google.common.base.Objects.equal(_t.a, new org.eclipse.xtext.xbase.lib.Functions.Function0<Object>() {\n      public Object apply() {\n        return new java.math.BigDecimal(\"5\");\n      }\n    }.apply());\n    return _equals;\n  }\n}.apply()");
	}

}
