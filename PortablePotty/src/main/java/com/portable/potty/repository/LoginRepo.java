package com.portable.potty.repository;

public interface LoginRepo {

	int validateEmployee(String username, String password);

	boolean hasValidCreditials(String username, String password);

	void addEmployee(int employeeId, String username, String password);

	void removeEmployee(int employeeId);

}