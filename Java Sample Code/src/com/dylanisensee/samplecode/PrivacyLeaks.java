package com.dylanisensee.samplecode;

public class PrivacyLeaks {

	public static void main(String[] args) {
		
	}

	public class Student{
		private int id;
		private String firstName;
		private String lastName;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public Student(int id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}
	
	public class School{
		private Student[] students = {
				new Student(1, "Tommy", "Smith"),
				new Student(2, "Sally", "Jones"),
				new Student(3,"Bob", "Johnson" )
		};

		public Student[] getStudents() {
			return students;
		}

		public void setStudents(Student[] students) {
			this.students = students;
		}
		
		
	}
}
