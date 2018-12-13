package com.portable.potty.repository;

import com.portable.potty.model.Employee;

public interface EmployeeRepo {

	void addEmployee(Employee employee);

	Employee getEmployee(int id);

	Employee getEmployee(String firstName, String lastName);

	void removeEmployee(Employee employee);

}