package com.dylanisensee.employees.step1;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		EmployeeApp app = new EmployeeApp();
			
		/*		
		// STEP 1 - Use the createEmployee() method to populate the program with employees
		System.out.println("How many employees do you have?");
		int numberOfEmployees = keyboard.nextInt();
		
		Employee[] employees = new Employee[numberOfEmployees];
		for(int x = 0; x < employees.length; x++) {
			System.out.println("Adding employee...");
			employees[x] = app.createEmployee();
		}
		*/
		
		// Now go back into the Employee class and add logic to protect the instance variables from being corrupted
		
		
		// STEP 2 - Rather than have to re-enter all the employee data each time we run the app, let's have some code do it for us
		Employee[] employees = app.loadEmployees();
		
		// STEP 3
		// Find the oldest employee (implement the code in the body of the getOldestEmployee()  method)...
		Employee oldest = app.getOldestEmployee();
		System.out.println(oldest.displayEmployee());
		// STEP 4
		// Find the highest paid employee (implement the code in the body of the getHighestPaidEmployee()  method)...
		Employee highestPaid = app.getHighestPaidEmployee();
		System.out.println(highestPaid.displayEmployee());
		
		// STEP 5
		// Check to see if the highest paid employee is the same as the oldest employee
		if(highestPaid == oldest)	{
			System.out.println("SAME OBJECT");
		}else {
			System.out.println("NOT THE SAME OBJECT");
		}
		
		

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
		e.setAge(age);
	
		return e;
		
	}
	
	public Employee[] loadEmployees() {

		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setFirstName("Bob");
		e1.setLastName("Smith");
		e1.setSalary(150000);
		e1.setAge(44);
		
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setFirstName("Sally");
		e2.setLastName("Jones");
		e2.setSalary(180000);
		e2.setAge(53);
		
		
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setFirstName("Jeff");
		e3.setLastName("Johnson");
		e3.setSalary(50000);
		e3.setAge(24);
		
		Employee[] allEmployees = {e1, e2, e3};
		return allEmployees;
		
	}
	
	
	public Employee getOldestEmployee() {
		
		Employee[] employees = this.loadEmployees();
		Employee oldest = employees[0];
		for(int x = 0; x < employees.length; x++) {
			if(oldest.getAge() < employees[x].getAge()) {
				oldest = employees[x];
			}
		}
		return oldest;
	}
	
	
	public Employee getHighestPaidEmployee() {
		
		Employee[] employees = this.loadEmployees();
		Employee highestPaid = employees[0];
		for(int x = 0; x < employees.length; x++) {
			if(highestPaid.getSalary() < employees[x].getSalary())
				highestPaid = employees[x];
		}
		return highestPaid;
	}
	

}