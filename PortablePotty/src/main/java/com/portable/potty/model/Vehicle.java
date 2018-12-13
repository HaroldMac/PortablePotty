package com.portable.potty.model;

public class Vehicle {
	
	private String truckName;
	private int id, currentKm, oilChangeNeededKm;
	
	public Vehicle(int id, String truckName, int currentKm, int oilChangeNeededKm){
		this.id = id;
		this.truckName = truckName;
		this.currentKm = currentKm;
		this.oilChangeNeededKm = oilChangeNeededKm;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCurrentKm() {
		return currentKm;
	}

	public void setCurrentKm(int currentKm) {
		this.currentKm = currentKm;
	}

	public int getOilChangeNeededKm() {
		return oilChangeNeededKm;
	}

	public void setOilChangeNeededKm(int oilChangeNeededKm) {
		this.oilChangeNeededKm = oilChangeNeededKm;
	}
	

}
