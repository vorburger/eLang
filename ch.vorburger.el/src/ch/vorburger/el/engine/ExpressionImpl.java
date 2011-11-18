package ch.vorburger.el.engine;


import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.eclipse.xtext.xbase.lib.Functions;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

import ch.vorburger.el.generator.ELGenerator;
import ch.vorburger.el.lib.DecimalExtensions;

import com.google.common.base.Supplier;
import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class ExpressionImpl extends AbstractExpression implements Expression {

	@Inject protected IExpressionInterpreter elInterpreter;
	@Inject protected Provider<IEvaluationContext> contextProvider;
	@Inject	protected EclipseRuntimeDependentJavaCompiler javaCompiler;
	@Inject	protected IGenerator generator;

	private XExpression xExpression;

	@Inject
	public ExpressionImpl() {}


	/* package-local */
	 void setXExpression(XExpression xExpression) {
		this.xExpression = xExpression;
	}

	/* package-local */
	XExpression getXExpression() {
		return xExpression;
	}
	
	public Object evaluate(ExpressionContext context) throws ExpressionExecutionException {
		Object thisElement = null;
	    IEvaluationContext evaluationContext = contextProvider.get();
	    evaluationContext.newValue(XbaseScopeProvider.THIS, thisElement);

	    if(context!=null) {
			for(String elementName : context.getElementNames()) {
				
				evaluationContext.newValue(QualifiedName.create(elementName), context.getInstance(elementName));
			}
	    } else {
	    	context = new ExpressionContext();
	    }

	    IEvaluationResult result = elInterpreter.evaluate(xExpression, evaluationContext, CancelIndicator.NullImpl);
	    if (result.getException() != null) {
	        throw new ExpressionExecutionException("Boo!", result.getException());
	    } 
	    return result.getResult();
	}

	public Object evaluate() throws ExpressionExecutionException {
		return evaluate(null);
	}
	
	@Override
	public Expression compile() throws ExpressionCompilationException {
		initializeClassPath();
		StringConcatenation concatenation = ((ELGenerator)generator).compile(xExpression);
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
	
	protected void initializeClassPath() {
		javaCompiler.addClassPathOfClass(getClass()); // this bundle
		javaCompiler.addClassPathOfClass(DecimalExtensions.class); // xbase.lib
		javaCompiler.addClassPathOfClass(Functions.class); // xbase.lib
		javaCompiler.addClassPathOfClass(Provider.class);  // google guice
		javaCompiler.addClassPathOfClass(Supplier.class);  // google collect
	}

}
