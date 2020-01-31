package com.dylanisensee.samplecode;

public class Constants {

	public static void main(String[] args) {
		
		/*
		 *Constants use the final keyword
		 *Once they are initialized they cannot be assigned a new value
		 *to name a constant use all caps and underscores for spaces
		 */
		final int MAX_AGE = 100;
		final int MIN_AGE = 0;
		
		System.out.println("You cannot be younger than " + MIN_AGE);
		
		//MAX_AGE = 120;
		
	}
	
}
