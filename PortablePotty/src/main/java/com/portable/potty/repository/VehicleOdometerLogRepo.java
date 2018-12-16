package com.portable.potty.repository;

import com.portable.potty.model.Vehicle;

public interface VehicleOdometerLogRepo {

	void logKm(Vehicle v);

	int getLog(Vehicle v);

}