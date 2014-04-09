package ch.vorburger.el.engine.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.junit.Test;

import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.engine.ExpressionFactory;
import ch.vorburger.el.engine.tests.helper.ECoreHelper;

import com.google.inject.Injector;

/**
 * Tests for the Expression Engine. These tests will assert correctness of Java
 * Code generated from EL expressions with context objects.
 * 
 * @author Michael Vorburger
 */
public class ExpressionWithContextGeneratorTest extends AbstractExpressionGeneratorTestBase {

	private static ECoreHelper helper = new ECoreHelper();

	public ExpressionWithContextGeneratorTest() {
		super(new ExpressionFactory());
	}

	@Test
	public void testGenerateWithExpressionContext() throws Exception {
		EDataType intType = EcorePackage.eINSTANCE.getEInt();

		EPackage pkg = helper.createPackage("tests");
		EClass clazz = helper.createClass(pkg, "NumericTests");
		helper.addAttribute(clazz, intType, "a");

		EObject instance = helper.createInstance(clazz);

		Injector injector = expressionFactory.getInjector();

		XtextResourceSet resourceSet = expressionFactory.getResourceSet();
		Resource resource = resourceSet.createResource(URI.createURI("__synthetic.testData.expr"));
		resource.getContents().add(instance);

		JvmTypesBuilder jvmTypesBuilder = injector .getInstance(JvmTypesBuilder.class);
		JvmGenericType type = jvmTypesBuilder.toClass(instance, "tests.NumericTests");
		resource.getContents().add(type);

		JvmField field = jvmTypesBuilder.toField(instance, "a", jvmTypesBuilder.newTypeRef(instance, "java.math.BigDecimal"));
		field.setVisibility(JvmVisibility.PUBLIC);
		type.getMembers().add(field);

		ExpressionContext context = new ExpressionContext();
		context.setType(jvmTypesBuilder.newTypeRef(instance, Boolean.TYPE).getType());
		context.addVariable("t", type);

		checkGeneration("t.a == 5", Boolean.TYPE, context,  
				  		  "new org.eclipse.xtext.xbase.lib.Functions.Function0<Boolean>() {\n" 
				  		+ "  public Boolean apply() {\n"
						+ "    boolean _equals = com.google.common.base.Objects.equal(t.a, new org.eclipse.xtext.xbase.lib.Functions.Function0<Object>() {\n"
						+ "      public Object apply() {\n"
						+ "        return new java.math.BigDecimal(\"5\");\n"
						+ "      }\n" + "    }.apply());\n"
						+ "    return _equals;\n"
						+ "  }\n"
						+ "}.apply()");
	}

}
