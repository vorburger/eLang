package ch.vorburger.el.engine;


import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import ch.vorburger.el.generator.ELCompiler;

import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class ExpressionImpl extends AbstractExpression {

	@Inject protected IExpressionInterpreter elInterpreter;
	@Inject protected Provider<IEvaluationContext> contextProvider;

	@Inject protected ELCompiler compiler;
	
	protected XExpression xExpression;


	/* package-local */
	 void setXExpression(XExpression xExpression) {
		this.xExpression = xExpression;
	}

	/* package-local */
	XExpression getXExpression() {
		return xExpression;
	}
	
	@Override
	public Object evaluate(ExpressionContext context) throws ExpressionExecutionException {
		Object thisElement = null;
	    IEvaluationContext evaluationContext = contextProvider.get();
	    evaluationContext.newValue(XbaseScopeProvider.THIS, thisElement);

	    if(context!=null) {
			for(String elementName : context.getVariableNames()) {
				Object instance = context.getInstance(elementName);
				if(instance==null && context instanceof DynamicExpressionContext) {
					instance = ((DynamicExpressionContext)context).getDynInstance(elementName);					
				}
				if(instance!=null) {
					evaluationContext.newValue(QualifiedName.create(elementName), instance);
				}
			}
	    } else {
	    	context = new ExpressionContext();
	    }

	    IEvaluationResult result = elInterpreter.evaluate(getXExpression(), evaluationContext, CancelIndicator.NullImpl);
	    if (result.getException() != null) {
	        throw new ExpressionExecutionException("Boo!", result.getException());
	    } 
	    return result.getResult();
	}

	@Override
	public Object evaluate() throws ExpressionExecutionException {
		return evaluate(null);
	}

	@Override
	public String generateJavaCode(Class<?> expectedType) {
		ImportManager importManager = new ImportManager(false);
		FakeTreeAppendable appendable = new FakeTreeAppendable(importManager);
		return compiler.compileAsJavaExpression(getXExpression(), appendable, expectedType).toString();
	}
	
}
