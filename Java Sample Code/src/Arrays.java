public class Arrays {

	public static void main(String[] args) {
		
		// STEP 1
		//creating arrays
		// to declare an array variable you must supply
		// the BASE TYPE[] followed by the variable name
		// UNLIKE JavaScript, you must specify the length of the array when you create it
		// ALSO UNLIKE JavaScript, you can only add elements to an array as long as the array size 
		// doesn't exceed the length that you specified when you created the array!
		// So Java arrays are not very flexible and they can be difficult to work with
		int[] myInts = new int[5];
		float[] myFloats = new float[5];
		String[] myStrings = new String[5];
		
		// Note that each element in an array has an INDEX
		// Note that array indexes start at 0
		// Note that you could also put the square brackets after the variable name (instead of after the base type)
		
		
		// STEP 2
		// populating arrays
		myInts[0] = 5;
		myInts[1] = 6;
		int x = 3;
		myInts[2] = x;
		myInts[3] = 8;
		myInts[x+1] = 11; 
		// Note that if you do not initialize all the
		// elements in in an array, they might be
		// initialized to their default values
		

		// STEP 3
		// you can create and populate arrays all at once
		int[] myInts2 = {5,3,4,7,12};
		String[] myStrings2 = {"Bob","Sally","Joe"};
		
		
		// STEP 4
		// Arrays have a 'length' property
		System.out.println(myStrings2.length);
		
		
		// STEP 5
		// Loop through the myStrings array
		for(int i = 0; i < myStrings.length; i++) {
			System.out.println(myStrings[i]);
		}
		
		
		// STEP 6
		// loop through all the elements in a String array
		// then loop through all the chars in each String
		for(x=0; x < myStrings2.length; x++) {
			String currentWord = myStrings2[x];
			for (int y = 0; y < currentWord.length(); y++) {
				System.out.println(currentWord.charAt(y));
			}
		}
		
		
		// STEP 7
		// Watch out for Out of Bounds errors
		// trying to access an index that doesn't exist
		//System.out.println(myStrings2[100]);

		

		
		
		
	}



}