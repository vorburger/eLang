package ch.vorburger.elang.engine.ast;

import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Either an AST Node holding a literal NUMBER, or a numeric result produced by an operation node.
 * 
 * @author Michael Vorburger
 */
// TODO /* package-local */ this shouldn't have to be public, it only temporarily is, for TestBeanDataObjectWrapper 
public final class NumberNode extends AbstractFixedValueNode {
	
	// Use of java.lang.Double may be reviewed later...
	// Could NumberNode abstract, and subclass e.g. IntegerNumberNode, Float/Double/BigDecimal-NumberNode -- faster??
	// Better to let the Lexer make the choice between Integer and other, than code here!
	// The problem is when a Numeric Node is then actually used for an operation,
	// Negation or Add/Sub/Mult/Div - Java doesn't offer these for Number!  
	private final Double number;
	
	/* package-local */ NumberNode(EObject emfASTNode, String number) {
		super(emfASTNode, number);
		// TODO Integer?? Double?  Float?  BigDecimal??
		this.number = new Double(number);
	}

	// TODO /* package-local */ this shouldn't have to be public, it only temporarily is, for TestBeanDataObjectWrapper 
	public NumberNode(Location location, double number) {
		super(location);
		this.number = number;
	}

	@Override
	public final Double asDouble() {
		return (Double) number;
	}

	@Override
	public Boolean asBoolean() throws ScriptExcecutionException {
		return number.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
	}

	@Override
	public GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException {
		throw newExcecutionException("Can not convert numeric value (" + number + ") into a Date/Time");
	}

	@Override
	public String asString() throws ScriptExcecutionException {
		return number.toString();
	}

	@Override
	public int compare(NodeEvalResult o) throws ScriptExcecutionException {
		return number.compareTo(o.asDouble());
	}

	@Override
	public boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException {
		return number.equals(y.asDouble());
	}
}
