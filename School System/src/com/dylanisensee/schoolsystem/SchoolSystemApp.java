package com.dylanisensee.schoolsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolSystemApp {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Bob","Smith","bob@smith.com",UserRole.STUDENT,"test", 0);
		Student s2 = new Student(2, "Sally","Jones","sally@jones.com",UserRole.STUDENT,"test",0);
		User t1 = new User(3,"Jim","J","j@j.com",UserRole.TEACHER,"test");
		
		ArrayList<User> users = new ArrayList();
		users.add(s1);
		users.add(s2);
		users.add(t1);
		
		
		/*
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your email address:");
		String emailInput = keyboard.nextLine();
		System.out.println("Enter your password:");
		String passwordInput = keyboard.nextLine();
		
		User currentUser = null;
		for(User u : users) {
			if(u.authenticate(emailInput, passwordInput)) {
				currentUser = u;
				break;
			}
		}
		if(currentUser != null) {
			System.out.println("Hello " + currentUser.getFirstName());
		}else {
			System.out.println("Unable to log in");
		}
		*/
		
		//System.out.println(t1.toString());
		//System.out.println(s1.toString());
		
		for(User u : users) {
			System.out.println(u.toString());
		}
		
		if(s1.equals(t1)) {
			System.out.println("s1 is equal to t1");
		}
		
		Student s3 = new Student(1, "Bob","Smith","bob@smith.com",UserRole.STUDENT,"test", 0);
		
		if(s1.equals(s3)) {
			System.out.println("s1 and s3 are referring to the same student");
		}
		
		School school1 = new School(1, "Western");
		school1.enrollStudent(s1);
		school1.enrollStudent(s2);
		school1.enrollStudent(s3);
	}

}
