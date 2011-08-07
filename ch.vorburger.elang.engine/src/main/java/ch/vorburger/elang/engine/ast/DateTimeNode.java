package ch.vorburger.elang.engine.ast;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import ch.vorburger.elang.engine.ScriptExcecutionException;
import ch.vorburger.elang.engine.data.Location;
import ch.vorburger.elang.engine.data.NodeEvalResult;


/**
 * Either an AST Node holding a literal DATE or DATE_TIME, or a Date/Time result produced by an operation node.
 * 
 * @author Michael Vorburger
 */
//TODO /* package-local */ this shouldn't have to be public, it only temporarily is, for TestBeanDataObjectWrapper 
public final class DateTimeNode extends AbstractFixedValueNode {

	// TODO Use of java.util.GregorianCalendar may be reviewed later...
	// Could http://joda-time.sourceforge.net/ be of interest? 
	private final GregorianCalendar date;

	/* package-local */ DateTimeNode(EObject emfASTNode, String dateTime) {
		super(emfASTNode, dateTime);
		this.date = parseDateTime(dateTime);
	}

	// TODO /* package-local */ this shouldn't have to be public, it only temporarily is, for TestBeanDataObjectWrapper 
	public DateTimeNode(Location p, GregorianCalendar date) {
		super(p);
		this.date = date;
	}

	private GregorianCalendar parseDateTime(String dateTime) {
		// I'm deliberately NOT using a DateFormat/SimpleDateFormat here...
		// Firstly because I really don't need it, hard-coded parsing is easier/faster;
		// Secondly SimpleDateFormat.parse() would give me a Date and not a GregorianCalendar/Calendar;
		// Thirdly and most importantly, BECAUSE DateFormat/SimpleDateFormat IS NOT THREAD-SAFE!!!
		// If you dear reader ever introduce a SimpleDateFormat here, do make sure that you really
		// truly understand what this means (use a new() DateFormat !), and beware of introduce subtle bugs!!!
		
		int dayOfMonth = Integer.parseInt(dateTime.substring(0, 2));
		int month = Integer.parseInt(dateTime.substring(3, 5));

		int year = -9999;
		int hourOfDay = 0;
		int minute = 0;
		int second = 0;
		if (dateTime.length() == 8) {
			year = makeFourDigitYearFromTwoDigitYear(Integer.parseInt(dateTime.substring(6, 8)));
		} else if (dateTime.length() == 10) {
			year = Integer.parseInt(dateTime.substring(6, 10));
		} else if (dateTime.length() == 17) {
			year = makeFourDigitYearFromTwoDigitYear(Integer.parseInt(dateTime.substring(6, 8)));
			hourOfDay = Integer.parseInt(dateTime.substring(9, 11));
			minute = Integer.parseInt(dateTime.substring(12, 14));
			second = Integer.parseInt(dateTime.substring(15, 17));
		} else if (dateTime.length() == 19) {
			year = Integer.parseInt(dateTime.substring(6, 10));
			hourOfDay = Integer.parseInt(dateTime.substring(11, 13));
			minute = Integer.parseInt(dateTime.substring(14, 16));
			second = Integer.parseInt(dateTime.substring(17, 19));
		} else {
			throw new RuntimeException("Unexpected problem; lexer should only pass a dateTime String of length 8 or 10 or 17 or 19 characters, but this is neither: " + dateTime);
		}
		
		// Note "month -1", Java's GregorianCalendar is a bit strange... ;-)
		return new GregorianCalendar(year, month - 1, dayOfMonth, hourOfDay, minute, second);
	}
	
	// TODO Review this!!! Ok?
	private int makeFourDigitYearFromTwoDigitYear(int twoDigitYear) {
		if (twoDigitYear >= 0 && twoDigitYear < 50) {
			return twoDigitYear + 2000;
		} else if (twoDigitYear < 100) {
			return twoDigitYear + 1900;
		} else {
			throw new RuntimeException("Unexpected problem; caller (lexer) should only pass a twoDigitYear be >=0 or <100 ?! twoDigitYear=" + twoDigitYear);
		}
	}
	
	@Override
	public final Double asDouble() throws ScriptExcecutionException {
		throw newExcecutionException("Can not convert Date/Time (" + this.asString() + ") into a number");
	}

	@Override
	public Boolean asBoolean() throws ScriptExcecutionException {
		throw newExcecutionException("Can not convert Date/Time (" + this.asString() + ") into a boolean");
	}

	@Override
	public GregorianCalendar asGregorianCalendar() throws ScriptExcecutionException {
		return date;
	}

	@Override
	public String asString() throws ScriptExcecutionException {
		// SimpleDateFormat IS NOT THREAD SAFE, so create a new one for each invocation here...
		// TODO Use org.apache.commons.lang.time.FastDateFormat or JodaTime instead...
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		return sdf.format(date.getTime());
	}

	@Override
	public int compare(NodeEvalResult o) throws ScriptExcecutionException {
		return date.compareTo(o.asGregorianCalendar());
	}

	@Override
	public boolean isEqual(NodeEvalResult y) throws ScriptExcecutionException {
		return date.equals(y.asGregorianCalendar());
	}
}
