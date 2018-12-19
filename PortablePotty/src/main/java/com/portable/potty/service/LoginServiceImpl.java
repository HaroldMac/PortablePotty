package com.portable.potty.service;

import com.portable.potty.repository.LoginRepo;
import com.portable.potty.repository.LoginRepoImpl;

public class LoginServiceImpl implements LoginService {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.LoginService#validateUser(java.lang.String, java.lang.String)
	 */
	@Override
	public int validateUser(String username, String password) {
		LoginRepo lr = new LoginRepoImpl();
		int employeeId = lr.validateEmployee(username, password);
		return employeeId;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.LoginService#isValid(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean isValid(String username, String password) {
		LoginRepo lr = new LoginRepoImpl();
		return lr.hasValidCreditials(username, password);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.LoginService#addEmployee(int, java.lang.String, java.lang.String)
	 */
	@Override
	public void addEmployee(int employeeId, String username, String password) {
		LoginRepo lr = new LoginRepoImpl();
		lr.addEmployee(employeeId, username, password);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.LoginService#removeEmployee(int)
	 */
	@Override
	public void removeEmployee(int employeeId) {
		LoginRepo lr = new LoginRepoImpl();
		lr.removeEmployee(employeeId);
	}

}
