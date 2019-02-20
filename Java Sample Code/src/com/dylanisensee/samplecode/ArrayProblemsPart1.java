package com.dylanisensee.samplecode;

import java.util.Random;

public class ArrayProblemsPart1 {

	public static void main(String[] args) {
		
		
		// PROBLEM 1 - Declaring and initializing an array
		// Declare an array of ints named randomNumbers that can hold 10 elements in it.
		// Then use a loop to populate the array with a randomly generated numbers that range from 1 to 100
		int[] randomNumbers = new int[10];
		for(int i = 0; i < randomNumbers.length; i++) {
			Random rand = new Random();
			int n = rand.nextInt(100 + 1);
			randomNumbers[i] = n;
			System.out.println(randomNumbers[i]);
		}
		// PROBLEM 2 - Searching through an array
		// Use the array that you created for the previous problem, and write code that will search for numbers that 
		// are divisible by 5. Your code should calculate how many elements in the array are divisible by 5.
		// Use the variable numbersDivisibleBy5 to store the result
		int numbersDivisibleBy5 = 0;
		for(int i = 0; i < randomNumbers.length; i++) {
			if(randomNumbers[i] % 5 == 0) 
				numbersDivisibleBy5++;
		}
		System.out.println("The amount of randomly generated numbers divisible by five is: " + numbersDivisibleBy5);
		
		// PROBLEM 3 - Aggregating Data
		// Use a loop to figure out the lowest score, highest score, average score, and the total of all scores in the array below
		// The variables you need have been  declared for you (min, max, total, and avg), print them to the console when you have them all calculated.
		// When are are done, sys out the values of min, max, total, and avg)
		int[] scores = {88,97,75,91};
		int min = scores[0];
		int max = scores[0];
		int total = 0;
		float avg = 0F;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < min)
				min = scores[i];
			if(scores[i] > max)
				max = scores[i];
			total += scores[i];
			avg = (float)total/scores.length;
		}
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("total: " + total);
		System.out.println("avg: " + avg);
		
		// PROBLEM 4 - Copy the values from one array to another
		// Declare an array named scoresCopy, then use a loop to copy the values from the scores array to the scoresCopy array
		int[] scoresCopy = new int[scores.length];
		for(int i = 0; i < scores.length; i++) {
			scoresCopy[i] = scores[i];
			System.out.println(scoresCopy[i]);
		}
		
		// PROBLEM 5 - Finding the index of an element in an array
		// Write code that will determine the position (index number) of 75 in the 'scores' array.
		// Assign the position to the variable below
		int indexOf75 = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == 75)
				indexOf75 = i;
		}
		System.out.println("The index of 75 is: " + indexOf75);
		// PROBLEM 6 - Create an array based on another array
		// Create an array of ints named 'asciiArray' which is the same length as the string below (in the variable someString).
		// Loop through each character in the string and convert it to it's ASCII number, then add the number to the 'asciiArray'
		// HINT: in order to convert a char to an int, you can simply cast it like this:  int someInt = (int)someChar
		String someString = "Hello!";
				

	}

}