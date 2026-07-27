package com.ktdsuniversity.edu.inheritance.animal;

public class Animal {
	
	private String name;
	private String age;
	private String sex;
	private float weight;
	private String species;
	private int tall; 
	
	public Animal(String name, String age, String sex, 
					float weight, String species, int tall) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.species = species;
		this.tall = tall;
	}

	public String getName() {
		return this.name;
	}
	
	public String getAge() {
		return this.age;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public int getTall() {
		return this.tall;
	}
}
