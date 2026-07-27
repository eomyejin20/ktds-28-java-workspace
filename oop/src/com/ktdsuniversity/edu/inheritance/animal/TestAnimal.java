package com.ktdsuniversity.edu.inheritance.animal;

public class TestAnimal {
	
	public static void fly(Animal animal) {
		if (animal instanceof Bird bird) {
			bird.fly();
		}
	}
	 
	public static void buildNest(Animal animal) {
		if (animal instanceof Bird bird) {
			bird.buildNest();
		}
	}
	
	public static void swim(Animal animal) {
		if (animal instanceof Fish fish) {
			fish.swim();
		}
	}
	
	public static void finBreath(Animal animal) {
		if (animal instanceof Fish fish) {
			fish.finBreath();
		}
	}
	
	public static void jump(Animal animal) {
		if (animal instanceof Amphibia frog) {
			frog.jump();
		}
	}

	public static void main(String[] args) {
		/*
		Animal animal = new Animal("구구", "2살", "수컷", 0.6f, "조류", 20); 
		
		Animal 비둘기 = new Bird("비둘기", "2살", "수컷", 0.6f, "조류", 20, 
				"비둘기의날개", "비둘기의부리", "비둘기의깃털", "비둘기의난생", "비둘기의꼬리");
		Bird 참새 = new Bird("참새", "1살", "암컷", 0.4f, "조류", 10, 
				"참새의날개", "참새의부리", "참새의깃털", "참새의난생", "참새의꼬리");
		fly(비둘기);
		fly(참새);
		
		
		Animal 금붕어 = new Fish("금붕어", "0.5살", "수컷", 0.01f, "어류", 2, 
				"금붕어의지느러미", "금붕어의꼬리", "금붕어의비늘", 
				"금붕어의 아가미", "금붕어의서식지");
		Fish 잉어 = new Fish("잉어", "5살", "수컷", 2f, "어류", 30, 
				"잉어의지느러미", "잉어의꼬리", "잉어의비늘", 
				"잉어의 아가미", "잉어의서식지");
		swim(금붕어);
		swim(잉어);
		*/
		Animal[] animal = new Animal[4];
		animal[0] = new Animal("구구", "2살", "수컷", 0.6f, "조류", 20);
		animal[1] = new Bird("비둘기", "2살", "수컷", 0.6f, "조류", 20, 
							"비둘기의날개", "비둘기의부리", "비둘기의깃털", 
							"비둘기의난생", "비둘기의꼬리");
		animal[2] = new Fish("금붕어", "0.5살", "수컷", 0.01f, "어류", 2, 
				"금붕어의지느러미", "금붕어의꼬리", "금붕어의비늘", 
				"금붕어의 아가미", "금붕어의서식지");
		animal[3] = new Amphibia("개구리", "1살", "암컷", 0.5f, "어류", 10, 
				"개구리의 점액");
		
		for (int i = 0; i < animal.length; i++) {
			fly(animal[i]);
			buildNest(animal[i]);
			swim(animal[i]);
			finBreath(animal[i]);
			jump(animal[i]);
		}
		
	}
}
