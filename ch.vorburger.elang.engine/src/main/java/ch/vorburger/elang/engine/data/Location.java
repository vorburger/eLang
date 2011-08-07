package ch.vorburger.elang.engine.data;

/**
 * Location, identifying simply some sort of position, and a "text", e.g. the name of a variable or expression.
 * 
 * @see DataObject#getField(String, Location)
 * 
 * @author Michael Vorburger (MVO)
 */
public interface Location {

	String getText();

	int getLineStart();

	int getLineEnd();

	int getColumnStart();

	int getColumnEnd();
}
