package com.portable.potty.model;

import java.util.List;

public class RunList { 
	
	List<Call> calls;
	Employee employee;
	String dayOfWeek;
	
	public RunList() {}
	
	public RunList(Employee employee, String dayOfWeek, List<Call> calls) {
		this.calls = calls;
		this.employee = employee;
		this.dayOfWeek = dayOfWeek;
	}

	public List<Call> getCalls() {
		return calls;
	}

	public void setCalls(List<Call> calls) {
		this.calls = calls;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

}
