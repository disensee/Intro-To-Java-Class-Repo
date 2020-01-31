package com.dylanisensee.samplecode;

public class Test2Review {

	public static void main(String[] args) {
		float[] floatArr = {1F, 4F, 7F, 3F};
		float min = floatArr[0];
		
		for(int i = 0; i < floatArr.length; i++) {
			if(floatArr[i] < min)
				min = floatArr[i];
		}
		System.out.println(min);
		
		
		String x = "7";
		int y = new Integer(x);
		System.out.println(y);
		String str = Integer.toString(y);
		System.out.println(str);
		
		String[] stringArr = {"hee", "haw", "blah"};
		String searchTerm = "blah";
		for(int i = 0; i < stringArr.length; i++) {
			if(stringArr[i].equals(searchTerm)) {
				System.out.println("Found it");
				break;
			}
		}
		
		
	}	
	
	
	public class Message{
		private int id;
		private String from;
		private String[] to;
		private String subject;
		private String text;
		
		public String getFrom(){
			return this.from;
		}
		
		public void setFrom(String from){
			this.from = from;
		}
		
		public boolean saveDraft(String fileName) {
			return true;
		}
		
	}
	
	public class Account {
		private int id;
		private String firstName;
		private String lastName;
		private float[] transactions;
		
		public String getFirstName() {
			return this.firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public float getBalance() {
			return 0F;
		}
		
	}
}


