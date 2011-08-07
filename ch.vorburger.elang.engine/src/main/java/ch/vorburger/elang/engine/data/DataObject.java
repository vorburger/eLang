package ch.vorburger.elang.engine.data;

/**
 * Mediator model for object navigation.
 * 
 * The TestBeanDataObjectWrapper is a Helper which turns Java Beans into Data Objects (intended for Unit Testing only).
 * 
 * @author Michael Vorburger (MVO)
 */
public interface DataObject {

	/**
	 * Get a Field from this Data Object.
	 * 
	 * @param fieldName name of field
	 * @param requestingParentLocation the location which "requested" this field.  This allows better (more fine-grained) error reporting in case the returned value is then attempted to be cast into something which it can not be.  The value passed into this argument is simply forward to the constructor of the returned result object.
	 * @return field, or null if field exists but is not set
	 * @throws UnknownFieldException if field does not exist (or some other internal problem)
	 */
	// TODO This return type seems wrong, it should just return some kind of Any interface
	NodeEvalResult getField(String fieldName, Location requestingParentLocation) throws UnknownFieldException;
	
	// TODO Overloaded method version without Location (on an as-needed basis)

	// TODO How to do setters?  Check the Any pattern!!! 
	// TODO void setField(String string, Number i);
	// TODO void setField(String string, String s);
	
	/**
	 * Equals.
	 * 
	 * @param o the other DataObject to compare to
	 * @return true if equals, false if not.
	 */
	boolean isEqual(DataObject o);

	// Probably not: int compare(DataObject o);

}
