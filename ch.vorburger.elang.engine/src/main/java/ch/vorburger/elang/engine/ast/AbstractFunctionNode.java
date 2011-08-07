package ch.vorburger.elang.engine.ast;

import ch.vorburger.elang.engine.data.Location;

/**
 * Function Node.
 * 
 * @see Subclasses.
 * 
 * @author Michael Vorburger (MVO)
 */
abstract class AbstractFunctionNode extends AbstractOperationNode {

	protected AbstractFunctionNode(Location loc) {
		super(loc);
	}
}
