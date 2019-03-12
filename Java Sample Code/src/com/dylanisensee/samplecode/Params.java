package com.dylanisensee.samplecode;
import java.util.Date;

public class Params {

	public static void main(String[] args) {
		
		int x = 2;
		Params.updatePrimitive(x);
		System.out.println(x);
		
		Date d = new Date();
		Params.updateDateObject(d);
		System.out.println(d);
		
		String s = "hello";
		Params.updateStringObject(s);
		System.out.println(s);
	}
	
	
	public static void updatePrimitive(int someInt) {
		//someInt *= 2;
		someInt = someInt * 2;
	}
	
	
	public static void updateDateObject(Date someDate) {
		someDate.setYear(0);
	}
	
	
	public static void updateStringObject(String someString) {
		someString = "BLAH";
	}

}