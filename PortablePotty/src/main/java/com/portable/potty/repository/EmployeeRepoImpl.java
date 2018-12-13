package com.portable.potty.repository;

import com.portable.potty.model.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#addEmployee(com.portable.potty.model.Employee)
	 */
	@Override
	public void addEmployee(Employee employee) {
		System.out.println("Adding " + employee.getFirstName() + " " + employee.getLastName());
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getEmployee(int)
	 */
	@Override
	public Employee getEmployee(int id){
		Employee e = new Employee(id, "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");
		System.out.println("Returning employee with id " + e.getId());
		return e;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getEmployee(java.lang.String, java.lang.String)
	 */
	@Override
	public Employee getEmployee(String firstName, String lastName){
		Employee e = new Employee(1, firstName, lastName, "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");
		System.out.println("Returning employee with name " + e.getFirstName() + " " + e.getLastName());
		return e;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#removeEmployee(com.portable.potty.model.Employee)
	 */
	@Override
	public void removeEmployee(Employee employee) {
		System.out.println("Removing " + employee.getFirstName() + " " + employee.getLastName());
	}

}
