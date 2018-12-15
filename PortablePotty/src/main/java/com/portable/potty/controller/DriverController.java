package com.portable.potty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		
		return "driver/StartShift";		
	}
	
	@RequestMapping(value="/driver/OnShift", method = RequestMethod.GET)
	public String driverOnShift(){
		System.out.println("driver on shift controller called");
		return "driver/OnShift";		
	}
	
	@RequestMapping(value="/driver/EndShift", method = RequestMethod.GET)
	public String driverEndShift(){
		System.out.println("driver end shift controller called");
		return "driver/EndShift";		
	}
	
	

}
