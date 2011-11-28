package ch.vorburger.el.interpreter;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

import ch.vorburger.el.eL.DateLiteral;
import ch.vorburger.el.eL.DateTimeLiteral;
import ch.vorburger.el.eL.DecimalLiteral;
import ch.vorburger.el.lib.DateExtensions;

@SuppressWarnings("restriction")
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
}
