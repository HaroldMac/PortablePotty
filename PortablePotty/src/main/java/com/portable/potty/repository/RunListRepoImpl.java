package com.portable.potty.repository;

import java.util.ArrayList;
import java.util.List;

import com.portable.potty.model.Call;
import com.portable.potty.model.Customer;
import com.portable.potty.model.Employee;
import com.portable.potty.model.RunList;

public class RunListRepoImpl implements RunListRepo {

	//public Call(String service, String location, int biWeeklyFrequency, Customer customer) {
	//public Customer(int id, String customerName, String address, String contactName, String phoneNumber) {
	//public RunList(Employee employee, String dayOfWeek, List<Call> calls) {
	//Customer customer1 = new Customer(1, "FauxCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
	//Customer customer2 = new Customer(2, "FakeCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
	//Customer customer3 = new Customer(3, "Fakies", "5679 Faux Dr, Calgary NE, B3C 7D4", "Amet Consectetur", "4030003755");
	//Customer customer4  = new Customer(4, "Frauds", "5679 Faux Dr, Calgary NE, B3C 7D4", "Adip Elit", "4030004755");
	
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.RunListRepo#getRunList(int)
	 */
	@Override
	public RunList getRunList(int runListId) {
		
		List<Call> calls = new ArrayList<Call>();
		Customer customer1 = new Customer(1, "FauxCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Customer customer2 = new Customer(2, "FakeCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
		Employee employee = new Employee(1, "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");

		calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", 4 , customer1));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5", 8, customer2));
		RunList runList = new RunList(employee, "tuesday", calls);
		return runList;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.RunListRepo#getRunList(com.portable.potty.model.Employee, java.lang.String)
	 */
	@Override
	public RunList getRunList(Employee employee, String dayOfWeek) {
		
		List<Call> calls = new ArrayList<Call>();
		Customer customer1 = new Customer(1, "FauxCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Customer customer2 = new Customer(2, "FakeCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
		//Employee employee = new Employee(1, "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");

		calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", 4 , customer1));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5", 8, customer2));
		RunList runList = new RunList(employee, "tuesday", calls);
		return runList;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.RunListRepo#getRunList()
	 */
	@Override
	public RunList getRunList() {
		
		List<Call> calls = new ArrayList<Call>();
		Customer customer1 = new Customer(1, "FauxCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Customer customer2 = new Customer(2, "FakeCompany", "5679 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
		Employee employee = new Employee(1, "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");

		calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", 4 , customer1));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5", 8, customer2));
		RunList runList = new RunList(employee, "tuesday", calls);
		return runList;
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.RunListRepo#updateRunList(com.portable.potty.model.RunList)
	 */
	@Override
	public void updateRunList(RunList runList) {
		System.out.println("Updating runlist");
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.RunListRepo#removeRunList(com.portable.potty.model.RunList)
	 */
	@Override
	public void removeRunList(RunList runList) {
		System.out.println("removing runlist");
	}

}
