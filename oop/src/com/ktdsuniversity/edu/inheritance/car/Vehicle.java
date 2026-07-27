package com.ktdsuniversity.edu.inheritance.car;

public class Vehicle {

	private String carModel;
	
	public Vehicle(String carModel) {
		this.carModel = carModel;
	}
	
	public void startEngine() {
		System.out.println("시동을 겁니다.");
	} 
	
	public String getName() {
		return this.carModel;
	}
}
