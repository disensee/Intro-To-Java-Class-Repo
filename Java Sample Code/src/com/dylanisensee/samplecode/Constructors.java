package com.dylanisensee.samplecode;
import java.util.Date;

public class Constructors {

	/*
	 1. Constructor functions create objects and return them (actually they return a memory address of an object)
	    In order to create an object, a constructor function must be invoked.
	    
	 2. Use the 'new' keyword when invoking a constructor.
	 	The name of the constructor function must be the same as the class name
	 	You do not have to specify a return type in when you define a constructor (it's implied that it returns an instance of the class)
	 	A return statement is not required inside the body of a constructor (it's implied that an instance of the class is returned).
	 	
	 3. Every class has a default constructor (that has no parameters), for example: Date today = new Date();
	    But you can define your own versions of a constructor functions, this is known as 'overloading'. 
	    This allows you to set instance variables and/or run setup code at the time the object is created.
	    // See the Date example below...
	    
	 4. If you define your own constructor, the default one disappears. But you can explicitly redefine it
	   	if you want to allow it to be used.
	   	// Create a class and define a constructor that takes at least one param
	   	// Try to call the default constructor (it won't work)
	   	// Then explicitly add the default constructor
	   	
	 5. You can invoke other version of the constructor from inside the body of a constructor by using this()
	 	// Overload the constructor' and use this 
	 */
	
	public static void main(String[] args) {

		// Assume that we want to create a Date object, and set it to July 4 (of the current year), we could do it like this:
		Date july4 = new Date();
		july4.setMonth(6);
		
		// See the problem? Some might argue that it's better to set the instance variables at the time of creation:
		Date independenceDay = new Date(119, 6,4);
		
		// Step 1 - define the MyDate class
		// add instance vars for month, day, year
		// add a toString() method
		MyDate d1 = new MyDate();
		System.out.println(d1.toString());
		
		// Step 2 - Define a constructor that takes month, day, year params
		// Note that this wipes out the default constructor (with no params) - we broke the code sample in step 1
		// For now just comment out the broken code
		MyDate d2 = new MyDate(3, 12, 2019);
		System.out.println(d2.toString());
		
		//Step 3 - Let's redefine a default constructor and then uncomment the code sample for step 1 above
		
		//Step 4 - Overload the constructor to take a month and day (the year will default to the current year)
		MyDate d3 = new MyDate(3, 12);
		System.out.println(d3.toString());
		//Step 5 - Overload the constructor to take a String
	}
	

	

}