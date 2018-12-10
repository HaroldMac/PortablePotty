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

}
