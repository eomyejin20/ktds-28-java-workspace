package com.ktdsuniversity.edu.fp.stream;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

/**
 * 스트림에서 하나의 값만 찾아 가져온다.
 */
public class Finding {
	
	public static void printHeavyCaloryDish() {
		// 칼로리가 1000이상인 첫 번째 Dish를 출력.
		// 없으면 null을 반환한다.
		List<Dish> dishes = DishList.makeDishList();
		Dish firstDish = dishes.stream() // List<Dish>
							  .filter(dish -> dish.getCalories() >= 1_000) // Stream<Dish>
							  .findFirst() // Optional<Dish>
							  .orElse(null) // Dish
		;
		System.out.println("첫 번째 1000칼로리 이상 Dish: " + firstDish);
	}
	
	public static void printFirstFishDish() {
		List<Dish> dishes = DishList.makeDishList();
		Dish firstDish = dishes.stream() // List<Dish>
							  .filter(dish -> dish.getDishType() == DishType.FISH) // Stream<Dish>
							  .findFirst() // Optional<Dish>
							  .get() // Dish
		;
		System.out.println("첫 번째 FishDish: " + firstDish);
	}
	
	public static void printAnyNumber() {
		// 난수 생성 => 1_000_000
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 100_000_000; i++) {
			numbers.add( (int) (Math.random() * 100_000) + 1 );
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(numbers.get(i));
		}
		
		int num = numbers.parallelStream() // Stream<Integer>
						 .findAny() // Optional<Integer>
						 .orElse(-1)
		;
		System.out.println("Find Any 결과: ");
		System.out.println(num);
	}
	
	public static void printFirstMultipleRandomNumber() {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			numbers.add( (int) (Math.random() * 100_000) + 1 );
		}
		
		System.out.println(numbers);
		
		// 찾으려는 난수 생성
		int random = (int) (Math.random() * 1_000_000) + 1;
		System.out.println("찾으려는 배수: " + random);
		
		int result = numbers.stream() // Stream<Integer>
							.filter(num -> num % random == 0) // Stream<Integer>
							.findFirst() // OPtional<Integer>
							.orElse(-1);
			;
			System.out.println(result);
	}

	public static void printFirstMultipleSevenNumber() {
		
		// 난수 생성 => 1_000_000
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			numbers.add( (int) (Math.random() * 100_000));
		}
		
		System.out.println(numbers);
		int sevenNum = numbers.stream() // Stream<Integer>
							  .filter(num -> num % 7 == 0) // Stream<Integer>
							  .findFirst() // OPtional<Integer>
							  .get()
		;
		System.out.println(sevenNum);
		
	}
	
	public static void printFirstElement() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int firstNumber = numbers.stream() // Stream<Integer>
								.findFirst() // Optional<Integer>
								.get() // Integer
		;
		System.out.println(firstNumber); // 1
	}
	public static void main(String[] args) {
//		printFirstElement();
//		System.out.println();
//		printFirstMultipleSevenNumber();
//		System.out.println();
//		printFirstMultipleRandomNumber();
//		System.out.println();
//		printAnyNumber();
		printHeavyCaloryDish();
		printFirstFishDish();
	}

}
