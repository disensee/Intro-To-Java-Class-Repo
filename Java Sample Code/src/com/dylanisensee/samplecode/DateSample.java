package com.dylanisensee.samplecode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateSample {

	public static void main(String[] args) {

		// Exploring the java.util.Date class...
		
		// Problem 1
		// Create and initialize Date objects
		// Declare a Date variable named 'today' and initialize it to the current date
		// Declare a Date variable named 'firstDayOfThisCentury' and initialize it to the Jan 1, 2000
		// Hint: If you set this date object in the constructor call, be aware of some weirdness in the parameters!
		// After you initialize both Date objects, print them to the console.
		Date today = new Date();
		Date firstDayOfThisCentury = new Date(100, 0, 1);
		System.out.println(today);
		System.out.println(firstDayOfThisCentury);
		
		// Problem 2
		// Parsing a String object into a Date object
		// Figure out how to convert the 'dateString' variable below into a Date object.
		// Then print the Date object to the console
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String dateString = "3/7/2019";
		try {
			Date stringToDate = formatter.parse(dateString);
			System.out.println(stringToDate);
			//System.out.println(formatter.format(stringToDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
		
		// Problem 3
		// Calculating time spans
		// Write code that calculates how many years have passed between 'today' and 'firstDayOfThisCentury'
		//int currentYear = today.getYear();
		//int startYearOfCentury = firstDayOfThisCentury.getYear();
		int diffInYears = today.getYear() - firstDayOfThisCentury.getYear();
		//System.out.println(currentYear);
		//System.out.println(startYearOfCentury);
		System.out.println(diffInYears);
	}

}