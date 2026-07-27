package com.ktdsuniversity.edu.inheritance.car;

public class BatMobile extends SportsCar{
	
	
	public BatMobile(String carModel) {
		super(carModel);
	} 
	
	public void seperatedBatPort() {
		System.out.println(super.getName() + "의 배트포트를 분리합니다.");
	}

}
