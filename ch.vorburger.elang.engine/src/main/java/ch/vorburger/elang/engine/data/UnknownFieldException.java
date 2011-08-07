package ch.vorburger.elang.engine.data;

/**
 * Exception thrown by {@link DataObject#getField(String)} if there is field of the requested name in the bean.
 *  
 * @author Michael Vorburger (MVO)
 */
public class UnknownFieldException extends Exception {
	private static final long serialVersionUID = -519565988178077730L;

	// private static final String MSG = "DataObject.getField() does not know this field (or there was an internal error) : ";
	
	// private final String fieldName;

	public UnknownFieldException(String message) {
		super(message);
		// super(MSG + fieldName);
		// this.fieldName = fieldName;
	}

	public UnknownFieldException(String message, Exception rootCause) {
		super(message, rootCause);
		// super(MSG + fieldName, rootCause);
		// this.fieldName = fieldName;
	}

//	public String getFieldName() {
//		return this.fieldName;
//	}
}
