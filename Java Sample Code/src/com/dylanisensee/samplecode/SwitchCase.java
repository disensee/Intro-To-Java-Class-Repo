package com.dylanisensee.samplecode;
import java.util.Scanner;

public class SwitchCase {
     enum AgeGroup{
    	 INFANT,
    	 ADOLESCENT,
    	 ADULT,
    	 SENIOR
     }
    public static void main(String[] args) {
       
        // Switch case statements are a lot like IF statements
    	
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Do you like pizza (yes or no)?");
    	String input = keyboard.next();
    	/*
    	if(input.equalsIgnoreCase("yes")){ 
    		System.out.println("Here's your pizza!");
    	}else if(input.equalsIgnoreCase("no")) {
    		System.out.println("How can you not like pizza?");
    	}else {
    		System.out.println("It was a yes/no question!");
    	}
    	*/
        // we could accomplish the same thing with this switch/case statement
    	/*
        switch(input.toLowerCase()) {
        case "yes":
        	System.out.println("Here's your pizza!");
        	break;
        case "no":
        	System.out.println("How can you not like pizza?");
        	break;
        default:
        	System.out.println("It was a yes/no question!");
        }
        */
       
        // sometimes it's helpful to omit the break statement
        // which is a lot like using a compound boolean expression in an IF statement
        switch(input.toLowerCase()){
        case "yes":
        case "y":
        	System.out.println("Here's your pizza!");
        	break;
        case "no":
        case "n":
        	System.out.println("How can you not like pizza?");
        	break;
        default:
        	System.out.println("It was a yes/no question!");
        }
       
        // go ahead and write and IF statement that accomplishes the same thing
        // as the switch/case above
         
       
        // Switch case statements work well with ENUMs (enumerated data types)
        // So let's talk about them before we show how to use them with switch case statements
        // (but they cannot be declared inside of a method, so we'll declare it above
        // and then come back here to use it)
        // Note that you might also want to put enums in their own file
        // (look in the bin dir and you'll see that the compiler separates AgeGroup into it's own class file)
       
       
        // When you create an enum, it's sort of like creating a very crude/simple class
        // You are actually creating data type, just like when you create a class
               
       
        // Now let's use an enum with a switch/case statement
         AgeGroup yourAge = null;
         System.out.println("Enter your age:");
         int age = keyboard.nextInt();
         
         if(age < 10) {
        	 yourAge = AgeGroup.INFANT;
         }else if(age < 18) {
        	 yourAge = AgeGroup.ADOLESCENT;
         }else if(age < 65) {
        	 yourAge = AgeGroup.ADULT;
         }else {
        	 yourAge = AgeGroup.SENIOR;
         }
         
         System.out.println(yourAge);
       
        //WHAT COULD YOU DO IF THERE WERE NO ENUMS???
        System.out.println("Enter your age:");
        
        
       
        // But by using a string instead of an enum, I might introduce bugs into the code
       
    }

}