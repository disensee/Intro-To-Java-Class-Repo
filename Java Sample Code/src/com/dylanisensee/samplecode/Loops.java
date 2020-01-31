package com.dylanisensee.samplecode;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        
        /*
         * Looping control structures (also known as 'iteration') allows you to repeat a block of
         * code until a certain condition is met. 
         */
        
        Scanner keyboard = new Scanner(System.in);
        

        /*
         *  WHILE LOOP - keeps looping until a boolean expression becomes false
         *  
         *  	while(boolean expression){
         *          // keep running this code block until the the boolean expression is false
         *      }
         *  
         *  // How does the boolean expression get change to false????
         */
                
        System.out.println("I will keep asking you for a cookie until you say 'yes'...");
        
        // STEP 1
        boolean keepLooping = true;
        while(keepLooping) {
        	System.out.println("Can I have a cookie?");
        	String input = keyboard.next();
        	if(input.toLowerCase().equals("yes")) { 
        		keepLooping = false;
        	}
        }
                
        
        /*
         * DO WHILE LOOP - The do/while loop will run the code in the block of the loop
         * before checking the condition of the loop
         * 
         *         do{
         *          // code to run
         *         }while(boolean expression);
         */
        
        // STEP 2
        keepLooping = false;         
        
        do {
        	System.out.println("Can I have some cake too?");
        }while(keepLooping);

        /*
         * FOR LOOPS - for loops are not controlled by a boolean expression, 
         * instead there is some sort of counter
         * 
         *         for(counter start value;  boolean expression;  counter incrementer){
         *             // this code runs for each loop (iteration)
         *         }
         * 
         *  NOTE THAT THE BOOK USES FOR LOOPS W/O CURLY BRACES!!!!!!!!
         *  ALSO NOTE THAT COUNTERS USE THE INCREMENT/DECREMENT OPERATORS
         */
        
        // STEP 3
        int counter;
        int endIndex = 10;
        for(counter = 0; counter <= endIndex; counter++) {
        	System.out.println("Counter: " + counter);
        }
        
        
        // STEP 4
        // you can also loop down from a number
        endIndex = 0;
        for (counter = 10; counter >= endIndex; counter--) {
        	System.out.println("COUNTER: " + counter);
        }
        
        /*
         *  Watch out for INFINITE LOOPS!
         */
        
        /*
        while(true){
            System.out.println("This is an infinite loop!");
        }
        */
        
        
        // STEP 5
        // You could use a 'counter' variable to control a WHILE loop
        int i = 0;
        int len = 6;
        
        while(i<len) {
        	System.out.println(i);
        	i++;
        }
        
                
        /*
         * Watch out for this common beginner mistake:
         * 
         *     for(int counter = 0; counter < endIndex; counter++);{
         *         System.out.println("Counter: " + counter);
         *     }
         * 
         * Do you see the problem? Check out page 222
         */
                
        
        // STEP 6
        // The 'break' statement
        // You can terminate a loop before it completes all of its iterations by using the break statement
        // Ask the user to enter a number from 1 to 10
        // Then write a loop that will start at 1 an add all numbers up until input number has been reached.
        System.out.println("Enter a number between 1 and 10");
        int input = keyboard.nextInt();
        int total = 0;
        for(int x = 0; x <= 10; x++) {
        	total += x;
        	if (x == input)
        		break;
        }
        System.out.println("The total is: " + total);        
        
        // STEP 7
        // The 'continue' statement allows you to skip an iteration of a loop
        // Write a program that asks the user to enter a number from 1 - 10
        // Assign the number to an int variable called 'input'
        // Then write a loop that will output each number from 1-10
        // EXCEPT the number that was entered by the user
        System.out.println("Enter another number between 1 and 10");
        input = keyboard.nextInt();
        for(int x = 1; x <= 10; x++) {
        	if(x == input)
        		continue;
        	 System.out.println(x);
        	 
        }
       
        // VARIABLE SCOPE - if you declare a variable inside a loop, then you won't be
        // able to use it anywhere after the loop completes (actually you wont be able to use it
        // any where except for the body of the loop.
        // In the example below, we say that the myStr variable is 'local' to the body of the loop
        
        String myStr = null;
        for(counter = 0; counter < endIndex; counter++){
            myStr = "hello";
        }
        
        System.out.println(myStr);
        
        
        
        
         //keyboard.close();

    }

}