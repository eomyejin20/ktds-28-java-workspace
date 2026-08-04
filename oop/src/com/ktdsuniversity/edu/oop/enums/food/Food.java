package com.ktdsuniversity.edu.oop.enums.food;

public class Food {

	private String name;
	private int calories;
	
	/**
	 * 채소
	 * 과일
	 * 고기
	 * 생선
	 * 패스트푸드
	 */
	private FoodType type;
	
	public Food(String name, int calories, FoodType type) {
		super();
		this.name = name;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return this.calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public FoodType getType() {
		return this.type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + this.name + ", calories=" + this.calories + ", type=" + this.type + "]";
	}
}
