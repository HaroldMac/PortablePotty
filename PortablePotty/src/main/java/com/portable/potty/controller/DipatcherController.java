package com.portable.potty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DipatcherController {

	@RequestMapping(value="/dispatcher", method = RequestMethod.GET)
	public String DispatcherPage(){
		System.out.println("Dispatch controller called");
		return "dispatcher";		
	}

	
}
