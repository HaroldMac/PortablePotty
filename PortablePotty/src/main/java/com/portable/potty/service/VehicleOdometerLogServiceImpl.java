package com.portable.potty.service;

import com.portable.potty.model.Vehicle;
import com.portable.potty.repository.VehicleOdometerLogRepo;
import com.portable.potty.repository.VehicleOdometerLogRepoImpl;
import com.portable.potty.repository.VehicleRepo;
import com.portable.potty.repository.VehicleRepoImpl;

public class VehicleOdometerLogServiceImpl implements VehicleOdometerLogService {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.VehicleOdometerLogService#logVehicleKm(java.lang.String, java.lang.String)
	 */
	@Override
	public void logVehicleKm(String odometerReading, String truckName) {
		VehicleRepo vr = new VehicleRepoImpl();
		int currentKm = this.convertToInt(odometerReading);
		Vehicle vehicle = vr.getVehicle(truckName);
		if (currentKm > 0 ) {	
			vehicle.setCurrentKm(currentKm);
		}
		VehicleOdometerLogRepo volr = new VehicleOdometerLogRepoImpl();
		volr.logKm(vehicle);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.VehicleOdometerLogService#getVehicleKmLog(int)
	 */
	@Override
	public int getVehicleKmLog(int id) {
		VehicleOdometerLogRepo volr = new VehicleOdometerLogRepoImpl();
		VehicleRepo vr = new VehicleRepoImpl();
		Vehicle vehicle = vr.getVehicle(id);
		int currentKm = volr.getLog(vehicle);
		
		return currentKm;
	}
	
	private int convertToInt(String odometerReading) {
		try {
			int reading = Integer.parseInt(odometerReading.trim());
			return reading;
		} catch(NumberFormatException e){
			System.out.println("NumberFormatExpection error: " + e.getMessage());
		}
		return -1;
	}
	

}
