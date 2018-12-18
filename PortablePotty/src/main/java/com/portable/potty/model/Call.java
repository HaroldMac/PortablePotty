package com.portable.potty.model;

public class Call {
	
	private String service;
	private String location;
	private int biWeeklyFrequency;		//every two weeks
	private Customer customer;
	private String contactName;
	private String phoneNumber;
	private String relocationAddress;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Call(String service, String location, int biWeeklyFrequency, Customer customer, String contactName, String phoneNummber) {
		this.service = service;
		this.location = location;
		this.biWeeklyFrequency = biWeeklyFrequency;
		this.customer = customer;
		this.contactName = contactName;
	}
	
	public Call(String service, String location, String newLocation, int biWeeklyFrequency, Customer customer, String contactName, String phoneNummber) {
		this.service = service;
		this.location = location;
		this.relocationAddress = newLocation;
		this.biWeeklyFrequency = biWeeklyFrequency;
		this.customer = customer;
		this.contactName = contactName;
	}

	public String getRelocationAddress() {
		return relocationAddress;
	}

	public void setRelocationAddress(String relocationAddress) {
		this.relocationAddress = relocationAddress;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBiWeeklyFrequency() {
		return biWeeklyFrequency;
	}

	public void setBiWeeklyFrequency(int biWeeklyFrequency) {
		this.biWeeklyFrequency = biWeeklyFrequency;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
