package com.portable.potty.repository;

import com.portable.potty.model.Customer;

public interface CustomerRepo {

	//public Customer(int id, String customerName, String address, String contactName, int phoneNumber) {
	void addCustomer(Customer customer);

	Customer getCustomer(int id);

	Customer getCustomer(String customerName);

	void removecustomer(Customer customer);

}