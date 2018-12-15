package com.portable.potty.repository;

import org.springframework.stereotype.Repository;

import com.portable.potty.model.Vehicle;

@Repository
public class VehicleRepoImpl implements VehicleRepo {
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#getVehicle(int)
	 */
	@Override
	public Vehicle getVehicle(int id) {
		Vehicle vehicle = new Vehicle(1, "pt1", 218555, 223555);
		return vehicle;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#getVehicle(java.lang.String)
	 */
	@Override
	public Vehicle getVehicle(String name) {
		Vehicle vehicle = new Vehicle(1, "pt1", 218555, 223555);
		return vehicle;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#addVehicle(com.portable.potty.model.Vehicle)
	 */
	@Override
	public void addVehicle(Vehicle v) {
		System.out.println("Adding vehicle " + v.getTruckName());
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#removeVehicle(com.portable.potty.model.Vehicle)
	 */
	@Override
	public void removeVehicle(Vehicle v) {
		System.out.println("Removing vehicle " + v.getTruckName());
	}

}
