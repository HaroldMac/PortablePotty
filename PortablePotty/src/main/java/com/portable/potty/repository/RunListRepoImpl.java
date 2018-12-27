package com.portable.potty.repository;

import java.util.ArrayList;
import java.util.List;

import com.portable.potty.model.Call;
import com.portable.potty.model.Customer;
import com.portable.potty.model.Employee;
import com.portable.potty.model.RunList;

public class RunListRepoImpl implements RunListRepo {

	/* (non-Javadoc)
	 * @see com.portable.potty.repository.RunListRepo#getRunList(int)
	 */
	@Override
	public RunList getRunList(int runListId) {
		RunList runlist;
		Employee employee = new Employee(0, "driver", "John", "Doe" , "5030005555", "1234 Employee St, Calgary NW, A1B 2C3");
		switch (runListId) {
			case 0:
				runlist = this.getStubMonday(employee);
				break;
			case 1: 
				runlist = this.getStubTuesday(employee);
				break;
			case 2: 
				runlist = this.getStubWednesday(employee);
				break;
			case 3: 	
				runlist = this.getStubThursday(employee);
				break;
			case 4: 
				runlist = this.getStubFriday(employee);
				break;
			default : 
				runlist = this.getStubFriday(employee);
				break;
		}
		return runlist;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.RunListRepo#getRunList(com.portable.potty.model.Employee, java.lang.String)
	 */
	@Override
	public RunList getRunList(Employee employee, String dayOfWeek) {
		return this.getStubData(employee, dayOfWeek);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.RunListRepo#getRunList()
	 */
	@Override
	public RunList getRunList() {
		Employee employee0 = new Employee(0, "driver", "John", "Doe" , "5030005555", "1234 Employee St, Calgary NW, A1B 2C3");
		return this.getStubData(employee0, "Monday");
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
	
	private RunList getStubData(Employee employee, String dayOfWeek) {
		RunList runlist;
		
		switch (dayOfWeek.toLowerCase()) {
		case "monday":
			runlist = this.getStubMonday(employee);
			break;
		case "tuesday": 
			runlist = this.getStubTuesday(employee);
			break;
		case "wednesday": 
			runlist = this.getStubWednesday(employee);
			break;
		case "thursday": 	
			runlist = this.getStubThursday(employee);
			break;
		case "friday": 
			runlist = this.getStubFriday(employee);
			break;
		default : 
			runlist = this.getStubFriday(employee);
			break;
	}		
		return runlist;		
	}

	private RunList getStubMonday(Employee employee) {
		List<Call> calls = new ArrayList<Call>();
		
		Customer customer0 = new Customer(0, "Faux Company", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Customer customer1 = new Customer(1, "Fake Company", "4659 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
		Customer customer2 = new Customer(2, "Froggies",     "1301 16 Ave, Calgary Nw, T2M 0L4", "Guy Gal", "4030001755");
		Customer customer3 = new Customer(4, "Crocs",        "4011 1a St Sw, Calgary , T3C 3B2", "Pan Nap", "4030002755");

		calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer0, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 4,  customer1, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer2, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer3, "Laura Ipso", "4067650424"));
		calls.add(new Call("Removal" , "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		RunList runList = new RunList(employee, "Monday", calls);
		return runList;		
	}
	private RunList getStubTuesday(Employee employee) {
		List<Call> calls = new ArrayList<Call>();
		
		Customer customer0 = new Customer(0, "Faux Company", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Customer customer1 = new Customer(1, "Fake Company", "4659 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
		Customer customer2 = new Customer(2, "Froggies",     "1301 16 Ave, Calgary Nw, T2M 0L4", "Guy Gal", "4030001755");
		Customer customer3 = new Customer(4, "Crocs",        "4011 1a St Sw, Calgary , T3C 3B2", "Pan Nap", "4030002755");

		calls.add(new Call("Cleaning", "5051 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer0, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 4,  customer1, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5051 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer2, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5051 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer3, "Laura Ipso", "4067650424"));
		calls.add(new Call("Removal" , "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		RunList runList = new RunList(employee, "Tuesday", calls);
		return runList;		
	}
	private RunList getStubWednesday(Employee employee) {
		List<Call> calls = new ArrayList<Call>();
		
		Customer customer0 = new Customer(0, "Faux Company", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Customer customer1 = new Customer(1, "Fake Company", "4659 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
		Customer customer2 = new Customer(2, "Froggies",     "1301 16 Ave, Calgary Nw, T2M 0L4", "Guy Gal", "4030001755");
		Customer customer3 = new Customer(4, "Crocs",        "4011 1a St Sw, Calgary , T3C 3B2", "Pan Nap", "4030002755");

		calls.add(new Call("Cleaning", "5052 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer0, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 4,  customer1, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5052 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer2, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5052 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer3, "Laura Ipso", "4067650424"));
		calls.add(new Call("Removal" , "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		RunList runList = new RunList(employee, "Wednesday", calls);
		return runList;		
	}
	
	private RunList getStubThursday(Employee employee) {
		List<Call> calls = new ArrayList<Call>();
		
		Customer customer0 = new Customer(0, "Faux Company", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Customer customer1 = new Customer(1, "Fake Company", "4659 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
		Customer customer2 = new Customer(2, "Froggies",     "1301 16 Ave, Calgary Nw, T2M 0L4", "Guy Gal", "4030001755");
		Customer customer3 = new Customer(4, "Crocs",        "4011 1a St Sw, Calgary , T3C 3B2", "Pan Nap", "4030002755");

		calls.add(new Call("Cleaning", "5053 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer0, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 4,  customer1, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5053 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer2, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5053 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer3, "Laura Ipso", "4067650424"));
		calls.add(new Call("Removal" , "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		RunList runList = new RunList(employee, "Thursday", calls);
		return runList;		
	}
	
	private RunList getStubFriday(Employee employee) {
		List<Call> calls = new ArrayList<Call>();
		
		Customer customer0 = new Customer(0, "Faux Company", "5679 Faux Dr, Calgary NE, B3C 7D4", "Laura Ipso", "4030001755");
		Customer customer1 = new Customer(1, "Fake Company", "4659 Faux Dr, Calgary NE, B3C 7D4", "Dolar Sit", "4030002755");
		Customer customer2 = new Customer(2, "Froggies",     "1301 16 Ave, Calgary Nw, T2M 0L4", "Guy Gal", "4030001755");
		Customer customer3 = new Customer(4, "Crocs",        "4011 1a St Sw, Calgary , T3C 3B2", "Pan Nap", "4030002755");

		calls.add(new Call("Cleaning", "5054 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer0, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 4,  customer1, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5054 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer2, "Laura Ipso", "4067650424"));
		calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		calls.add(new Call("Cleaning", "5054 Spruce Dr SW, Calgary, AB T3C 3B2", 1 , customer3, "Laura Ipso", "4067650424"));
		calls.add(new Call("Removal" , "4011 1a St SW, Calgary, AB T2S 2P5"    , 2,  customer3, "Dolar Sit",  "4067650424"));
		RunList runList = new RunList(employee, "Friday", calls);
		return runList;		
	}
	
	
}
