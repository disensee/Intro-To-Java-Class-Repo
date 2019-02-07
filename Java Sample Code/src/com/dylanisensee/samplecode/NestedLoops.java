package com.dylanisensee.samplecode;

import java.util.Date;

public class NestedLoops {

	public static void main(String[] args) {
		//loops work great with arrays
		int[] someInts = {10, 20, 30};
		for(int x = 0; x < someInts.length; x++) {
			//be careful of fence-post errors when looping through arrays
			int currentInt = someInts[x];
			currentInt = 50; //copy the VALUE of the someInts[x];
			System.out.println(currentInt);
		}
		
		
		//loop through an array of objects using the enhanced for loop
		String[] someStrings = {"Hello", "World", "!"};
		for(String s : someStrings ) {
			//the variable s will hold the "current element" in the loop
			System.out.println(s);
		}
		
		for(int c : someInts) {
			System.out.println(c);
		}
		
		Date[] someDates = {new Date(), new Date(), new Date()};
		System.out.println(someDates[0]);
		for(int x = 0; x < someDates.length; x++) {
			Date currentDate = someDates[x];//copy the REFERENCE (memory address) of someDates[x];
			int currentYear = currentDate.getYear();
			currentDate.setYear(currentYear + 1); 
			System.out.println(currentDate);
		}
		//notice how the dates are updated to next year when we loop again
		//this is different than what we saw when we altered the array of ints
		//(primitives are 'copy by value' and objects are 'copy by reference' (memory address)
		for(Date d : someDates) {
			System.out.println(d);
		}
		
		//Nested Loops
		//A string is an array of chars, let's loop through each string
		//and then loop through each char in each string
		for(int x = 0; x < someStrings.length; x++) {
			System.out.println(someStrings[x]);
			for(char c : someStrings[x].toCharArray()) {
				System.out.println(c);
			}
		}
		
		//Multiple dimension arrays
		//nested loops are super useful for looping through 2-D arrays
		String[][] quarterlySales = {
				{"2016", "2017", "2018", "2019"},
				{"500", "600", "700", "900"},
				{"500", "600", "700", "900"},
				{"500", "600", "700", "900"}
		};
		
		for(int x = 0; x < quarterlySales.length; x++) {
			//System.out.println(quarterlySales[x]);
			String[] row = quarterlySales[x];
			for(int i = 0; i < row.length; i++) {
				System.out.print(row[i] + "|");
			}
			System.out.print("\n");
		}
		
	}
}