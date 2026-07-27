package com.ktdsuniversity.edu.inheritance.car;

public class TestCar {
	
	public static void startEngine(Vehicle carModel) {
		carModel.startEngine();
	}
	/*
	public static void startTurboMode(SportsCar carModel) {
		carModel.startTurboMode();
	} 
	
	public static void batteryCheck(EV carModel) {
		carModel.batteryCheck();
	}
	
	public static void seperatedBatPort(BatMobile carModel) {
		carModel.seperatedBatPort();
	}*/
	
	public static void startTurboMode(Vehicle carModel) {
		if (carModel instanceof SportsCar sportsCar) {
			sportsCar.startTurboMode();
		}
	}
	
	public static void batteryCheck(Vehicle carModel) {
		if (carModel instanceof EV ev) {
			ev.batteryCheck();
		}
	}
	
	public static void seperatedBatPort(Vehicle carModel) {
		// carModel로 전달된 인스턴스의 타입이 BatMobile이라면
		//BatMobile로 형변환해라
		if (carModel instanceof BatMobile batMobile) {
			batMobile.seperatedBatPort();
		}
	}
	
	public static void main(String[] args) {
		/*
		Vehicle classicCar = new Vehicle("클래식 카");
		
		Vehicle sportsCar1 = new SportsCar("스포츠카 1");
		SportsCar sportsCar2 = new SportsCar("스포츠카 2");
		
		Vehicle ev1 = new EV("전기차1");
		EV ev2 = new EV("전기차2", 50f);
		
		Vehicle batCar1 = new BatMobile("배트카1");
		SportsCar batCar2 = new BatMobile("배트카2");
		BatMobile batCar3 = new BatMobile("배트카3");
		
		startEngine(classicCar);
		startEngine(sportsCar1);
		startEngine(sportsCar2);
		startEngine(ev1);
		startEngine(ev2);
		startEngine(batCar1);
		startEngine(batCar2);
		startEngine(batCar3);
		
//		batteryCheck((EV) ev1);
		batteryCheck(ev1);
		batteryCheck(ev2);
		
		//Vehicle sportsCar1 = new SportsCar("스포츠카 1");
		startTurboMode((SportsCar) sportsCar1); //껍데기가 Vehicle이니까 SportsCar로 전달해라
		startTurboMode(sportsCar2);
		
		seperatedBatPort((BatMobile) batCar1);
		seperatedBatPort((BatMobile) batCar2);
		seperatedBatPort(batCar3);
		*/
		
		Vehicle[] vehicles = new Vehicle[5];
		vehicles[0] = new Vehicle("클래식 카");
		vehicles[1] = new SportsCar("스포츠카 1");
		vehicles[2] = new EV("전기차2", 50f);
		vehicles[3] = new BatMobile("배트카 1");
		vehicles[4] = new BatMobile("배트카 2");
		
		for (int i = 0; i < vehicles.length; i++) {
			startEngine(vehicles[i]);
			batteryCheck(vehicles[i]);
			startTurboMode(vehicles[i]);
			seperatedBatPort(vehicles[i]);
		}
	}

}
