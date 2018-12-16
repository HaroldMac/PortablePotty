package com.portable.potty.repository;

import com.portable.potty.model.Vehicle;

public class VehicleOdometerLogRepoImpl implements VehicleOdometerLogRepo  {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleOdometerLogRepo#logKm(com.portable.potty.model.Vehicle)
	 */
	@Override
	public void logKm(Vehicle v) {
		System.out.println(v.getTruckName() + " is logging in "  + v.getCurrentKm() + "km.");
	}

	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleOdometerLogRepo#getLog(com.portable.potty.model.Vehicle)
	 */
	@Override
	public int getLog(Vehicle v) {
		System.out.println(v.getTruckName() + " has logged "  + v.getCurrentKm() + "km.");
		return v.getCurrentKm();
	}

}
