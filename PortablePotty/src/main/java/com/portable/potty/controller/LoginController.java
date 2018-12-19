package com.portable.potty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.portable.potty.model.Employee;
import com.portable.potty.service.EmployeeService;
import com.portable.potty.service.EmployeeServiceImpl;
import com.portable.potty.service.LoginService;
import com.portable.potty.service.LoginServiceImpl;

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
		System.out.println("handle login Page controller called: " + uName);
		LoginService ls = new LoginServiceImpl();
		EmployeeService es = new EmployeeServiceImpl();
		if (ls.isValid(uName, uPass)){
			System.out.println("valid username and password");
			int employeeId = ls.validateUser(uName, uPass);
			Employee employee = es.getEmployee(employeeId);
			model.addAttribute("employee", employee.getFirstName());
			System.out.println("employee is " + employee.getFirstName());
			if (uName.equals("driver1")) {
				return "driver";
			} else if (uName.equals("dispatcher")) {
				return "dispatcher";
			} else if (uName.equals("admin")) {
				return "admin";
			}
			
		}
		
		return "login";		
	}

}
