package com.dylanisensee.samplecode;

public class StringFormat {

	public static void main(String[] args) {
		int someInt = 27;
		float someFloat = 35.46F;
		boolean someBool = true;
		String someString = "Hello";
		
		String output = String.format("%s, My name is Dylan. I am %d years old, I am employed (%b), and I make %.2f dollars an hour", someString, someInt, someBool, someFloat );
		System.out.println(output);
	}

}
