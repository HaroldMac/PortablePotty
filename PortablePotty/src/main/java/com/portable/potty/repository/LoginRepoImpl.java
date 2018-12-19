package com.portable.potty.repository;

public class LoginRepoImpl implements LoginRepo  {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.LoginRepo#validateEmployee(java.lang.String, java.lang.String)
	 */
	@Override
	public int validateEmployee(String username, String password) {
		username = username.trim();
		switch (username){
			case "driver1":  return 1;		
			case "driver2":  return 2;		
			case "dispatcher": return 3;
			case "admin": 	 return 4;		
		}
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.LoginRepo#hasValidCreditials(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean hasValidCreditials(String username, String password) {
		username = username.trim();
		if ((username.equals("driver1")) || (username.equals("driver2")) || (username.equals("dispatcher")) || (username.equals("admin"))){
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.LoginRepo#addEmployee(int, java.lang.String, java.lang.String)
	 */
	@Override
	public void addEmployee(int employeeId, String username, String password) {
		System.out.println("Adding: " + employeeId + " " + username + " " + password);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.LoginRepo#removeEmployee(int)
	 */
	@Override
	public void removeEmployee(int employeeId) {
		System.out.println("You have been fired!! " + employeeId);
	}
	

}
