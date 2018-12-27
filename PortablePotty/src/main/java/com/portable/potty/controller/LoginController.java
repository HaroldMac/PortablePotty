package com.portable.potty.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@SessionAttributes("employeeId")
public class LoginController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginPage(Model model){
		return "login";		
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String uName, @RequestParam String uPass, ModelMap model){

		LoginService ls = new LoginServiceImpl();
		EmployeeService es = new EmployeeServiceImpl();
		if (ls.isValid(uName, uPass)){
			int employeeId = ls.validateUser(uName, uPass);
			Employee employee = es.getEmployee(employeeId);
			model.addAttribute("employeeId", employee.getId());
			model.addAttribute("employee", employee.getFirstName());
			if (uName.equals("driver1") || uName.equals("driver2") ) {
				return "forward:driver";
			} else if (uName.equals("dispatcher")) {
				return "dispatcher";
			} else if (uName.equals("admin")) {
				return "admin";
			}		
		}
		
		return "login";		
	}
	
	private Employee getEmployeeFromModel(Model model) {
		Map<String, Object> myModel = model.asMap();
		int employeeId = (int) myModel.get("employeeId");
		EmployeeService es = new EmployeeServiceImpl();
		Employee employee = es.getEmployee(employeeId);
		return employee;
	}

}
