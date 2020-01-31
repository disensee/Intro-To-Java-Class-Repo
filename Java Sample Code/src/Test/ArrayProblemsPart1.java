package Test;

import java.util.Random;

public class ArrayProblemsPart1 {

	public static void main(String[] args) {
		
		
		// PROBLEM 1 - Declaring and initializing an array
		// Declare an array of ints named randomNumbers that can hold 10 elements in it.
		// Then use a loop to populate the array with a randomly generated numbers that range from 1 to 100
		System.out.println("PROBLEM 1:");
		int[] randomNumbers = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int min = 1;
			int max = 100;
			Random r = new Random();
			int randomArray = r.nextInt((max - min) + 1) + min;
			
			randomNumbers[i] = randomArray;
			System.out.println(randomNumbers[i]);
		}
		
		// PROBLEM 2 - Searching through an array
		// Use the array that you created for the previous problem, and write code that will search for numbers that 
		// are divisible by 5. Your code should calculate how many elements in the array are divisible by 5.
		// Use the variable numbersDivisibleBy5 to store the result
		System.out.println("PROBLEM 2:");
		int numbersDivisibleBy5;
		int mod = 0;
		
		for(int i = 0; i < randomNumbers.length; i++) {
			if(mod == randomNumbers[i] % 5) {
				numbersDivisibleBy5 = randomNumbers[i];
				System.out.println(numbersDivisibleBy5);
			}
		}
	
		
		// PROBLEM 3 - Aggregating Data
		// Use a loop to figure out the lowest score, highest score, average score, and the total of all scores in the array below
		// The variables you need have been  declared for you (min, max, total, and avg), print them to the console when you have them all calculated.
		// When are are done, sys out the values of min, max, total, and avg)
		System.out.println("PROBLEM 3:");
		int[] scores = {88,97,75,91};
		
		int min, max, total;
		float avg;
		min = scores[0];
		max = 0;
		total = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < min) {
				min = scores[i];
			}
			if(scores[i] > max){
				max = scores[i];
			}
			total = total + scores[i];
		}
		avg = (float)total / 4.0F;
		System.out.println(min);
		System.out.println(max);
		System.out.println(total);
		System.out.println(avg);

		
		
		// PROBLEM 4 - Copy the values from one array to another
		// Declare an array named scoresCopy, then use a loop to copy the values from the scores array to the scoresCopy array
		System.out.println("PROBLEM 4:");
		int[] scoresCopy = new int[4];
		
		for(int i = 0; i < scores.length; i++) {
			scoresCopy[i] = scores[i];
			System.out.println(scoresCopy[i]);
		}
		
		
		
		// PROBLEM 5 - Finding the index of an element in an array
		// Write code that will determine the position (index number) of 75 in the 'scores' array.
		// Assign the position to the variable below
		System.out.println("PROBLEM 5:");
		int indexOf75;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == 75) {
				indexOf75 = i;
				System.out.println(indexOf75);
			}
		}
		
		
		
		// PROBLEM 6 - Create an array based on another array
		// Create an array of ints named 'asciiArray' which is the same length as the string below (in the variable someString).
		// Loop through each character in the string and convert it to it's ASCII number, then add the number to the 'asciiArray'
		// HINT: in order to convert a char to an int, you can simply cast it like this:  int someInt = (int)someChar
		System.out.println("PROBLEM 6:");
		String someString = "Hello!";
		
		int[] asciiArray = new int[6];

		for(int i = 0; i < someString.length(); i++) {
			asciiArray[i] = (int)someString.charAt(i);
			System.out.println(asciiArray[i]);
		}
	}

}