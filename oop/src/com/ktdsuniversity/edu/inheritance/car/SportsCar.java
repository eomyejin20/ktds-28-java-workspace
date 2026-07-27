package com.ktdsuniversity.edu.inheritance.car;

public class SportsCar extends Vehicle{
	
	public SportsCar(String carModel) {
		super(carModel);
	}
	
	public void startTurboMode() {
		System.out.println(super.getName() + "의 터보모드를 켭니다.");
	} 

}
