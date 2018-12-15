package com.portable.potty.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.portable.potty.model.Employee;

@Repository
public class EmployeeHoursLogRepoImpl implements EmployeeHoursLogRepo {
	
	public List<String> tempRepo = new ArrayList<String>();
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeHoursLogRepo#logIn(com.portable.potty.model.Employee, java.util.Calendar)
	 */
	@Override
	public void logIn(Employee employee, Calendar c) {
		System.out.println("EmployeeHoursLogRepoImpl: logIn");
		System.out.println(employee.getFirstName() + " is loggin in at " + c.toString());
		tempRepo.add(employee.getFirstName() + " is loggin in at " + c.toString());
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeHoursLogRepo#logOut(com.portable.potty.model.Employee, java.util.Calendar)
	 */
	@Override
	public void logOut(Employee employee, Calendar c) {
		System.out.println("EmployeeHoursLogRepoImpl: logOut");
		System.out.println(employee.getFirstName() + " is loggin out at " + c.toString());
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeHoursLogRepo#getAllLogsByDay(com.google.appengine.repackaged.com.google.type.Date)
	 */
	@Override
	public String getAllLogsByDay(Date d) {
		System.out.println("Getting all logs for " + d.getDay());
		return "";
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.EmployeeHoursLogRepo#getAllLogsBetween2Days(com.google.appengine.repackaged.com.google.type.Date, com.google.appengine.repackaged.com.google.type.Date)
	 */
	@Override
	public List<String> getAllLogsBetween2Days(Date day1, Date day2) {
		System.out.println("Getting all logs form " + day1.getDay() + " to " + day2.getDay());
		return tempRepo;
	}


}
