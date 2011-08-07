package ch.vorburger.elang.engine.data;

import java.util.GregorianCalendar;

import ch.vorburger.elang.engine.ScriptExcecutionException;

/**
 * The result of evaluating a Node. (TODO: Review doc, adapt for Any pattern.)
 * 
 * Extends Location, so it can tell "where it came from".
 * 
 * @author Michael Vorburger
 */
public interface NodeEvalResult extends Location {

	// TODO Naming/Doc? This is more of a kind of an "Any" (VBA!) type (pattern?) - nothing to do with AST & Nodes, really...
	
	// TODO An extends Location seems weird, should have a getLocation() instead?!
	
	Double asDouble() throws ScriptExcecutionException;

	String asString() throws ScriptExcecutionException;

	Boolean asBoolean() throws ScriptExcecutionException;
	
	GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException;
	
	// TODO asDataObject naming?  better e.g. asStruct() ?  See Any..
	DataObject asDataObject() throws ScriptExcecutionException;
	
	/**
	 * @see Comparable#compareTo(Object)
	 */
	int compare(NodeEvalResult o) throws ScriptExcecutionException;

	boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException;
}
