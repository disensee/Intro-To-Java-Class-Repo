package com.dylanisensee.schoolsystem;

import java.util.ArrayList;

public abstract class School {
	
	//instance variables
	private int id;
	private String name;
	
	protected ArrayList<Student> students = new ArrayList();
	
	//setters/getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//constructors
	public School(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
	
	//methods
	public boolean enrollStudent(Student newStudent) {
		for(Student s : students) {
			if(s.equals(newStudent)) {
				System.out.println("Unable to enroll " + newStudent.getFirstName() + " because the student is already enrolled.");
				return false;
			}
		}
		students.add(newStudent);
		System.out.println(newStudent.getFirstName() + " enrolled.");
		saveAllStudents();
		return true;
	}
	
	public abstract void saveAllStudents();
		
	
	
}
