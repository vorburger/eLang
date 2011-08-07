package ch.vorburger.elang.engine.ast;


import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.DataObject;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Node.
 * @author Michael Vorburger
 */
/* package-local */ abstract class Node extends LocationImpl implements NodeEvalResult {

	// TODO Should not take EObject arg, this class has to be EMF independent, but a line/posStart/posEnd (or a new Location class), and logic in private helper method in the ASTTranslator 
	protected Node(EObject emfASTNode)
	{
		// OLD xText: org.openarchitectureware.xtext.parser.parsetree.Node xTextNode = NodeUtil.getNode(emfASTNode);
		
		super(ASTTranslator.location(emfASTNode));
	}

	// TODO See above, remove this; should not take EObject arg... 
	protected Node(EObject emfASTNode, String tokenText) {
		// ICompositeNode node = NodeModelUtils.findActualNodeFor(emfASTNode); // TODO use findActualNodeFor() or getNode()
		super(0, 0, 0, 0, "");

//		super(NodeUtil.getRootNode(emfASTNode).getLine(),
//				NodeUtil.getRootNode(emfASTNode).getOffset(),
//				NodeUtil.getRootNode(emfASTNode).getOffset() + NodeUtil.getRootNode(emfASTNode).getLength(),
//				tokenText);
	}
	
	protected Node() {
		super(0, 0, 0, 0, "");
	}
	
	protected Node(Location location) {
		super(location);
	}

/*
	protected Node(LocationImpl parentNode) {
		this.line = parentNode.line;
		this.posStart = parentNode.posStart;
		this.posEnd = parentNode.posEnd;
		this.tokenText = parentNode.tokenText;
	}
*/	

	/**
	 * Evaluate this node.
	 */
	abstract NodeEvalResult evaluate(DataObject root) throws ScriptExcecutionException;

	// TODO Class getNodeType() - for some basic parse-time validation in the future?

	@Override
	public String toString() {
		try {
			return asString();
		} catch (ScriptExcecutionException e) {
			throw new RuntimeException("Caller should probably have used asString() instead of toString()", e);
		}
	}
	
	/**
	 * Helper to create suitably initialized ScriptExcecutionException.
	 * 
	 * Note: Returning the exception is better than throwing it directly, because the compiler relies on seeing the "throw" in a method for some cases (e.g. determine if a return statement is required).
	 * 
	 * @param e Throwable (if none, use version with alternative signature)  
	 * @param message String, should end with ':', as token will be appended
	 * @return ScriptExcecutionException, ready to be thrown
	 */
	protected ScriptExcecutionException newExcecutionException(Throwable e, String message) {
		return new ScriptExcecutionException(e, message + tokenText, this.lineStart, this.posStart, this.posEnd - this.posStart);
	}

	protected ScriptExcecutionException newExcecutionException(String message) {
		return new ScriptExcecutionException(message + tokenText, this.lineStart, this.posStart, this.posEnd - this.posStart);
	}
}
