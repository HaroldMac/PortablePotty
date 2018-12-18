package com.portable.potty.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.portable.potty.model.Vehicle;
import com.portable.potty.repository.VehicleRepo;
import com.portable.potty.repository.VehicleRepoImpl;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	VehicleRepo vr = new VehicleRepoImpl();
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.VehicleService#getVehicle(int)
	 */
	@Override
	public Vehicle getVehicle(int id) {
		return vr.getVehicle(id);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.VehicleService#getVehicle(java.lang.String)
	 */
	@Override
	public Vehicle getVehicle(String name) {
		
		return vr.getVehicle(name);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.VehicleService#addVehicle(com.portable.potty.model.Vehicle)
	 */
	@Override
	public void addVehicle(Vehicle v) {
		vr.addVehicle(v);
	}
	

	/* (non-Javadoc)
	 * @see com.portable.potty.service.VehicleService#removeVehicle(com.portable.potty.model.Vehicle)
	 */
	@Override
	public void removeVehicle(Vehicle v) {
		vr.removeVehicle(v);
	}
	
	/* (non-Javadoc)
	 * @see com.portable.potty.service.VehicleService#getAllVehicles()
	 */
	@Override
	public List<Vehicle> getAllVehicles() {
		return vr.getAllVehicles();
	}
	
}
