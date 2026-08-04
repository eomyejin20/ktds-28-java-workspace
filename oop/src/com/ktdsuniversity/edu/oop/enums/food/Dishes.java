package com.ktdsuniversity.edu.oop.enums.food;

public class Dishes {
	
	public static void main(String[] args) {
		Food bicmac = new Food("빅맥", 900, FoodType.FASTFOOD);
		System.out.println(bicmac);
		
		Food carrot = new Food("당근", 20, FoodType.VEGETABLE);
		System.out.println(carrot);
		
		Food apple = new Food("사과", 50, FoodType.FRUIT);
		System.out.println(apple);
	}

}
