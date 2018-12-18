package com.portable.potty.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.portable.potty.model.Vehicle;

@Repository
public class VehicleRepoImpl implements VehicleRepo  {
	
	List<Vehicle> vehicles;
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#getVehicle(int)
	 */
	@Override
	public Vehicle getVehicle(int id) {
		List<Vehicle> vehicles = this.stubVehicleData();
		Vehicle returnVehicle = new Vehicle(0, "pt1", 0);
		for (Vehicle vehicle: vehicles) {
			if (vehicle.getId() == id) {
				returnVehicle = vehicle;
			}
		}
		return returnVehicle;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#getVehicle(java.lang.String)
	 */
	@Override
	public Vehicle getVehicle(String name) {
		List<Vehicle> vehicles = this.stubVehicleData();
		Vehicle returnVehicle = new Vehicle(0, "pt1", 0);
		for (Vehicle vehicle: vehicles) {
			if (vehicle.getTruckName().toLowerCase().trim().equals(name.trim().toLowerCase())) {
				returnVehicle = vehicle;
			}
		}
		return returnVehicle;
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#addVehicle(com.portable.potty.model.Vehicle)
	 */
	@Override
	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#removeVehicle(com.portable.potty.model.Vehicle)
	 */
	@Override
	public void removeVehicle(Vehicle v) {
		this.vehicles.remove(v);
	}

	/* (non-Javadoc)
	 * @see com.portable.potty.repository.VehicleRepo#getAllVehicles()
	 */
	@Override
	public List<Vehicle> getAllVehicles(){
		return this.stubVehicleData();
	}
	
	
	private List<Vehicle> stubVehicleData(){
		this.vehicles = new ArrayList<Vehicle>();
		this.vehicles.add(new Vehicle(0, "pt1", 218555));
		this.vehicles.add(new Vehicle(1, "pt2", 428312));
		this.vehicles.add(new Vehicle(2, "pt3", 70579));
		this.vehicles.add(new Vehicle(3, "pt4", 217759));
		return this.vehicles;
	}


}
