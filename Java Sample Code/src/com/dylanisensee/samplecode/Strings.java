package com.dylanisensee.samplecode;

public class Strings {

	public static void main(String[] args) {
		
		/*
		 INTRODUCTION
		 1. Strings are groups of characters
		 2. String is a CLASS in Java 
		 	- which is why it's a capital S
		 	- it's not a primitive data type (we should have discussed this)
		 3. The String class, like just about every class, has methods that you can call/invoke
		*/
		
		// Step 1
		// We use the String class to create string objects
		// In order to create an object, you need to invoke the constructor function
		String greeting = new String("Hello There!");
		
		// Step 2
		// Because strings are so common, there is a shortcut to create a string object
		String str = "Hello";
		
		// Step 3
		// you can initialize a String to be empty
		String emptyStr = "";
		
		// Step 4
		// if you don't initialize a String, it's value will be null (no value)
		String nullStr = null;
		//System.out.println(nullStr);
		
		// Step 5
		// declare and initialize two String variables
		String str1 = "Hello";
		String str2 = "World";		
		// Step 6
		//Combining strings is called STRING CONCATENATION, or concatenating strings
		String str3 = str1 + " " + str2;
		System.out.println(str3);
		
		// Step 7
		//As you've seen, you have to use a " before and after your String value
		//But what if you want to include a " inside your String?
		// Answer - use ESCAPE CHARACTERS
		String str4 = "He said, \"Hi\"";
		
		// Step 8
		// There are other escape characters too (see page 89)
		// use \n to put a line break in your String
		System.out.println("HEY \nYOU");
		
		// Step 9	
		//As discussed, Strings are class types, and they have methods that you can invoke
		// You can get the length of a string by calling the length() method:
		// Note that in JavaScript, length is a property, not a method (confusing!)
		int len = str4.length();
		System.out.println(len);
		
		// Step 10
		// to compare two strings to see if they are equal, you shouldn't use ==
		// instead use the equals() method
		if(str1.equals(str2)) {
			System.out.println("Same...");
		}else {
			System.out.println("Different...");
		}
		
		
		// Step 11
		// Strings have indices (each character in the string has an index, starting with 0)
		System.out.println(str4.indexOf("He"));
		
		// Step 12
		// Here are some methods of the String class for us to play with:
		// length()
		// lastIndexOf()
		// substring() 
		//	- this one takes some getting used to...
		//  - if you use two params, the first is INCLUSIVE, the second is EXCLUSIVE
		String firstName = "Sally";
		System.out.println(firstName.indexOf("S"));
		System.out.println(firstName.lastIndexOf("l"));
		System.out.println(firstName.substring(1, 2));
		// Step 13
		// see if you can extract the mailbox name from an email address...
		String someEmail = "salley@acme.com";
		int indexOfAtSign = someEmail.indexOf("@");
		String result = (someEmail.substring(0, indexOfAtSign));
		System.out.println(result);	
		
		// Now it's your turn, investigate some methods of the String class
		// By the way, here is the official documentation for the String class from Oracle
		// https://docs.oracle.com/javase/9/docs/api/java/lang/String.html
		
		//charAt()
		
		//concat()
				
		//equals()
		
		//equalsIgnoreSpace()
		
		//format() - note, I might have to help you with this one, but it is handy!
		
		//lastIndexOf()
				
		//replace()
				
		//replaceAll()
		
		//substring() // with one param
				
		//substring() // with two params
		
		//trim()
				
		//startsWith()
		
	}

}