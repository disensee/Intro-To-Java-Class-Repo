package com.dylanisensee.samplecode;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlocks {

	public static void main(String[] args) {
				
		/*
		If there's a chance that some of your code will result in an error
		then you should put it in a try/catch block
		This can prevent your program from crashing and it may
		be able to recover and continue running
		*/
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The scanner is expecting you to enter an int, but see what happens if you enter a string:");
		
		
		//int someInt = keyboard.nextInt();
		//System.out.println("Here's someInt: " + someInt);
		
		
		/*
		Notice it's an InputMismatchException, which is a Java class.
		
		Look this up on the Oracle website:
			https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html
		Notice all the super classes of this specific exception on the docs page
		
		There are a whole bunch of 'exception' classes:
			http://docstore.mik.ua/orelly/java/exp/figs/je0401.gif
			
		When things go wrong in your program, Java will create an Exception object
		(or some subclass of the Exception object - the subclass will be more specific
		about the details of the error than the generic Exception class).
		
		In order to handle exceptions, we can use a try/catch block
		
		You 'try' to do something that you know is risky,
		and you 'catch' any errors that are 'thrown'
		*/
		
		
		// STEP 1
		// Set up a try catch block to deal with the problem...
		try {
			System.out.println("Enter an int");
			int x = keyboard.nextInt();
			System.out.println("x is: " + x);
		}catch(Exception e) {
			System.out.println("There was an error: " + e.getClass());
		}
		
		
		// STEP 2 - Here's another potential problem that we may encounter
		int[] someArray = {7, 8, 9};
		try {
			for(int i = 0; i < 6; i++) {
				System.out.println(someArray[i]);
			}
		}catch(Exception e) {
			System.out.println("There was an error: " + e.getClass());
		}
		
		
		// Step 3 - You can catch different exceptions and handle them in different ways
		// If your code may throw more than one type of exception, you can have multiple 'catch' blocks. 
		// if you do this, you should always put the more specific subclasses of Exception first
		// NOTE: to instructor - start with handling general exceptions, then add in the more specific ones BEFORE the general one
		try {
			System.out.println("Enter yet another int");
			int x = keyboard.nextInt();
			System.out.println("x is: " + x);
			System.out.println(someArray[6]);
			throw new Exception("FOO!");
		}catch(InputMismatchException e) {
			System.out.println("Input mismatch");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		}catch(Exception e) {
			System.out.println("Some generic exception");
		}
		
		
		/*
		See what happens if you switch the order of the exceptions in the
		catch blocks. Java will go through each catch in order and it will
		if it finds a match to the error that it is throwing, it will act
		on that catch.
		*/
		
		
		// Step 4
		// Sometimes method return strings, but if something goes wrong, they return null instead
		String str = TryCatchBlocks.lookUpDefinition("Java");
		System.out.println(str);
		
		// if we know that the method could return null can check for it...
		
		
		
		// If we don't check for null, we may crash our app, unless we use a try catch block... 
		
		
		
		// STEP 5
		// The first version of the lookUpDefinition() method handles the error in some way
		// (it prints out a rather offensive message to the console)
		// But this is inflexible code; what if I want to use the method, but I don't want my 
		// users to see that rude method?
		
		// Let's look at the other version of the method. It does not deal with the problem,
		// instead it just throws and exception and gives us the flexibility to deal with it in our own way.
		// Note you will be prompted to use a try/catch block when you try to call this version of the method
		// because the method-heading includes 'throws Exception'
		try {
			TryCatchBlocks.lookUpDefinitionV2("foo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// OPTIONAL....
		/*
		 There is another part to the the try/catch blocks, it's called a 'finally' block
		 In some cases you want code to run regardless of whether or not an exception is thrown
		 
		 try{
		 	// put your risky code here
		 }catch(Exception e){
		 	// catch the error here
		 }finally{
		 	// this code will run regardless of whether or not an error was thrown
		 }

		 */
	
	}
	
	
	
	public static String lookUpDefinition(String termToLookUp){
		
		// create a dictionary of 'terms' and their definition
		HashMap<String, String> terms = new HashMap<String, String>();
		terms.put("Java", "A cool language");
		terms.put("javac.exe", "The program used to compile Java source code to bytecode");
		terms.put("java.exe", "The program that runs Java bytecode (java.exe is also known as the JVM)");
		
		if(terms.containsKey(termToLookUp)) {
			return terms.get(termToLookUp);
		}else {
			System.out.println("We don't have that term, you fool!");
			return null;
		}
				
	}
	
	public static String lookUpDefinitionV2(String termToLookUp)throws Exception{
		
		// create a dictionary of 'terms' and their definition
		HashMap<String, String> terms = new HashMap<String, String>();
		terms.put("Java", "A cool language");
		terms.put("javac.exe", "The program used to compile Java source code to bytecode");
		terms.put("java.exe", "The program that runs Java bytecode (java.exe is also known as the JVM)");
		
		if(terms.containsKey(termToLookUp)) {
			return terms.get(termToLookUp);
		}else {
		
			throw new Exception("Term Not Found");
		}
			
	}

}