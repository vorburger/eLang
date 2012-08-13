package ch.vorburger.el.interpreter;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

import ch.vorburger.el.eL.DateLiteral;
import ch.vorburger.el.eL.DateTimeLiteral;
import ch.vorburger.el.eL.DecimalLiteral;
import ch.vorburger.el.engine.DynamicExpressionContext;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.lib.DateExtensions;
import ch.vorburger.el.scoping.ELScopeProvider;

/**
 * This is the Xtext/Xbase internal interpreter for our DSL.
 * Users should always only use the {@link ExpressionFactory} and {@link Expression} as entry points for expression evaluations.
 * 
 * @author Kai Kreuzer
 *
 */
public class ELInterpreter extends XbaseInterpreter {

	protected Object _evaluateDecimalLiteral(DecimalLiteral literal, IEvaluationContext context, CancelIndicator indicator) {
		BigDecimal result = new BigDecimal(literal.getValue());
		return result;
	}

	protected Object _evaluateDateLiteral(DateLiteral literal, IEvaluationContext context, CancelIndicator indicator) {
		return DateExtensions.parseDateTime(literal.getValue());
	}

	protected Object _evaluateDateTimeLiteral(DateTimeLiteral literal, IEvaluationContext context, CancelIndicator indicator) {
		return DateExtensions.parseDateTime(literal.getValue());
	}
	
	@Override
	protected Object _featureCallJvmIdentifyableElement(JvmIdentifiableElement identifiable, XFeatureCall featureCall, Object receiver,
			IEvaluationContext context, CancelIndicator indicator) {
		Object value = super._featureCallJvmIdentifyableElement(identifiable, featureCall, receiver, context, indicator);
		if(value==null && receiver==null) {
			String featureName = featureCall.toString();
			value = context.getValue(QualifiedName.create(featureName));
		}

		return value;
	}

	@Override
	protected Object featureCallField(JvmField jvmField, Object receiver) {
		if(receiver instanceof EObject) {
			EObject eObj = (EObject) receiver;
			EStructuralFeature feature = eObj.eClass().getEStructuralFeature(jvmField.getSimpleName());
			if(feature!=null) {
				Object value = eObj.eGet(feature);
				if(value instanceof Number) {
					value = new BigDecimal(value.toString());
				}
				return value;
			}
		}
		return super.featureCallField(jvmField, receiver);
	}

	@Override
	protected Object _featureCallField(JvmField jvmField, XAbstractFeatureCall featureCall, Object receiver, IEvaluationContext context, CancelIndicator indicator) {
		if (jvmField instanceof JvmEnumerationLiteral) {
			JvmEnumerationLiteral jvmEnumLiteral = (JvmEnumerationLiteral) jvmField;
			String enumTypeName = jvmEnumLiteral.getEnumType().getQualifiedName();
			String enumLiteralName = jvmEnumLiteral.getSimpleName();
			
			ExpressionContext expressionContext = ELScopeProvider.getExpressionContext(featureCall.eResource());
			if (expressionContext instanceof DynamicExpressionContext) {
				DynamicExpressionContext dynamicExpressionContext = (DynamicExpressionContext) expressionContext;
				EClassifier eClassifier = dynamicExpressionContext.getDeclaredDynType(enumTypeName);
				if (eClassifier instanceof EEnum) {
					EEnum enumType = (EEnum) eClassifier;
					return enumType.getEEnumLiteral(enumLiteralName);
				} else if (eClassifier != null) {
					throw new EvaluationException(new RuntimeException("Unexpected internal problem while resolving " + enumTypeName + "::" + enumLiteralName + ", expected an EEnum but found: " + eClassifier.getInstanceTypeName()));
				}
			}
		}
		return super._featureCallField(jvmField, featureCall, receiver, context, indicator);
	}
	
	
}
