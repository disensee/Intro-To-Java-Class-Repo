package com.dylanisensee.samplecode;
public class EqualityVsIdentity {

	public static void main(String[] args) {
		
		int x = 7;
		int y = 7;
		int z = y; // The value of y is copied into the bytes allocated for z
		
		if(x == y && y == z && z == x) {
			System.out.println("x,y, and z are the same");
		}
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1 and str2 are the same");
		}else {
			System.out.println("str1 and str2 are NOT the same");
		}
		
		str2 = str1; // a reference to str1 (the memory address of str1) is copied to str2
		if(str1 == str2) {
			System.out.println("str1 and str2 are the same");
		}else {
			System.out.println("str1 and str2 are NOT the same");
		}
		
		// using == to compares objects checks to see if they are the same object (checks for identity)
		// which is why we have the equals() method (checks for equality)

	}

}