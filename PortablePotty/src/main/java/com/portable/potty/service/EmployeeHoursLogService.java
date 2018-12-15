package com.portable.potty.service;

import com.portable.potty.model.Employee;

public interface EmployeeHoursLogService {

	void employeeLogIn(Employee employee);

	void employeeLogOut(Employee employee);

}