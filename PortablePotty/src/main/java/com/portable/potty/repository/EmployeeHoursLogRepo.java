package com.portable.potty.repository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.portable.potty.model.Employee;

public interface EmployeeHoursLogRepo {

	void logIn(Employee employee, Calendar c);

	void logOut(Employee employee, Calendar c);

	String getAllLogsByDay(Date d);

	List<String> getAllLogsBetween2Days(Date day1, Date day2);




}