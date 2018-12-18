package com.portable.potty.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.portable.potty.model.Employee;
import com.portable.potty.repository.EmployeeRepo;
import com.portable.potty.repository.EmployeeRepoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.EmployeeService#getEmployee(int)
	 */
	@Override
	public Employee getEmployee(int id) {
		EmployeeRepo er = new EmployeeRepoImpl();
		return er.getEmployee(id);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.EmployeeService#getEmployee(java.lang.String, java.lang.String)
	 */
	@Override
	public Employee getEmployee(String firstName, String lastName) {
		EmployeeRepo er = new EmployeeRepoImpl();
		return er.getEmployee(firstName, lastName);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.EmployeeService#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		EmployeeRepo er = new EmployeeRepoImpl();
		return er.getEmployees();
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.EmployeeService#addEmployee(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void addEmployee(String firstName, String lastName, String phoneNumber, String address) {
		//public Employee(int id, String firstName, String lastName, String phoneNumber, String address) {
		EmployeeRepo er = new EmployeeRepoImpl();
		int nextId = er.getHighestId() + 1;
		Employee employee = new Employee(nextId, firstName, lastName, phoneNumber, address);
		er.addEmployee(employee);
	}

}
