package Test;

import oop.Car;
import oop.Student;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Student student;
		
		String name = "Adsfsdaf";
		double rnd = Math.random();
		
		Car testCar = new Car(10);
		testCar.pressEngineStartButton();
		System.out.println(testCar.zero100seconds);
		
		Scanner keyboard = new Scanner(System.in);
	}
}
