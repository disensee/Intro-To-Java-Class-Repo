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
		
		
		//enhanced for loop
		String[] someStrings = {"Hello", "World", "!"};
		for(String s : someStrings ) {
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
		
		for(Date d : someDates) {
			System.out.println(d);
		}
		
		//Nested Loops
		for(int x = 0; x < someStrings.length; x++) {
			System.out.println(someStrings[x]);
			for(char c : someStrings[x].toCharArray()) {
				System.out.println(c);
			}
		}
		
		//Multiple dimension arrays
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