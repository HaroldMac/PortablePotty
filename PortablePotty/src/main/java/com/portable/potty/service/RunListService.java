package com.portable.potty.service;

import java.util.List;

import com.portable.potty.model.Call;
import com.portable.potty.model.Employee;
import com.portable.potty.model.RunList;

public interface RunListService {

	List<Call> getCalls(int routeId, String dayOfWeek);

	List<Call> getCalls(Employee employee, String dayOfWeek);

	void insertIntoRunList(RunList runList, Call call);

	void removeFromRunList(RunList runList, Call call);

	RunList getRunList(int routeId, String dayOfWeek);

	RunList getRunList(Employee employee, String dayOfWeek);

	List<Call> optimizeCalls(List<Call> calls);

}