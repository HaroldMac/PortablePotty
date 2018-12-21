package com.portable.potty.service;

import java.util.List;

import com.portable.potty.model.Employee;

public interface EmployeeService {

	Employee getEmployee(int id);

	Employee getEmployee(String firstName, String lastName);

	List<Employee> getAllEmployees();

	void addEmployee(String position, String firstName, String lastName, String phoneNumber, String address);

}