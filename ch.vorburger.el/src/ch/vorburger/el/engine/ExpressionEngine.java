package ch.vorburger.el.engine;


import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;

import ch.vorburger.el.interpreter.ELInterpreter;

import com.google.inject.Inject;
import com.google.inject.Provider;


/**
 * Expression Engine, can "run" (execute) Expression.
 *  
 * @see Expression
 * @author Michael Vorburger
 */
public class ExpressionEngine {

	// TODO The ExpressionEngine and Expression/ExpressionImpl class so far have little difference/reason for being different, will they later have, or merge them?
	
	@Inject private ELInterpreter elInterpreter;
	@Inject private Provider<IEvaluationContext> contextProvider;
	
	/* package-local */
	ExpressionEngine(/* Need anything here?? */) {
	}
	
	private Object evaluateExpression(final Expression expression) throws ExpressionExecutionException {
		Object thisElement = null;
		XExpression xExpression = ((ExpressionImpl) expression).getXExpression();
	    IEvaluationContext evaluationContext = contextProvider.get();
	    //evaluationContext.newValue(XbaseScopeProvider.THIS, thisElement);
	    IEvaluationResult result = elInterpreter.evaluate(xExpression, evaluationContext, CancelIndicator.NullImpl);
	    if (result.getException() != null) {
	        throw new ExpressionExecutionException("Boo!", result.getException());
	    } 
	    return result.getResult();
	}
	
	

	// TODO Better use some kind of expressionID in signatures, and new additional some ExpressionRepository?  
	// Actually probably NO, a future new ExpressionRepository would be additional..  on top of the existing, not modifying it.
	
	// TODO Return Any (ex-NodeEvalResult) instead of 4-5 different signatures?
	
	public BigDecimal evaluateExpressionExpectingNumber(final Expression expression/*, final DataObject rootObj*/) throws ExpressionExecutionException {
		try {
			return (BigDecimal) evaluateExpression(expression);
		} catch(ClassCastException e) {
			throw new ExpressionExecutionException("Expression does not evaluate to a Number.");
		}
	}

	public GregorianCalendar evaluateExpressionExpectingGregorianCalendar(final Expression expression, final Object rootObj) throws ExpressionExecutionException {
		try {
			return (GregorianCalendar) evaluateExpression(expression);
		} catch(ClassCastException e) {
			throw new ExpressionExecutionException("Expression does not evaluate to a GregorianCalendar.");
		}
	}

	public Date evaluateExpressionExpectingDate(final Expression expression, final Object rootObj) throws ExpressionExecutionException {
		// Implementation may change; clients should use method with most appropriate return type for client 
		try {
			GregorianCalendar result = (GregorianCalendar) evaluateExpression(expression);
			return result.getTime();
		} catch(ClassCastException e) {
			throw new ExpressionExecutionException("Expression does not evaluate to a Date.");
		}
	}

	public String evaluateExpressionExpectingString(final Expression expression, final Object rootObj) throws ExpressionExecutionException {
		Object result = evaluateExpression(expression);
		if(result==null) {
			return null;
		} else {
			return evaluateExpression(expression).toString();
		}
	}

	public Boolean evaluateExpressionExpectingBoolean(final Expression expression, final Object rootObj) throws ExpressionExecutionException {
		try {
			Object result = evaluateExpression(expression);
			if(result instanceof BigDecimal) {
				return ((BigDecimal) result).intValue()!=0;
			} else {
				return (Boolean) evaluateExpression(expression);
			}
		} catch(ClassCastException e) {
			throw new ExpressionExecutionException("Expression does not evaluate to a Boolean.");
		}
	}

//	public DataObject evaluateExpressionExpectingDataObject(Expression expression/*, DataObject rootObj*/) throws ExpressionExcecutionException {
//		return ((ExpressionImpl)expression).evaluateExpressionExpectingDataObject(null /*rootObj*/);
//	}
}
