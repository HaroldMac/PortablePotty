package com.portable.potty.model;

public class Call {
	
	private String service;
	private String location;
	private int biWeeklyFrequency;		//every two weeks
	private Customer customer;

	public Call(String service, String location, int biWeeklyFrequency, Customer customer) {
		this.service = service;
		this.location = location;
		this.biWeeklyFrequency = biWeeklyFrequency;
		this.customer = customer;
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
