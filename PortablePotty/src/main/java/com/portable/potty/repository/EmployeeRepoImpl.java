package com.portable.potty.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.portable.potty.model.Customer;
import com.portable.potty.model.Employee;

@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
	
	List<Employee> employees;
	
	public EmployeeRepoImpl() {
		this.createStubData();
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#addEmployee(com.portable.potty.model.Employee)
	 */
	@Override
	public void addEmployee(Employee employee) {
		System.out.println("Adding " + employee.getFirstName() + " " + employee.getLastName());
		employees.add(employee);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getEmployee(int)
	 */
	@Override
	public Employee getEmployee(int id){
		Employee e = new Employee(99, "driver", "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");
		for (Employee employee: employees) {
			if (employee.getId() == id){
				e = employee;
			}
		}	
		System.out.println("Returning employee with id " + e.getId());
		return e;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getEmployee(java.lang.String, java.lang.String)
	 */
	@Override
	public Employee getEmployee(String firstName, String lastName){
		Employee e = new Employee(99, "driver", "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");
		
		for (Employee employee: employees) {
			if ((employee.getFirstName().toLowerCase().equals(firstName)) && (employee.getLastName().toLowerCase().equals(lastName))){
				e = employee;
			}
		}
		System.out.println("Returning employee with name " + e.getFirstName() + " " + e.getLastName());
		return e;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#removeEmployee(com.portable.potty.model.Employee)
	 */
	@Override
	public void removeEmployee(Employee employee) {
		System.out.println("Removing " + employee.getFirstName() + " " + employee.getLastName());
		employees.remove(employee);
	}

	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getEmployees()
	 */
	@Override
	public List<Employee> getEmployees(){

		return this.employees;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeRepo#getHighestId()
	 */
	@Override
	public int getHighestId() {
		return this.getEmployees().size(); 
	}
	
	private void createStubData() {
		this.employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "driver", "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		employees.add(new Employee(2, "driver", "Jane", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		employees.add(new Employee(3, "dispatcher", "Sakura", "Haruna", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		employees.add(new Employee(4, "admim","Tidus", "Jecht", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		
	}

}
