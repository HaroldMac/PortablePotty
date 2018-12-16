package com.portable.potty.service;

public interface VehicleOdometerLogService {

	void logVehicleKm(String odometerReading, String truckName);

	int getVehicleKmLog(int id);

}