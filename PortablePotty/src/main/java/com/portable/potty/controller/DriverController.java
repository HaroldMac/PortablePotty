package com.portable.potty.controller;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.portable.potty.model.Call;
import com.portable.potty.model.Employee;
import com.portable.potty.model.RunList;
import com.portable.potty.model.Vehicle;
import com.portable.potty.service.EmployeeHoursLogService;
import com.portable.potty.service.EmployeeHoursLogServiceImpl;
import com.portable.potty.service.EmployeeService;
import com.portable.potty.service.EmployeeServiceImpl;
import com.portable.potty.service.RunListService;
import com.portable.potty.service.RunListServiceImpl;
import com.portable.potty.service.VehicleOdometerLogService;
import com.portable.potty.service.VehicleOdometerLogServiceImpl;
import com.portable.potty.service.VehicleService;
import com.portable.potty.service.VehicleServiceImpl;


@Controller
@SessionAttributes("employeeId")
public class DriverController {
	
	@RequestMapping(value="/driver", method = RequestMethod.GET)
	public String driverPage(Model model){

		System.out.println("driverpage called");
		
		Employee employee = this.getEmployeeFromModel(model);
		System.out.println("method driverPage " + employee.getFirstName());
		model.addAttribute("employee", employee.getFirstName());
		return "driver";		
	}
	
	@RequestMapping(value="/driver", method = RequestMethod.POST)
	public String driverPagePostMethod(Model model){

		System.out.println("driverpagePostMethod called");
		
		Employee employee = this.getEmployeeFromModel(model);
		System.out.println("method driverPage" + employee.getFirstName());
		model.addAttribute("employee", employee.getFirstName());
		return "driver";		
	}
	
	@RequestMapping(value="/driver/StartShift", method = RequestMethod.GET)
	public String driverInspection(Model model){

		Employee employee = this.getEmployeeFromModel(model);
		
		//Required Code
		model.addAttribute("trucktList", this.vehicleDropDownBox());
		model.addAttribute("employee", employee.getFirstName());
		EmployeeHoursLogService log = new EmployeeHoursLogServiceImpl();
		log.employeeLogIn(employee);
		return "driver/StartShift";		
	}
	
	@RequestMapping(value="/driver/OnShift", method = RequestMethod.GET)
	public String driverOnShift(Model model){

		Employee employee = this.getEmployeeFromModel(model);
		
		String odometerReading = "4564652";
		String truckName = "pt1";
		RunList rl = this.getRunList(0);
		
		String callList = this.printRunListAsHTML(rl);
		model.addAttribute("runlist", callList);

		this.logKm(odometerReading, truckName);
		return "driver/OnShift";		
	}
	
	
	
	@RequestMapping(value="/driver/EndShift", method = RequestMethod.GET)
	public String driverEndShift(Model model){
		//Stuff to delete later
		System.out.println("driver end shift controller called");
		String odometerReading = "4564872";
		String truckName = "pt1";
		
		Employee employee = this.getEmployeeFromModel(model);
		
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
		RunListService rls = new RunListServiceImpl();
		Calendar cal = Calendar.getInstance();
		String day = this.getDayOfWeek(cal.DAY_OF_WEEK);
		return rls.getRunList(employee, day);
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
			} else {
				System.out.println("No relocation" + " " + call.getService());
			}
			
			html += "<td></td></tr>"; 
			this.getGoogleMapsLink(call.getLocation());
		}
		return html;
	}
	
	private Employee getEmployeeFromModel(Model model) {
		Map<String, Object> myModel = model.asMap();
		int employeeId = (int) myModel.get("employeeId");
		EmployeeService es = new EmployeeServiceImpl();
		Employee employee = es.getEmployee(employeeId);
		return employee;
	}
	
	private String getGoogleMapsLink(String address) {
		address = address.trim();
		String linkAddress = address.replace(" ", "+");
		String link = "<a href='https://www.google.ca/maps/place/" + linkAddress +  "' target='_blank'>" + address + "</a>";
		return link;
	}
	
	private String getDayOfWeek(int day) {
		System.out.println("the id of the day of the week is " + day);
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday" };
		return days[day-1];
	}
	
	private String vehicleDropDownBox() {
		String dropDownBox = "<select>";
		VehicleService vs = new VehicleServiceImpl();
		List<Vehicle> vehicles = vs.getAllVehicles();
		for (Vehicle vehicle: vehicles) {
			dropDownBox += "<option value='" + vehicle.getId() + "'>" + vehicle.getTruckName() + "</option>";
		}
		dropDownBox += "</select>";
		return dropDownBox;
	}
	
/*	
 *  A couple of cases for onshift to handle
 * 
	<tr>
	<td><img src="PortableFinder/portable.png" style = "width:32px; height:32px; border:0;"></td>
	<td><input type="checkbox"></td>
	<td>Cleaning</td>
	<td>Fakies</td>
	<td>Jared Su </td> 
	<td>(403) 000-0011</td>
    <td><a href="https://www.google.ca/maps/place/50.897982,-114.011723" target="_blank">Fish Creek Park</a></td>
    <td></td>
</tr>
<tr>
	<td><img src="PortableFinder/portable.png"style = "width:32px; height:32px; border:0;"></td>
	<td><input type="checkbox"></td>
	<td>Deliver</td>
	<td>New Company</td>
	<td>Terry Cloth</td>
	<td>(403)000-0100</td>
	<td><a href="https://www.google.ca/maps/place/Range+Road+53,+Sexsmith,+AB+T0H+3C0" target="_blank">Range Road 53, Sexsmith, AB T0H 3C0</a> </td>
	<td></td>
</tr>
<tr>
	<td><img src="PortableFinder/portable.png" style = "width:32px; height:32px; border:0;"></td>
	<td><input type="checkbox"></td>
	<td>Relocation</td>
	<td>Moving Company</td>
	<td>Likes T Movitt</td>
	<td>(403)000-0101</td>
	<td><a href="https://www.google.ca/maps/place/5050+Spruce+Dr+SW,+Calgary,+AB+T3C+3B2" target="_blank">1301 16 Ave NW, Calgary, AB T2M 0L4 </a> </td>
	<td><a href="https://www.google.ca/maps/place/51.1885508,-114.4729189" target="_blank">Canyon Meadows Golf Club </a> </td>
</tr>	
*/
	
}
