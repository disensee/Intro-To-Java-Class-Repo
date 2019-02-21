package com.dylanisensee.samplecode;

public class MinValue {

	public static void main(String[] args) {
		int[] numbers = {10,5,-16,2,1};
		int min = numbers[0];
		
		for(int x = 0; x < numbers.length; x++) {
			if(numbers[x] < min)
				min = numbers[x];
		}
		System.out.println(min);
	}

}
