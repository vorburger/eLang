package ch.vorburger.el.lib;

import java.util.GregorianCalendar;

/**
 * This class provides extensions for expressions that deal with the handling of dates.
 * 
 * @author Kai Kreuzer
 * @author Michael Vorburger
 *
 */
public class DateExtensions {
	
	public static GregorianCalendar parseDateTime(String dateTime) {
		int[] args = getGregorianCalendarConstructorArgs(dateTime);
		return new GregorianCalendar(args[0], args[1], args[2], args[3], args[4], args[5]);
	}
	
	public static int[] getGregorianCalendarConstructorArgs(String dateTime) {
		// I'm deliberately NOT using a DateFormat/SimpleDateFormat here...
		// Firstly because I really don't need it, hard-coded parsing is easier/faster;
		// Secondly SimpleDateFormat.parse() would give me a Date and not a GregorianCalendar/Calendar;
		// Thirdly and most importantly, BECAUSE DateFormat/SimpleDateFormat IS NOT THREAD-SAFE!!!
		// If you dear reader ever introduce a SimpleDateFormat here, do make sure that you really
		// truly understand what this means (use a new() DateFormat !), and beware of introduce subtle bugs!!!
		
		dateTime = dateTime.trim();
		
		String[] segments = dateTime.split(" ");
		
		String date = segments[0];
		String[] dateSegments = date.split("\\.");
		
		if(dateSegments.length!=3) {
			throw new RuntimeException("Date string is not valid, it should be in the format dd.mm.yy[yy]: " + date);
		}
		
		int dayOfMonth = Integer.parseInt(dateSegments[0]);
		int month = Integer.parseInt(dateSegments[1]);

		int year = -9999;
		int hourOfDay = 0;
		int minute = 0;
		int second = 0;
		
		year = Integer.parseInt(dateSegments[2]);
		
		if(segments.length > 1) { // we have a time as well
			String[] timeSegments = segments[1].split(":");
			if(timeSegments.length!=3 || timeSegments[0].length()!=2 || timeSegments[1].length()!=2 || timeSegments[2].length()!=2) {
				throw new RuntimeException("Time string is not valid, it should be in the format hh.mm.ss: " + segments[1]);
			}

			hourOfDay = Integer.parseInt(timeSegments[0]);
			minute = Integer.parseInt(timeSegments[1]);
			second = Integer.parseInt(timeSegments[2]);
		}

		// Note "month -1", Java's GregorianCalendar is a bit strange... ;-)
		return new int[] { year, month - 1, dayOfMonth, hourOfDay, minute, second };
	}
	
}