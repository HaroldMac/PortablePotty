package com.portable.potty.repository;

import com.portable.potty.model.Vehicle;

public interface VehicleRepo {

	Vehicle getVehicle(int id);

	Vehicle getVehicle(String name);

	void addVehicle(Vehicle v);

	void removeVehicle(Vehicle v);

}