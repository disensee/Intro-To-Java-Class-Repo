package com.dylanisensee.schoolsystem;

public class MySchool extends School {

	public MySchool(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveAllStudents() {
		System.out.println("SAVING ALL STUDENTS TO CSV FILE...");
		for(Student s : this.students) {
			System.out.println(s);
		}

	}

}
