package com.portable.potty.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.portable.potty.model.Call;
import com.portable.potty.model.Employee;
import com.portable.potty.model.RunList;
import com.portable.potty.model.Vehicle;
import com.portable.potty.service.EmployeeService;
import com.portable.potty.service.EmployeeServiceImpl;
import com.portable.potty.service.RunListService;
import com.portable.potty.service.RunListServiceImpl;
import com.portable.potty.service.VehicleService;
import com.portable.potty.service.VehicleServiceImpl;

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
	public String dispatcherOnShift(Model model){
		List<Employee> drivers = this.getDrivers();
		model.addAttribute("drivers", this.printDriversAsHtmlTab(drivers));
		model.addAttribute("runList", this.printAllRunListAsHTMl(drivers));
		model.addAttribute("days", this.daysDropDownBox());		
		return "dispatch/onShift";		
	}
	
	@RequestMapping(value="/dispatch/onShift", method = RequestMethod.POST)
	public String updateOnShift(@RequestParam String selectedDay, Model model){
		System.out.println("onshift post called");
		List<Employee> drivers = this.getDrivers();
		model.addAttribute("drivers", this.printDriversAsHtmlTab(drivers));
		model.addAttribute("runList", this.printAllRunListAsHTMl(drivers));
		model.addAttribute("days", this.daysDropDownBox());
		System.out.println("the selected day is " + selectedDay);
		
		return "dispatch/onShift";		
	}
	
	
	
	@RequestMapping(value="/dispatch/endShift", method = RequestMethod.GET)
	public String dispatcherEndShift(){

		System.out.println("dispatch end shift controller called");

		return "dispatch/endShift";		
	}
	
	private List<Employee> getDrivers(){
		List<Employee> employees = new ArrayList<Employee>();
		EmployeeService es = new EmployeeServiceImpl();
		for (Employee e: es.getAllEmployees()) {
			if (e.getPosition().trim().toLowerCase().equals("driver")) {
				employees.add(e);
			}
		}
		
		return employees;
	}
	
	private RunList getRunList(int employeeId) {
		EmployeeService es = new EmployeeServiceImpl();
		Employee employee = es.getEmployee(employeeId);
		RunListService rls = new RunListServiceImpl();
		Calendar cal = Calendar.getInstance();
		String day = this.getDayOfWeek(cal.DAY_OF_WEEK);
		return rls.getRunList(employee, day);
	}
	
	private String printDriversAsHtmlTab(List<Employee> employees) {
		String html = "";
		boolean firstEmployee = true;
		for (Employee e: employees) {
			if (firstEmployee) {
				html += "<button class=\"tablinks\" onload=\"openDriver(event, '" + e.getFirstName() + "')\" onclick=\"openDriver(event, '" + e.getFirstName() + "')\">" + e.getFirstName() + "</button>";
				firstEmployee = false;
			} else {
				html += "<button class=\"tablinks\" onclick=\"openDriver(event, '" + e.getFirstName() + "')\">" + e.getFirstName() + "</button>";
			}
		}
		return html;
	}
	
	
	//<div id="London" class="tabcontent">
	//<h3>London</h3>
	//<p>London is the capital city of England.</p>
	//</div>
	
	private String createTable() {
		String html ="<table id=\"calls\" >\r\n" + 
				"	<tr>\r\n" + 
				"		<th></th>\r\n" + 
				"		<th style=\"text-decoration: underline;\">Completed</th>\r\n" + 
				"		<th style=\"text-decoration: underline;\">Service</th>\r\n" + 
				"		<th style=\"text-decoration: underline;\">Company</th>\r\n" + 
				"		<th style=\"text-decoration: underline;\">Contact</th>\r\n" + 
				"		<th style=\"text-decoration: underline;\">Phone Number</th>\r\n" + 
				"	    <th style=\"text-decoration: underline;\">Current Address</th>\r\n" + 
				"	    <th style=\"text-decoration: underline;\">New Address</th>\r\n" + 
				"	</tr>";
		return html;
	}
	/*
	<table id="calls" >
	<tr>
		<th></th>
		<th style="text-decoration: underline;">Completed</th>
		<th style="text-decoration: underline;">Service</th>
		<th style="text-decoration: underline;">Company</th>
		<th style="text-decoration: underline;">Contact</th>
		<th style="text-decoration: underline;">Phone Number</th>
	    <th style="text-decoration: underline;">Current Address</th>
	    <th style="text-decoration: underline;">New Address</th>
	</tr>
	*/
	
	private String printAllRunListAsHTMl(List<Employee> drivers) {
		String html = "";
		for (Employee driver: drivers) {
			html += "<div id=\"" + driver.getFirstName() + "\" class=\"tabcontent\">";
			html += this.createTable();
			RunList runList = this.getRunList(driver.getId());
			html += this.printRunListAsHTML(runList);
			html += "</table>";
			html += "</div>";
		}
		
		return html;
	}

	
	private String printRunListAsHTML(RunList runList) {
		String html = "";
		List<Call> calls = runList.getCalls();
		for (Call call : calls) {
			html += "<tr><td><img src='images/profilePicture.jpg' style = 'width:32px; height:32px; border:0;''></td><td><input type='checkbox'></td>";
			html += "<td>" + call.getService() + "</td>";
			html += "<td>" + call.getCustomer().getCustomerName() + "</td>";
			html += "<td>" + call.getContactName() + "</td>";
			html += "<td>" + call.getCustomer().getPhoneNumber() + "</td>";
			html += "<td>" + this.getGoogleMapsLink(call.getLocation()) + "</td>";
			if (call.getService().toLowerCase().equals("relocation")) {
				html += "<td>" + this.getGoogleMapsLink(call.getRelocationAddress()) + "</td>";
			}
			
			html += "<td></td></tr>"; 
			this.getGoogleMapsLink(call.getLocation());
		}
		return html;
	}
	
	private String getGoogleMapsLink(String address) {
		address = address.trim();
		String linkAddress = address.replace(" ", "+");
		String link = "<a href='https://www.google.ca/maps/place/" + linkAddress +  "' target='_blank'>" + address + "</a>";
		return link;
	}
	
	private String getDayOfWeek(int day) {
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday" };
		return days[day-1];
	}

	
	private String daysDropDownBox() {
		String dropDownBox = "<select name=\"selectedDay\" form=\"dayForm\">";
		String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday", "Sunday"};
		for (String day: days) {
			dropDownBox += "<option value='" + day + "'>" + day + "</option>";
		}
		dropDownBox += "</select>";
		return dropDownBox;
	}
	


	
}
