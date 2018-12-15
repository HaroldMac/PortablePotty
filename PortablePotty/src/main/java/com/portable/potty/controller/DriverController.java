package com.portable.potty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portable.potty.model.Employee;
import com.portable.potty.service.EmployeeHoursLogService;
import com.portable.potty.service.EmployeeHoursLogServiceImpl;

@Controller
public class DriverController {
	
	@RequestMapping(value="/driver", method = RequestMethod.GET)
	public String driverPage(){
		System.out.println("driver controller called");
		return "driver";		
	}
	
	@RequestMapping(value="/driver/StartShift", method = RequestMethod.GET)
	public String driverInspection(){
		System.out.println("driver start shift controller called");
		System.out.println("Driver is Starting Shift");
		EmployeeHoursLogService log = new EmployeeHoursLogServiceImpl();
		log.employeeLogIn(new Employee(22, "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		return "driver/StartShift";		
	}
	
	@RequestMapping(value="/driver/OnShift", method = RequestMethod.GET)
	public String driverOnShift(){
		System.out.println("driver on shift controller called");
		System.out.println("What is the odometer?");
		return "driver/OnShift";		
	}
	
	@RequestMapping(value="/driver/EndShift", method = RequestMethod.GET)
	public String driverEndShift(){
		System.out.println("driver end shift controller called");
		System.out.println("Driver is Ending Shift");
		EmployeeHoursLogService log = new EmployeeHoursLogServiceImpl();
		log.employeeLogOut(new Employee(22, "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"));
		return "driver/EndShift";		
	}
	
}
