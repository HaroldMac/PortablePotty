package com.portable.potty.model;

public class Person {

	private int id;
	private String firstName, lastName;
	private String position;
	
	public Person(int id, String firstName, String lastName, String position) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	public String getPosition() {return position;}
	public void setPosition(String position) {this.position = position;}
	
}
