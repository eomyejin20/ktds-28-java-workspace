package com.ktdsuniversity.edu.inheritance.animal;

public class Fish extends Animal{
	
	private String fin; 
	private String tail;
	private String scales;
	private String gill; // 아가미
	private String habitat; // 서식지
	
	public Fish(String name, String age, String sex, 
			float weight, String species, int tall, 
			String fin, String tail, String scales,
			String gill, String habitat) {
		super(name, age, sex, weight, species, tall);
		this.fin = fin;
		this.tail = tail;
		this.scales = scales;
		this.gill = gill;
		this.habitat = habitat;
	}
	
	public void swim() {
		System.out.println(super.getName() + "는 수영합니다.");
	}
	
	public void finBreath() {
		System.out.println(super.getName() + "는 아가미로 호흡합니다.");
	}

}
