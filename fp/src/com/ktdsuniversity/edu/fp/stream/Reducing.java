package com.ktdsuniversity.edu.fp.stream;

import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

public class Reducing {
	
	public static void printLongestNameDish() {
		// 이름이 가장 긴 Dish를 출력
		List<Dish> dishes = DishList.makeDishList();
		Dish longDish = dishes.stream() // Stream<Dish>
							  .reduce(dishes.get(0), (longestDish, eachDish) -> {
								  int logestNameDish = longestDish.getName().length();
								  int eachNameDish = eachDish.getName().length();
								  if (logestNameDish < eachNameDish) {
									  return eachDish;
								  }
								  return longestDish;
							  })
		;
		System.out.println("이름이 가장 긴 Dish: "+ longDish);
	}
	
	public static void printMaxCalory() {
		// 가장 높은 칼로리를 출력
		List<Dish> dishes = DishList.makeDishList();
		int maxCalory = dishes.stream() // Stream<Dish>
							  .map(dish -> dish.getCalories()) // Stream<Integer>
							  .reduce(Integer.MIN_VALUE, Math::max)
		;
		System.out.println("가장 높은 칼로리: "+ maxCalory);
	}
	
	public static void printMinCaloryOtherDishes() {
		// OTHER Dish 중에 가장 낮은 칼로리를 출력
		List<Dish> dishes = DishList.makeDishList();
		int minCalory = dishes.stream() // Stream<Dish>
							  .filter(dish -> dish.getDishType() == DishType.OTHER) // Stream<Dish>
							  .map(dish -> dish.getCalories()) // Stream<Integer>
							  .reduce(Integer.MAX_VALUE, Math::min)
		;
		System.out.println("OTHER 중 가장 낮은 칼로리: "+ minCalory);
	}
	
	public static void printMinNumberWithReference() {
		List<Integer> numbers = List.of(-123, 123, 4532, 1234, 5346, -432, 543, 787, 212, 54, -886);
		int min = numbers.stream()
	    		 		 .reduce(Integer.MAX_VALUE, Math::min);
		System.out.println(min);
	}
	
	public static void printMaxNumberWithReference() {
		List<Integer> numbers = List.of(-123, 123, 4532, 1234, 5346, -432, 543, 787, 212, 54, -886);
		int max = numbers.stream()
			    		 .reduce(Integer.MIN_VALUE, Math::max);
		System.out.println(max);
	}
	
	public static void printMaxNumber() {
		List<Integer> numbers = List.of(-123, 123, 4532, 1234, 5346, -432, 543, 787, 212, 54, -886);
		int max = numbers.stream()
			    		 .reduce(Integer.MIN_VALUE, (maxNum, eachNumber) -> {
			    			 if (maxNum < eachNumber) {
			    				return eachNumber; // 반환 값이 maxNum에 들어감
			    			 } else {
			    				 return maxNum;
			    			 }
			    		 });
		System.out.println(max);
	}

	public static void printSumNumbers() {
		List<Integer> numbers = List.of(123, 123, 4532, 1234, 5346, 432, 543, 787, 212, 54, 886);
		int sum = numbers.stream()
						 .reduce(0, (total, eachNumber) -> total + eachNumber);
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printSumNumbers();
		printMaxNumber();
		printMaxNumberWithReference();
		printMinNumberWithReference();		
		printMinCaloryOtherDishes();
		printMaxCalory();
		printLongestNameDish();
	}
}
