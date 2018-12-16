package com.portable.potty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portable.potty.model.Employee;
import com.portable.potty.model.Vehicle;
import com.portable.potty.service.EmployeeHoursLogService;
import com.portable.potty.service.EmployeeHoursLogServiceImpl;
import com.portable.potty.service.VehicleOdometerLogService;
import com.portable.potty.service.VehicleOdometerLogServiceImpl;

@Controller

public class DriverController {
	
	@RequestMapping(value="/driver", method = RequestMethod.GET)
	public String driverPage(){
		//System.out.println("driver controller called");
		return "driver";		
	}
	
	@RequestMapping(value="/driver/StartShift", method = RequestMethod.GET)
	public String driverInspection(){
		//Stuff to delete later
		System.out.println("driver start shift controller called");
		System.out.println("Driver is Starting Shift");
		Employee employee = new Employee(22, "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3"); 
		
		//Required Code
		EmployeeHoursLogService log = new EmployeeHoursLogServiceImpl();
		log.employeeLogIn(employee);
		return "driver/StartShift";		
	}
	
	@RequestMapping(value="/driver/OnShift", method = RequestMethod.GET)
	public String driverOnShift(){
		//Stuff to delete later
		System.out.println("driver on shift controller called");
		String odometerReading = "4564652";
		String truckName = "pt1";
		
		//Required code
		this.logKm(odometerReading, truckName);
		return "driver/OnShift";		
	}
	
	
	
	@RequestMapping(value="/driver/EndShift", method = RequestMethod.GET)
	public String driverEndShift(){
		//Stuff to delete later
		System.out.println("driver end shift controller called");
		String odometerReading = "4564872";
		String truckName = "pt1";
		Employee employee = new Employee(22, "John", "Doe", "4030005555", "1234 Employee St, Calgary NW, A1B 2C3");
		
		//required code
		EmployeeHoursLogService log = new EmployeeHoursLogServiceImpl();
		log.employeeLogOut(employee);
		this.logKm(odometerReading, truckName);
		return "driver/EndShift";		
	}
	
	private void logKm(String odometerReading, String truckName) {
		VehicleOdometerLogService vols = new VehicleOdometerLogServiceImpl();
		vols.logVehicleKm(odometerReading, truckName);
	}
	
}
