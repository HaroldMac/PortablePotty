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
		System.out.println("It is currently " + cal.getTime().getDay() + " at " + cal.getTime().getHours() + ":" + cal.getTime().getMinutes());
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
		System.out.println("It is currently " + this.getDayOfWeek(cal.getTime().getDay()) + " at " + cal.getTime().getHours() + ":" + cal.getTime().getMinutes());
		employeeHoursLogRepo.logOut(employee, cal);
	}
	
	
	private String getDayOfWeek(int day) {
		System.out.println("the id of the day of the week is " + day);
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday" };
		return days[day-1];
	}

}
