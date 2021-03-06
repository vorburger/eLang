package ch.vorburger.el.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;

import ch.vorburger.el.eL.DateLiteral;
import ch.vorburger.el.eL.DateTimeLiteral;
import ch.vorburger.el.eL.DecimalLiteral;
import ch.vorburger.el.lib.DateExtensions;

import com.google.inject.Inject;

/**
 * This class does the code generation for expressions (beware, the name "compiler" is a bit misleading here).
 * 
 * @author Kai Kreuzer
 * @author Michael Vorburger - fixes after upgrade to Xtext v2.3.1 (@see http://koehnlein.blogspot.ch/2011/07/extending-xbase.html, but it's not accurate anymore)
 */
@SuppressWarnings("restriction")
public class ELCompiler extends XbaseCompiler {

	private @Inject JvmTypeReferenceBuilder.Factory factory;
	private JvmTypeReferenceBuilder jvmTypeReferenceBuilder;
	
	protected JvmTypeReferenceBuilder getJvmTypeReferenceBuilder(EObject context) {
		if (jvmTypeReferenceBuilder == null) {
			jvmTypeReferenceBuilder = factory.create(context.eResource().getResourceSet());
		}
		return jvmTypeReferenceBuilder;
	}
	
	public ITreeAppendable compile(XExpression obj, ITreeAppendable appendable, Class<?> expectedType) {
		final JvmTypeReference newTypeRef = getJvmTypeReferenceBuilder(obj).typeRef(expectedType);
		final LightweightTypeReference newLightTypeRef = newTypeReferenceOwner(obj).toLightweightTypeReference(newTypeRef);
		return compile(obj, appendable, newLightTypeRef);
	}
	
	public ITreeAppendable compileAsJavaExpression(XExpression obj, ITreeAppendable parentAppendable, Class<?> expectedType) {
		final JvmTypeReference newTypeRef = getJvmTypeReferenceBuilder(obj).typeRef(expectedType);
		return compileAsJavaExpression(obj, parentAppendable, newTypeRef);
	}
	
	@Override
	public void _toJavaStatement(XExpression obj, ITreeAppendable appendable, boolean isReferenced) {
		if (obj instanceof DecimalLiteral) {
			generateComment(obj, appendable, isReferenced);
		} else if (obj instanceof DateLiteral) {
			generateComment(obj, appendable, isReferenced);
		} else if (obj instanceof DateTimeLiteral) {
			generateComment(obj, appendable, isReferenced);
		} else {
			super._toJavaStatement(obj, appendable, isReferenced);
		}
	}

	@Override
	public void _toJavaExpression(XExpression obj, ITreeAppendable appendable) {
		if (obj instanceof DecimalLiteral) {
			_toJavaExpression((DecimalLiteral) obj, appendable);
		} else if (obj instanceof DateLiteral) {
			_toJavaExpression((DateLiteral) obj, appendable);
		} else if (obj instanceof DateTimeLiteral) {
			_toJavaExpression((DateTimeLiteral) obj, appendable);
		} else {
			super._toJavaExpression(obj, appendable);
		}
	}
	
	protected void _toJavaExpression(DecimalLiteral expr, ITreeAppendable b) {
		b.append("new java.math.BigDecimal(\"" + expr.getValue() + "\")");
	}

	protected void _toJavaExpression(DateLiteral expr, ITreeAppendable b) {
		int[] args = DateExtensions.getGregorianCalendarConstructorArgs(expr.getValue());
		b.append("new java.util.GregorianCalendar(");
		for(int i=0; i<6; i++) {
			b.append(String.valueOf(args[i]));
			if(i<5) b.append(", ");
		}
		b.append(")");
	}

	protected void _toJavaExpression(DateTimeLiteral expr, ITreeAppendable b) {
		int[] args = DateExtensions.getGregorianCalendarConstructorArgs(expr.getValue());
		b.append("new java.util.GregorianCalendar(");
		for(int i=0; i<6; i++) {
			b.append(String.valueOf(args[i]));
			if(i<5) b.append(", ");
		}
		b.append(")");
	}

}
