package com.portable.potty.repository;

import com.portable.potty.model.Employee;
import com.portable.potty.model.RunList;

public interface RunListRepo {

	RunList getRunList(int runListId);

	RunList getRunList(Employee employee, String dayOfWeek);

	RunList getRunList();

	void updateRunList(RunList runList);

	void removeRunList(RunList runList);

}