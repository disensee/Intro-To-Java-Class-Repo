package com.dylanisensee.schoolsystem;

public class Student extends User {
	//instance variables
	private float gpa;
	
	//getters/setters
	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	//constructor function
	public Student(long id, String firstName, String lastName, String email, UserRole role, String password, float gpa) {
		super(id, firstName, lastName, email, role, password);
		this.gpa = gpa;
	}
}
