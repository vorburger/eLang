package ch.vorburger.elang.engine.ast;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.NodeEvalResult;
import ch.vorburger.elang.engine.data.UnknownFieldException;


/**
 * Node type for "object navigations", e.g. 'anE.numericAttribute' or
 * also 'aSecondE.anotherEntity.stringAttribute', including
 * 'aSecondE.anotherEntity[3]' (TODO). 
 * 
 * @author Michael Vorburger (MVO)
 */
public class ObjectNavigationNode extends AbstractOperationNode {

	// TODO SquareBracketFunction are NOT handled yet here.  That will probably best be another Node sub-type, one per known SquareBracketFunction?
	
	// TODO Should ObjectNavigationNode & VariableNode be merged?  While different in grammer, they're very similiar for interpretation.. ASTTranslator could flatten?  
	
	private final Node startNode;
	private final List<VariableNode> variablesNodes;
	
	public ObjectNavigationNode(EObject emfASTNode, Node startNode, List<VariableNode> navigations) {
		super(emfASTNode);
		this.startNode = startNode;
		this.variablesNodes = navigations;
		
		if (this.variablesNodes.isEmpty()) {
			throw new AssertionError("Grammer Programming Error; the parser gave me a List<VariableOrSquareBracketFunction> navigations that's empty?  It should just be a VariableNode in that case?!");
		}
	}

	@Override
	NodeEvalResult evaluate(DataObject root) throws ScriptExcecutionException {
		NodeEvalResult result = startNode.evaluate(root);
		
		for (VariableNode var : variablesNodes) {
			DataObject struct = result.asDataObject();
			try {
				result = struct.getField(var.getVariableName(), this);
			} catch (UnknownFieldException e) {
				// TODO The throw was missing here... do TDD and create a failing testcase!! 
				throw newExcecutionException(e, "Could not get field named '" + var.getVariableName());
			}
		}
		
//		for (VariableOrSquareBracketFunction navigation : variablesNodes) {
//			// TODO Once SquareBracketFunction clarified, could I avoid the if/instanceof/else here, through real full polymorphism here as well?
//			if (navigation instanceof Variable) {
//				Variable var = (Variable) navigation;
//				result = struct.getField(var.getVarname());
//			} else if (navigation instanceof SquareBracketFunction) {
//				// TODO Implement SquareBracketFunction.  Do NOT do if... here, but create subclasses
//				newExcecutionException("SquareBracketFunctions are not yet implemented!");
//			}
//		}
		
		return result;
	}

}
