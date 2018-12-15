package com.portable.potty.service;


import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portable.potty.model.Employee;
import com.portable.potty.repository.EmployeeHoursLogRepo;
import com.portable.potty.repository.EmployeeHoursLogRepoImpl;

@Service
public class EmployeeHoursLogServiceImpl implements EmployeeHoursLogService {
	
	@Autowired
	EmployeeHoursLogRepo employeeHoursLogRepo = new EmployeeHoursLogRepoImpl();
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.EmployeeHoursLogService#employeeLogIn(com.portable.potty.model.Employee)
	 */
	@Override
	public void employeeLogIn(Employee employee) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Employee Hour service log in");
		System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " is starting shift");
		System.out.println("It is currently: " + cal.getTime());
		employeeHoursLogRepo.logIn(employee, cal);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.EmployeeHoursLogService#employeeLogOut(com.portable.potty.model.Employee)
	 */
	@Override
	public void employeeLogOut(Employee employee) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Employee Hour service log out");
		System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() + " is ending shift");
		System.out.println("It is currently: " + cal.getTime());
		employeeHoursLogRepo.logOut(employee, cal);
	}

}
