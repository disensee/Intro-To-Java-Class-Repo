package com.dylanisensee.schoolsystem;

public class User {
	//instance variables
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private UserRole role;
	private String password;
	
	//Getters/Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Constructors
	public User(long id, String firstName, String lastName, String email, UserRole role, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.password = password;
	}
	
	public User() {}
	
	public boolean authenticate(String email, String password) {
		if(email.equals(this.email) && password.equals(this.password)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d Name: %s %s Email: %s Role: %s", id, firstName, lastName, email, role);
	}
	

	public boolean equals(User u) {
		if(this.id == u.getId()) {
			return true;
		}
		return false;
	}
}
