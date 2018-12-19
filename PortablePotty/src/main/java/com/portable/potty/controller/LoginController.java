package com.portable.potty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("employee")
public class LoginController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginPage(){
		System.out.println("login Page controller called");
		return "login";		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String uName, @RequestParam String uPass, ModelMap model){
		System.out.println("handle login Page controller called");
		System.out.println(uName);
		if (uName.equals("driver1")) {
			model.addAttribute("employee", uName);
			return "driver";
		} else if (uName.equals("dispatcher")) {
			model.addAttribute("employee", uName);
			return "dispatcher";
		} else if (uName.equals("admin")) {
			model.addAttribute("employee", uName);
			return "admin";
		}
		
		return "login";		
	}

}
