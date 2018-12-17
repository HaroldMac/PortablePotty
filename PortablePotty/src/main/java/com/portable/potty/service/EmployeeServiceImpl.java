package com.portable.potty.service;

import java.util.List;

import com.portable.potty.model.Employee;
import com.portable.potty.repository.EmployeeRepo;
import com.portable.potty.repository.EmployeeRepoImpl;

public class EmployeeServiceImpl {
	
	public Employee getEmployee(int id) {
		EmployeeRepo er = new EmployeeRepoImpl();
		return er.getEmployee(id);
	}
	
	public Employee getEmployee(String firstName, String lastName) {
		EmployeeRepo er = new EmployeeRepoImpl();
		return er.getEmployee(firstName, lastName);
	}
	
	public List<Employee> getAllEmployees(){
		EmployeeRepo er = new EmployeeRepoImpl();
		return er.getEmployees();
	}
	
	public void addEmployee(String firsName, String lastName, String phoneNumber, String address) {
		//public Employee(int id, String firstName, String lastName, String phoneNumber, String address) {
		EmployeeRepo er = new EmployeeRepoImpl();
		int nextId = er.getEmployees().size() + 1;		
	}

}
