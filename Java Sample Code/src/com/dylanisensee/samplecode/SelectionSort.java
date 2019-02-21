package com.dylanisensee.samplecode;

public class SelectionSort {

	public static void main(String[] args) {
		
		// Before we talk about selection sort, you need to understand how to swap elements in an array
		// Step through the code with the debugger ('watch' temp and the letters array)
		char[] letters = {'C','A','B'};
		char temp = letters[1];
		letters[1] = letters[0];
		letters[0] = temp;
		
		temp = letters[1];
		letters[1] = letters[2];
		letters[2] = temp;
		
		//enhanced for loop. "c" is the variable name 
		for(char c : letters) {
			System.out.println(c);
		}
		
		// Before you look at the code in the sort() method, note that it finds the INDEX of the min value in the array
				
		
		int[] unsortedArray = {6,4,1,3};
		
		

	}

	public static void sort(int[] arr) {

		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {
			
			// Find the INDEX of the minimum element in unsorted array
			int min_idx = i;
			
			// loop through the rest of the array and find the smallest value
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
		

}