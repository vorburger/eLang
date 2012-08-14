package ch.vorburger.el.generator;

import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

import ch.vorburger.el.eL.DateLiteral;
import ch.vorburger.el.eL.DateTimeLiteral;
import ch.vorburger.el.eL.DecimalLiteral;
import ch.vorburger.el.lib.DateExtensions;

/**
 * This class does the code generation for expressions (beware, the name "compiler" is a bit misleading here).
 * 
 * @author Kai Kreuzer
 */
@SuppressWarnings("restriction")
public class ELCompiler extends XbaseCompiler {

	public String compile(XExpression expression, ImportManager importManager) {
		FakeTreeAppendable appendable = new FakeTreeAppendable(importManager);
		return compile(expression, appendable,
				TypesFactory.eINSTANCE.createJvmAnyTypeReference()).toString();
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
