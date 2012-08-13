package ch.vorburger.el.validation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator;

import ch.vorburger.el.eL.DateLiteral;
import ch.vorburger.el.eL.DateTimeLiteral;
import ch.vorburger.el.eL.ELPackage;
import ch.vorburger.el.engine.ExpressionContext;
import ch.vorburger.el.lib.DateExtensions;

import com.google.inject.Inject;
 

@SuppressWarnings("restriction")
public class ELJavaValidator extends XbaseJavaValidator {

	@Inject
	private ITypeProvider typeProvider;
	
	@Inject
	private TypeReferences typeReferences;
	
	@Inject
	private TypeConformanceComputer conformanceComputer;
	
	@Check
	public void checkValidDate(DateLiteral date) {
		try {
			int[] args = DateExtensions.getGregorianCalendarConstructorArgs(date.getValue());
			if(args[0]<1000 || args[0]>3000) { // check year
				error("No valid year in the given date", ELPackage.Literals.DATE_LITERAL__VALUE);
			}
			if(args[1]<0 || args[1]>11) { // check month
				error("No valid month in the given date", ELPackage.Literals.DATE_LITERAL__VALUE);
			}
			if(args[2]<1 || args[2]>31) { // check day
				error("No valid day in the given date", ELPackage.Literals.DATE_LITERAL__VALUE);
			}
		} catch(RuntimeException e) {
			error(e.getMessage(), ELPackage.Literals.DATE_LITERAL__VALUE);
		}
	}

	@Check
	public void checkValidDateTime(DateTimeLiteral date) {
		try {
			int[] args = DateExtensions.getGregorianCalendarConstructorArgs(date.getValue());
			if(args[0]<1000 || args[0]>3000) { // check year
				error("No valid year in the given date", ELPackage.Literals.DATE_TIME_LITERAL__VALUE);
			}
			if(args[1]<0 || args[1]>11) { // check month
				error("No valid month in the given date", ELPackage.Literals.DATE_TIME_LITERAL__VALUE);
			}
			if(args[2]<1 || args[2]>31) { // check day
				error("No valid day in the given date", ELPackage.Literals.DATE_TIME_LITERAL__VALUE);
			}
			if(args[3]<0 || args[3]>23) { // check hour
				error("No valid hour in the given time", ELPackage.Literals.DATE_TIME_LITERAL__VALUE);
			}
			if(args[4]<0 || args[4]>59) { // check minute
				error("No valid minute in the given time", ELPackage.Literals.DATE_TIME_LITERAL__VALUE);
			}
			if(args[5]<0 || args[5]>59) { // check second
				error("No valid second in the given time", ELPackage.Literals.DATE_TIME_LITERAL__VALUE);
			}
		} catch(RuntimeException e) {
			error(e.getMessage(), ELPackage.Literals.DATE_TIME_LITERAL__VALUE);
		}
	}

	@Check
	public void checkType(XExpression obj) {
		if(obj.eContainer()==null) {
			Adapter adapter = EcoreUtil.getAdapter(obj.eResource().eAdapters(), ExpressionContext.class);
			if(adapter!=null) {
				ExpressionContext context = (ExpressionContext) adapter;
				Object returnType = context.getExpectedReturnType();
				JvmTypeReference expectedJvmType = null;
				if(returnType instanceof EClass) {
					expectedJvmType = typeReferences.getTypeForName(((EClass) returnType).getName(), obj);
				}
				if(returnType instanceof Class<?>) {
					expectedJvmType = typeReferences.getTypeForName((Class<?>) returnType, obj);
				}
				JvmTypeReference returnedType = typeProvider.getType(obj, false);

				if(expectedJvmType!=null && returnedType!=null && !conformanceComputer.isConformant(expectedJvmType, returnedType, true)) {
					error("Expression does not match expected return type " + expectedJvmType.getSimpleName(), obj.eContainingFeature());
				}
			}
		}
	}

}
