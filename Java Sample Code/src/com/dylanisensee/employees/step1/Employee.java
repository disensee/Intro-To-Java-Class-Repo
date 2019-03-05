package com.dylanisensee.employees.step1;

public class Employee {

	//Static members
	public static final float MAX_SALARY = 200000F;
	public static final float MIN_SALARY = 40000F;
	
	//Instance variables
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private float salary;
	
	//Get methods
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public float getSalary() {
		return salary;
	}
	//Set methods
	public void setId(long id) {
		if(id > 0) {
			this.id = id;
		}
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	public void setSalary(float salary) {
		if(salary >= MIN_SALARY && salary <= MAX_SALARY ) {
			this.salary = salary;
		}
	}
	//Constructors
	
	//Methods
	public String displayEmployee() {
		return String.format("NAME: %s %s AGE: %d SALARY: %.2f", this.firstName, this.lastName, this.age, this.salary);
	}
	
	
}

