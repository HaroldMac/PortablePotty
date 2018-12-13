package com.portable.potty.repository;

import com.portable.potty.model.Call;
import com.portable.potty.model.Customer;

public class CallRepoImpl {
	
	//public Call(String service, String location, int biWeeklyFrequency, Customer customer) {
	public Call getCall(int id) {
		Customer customer = new Customer(id, "FauxCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Call call = new Call("Cleaning", "5679 Faux Dr, Calgary NE, B3C 7D4", 2, customer );
		System.out.println("Retrieving Call " + call.getCustomer().getCustomerName());
		return call;
	}
	
	public Call getCall(String location) {
		Customer customer = new Customer(5, "FauxCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Call call = new Call("Cleaning", "5679 Faux Dr, Calgary NE, B3C 7D4", 2, customer );
		System.out.println("Retrieving Call " + call.getCustomer().getCustomerName());
		return call;
	}
	
	public void addCall(Call call) {
		System.out.println("Adding call" + call.getLocation());
	}
	
	
}
