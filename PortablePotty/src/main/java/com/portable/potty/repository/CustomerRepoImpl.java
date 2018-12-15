package com.portable.potty.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.portable.potty.model.Customer;

@Repository
public class CustomerRepoImpl implements CustomerRepo {
	
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
	 * @see com.portable.potty.repository.CustomerRepo#getCustomers()
	 */
	@Override
	public List<Customer> getCustomers(){
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1, "FauxCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755"));
		customers.add(new Customer(2, "FakeCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755"));
		customers.add(new Customer(3, "Fakies", "5679 Faux Dr, Calgary NE, B3C 7D4", "Amet Consectetur", "4030003755"));
		customers.add(new Customer(4, "Frauds", "5679 Faux Dr, Calgary NE, B3C 7D4", "Adip Elit", "4030004755"));
		return customers;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.CustomerRepo#removecustomer(com.portable.potty.model.Customer)
	 */
	@Override
	public void removecustomer(Customer customer) {
		System.out.println("Removing " + customer.getCustomerName());
	}

}
