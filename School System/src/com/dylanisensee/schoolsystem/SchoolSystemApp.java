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
		
		MySchool school1 = new MySchool(1, "Western");
		school1.enrollStudent(s1);
		school1.enrollStudent(s2);
		school1.enrollStudent(s3);
		
		String str = s3.toString();
		System.out.println(str);
		
		
//		Here are the steps we followed (let's paste these steps into a comment in our SchoolSystem class)
//
//		Before we start, notice that private instance variables cannot be accessed from subclasses
//		(you must use get/set methods from the Student class to access the private instance variables in User)
//
//		1.  Let's go into the School class and make the students 'protected' instead of private (we'll extend School in a bit).
//		This will allow sub classes of School to access the students directly (this could be a security problem!)
//
//		2. Make the School class abstract and add and abstract method: public abstract void saveStudents();
//
//		3. Add a method call to saveStudents() from enrollStudent() (when a new student is enrolled we should probably 
//		save all of our student data). Note that you cannot instantiate an abstract class (because it's not complete). 
//		But you can extend it, and then provide the details to complete it by overridding the abstract method. So lets 
//		make a sub class of School and provide the details of how we want to save our student data…
//
//		4. Create a class called MySchool that extends School
//
//		5. Add a constructor that takes the id and name params, make sure to call super(id, name)
//
//		6. Override saveStudents() - We'll just simulate saving the students to a CSV file, but the beauty of the abstract
//		School class is that different schools in the system (sub classes of School)  can save student data however they want
//		(to CSV, or to a database, or whatever). The designers of the School class don't care HOW the student data is saved,
//		they know that they can just invoke saveStudents() and leave it up to the sub classes to define exactly how the student
//		data will actually be saved.


		 
	}

}
