package com.portable.potty.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.portable.potty.model.Customer;
import com.portable.potty.model.Employee;

@Repository
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
		Employee e = new Employee(id, "driver", "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");
		System.out.println("Returning employee with id " + e.getId());
		return e;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getEmployee(java.lang.String, java.lang.String)
	 */
	@Override
	public Employee getEmployee(String firstName, String lastName){
		Employee e = new Employee(1, "driver", firstName, lastName, "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");
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

	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getEmployees()
	 */
	@Override
	public List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "driver", "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		employees.add(new Employee(2, "driver", "Jane", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		employees.add(new Employee(3, "dispatcher", "Sakura", "Haruna", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		employees.add(new Employee(4, "admim","Tidus", "Jecht", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		return employees;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getHighestId()
	 */
	@Override
	public int getHighestId() {
		return this.getEmployees().size(); 
	}

}
