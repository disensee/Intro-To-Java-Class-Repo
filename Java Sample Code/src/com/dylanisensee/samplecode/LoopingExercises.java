package com.dylanisensee.samplecode;
import java.util.Scanner;
public class LoopingExercises {

	public static void main(String[] args) {
		
		//Problem 1
		System.out.println("PROBLEM 1:");
		String secretPassword = new String("opensesame");
		Scanner keyboard = new Scanner(System.in);
		boolean keepLooping = true;
		while(keepLooping) {
			System.out.println("Please enter the secret password:");
			String input = keyboard.next();
			if(input.equals(secretPassword))
				keepLooping = false;
		}
		//Problem 2
		System.out.println("PROBLEM 2:");
		keepLooping = true;
		do {
			System.out.println("Please enter the secret password:");
			String input = keyboard.next();
			if (input.equals(secretPassword))
				keepLooping = false;
		} while (keepLooping);
		//Problem 3
		System.out.println("PROBLEM 3:");
		for(int counter = 1; counter <= 5; counter++) {
			System.out.println(counter);
		}
		//Problem 4
		System.out.println("PROBLEM 4:");
		System.out.println("Enter a number between 1 and 10:");
		int input = keyboard.nextInt();
		int output = 0;
		for(int x = 1; x <= 10; x++) {
			output = x;
			if(x == input) 
				break;
			System.out.println(output);
		}
		//Problem 5
		System.out.println("PROBLEM 5:");
		for(int x = 5; x >= 1; x--) {
			System.out.println(x);
		}
		
		//Problem 6
		System.out.println("PROBLEM 6:");
		for(int x = 0; x <= 10; x+=2) {
			System.out.println(x);
		}
		//Problem 7
		System.out.println("PROBLEM 7:");
		for(int x = 0; x <= 100; x++) {
		if (x % 3 == 0 || x % 5 == 0)
			continue;
			System.out.println(x);
		}
	}
}
