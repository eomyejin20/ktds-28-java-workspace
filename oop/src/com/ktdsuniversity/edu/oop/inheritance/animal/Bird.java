package com.ktdsuniversity.edu.oop.inheritance.animal;

public class Bird extends Animal{

	private String wings;
	private String buri;
	private String feathers;
	private String oviparous;
	private String tail; 
	
	public Bird(String name, String age, String sex, 
			float weight, String species, int tall, 
			String wings, String buri, String feathers, 
			String oviparous, String tail) {
		super(name, age, sex, weight, species, tall);
		this.wings = wings;
		this.buri = buri;
		this.feathers = feathers;
		this.oviparous = oviparous;
		this.tail = tail;
	}
	
	public void fly() {
		System.out.println(super.getName() + "는 납니다.");
	}
	
	public void buildNest() {
		System.out.println(super.getName() + "는 둥지를 짓습니다.");
	}
	
}
