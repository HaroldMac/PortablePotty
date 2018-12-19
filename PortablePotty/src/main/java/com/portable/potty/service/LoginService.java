package com.portable.potty.service;

public interface LoginService {

	int validateUser(String username, String password);

	boolean isValid(String username, String password);

	void addEmployee(int employeeId, String username, String password);

	void removeEmployee(int employeeId);

}