package oop;

public class Car {
	
	// 멤버변수
	// 클래스의 인스턴스가 독립적으로 가지고 있는 정보들
	boolean isEngineStart;
	int speed;
	public int zero100seconds;
	
	/**
	 * 기본생성자
	 */
	
	/*
	public Car() {
		System.out.println("생성자를 호출했습니다.");
		System.out.println(this);
		this.pressEngineStartButton(); //호출한 인스턴스의 것
	}
	*/
	
	/*
	 * Car(int a)
	 */
	public Car(int zero100seconds) {
		this.zero100seconds = zero100seconds;
	}
	
	// 인스턴스 메소드(이하 메소드) 정의. => 멤버변수에 영향
	// 엔진 켜기 / 끄기
	public void pressEngineStartButton() {
		// 이 메소드를 호출하는 인스턴스의 isEngineStart가 false => true. true => false
		
		if (isEngineStart) {
			// 시동이 켜져있다면 끈다.
			isEngineStart = false;
			speed = 0;
		}
		else {
			// 시동이 꺼져있다면 켠다.
			isEngineStart = true;
			speed = 10;
		}
	}
	
	// 가속페달을 밟는다.
	// 페달을 밟는 압력만큼 속도가 증가한다.
	public void pressGasolinPedal(int pressure) {
		if(isEngineStart) {
			speed += pressure;
		}
	}
	
	// 브레이크 페달을 밟는다.
	// 페달을 밟는 압력만큼 속도가 감소한다. 
	public void pressBrakePedal(int pressure) {
		if(isEngineStart) {
			speed -= pressure;
		}
	}
	
	
	public static void main(String[] args) {
		
		// Car 클래스를 이용해 다음을 생성.
		// Car 타입의 kona 인스턴스를 생성
		Car kona = new Car(8);
		// Car 타입의 carnival 인스턴를 생성
		Car carnival = new Car(7);
		
		//Car kona2 = new Car(8);
		
		// kona의 시동을 켠다.
		kona.pressEngineStartButton();
		
		//브레이크 페달을 약하게 몇 차례 밟는다.
		kona.pressBrakePedal(3);
		kona.pressBrakePedal(3);
		
		//가속페달을 3회 강하게 밟는다.
		kona.pressGasolinPedal(150);
		kona.pressGasolinPedal(150);
		kona.pressGasolinPedal(150);
		
		// 브레이크 페달을 아주 강하게 밟는다.
		kona.pressBrakePedal(300);
		
		//kona의 시동을 끈다.
		kona.pressEngineStartButton();
		
		
		// carnival의 시동을 켠다.
		carnival.pressEngineStartButton();
		
		// 가속 페달을 약하게 밟는다.
		carnival.pressGasolinPedal(20);
		
		// 가속 페달을 강하게 밟는다.
		carnival.pressGasolinPedal(120);
		
		// 브레이크 페달을 밟는다.
		carnival.pressBrakePedal(30);
		carnival.pressBrakePedal(30);
		carnival.pressBrakePedal(30);
		carnival.pressBrakePedal(30);
		
		// carnival의 시동을 끈다.
		carnival.pressEngineStartButton();
		
		
//		kona.isEngineStart = true;
//		kona.speed = 100;
		
//		carnival.isEngineStart = false;
//		carnival.speed = 70;
		
		System.out.println(kona.isEngineStart);
		System.out.println(kona.speed);
		System.out.println(carnival.isEngineStart);
		System.out.println(carnival.speed);
	}

}
