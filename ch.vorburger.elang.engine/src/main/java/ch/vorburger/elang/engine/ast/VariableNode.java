package ch.vorburger.elang.engine.ast;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;
import ch.vorburger.elang.engine.data.UnknownFieldException;


/**
 *
 *
 * @author Michael Vorburger
 */
// TODO Doc class JavaDoc
/* package-local */ final class VariableNode extends AbstractOperationNode {

	// TODO Should ObjectNavigationNode & VariableNode be merged?  While different in grammer, they're very similiar for interpretation.. ASTTranslator could flatten?  

	private final String variableName;

	public VariableNode(Location location, String varname) {
		super(location);
		this.variableName = varname;
	}

	@Override
	NodeEvalResult evaluate(DataObject root) throws ScriptExcecutionException {
		try {
			return root.getField(variableName, this);
		} catch (UnknownFieldException e) {
			throw newExcecutionException(e, "Could not get field named: " + variableName);
		}
	}

	String getVariableName() {
		return variableName;
	}
}
