package ch.vorburger.el.engine.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.vorburger.el.ELInjectorProvider;
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
@RunWith(XtextRunner.class)
@InjectWith(ELInjectorProvider.class)
public class ExpressionWithContextGeneratorTest extends AbstractExpressionGeneratorTestBase {

	private static ECoreHelper helper = new ECoreHelper();

	public ExpressionWithContextGeneratorTest() {
		super(new ExpressionFactory());
	}

	@Test
	public void testGenerateWithExpressionContext() throws Exception {
		EDataType dataType = EcorePackage.eINSTANCE.getEBigDecimal();

		EPackage pkg = helper.createPackage("tests");
		EClass clazz = helper.createClass(pkg, "NumericTests");
		helper.addAttribute(clazz, dataType, "a");

		EObject instance = helper.createInstance(clazz);

		XtextResourceSet resourceSet = expressionFactory.getInjector().getInstance(XtextResourceSet.class);
		Resource resource = resourceSet.createResource(URI.createURI("__synthetic.testData.expr"));
		resource.getContents().add(instance);

		// TODO could use TypeReferences getTypeForName() instead JvmTypesBuilder newTypeRef() .. 

		Injector injector = expressionFactory.getInjector();
		JvmTypesBuilder jvmTypesBuilder = injector.getInstance(JvmTypesBuilder.class);
		JvmTypeReferenceBuilder.Factory factory = injector.getInstance(JvmTypeReferenceBuilder.Factory.class);
		JvmTypeReferenceBuilder jvmTypeReferenceBuilder = factory.create(instance.eResource().getResourceSet());

		JvmTypeReference type = jvmTypeReferenceBuilder.typeRef("tests.NumericTests");
		resource.getContents().add(type);

		JvmField field = jvmTypesBuilder.toField(instance, "a", jvmTypeReferenceBuilder.typeRef(dataType.getInstanceClassName() /*"java.math.BigDecimal"*/));
		field.setVisibility(JvmVisibility.PUBLIC);
		type.getMembers().add(field);

		ExpressionContext context = new ExpressionContext(resource);
		context.setType(jvmTypeReferenceBuilder.typeRef(Boolean.TYPE));
		context.addVariable("t", type);

		checkGeneration("t.a == 5", Boolean.TYPE, context, 
		  		  "com.google.common.base.Objects.equal(t.a, new java.math.BigDecimal(\"5\"))");
	}

}

