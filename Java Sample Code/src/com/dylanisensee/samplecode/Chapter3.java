package com.dylanisensee.samplecode;

public class Chapter3 {

	public static void main(String[] args) {
		int x = 7;
		
		//if you only have one statement to run, then curly braces are not needed
		if (x > 5)
			System.out.println("x is greater than 5");
		//be aware when working precise numbers
		float num1 = 3.33333F;
		float num2 = 10F/3F;
		if(num1 == num2)
			System.out.println("num1 is equal to num2");
		System.out.println(num2);
		//Don't use == to compare objects. Only use == on primitives.
		String name1 = "Bob";
		String name2 = "Bob";
		
		if(name1.equals(name2)) {
			System.out.println("The strings are the same");
		}
		//the NOT operator (negation operator)
		int a = 5;
		int b = 6;
		if (!(a==b))
			System.out.println("a and b are NOT equal");
		
		//the conditional operator
		String output;
		String userInput = "yes";
		if(userInput.equals("yes")) {
			output = "TRUE";
		}else {
			output = "FALSE";
		}
		
		output = userInput.equals("yes") ? "TRUE" : "FALSE";
		System.out.println(output);
		}
				
	}


