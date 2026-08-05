package com.ktdsuniversity.edu.fp.anonymous.inf;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class CompareTest {
	
	public static void main(String[] args) {
		
		// Compare 인터페이스를 클래스 없이 인스턴스화 시킨다.
		Dish dish1 = new Dish("메뉴1", FoodType.MEAT, 500, DishType.MEAT);
		Dish dish2 = new Dish("메뉴2", FoodType.VEGETABLES, 200, DishType.OTHER);
		Dish dish3 = new Dish("메뉴3", FoodType.MEAT, 700, DishType.FISH);
		
		// 제네릭이 DishType
		Compare<DishType> dishCompare = new Compare<>() {
			@Override
			public boolean compareType(Dish dish, DishType type) {
				return dish.getDishType() == type;
			}
			
		};
		
		//dish1 메누가 DishType의 Other인가?
		boolean isOther = dishCompare.compareType(dish1, DishType.OTHER);
		System.out.println(isOther);
		
		// dish1의 메뉴가 DishType의 MEAT인가?
		boolean isMeat = dishCompare.compareType(dish1, DishType.MEAT);
		System.out.println(isMeat);
		
		
		// 제네릭이 FoodType
		Compare<FoodType> foodCompare = new Compare<>() {
			@Override
			public boolean compareType(Dish dish, FoodType type) {
				return dish.getFoodType() == type;
			}
		};
		// dish1 메뉴가 FoodType의 MEAT인가.?
		isMeat = foodCompare.compareType(dish1, FoodType.MEAT);
		System.out.println(isMeat);
		
		// dish1 메뉴가 FoodType의 VEGETABLES인가?
		boolean isVegetable = foodCompare.compareType(dish1, FoodType.VEGETABLES);
		System.out.println(isVegetable);
	}

}
