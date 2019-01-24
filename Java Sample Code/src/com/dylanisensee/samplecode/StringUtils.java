package com.dylanisensee.samplecode;
public class StringUtils{

	public static void main(String[] args){

		StringUtils su = new StringUtils();

		String someDate = "12/25/2019"; // make sure to test other dates 1/13/19, 03/03/2019, etc.
		String month, year, day;

		// test date extraction methods
		month = su.getMonthFromDate(someDate);
		System.out.println(month);
		day = su.getDayFromDate(someDate);
		System.out.println(day);
		year = su.getYearFromDate(someDate);
		System.out.println(year);
 
	}

	/*
	StringUtils STEP 1
	Implement the code for the following method stubs that are declared in this class.
	
	In this case your tools are the indexOf() lastIndexOf(), length(), substring() methods of the String class
	Speaking of tools, note the following info about the params to substring();


	The API docs for substring(beginIndex, endIndex) say this about the params:

		beginIndex - the begin index, inclusive.
		endIndex - the end index, exclusive.
	
	Which means that the character at the beginning index is included in the result.
	But the characters at the ending index is not.
	*/


	public String getMonthFromDate(String dateStr){
		// replace the return statement with code to extract the month
		// from a date string and then return it
		//return "This method should return the month...";
		int indexOfSlash = dateStr.indexOf("/");
		String monthResult = dateStr.substring(0, indexOfSlash);
		return monthResult;
	}

	public String getDayFromDate(String dateStr){
		// replace the return statement with code to extract the day
		// from a date string and then return it
		int indexOfDay = dateStr.lastIndexOf("/");
		String dayResult = dateStr.substring(3, indexOfDay);
		return dayResult;
	}

	public String getYearFromDate(String dateStr){
		// replace the return statement with code to extract the year
		// from a date string and then return it
		return "This method should return the year...";
	}

}