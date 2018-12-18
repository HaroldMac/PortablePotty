package com.portable.potty.service;

import java.util.ArrayList;
import java.util.List;

import com.portable.potty.model.Call;
import com.portable.potty.model.Employee;
import com.portable.potty.model.RunList;
import com.portable.potty.repository.RunListRepo;
import com.portable.potty.repository.RunListRepoImpl;

public class RunListServiceImpl implements RunListService {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.RunListService#getCalls(int, java.lang.String)
	 */
	@Override
	public List<Call> getCalls(int routeId, String dayOfWeek){
		List<Call> calls = new ArrayList<Call>();
		if (this.validDayOfWeek(dayOfWeek)) {
			System.out.println("get a runlist");
		}
		//calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", "(403)000-0001", "Fake Company"));
		//calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5", "(403)000-0002", "Fakes-R-Us"));	
		return calls;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.RunListService#getCalls(com.portable.potty.model.Employee, java.lang.String)
	 */
	@Override
	public List<Call> getCalls(Employee employee, String dayOfWeek){
		List<Call> calls = new ArrayList<Call>();
		if (this.validDayOfWeek(dayOfWeek)) {
			System.out.println("get a runlist");
		}
		//calls.add(new Call("Cleaning", "5050 Spruce Dr SW, Calgary, AB T3C 3B2", "(403)000-0001", "Fake Company"));
		//calls.add(new Call("Cleaning", "4011 1a St SW, Calgary, AB T2S 2P5", "(403)000-0002", "Fakes-R-Us"));	
		return calls;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.RunListService#insertIntoRunList(com.portable.potty.model.RunList, com.portable.potty.model.Call)
	 */
	@Override
	public void insertIntoRunList(RunList runList, Call call) {
		List<Call> calls = runList.getCalls();
		calls.add(call);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.RunListService#removeFromRunList(com.portable.potty.model.RunList, com.portable.potty.model.Call)
	 */
	@Override
	public void removeFromRunList(RunList runList, Call call) {
		List<Call> calls = runList.getCalls();
		calls.remove(call);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.RunListService#getRunList(int, java.lang.String)
	 */
	@Override
	public RunList getRunList(int routeId, String dayOfWeek) {
		
		RunListRepo rlr = new RunListRepoImpl();
		return rlr.getRunList(routeId);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.RunListService#getRunList(com.portable.potty.model.Employee, java.lang.String)
	 */
	@Override
	public RunList getRunList(Employee employee, String dayOfWeek) {
		RunListRepo rlr = new RunListRepoImpl();
		return rlr.getRunList(employee, dayOfWeek);
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.RunListService#optimizeCalls(java.util.List)
	 */
	@Override
	public List<Call> optimizeCalls(List<Call> calls){
		List<Call> optimizedCalls = new ArrayList<Call>();
		return optimizedCalls;
	}
	
	
	
	private boolean validDayOfWeek(String dayOfWeek) {
		boolean valid = false;
		dayOfWeek = dayOfWeek.trim().toLowerCase(); 
		switch (dayOfWeek) {
			case "monday": 
			case "tuesday":
			case "wednesday":
			case "thursday":
			case "friday": 
				valid = true;
				break;
			default: valid = false;
		}
		return valid;
	}

}
