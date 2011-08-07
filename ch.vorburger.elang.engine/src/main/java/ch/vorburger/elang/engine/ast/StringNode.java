package ch.vorburger.elang.engine.ast;

import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Either an AST Node holding a literal STRING, or a textual result produced by an operation node.
 * 
 * @author Michael Vorburger
 */
public final class StringNode extends AbstractFixedValueNode {
// TODO Should not be public, but Any (see SomeOtherEntity) needs to be clarified first.
	
	private final String text;
	
	/* package-local */ StringNode(EObject emfASTNode, String text) {
		super(emfASTNode, text);
		// The 'text' contains the "quotes", so we need to strip them:
		this.text = text;
	}

	// TODO I made this class & constructor public instead of package-local for short-term SomeOtherEntity implements DataObject.  Adapt with Any pattern later... and move.
	public StringNode(Location location, String text) {
		super(location);
		this.text = text;
	}

	@Override
	public final Double asDouble() throws ScriptExcecutionException {
		try {
			return Double.valueOf(text);
		}
		catch (NumberFormatException e) {
			throw newExcecutionException("'" + text + "' is not a number");
		}
	}

	@Override
	public Boolean asBoolean() throws ScriptExcecutionException {
		return Boolean.valueOf(text);
	}

	@Override
	public GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException {
		throw newExcecutionException("'" + text + "' is not a Date/Time (but it could may be transformed into one... should this be supported?!)");
	}

	@Override
	public String asString() {
		return text;
	}

	@Override
	public int compare(NodeEvalResult o) throws ScriptExcecutionException {
		return text.compareTo(o.asString());
	}

	@Override
	public boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException {
		return text.equals(y.asString());
	}
}
