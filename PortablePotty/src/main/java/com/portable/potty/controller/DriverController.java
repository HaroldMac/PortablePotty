package com.portable.potty.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.portable.potty.model.Call;
import com.portable.potty.model.Employee;
import com.portable.potty.model.RunList;
import com.portable.potty.model.Vehicle;
import com.portable.potty.repository.RunListRepo;
import com.portable.potty.repository.RunListRepoImpl;
import com.portable.potty.service.EmployeeHoursLogService;
import com.portable.potty.service.EmployeeHoursLogServiceImpl;
import com.portable.potty.service.EmployeeService;
import com.portable.potty.service.EmployeeServiceImpl;
import com.portable.potty.service.RunListService;
import com.portable.potty.service.RunListServiceImpl;
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
	public String driverOnShift(Model model){
		//Stuff to delete later
		System.out.println("driver on shift controller called");
		String odometerReading = "4564652";
		String truckName = "pt1";
		RunList rl = this.getRunList(0);
		System.out.println("The current day of the week is" + rl.getDayOfWeek());
		model.addAttribute("employee", "Joe Joe");
		
		String callList = this.printRunListAsHTML(rl);
		model.addAttribute("runlist", callList);
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
	
	private RunList getRunList(int employeeId) {
		EmployeeService es = new EmployeeServiceImpl();
		Employee employee = es.getEmployee(employeeId);
		Calendar cal = Calendar.getInstance();
		int day = cal.DAY_OF_WEEK;
		String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday" };
		RunListRepo rlr = new RunListRepoImpl();
		return rlr.getRunList(employee, strDays[day-1]);
	}
	
	private String printRunListAsHTML(RunList runList) {
		String html = "";
		List<Call> calls = runList.getCalls();
		//for (int i=0; i < calls.size(); i++) {
		for (Call call : calls) {
			html += "<tr><td><img src='PortableFinder/portable.png' style = 'width:32px; height:32px; border:0;''></td><td><input type='checkbox'></td>";
			html += "<td>" + call.getService() + "</td>";
			html += "<td>" + call.getCustomer() + "</td>";
			html += "<td>" + call.getContactName() + "</td>";
			html += "<td>" + call.getPhoneNumber()+ "</td>";
			html += "<td>" + call.getLocation() + "</td>";
			html += "<td></td></tr>"; 
		}
		/*

		<td>Fake Company</td>
		<td>Tony Gomez</td>
		<td>(403)000-0001</td>
        <td><a href="https://www.google.ca/maps/place/5050+Spruce+Dr+SW,+Calgary,+AB+T3C+3B2" target="_blank">5050 Spruce Dr SW, Calgary, AB T3C 3B2 </a> </td>
        <td></td>
	</tr>
	*/
		return html;
	}
	
	private String getGoogleMapsLink(String address) {
		String link = "<td><a href="; 
		System.out.println(address);
		return "";
	}
	
	
}
