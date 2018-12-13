package com.portable.potty.model;

public class Customer {
	
	private int id;
	private String customerName, address, contactName;
	private String phoneNumber;
	
	public Customer(int id, String customerName, String address, String contactName, String phoneNumber) {
		this.id = id;
		this.customerName = customerName;
		this.address = address;
		this.contactName = contactName;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
