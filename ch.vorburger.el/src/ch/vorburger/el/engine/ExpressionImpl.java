package ch.vorburger.el.engine;


import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.lib.Functions;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

import ch.vorburger.el.generator.ELGenerator;
import ch.vorburger.el.interpreter.ELInterpreter;
import ch.vorburger.el.lib.DecimalExtensions;

import com.google.common.base.Supplier;
import com.google.inject.Inject;
import com.google.inject.Provider;

class ExpressionImpl extends AbstractExpression implements Expression {

	@Inject private ELInterpreter elInterpreter;
	@Inject private Provider<IEvaluationContext> contextProvider;
	@Inject	private EclipseRuntimeDependentJavaCompiler javaCompiler;
	@Inject	private ELGenerator generator;

	private XExpression xExpression;

	@Inject
	private ExpressionImpl() {}


	/* package-local */
	 void setXExpression(XExpression xExpression) {
		this.xExpression = xExpression;
	}

	/* package-local */
	XExpression getXExpression() {
		return xExpression;
	}
	
	public Object evaluate() throws ExpressionExecutionException {
		Object thisElement = null;
	    IEvaluationContext evaluationContext = contextProvider.get();
	    evaluationContext.newValue(XbaseScopeProvider.THIS, thisElement);
	    IEvaluationResult result = elInterpreter.evaluate(xExpression, evaluationContext, CancelIndicator.NullImpl);
	    if (result.getException() != null) {
	        throw new ExpressionExecutionException("Boo!", result.getException());
	    } 
	    return result.getResult();
	}

	@Override
	public Expression compile() throws ExpressionCompilationException {
		initializeClassPath();
		StringConcatenation concatenation = generator.compile(xExpression);
		Class<?> clazz = javaCompiler.compileToClass("CompiledExpression", concatenation.toString());
		try {
			Expression compiledExpression = (Expression) clazz.newInstance();
			return compiledExpression;
		} catch (InstantiationException e) {
			throw new ExpressionCompilationException("Could not compile expression", e);
		} catch (IllegalAccessException e) {
			throw new ExpressionCompilationException("Could not compile expression", e);
		}
	}
	
	private void initializeClassPath() {
		javaCompiler.addClassPathOfClass(getClass()); // this bundle
		javaCompiler.addClassPathOfClass(DecimalExtensions.class); // xbase.lib
		javaCompiler.addClassPathOfClass(Functions.class); // xbase.lib
		javaCompiler.addClassPathOfClass(Provider.class);  // google guice
		javaCompiler.addClassPathOfClass(Supplier.class);  // google collect
	}

	
}
