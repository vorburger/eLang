package ch.vorburger.elang.engine.ast;


import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Abstract superclass for fixed value nodes,
 * created e.g. from/for "literals" in the AST,
 * or results produced by an operation node.
 *   
 * @author Michael Vorburger (MVO)
 */
abstract class AbstractFixedValueNode extends Node {

	protected AbstractFixedValueNode(EObject emfASTNode, String tokenText) {
		super(emfASTNode, tokenText);
	}

	protected AbstractFixedValueNode(LocationImpl p) {
		super(p);
	}

	protected AbstractFixedValueNode(Location location) {
		super(location);
	}

	protected AbstractFixedValueNode() {
		super();
	}

	@Override
	NodeEvalResult evaluate(DataObject root) throws ScriptExcecutionException {
		return this;
	}
	
	@Override
	public DataObject asDataObject() throws ScriptExcecutionException {
		throw newExcecutionException("Indirect Access (field navigation) not possible, this is not a Data Object type: ");
	}
}
