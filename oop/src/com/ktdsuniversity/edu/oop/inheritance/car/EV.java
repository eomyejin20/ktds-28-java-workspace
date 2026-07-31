package com.ktdsuniversity.edu.oop.inheritance.car;

public class EV extends Vehicle{

	private float batteryAmount;
	
	public EV(String carModel) {
//		super(carModel);
//		this.batteryAmount = 0.0f;
		this(carModel, 0f);
	} 
	
	public EV(String carModel, float batteryAmount) {
		super(carModel);
		this.batteryAmount = batteryAmount;
	}
	
	public void batteryCheck() {
		System.out.println(super.getName() + "배터리를 체크합니다.");
	}
}
