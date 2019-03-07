package com.dylanisensee.employees.step2;

import java.util.Date;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		
		EmployeeApp app = new EmployeeApp();
				
		
		// Find the oldest employee...
		Employee oldest = app.getOldestEmployee();
		System.out.println(oldest.displayEmployee());
		
		// Find the highest paid employee...
		Employee highestPaid = app.getHighestPaidEmployee();
		System.out.println(highestPaid.displayEmployee());
		
		/*
		// Check to see if the highest paid employee is the same as the oldest employee
		if(oldest == highestPaid) {
			System.out.println("SAME OBJECT");
		}else {
			System.out.println("NOT THE SAME OBJECT");
		}
		*/
		if(oldest.equals(highestPaid)) {
			System.out.println("SAME EMPLOYEE");
		}else {
			System.out.println("NOT THE SAME EMPLOYEE");
		}
		
		int x = 10;
		oldest.changePrimitiveType(x);
		System.out.println(x);
		
		Date d = new Date();
		oldest.changeReferenceType(d);
		System.out.println(d);
	}
	
	
	public Employee createEmployee() {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Employee ID:");
		long id = keyboard.nextLong();
		
		System.out.println("First Name:");
		String fName = keyboard.next();
		
		System.out.println("Last Name:");
		String lName = keyboard.next();
		
		System.out.println("Salary:");
		float salary = keyboard.nextFloat();
		
		System.out.println("Age:");
		int age = keyboard.nextInt();
		
		Employee e = new Employee();
		e.setId(id);
		e.setFirstName(fName);
		e.setLastName(lName);
		e.setSalary(salary);
		//e.setAge(age);
	
		return e;
	}
	
	public Employee[] loadEmployees() {
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setFirstName("Bob");
		e1.setLastName("Smith");
		e1.setSalary(150000);
		e1.setAge(44);
		e1.setDateHired(new Date(100, 0, 1));
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setFirstName("Sally");
		e2.setLastName("Jones");
		e2.setSalary(180000);
		e2.setAge(53);
		e2.setDateHired(new Date(110, 2, 5));
		
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setFirstName("Jeff");
		e3.setLastName("Johnson");
		e3.setSalary(50000);
		e3.setAge(24);
		e3.setDateHired(new Date(110, 2, 7));
		
		Employee[] allEmployees = {e1, e2, e3};
		return allEmployees;
	}
	
	
	public Employee getOldestEmployee() {
		
		Employee[] employees = this.loadEmployees();
		
		Employee oldestEmployee = employees[0];
		
		for(Employee e : employees) {
			if(e.getAge() > oldestEmployee.getAge()) {
				oldestEmployee = e;
			}
		}
		
		return oldestEmployee;
		
	}
	
	
	public Employee getHighestPaidEmployee() {
		
		Employee[] employees = this.loadEmployees();
		
		Employee highestPaidEmployee = employees[0];
		
		for(Employee e : employees) {
			if(e.getSalary() > highestPaidEmployee.getSalary()) {
				highestPaidEmployee = e;
			}
		}
		
		return highestPaidEmployee;
		
	}
	

}