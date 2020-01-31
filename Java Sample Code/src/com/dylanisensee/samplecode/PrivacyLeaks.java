package com.dylanisensee.samplecode;
public class PrivacyLeaks {

	public static void main(String[] args) {
				
		School school1 = new School();
		Student[] allStudents = school1.getStudents();
		school1.setStudents(null);
				
	}

}

class Student{
	
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

class School{
	
	private Student[] students = {
		new Student(1, "Tommy", "Smith"),
		new Student(2, "Sally" , "Jones"),
		new Student(3, "Bob", "Johnson")
	};

	// we want to protect our students!
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	// instead of the default get/set methods, we'll use these instead
	public void addStudent(Student newStudent) {
		
		// create a new array (that can hold one more student than the current students array)
		Student[] newStudentArray = new Student[students.length];
		// copy all the students over to the temp array
		for(int x = 0; x < students.length; x++) {
			newStudentArray[x] = students[x];
		}
		
		// add the new student to the temp array
		newStudentArray[newStudentArray.length-1] = newStudent;
		
		// replace the 'students' array with the new one
		students = newStudentArray;
	}
	
	public Student getStudentById(int studentId) {
		return null;
	}
	
	public Student getStudentByName(String fName, String lName) {
		return null;
	}
	
}