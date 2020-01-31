package com.dylanisensee.employees.step2;

import java.util.Date;

public class Employee {
		
	// Static members
	public static final float MAX_SALARY = 200000F;
	public static final float MIN_SALARY = 40000F;
	
	// Instance Variables
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private float salary;
	private Date dateHired;
	
	// Getters/Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id > 0) {
			this.id = id;
		}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		if(salary >= MIN_SALARY && salary <= MAX_SALARY) {
			this.salary = salary;
		}	
	}
	public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
		
	// METHODS
	public String displayEmployee() {
		return String.format("ID: %d NAME: %s %s AGE: %d SALARY %.2f Date Hired: %s",this.id, this.firstName, this.lastName, this.age, this.salary, this.dateHired);
	}
	
	public boolean equals(Employee e) {
		if(this.id == e.getId()) {
			return true;
		}
		return false;
	}
	
	public void changePrimitiveType (int someInt) {
		someInt = -1;
	}
	
	public void changeReferenceType (Date someDate) {
		someDate.setYear(0);
	}
}