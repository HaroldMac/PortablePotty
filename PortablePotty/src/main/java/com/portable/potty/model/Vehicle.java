package com.portable.potty.model;

public class Vehicle {
	
	private String truckName;
	private int id, currentKm;
	
	public Vehicle(int id, String truckName, int currentKm){
		this.id = id;
		this.truckName = truckName;
		this.currentKm = currentKm;
	}

	public Vehicle(){

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
}
