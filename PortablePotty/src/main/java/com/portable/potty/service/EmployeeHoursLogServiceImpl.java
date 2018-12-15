package com.portable.potty.service;


import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portable.potty.model.Employee;
import com.portable.potty.repository.EmployeeHoursLogRepo;
import com.portable.potty.repository.EmployeeHoursLogRepoImpl;

@Service
public class EmployeeHoursLogServiceImpl {
	
	@Autowired
	EmployeeHoursLogRepo employeeHoursLogRepo = new EmployeeHoursLogRepoImpl();
	
	public void employeeLogIn(Employee employee) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Employee Hour service ");
		System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " is starting shift");
		System.out.println("It is currently: " + cal.getTime());
		employeeHoursLogRepo.logIn(employee, cal);
	}

}
