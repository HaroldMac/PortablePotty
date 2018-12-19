package com.portable.potty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("employee")
public class DipatcherController {

	@RequestMapping(value="/dispatcher", method = RequestMethod.GET)
	public String DispatcherPage(){
		System.out.println("Dispatch controller called");
		return "dispatcher";		
	}
	
	@RequestMapping(value="/dispatch/startShift", method = RequestMethod.GET)
	public String driverInspection(Model model){
		//Stuff to delete later
		System.out.println("dispatch start shift controller called");
		System.out.println("Dispatch is Starting Shift");
		
		return "dispatch/startShift";		
	}
	
	@RequestMapping(value="/dispatch/onShift", method = RequestMethod.GET)
	public String driverOnShift(){
		//Stuff to delete later
		System.out.println("dispatch on shift controller called");

		return "dispatch/onShift";		
	}
	
	
	
	@RequestMapping(value="/dispatch/endShift", method = RequestMethod.GET)
	public String driverEndShift(){

		System.out.println("dispatch end shift controller called");

		return "dispatch/endShift";		
	}


	
}
