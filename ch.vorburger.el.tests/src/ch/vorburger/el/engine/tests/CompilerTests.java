package ch.vorburger.el.engine.tests;

import java.lang.reflect.Method;
import java.math.BigDecimal;

import static org.junit.Assert.*;

import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.junit.validation.ValidationTestHelper;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;
import org.eclipse.xtext.xbase.lib.Functions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.vorburger.el.generator.ELGenerator;
import ch.vorburger.el.lib.TypeExtensions;

import com.google.common.base.Supplier;
import com.google.inject.Inject;
import com.google.inject.Provider;

@RunWith(XtextRunner.class)
@InjectWith(InjectorProviderCustom.class)
public class CompilerTests {
	
	@Inject
	private EclipseRuntimeDependentJavaCompiler javaCompiler;

	@Inject
	private ParseHelper<XExpression> parseHelper;

	@Inject
	private ValidationTestHelper validationHelper;
	
	@Inject
	private ELGenerator generator;
	
	@Before
	public void initializeClassPath() throws Exception {
		javaCompiler.addClassPathOfClass(getClass()); // this bundle
		javaCompiler.addClassPathOfClass(TypeExtensions.class); // xbase.lib
		javaCompiler.addClassPathOfClass(Functions.class); // xbase.lib
		javaCompiler.addClassPathOfClass(Provider.class);  // google guice
		javaCompiler.addClassPathOfClass(Supplier.class);  // google collect
	}

	protected Object invokeXbaseExpression(String expression) throws Exception {
		XExpression parse = parseHelper.parse(expression);
		validationHelper.assertNoErrors(parse);
		StringConcatenation concatenation = generator.compile(parse);
		Class<?> clazz = javaCompiler.compileToClass("ExpressionWrapper", concatenation.toString());
		Object classInstance = clazz.newInstance();
		Method method = clazz.getDeclaredMethod("evaluate");
		return method.invoke(classInstance);
	}

	@Test
	public void testCompileExpression() throws Exception {
		Object result = invokeXbaseExpression("1+2");
		assertTrue("Result is not 3!", new BigDecimal(3).compareTo((BigDecimal) result)==0);
	}

}
