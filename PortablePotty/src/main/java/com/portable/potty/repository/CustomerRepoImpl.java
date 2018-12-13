package com.portable.potty.repository;

import com.portable.potty.model.Customer;

public class CustomerRepoImpl implements CustomerRepo {
	
//public Customer(int id, String customerName, String address, String contactName, int phoneNumber) {
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.CustomerRepo#addCustomer(com.portable.potty.model.Customer)
	 */
	@Override
	public void addCustomer(Customer customer) {
		System.out.println("Adding " + customer.getCustomerName());
	}

	/* (non-Javadoc)
	 * @see com.portable.potty.repository.CustomerRepo#getCustomer(int)
	 */
	@Override
	public Customer getCustomer(int id){
		Customer c = new Customer(id, "FauxCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		System.out.println("Returning employee with id " + c.getId());
		return c;
	}

	/* (non-Javadoc)
	 * @see com.portable.potty.repository.CustomerRepo#getCustomer(java.lang.String)
	 */
	@Override
	public Customer getCustomer(String customerName){
		Customer c = new Customer(1, customerName, "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		System.out.println("Returning employee with name " + c.getCustomerName());
		return c;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.CustomerRepo#removecustomer(com.portable.potty.model.Customer)
	 */
	@Override
	public void removecustomer(Customer customer) {
		System.out.println("Removing " + customer.getCustomerName());
	}

}
