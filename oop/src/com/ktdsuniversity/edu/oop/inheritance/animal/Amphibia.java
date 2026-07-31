package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Amphibia extends Animal{
	private String mucus; // 점액
	
	public Amphibia(String name, String age, String sex, 
			float weight, String species, int tall, 
			String mucus) {
		super(name, age, sex, weight, species, tall);
		this.mucus = mucus; 
	}
	
	public void jump() {
		System.out.println(super.getName() + "는 점프합니다.");
	}

}
