package com.dylanisensee.samplecode;

import java.util.Arrays;

public class ArrayProblemsPart2 {

	public static void main(String[] args) {
		
		
		// Problem 1 - URL Parsing
		// The split() method of the String class returns an array of Strings
		// Do some research to figure how to use the split() method.
		// Then use the split() method to extract the following parts of the url below.
		// The PROTOCOL (the protocol in the url below is: https)
		// The HOST NAME (the host name (aka domain name or server name) in the url below is: www.google.com)
		// The FILE NAME (the file name in the url below is: somefile.html)
		// Variables for each part have been declared for you (protocol, hostName, fileName), you need to figure out how to initialize them.
		// Sysout the variables when you are done
		String url = "https://www.google.com/somefolder/someotherfolder/somefile.html";
		String[] protocolSplit = url.split(":");
		String protocol = protocolSplit[0];
		
		String[] urlSplit = url.split("/");
		String hostName = urlSplit[2];
		String fileName = urlSplit[5];
		
		System.out.println(protocol);
		System.out.println(hostName);
		System.out.println(fileName);
		
		
		
		// Problem 2 - Swap 2 elements in an array
		// Write code that swaps the first 2 elements in the 'someNumbers' array below.
		// When you are done the array should look like this: {1,2,3,4,5}
		// When you are done, loop through the array and sysout each value so that you can verify that your code worked
		int[] someNumbers = {2,1,3,4,5};
		int temp = someNumbers[1];
		someNumbers[1] = someNumbers[0];
		someNumbers [0] = temp;
		for(int i = 0; i < someNumbers.length; i++) {
			System.out.println(someNumbers[i]);
		}
		
		
		// Problem 3 - Nested Loops
		// I found this poem by Irwin Mercer (Source: https://www.familyfriendpoems.com/poems/other/short/)...
		String poem = "Simple Sam was a simple man.\n";
		poem +=       "He lived each day by a simple plan.\n";
		poem +=		  "Enjoy your life and live while you can.\n";
		poem +=		  "Make each day count and take a stand.";
		
		// Use the split() method to split the poem on the line breaks (the \n escape character).
		// This will return an array where each element is a line from the poem.
		// Then loop through the array of lines.
		// Inside the body of the loop, split each line on the space character.
		// This will return an array of words within the line.
		// Add a nested loop that iterates through each word in the current line.
		// Inside the body of the nested loop, simply sysout each word.
		String[] lineSplit = poem.split("\n");
		for(int i = 0; i < lineSplit.length; i++) {
			String[] wordSplit = lineSplit[i].split(" ");
			for(int x = 0; x < wordSplit.length; x++) {
				System.out.println(wordSplit[x]);
			}	
		}
		
		
		
		// Problem 4 - Find the index number of an element within an array
		// Write the code for a method that returns the index number of a value in an array
		// Below the main() method, you will find the stub for a method named indexOfElement().
		// The indexOfElement() method has two parameters, the first is an array to search through,
		// and the second is a value to search for within the array.
		// Add code to the body of the method that searches through the array, looking for the value to search for.
		// If you find the value within the array, return its index number.
		// If you don't find the value within the array then return -1 (which is an invalid index number).
		// Once you finish writing the code for the body of the method you can use this next bit of code to test it.
		
		
		// this code will test the indexOfElement() method
		int[] scores = {88,74,100,83};
		int perfectScore = 100;
		int index = ArrayProblemsPart2.indexOfElement(scores, perfectScore);
		System.out.println(index); // this should sysout 2
		int worstScore = 0;
		index = ArrayProblemsPart2.indexOfElement(scores, worstScore);
		System.out.println(index); // this should sysout -1
		
		
	
		// Problem 5
		// Write a method that adds an element to an array.
		// Near the bottom of this class you will find a stub for a method named addElement().
		// The method takes 2 parameters, the first param is an array (of ints) named originalArray, the second param is an int that needs to be added to the original array.
		// Your job is to write code for the body of the method. 
		// Since Java does not allow you to resize an array, you'll have to create a new array (which can hold one more element than the original array).
		// Then copy all the values from the original to the new array.
		// Then, you'll have to add the value from the elementToAdd param to the new array.
		// Once you finish writing the body of the method, you can use the next bit of code to test it.
				
		
		// This code will test the addElement() method
		int[] scores2 = {88, 93, 72}; // here's the original array
		int scoreToAdd = 100; // here's the value we want to add to the array
		scores2 = ArrayProblemsPart2.addElement(scores2, scoreToAdd); // invoke the addElement() method like this, and assign the return value to the scores variable
		
		// let's have a look at what's in the scores array now...
		for(int s : scores2) {
			System.out.println(s);
		}
		
		
		// Problem 6
		// Write code that identifies duplicate values in an array by creating a new array that contains the duplicate values
		// that occur more than once in the original array. Use the 'numbers' array below to test your code.
		// The new array should contain the following values: 1,5,9
		// Finally, sysout each value in the new array
		
		int[] numbers = {1,2,5,1,3,7,5,8,5,9,9,10};
		Arrays.sort(numbers);
		int[] duplicateNumbers = new int[0];
		int indexOfDuplicate = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int x = i + 1; x < numbers.length; x++) {
				if(numbers[i] == numbers[x]) {
					indexOfDuplicate = ArrayProblemsPart2.indexOfElement(duplicateNumbers, numbers[i]);
					if(indexOfDuplicate == -1)
						duplicateNumbers = ArrayProblemsPart2.addElement(duplicateNumbers, numbers[x]);
				}
			}
		}
			for(int i = 0; i < duplicateNumbers.length; i++) {
				System.out.println(duplicateNumbers[i]);
			}
				
	}
	
	
	public static int indexOfElement(int[] arrayToSearch, int valueToSearchFor) {
		for(int i = 0; i < arrayToSearch.length; i ++) {
			if(arrayToSearch[i] == valueToSearchFor) 
				return i;	
			}
		return -1;	
	}
	
	
	public static int[] addElement(int[] originalArray, int elementToAdd) {
		int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);
		newArray[newArray.length - 1] = elementToAdd;
		return newArray;				
	}
	
}