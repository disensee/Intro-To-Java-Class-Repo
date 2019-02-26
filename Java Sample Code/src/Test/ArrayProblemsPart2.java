package Test;

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
		System.out.println("PROBLEM 1:");
		String url = "https://www.google.com/somefolder/someotherfolder/somefile.html";
		String protocol,hostName,fileName;
		
		String[] protocolSplit = url.split(":");
		protocol = protocolSplit[0];
		
		String[] nameSplit = url.split("/");
		hostName = nameSplit[2];
		fileName = nameSplit[5];
		
		System.out.println(protocol);
		System.out.println(hostName);
		System.out.println(fileName);
		
		// Problem 2 - Swap 2 elements in an array
		// Write code swaps the first 2 elements in the 'someNumbers' array below.
		// When you are done the array should look like this: {1,2,3,4,5}
		// When you are done, loop through the array and sysout each value so that you can verify that your code worked
		System.out.println("PROBLEM 2:");
		int[] someNumbers = {2,1,3,4,5};
		
		int temp = someNumbers[0];
		someNumbers[0] = someNumbers[1];
		someNumbers[1] = temp;
		
		for (int s : someNumbers) {
			System.out.println(s);
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
		System.out.println("PROBLEM 3:");
		String[] lines = poem.split("\n");
		
		for(int x = 0; x < lines.length; x++) {
			String[] wordSplit = lines[x].split(" ");
			for(int i = 0; i < wordSplit.length; i++) {
				System.out.println(wordSplit[i]);
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
		
		System.out.println("PROBLEM 4:");
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
		System.out.println("PROBLEM 5:");
		for(int s : scores2) {
			System.out.println(s);
		}
		
		
		// Problem 6
		// Write code that identifies duplicate values in an array by creating a new array that contains the duplicate values
		// that occur more than once in the original array. Use the 'numbers' array below to test your code.
		// The new array should contain the following values: 1,5,9
		// Finally, sysout each value in the new array
		int[] numbers = {1,2,5,1,3,7,5,8,5,9,9,10};
		System.out.println("PROBLEM 6:");
		findDuplicateInArray(numbers);		

	}
	
	
	public static int indexOfElement(int[] arrayToSearch, int valueToSearchFor) {
		
		// Comment out this next line before you start adding code for this method (it just prevents a compiler error)
		//return 0;
		int index = 0;
		
		for(int x = 0; x < arrayToSearch.length; x++) {
			if(arrayToSearch[x] == valueToSearchFor) {
				index = x;
				break;
			}else {
				index = -1;
			}	
		}
		return index;
	}
	
	
	public static int[] addElement(int[] originalArray, int elementToAdd) {
		
		// Comment out this next line before you start adding the code for this method (it just creates and returns an empty array to avoid compiler error)
		//return new int[0];
		int[] arrayCopy = new int[originalArray.length + 1];
		
		for(int i = 0; i < originalArray.length; i++) {
			arrayCopy[i] = originalArray[i];
		}
		arrayCopy[arrayCopy.length - 1] = elementToAdd;
		return arrayCopy;
				
	}
	
	public static void findDuplicateInArray(int[] a) {
        int count=0;
        for(int j = 0; j < a.length; j++) {
            for(int k = j + 1; k < a.length; k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
            if(count==1)
               System.out.println(a[j]);
            count = 0;
        }
    }

}