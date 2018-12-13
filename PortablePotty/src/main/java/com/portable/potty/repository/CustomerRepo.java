package com.portable.potty.repository;

import java.util.List;

import com.portable.potty.model.Customer;

public interface CustomerRepo {

	void addCustomer(Customer customer);

	Customer getCustomer(int id);

	Customer getCustomer(String customerName);
	
	List<Customer> getCustomers();

	void removecustomer(Customer customer);

}