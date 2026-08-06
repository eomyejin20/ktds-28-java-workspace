package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

/**
 * 스트림의 데이터를 변경시키는 Map실습
 */
public class Mapping {
	
	public static void compareString() {
		String a = "이름";
		String b = "이름";
		
		System.out.println(a == b); // true
		
		Scanner key = new Scanner(System.in);
		String c = key.nextLine();
		String d = key.nextLine();
		
		System.out.println(c == d); // false
	}
	
	public static void printDishesUniqueFoodType() {
		// DishList에 있는 FoodType을 중복 없이 출력한다.
		List<Dish> dishes = DishList.makeDishList();
		
		dishes.stream() // List<Dish>
			  .map(dish -> dish.getFoodType()) // Stream<FoodType>
			  .peek(dish -> {
				  System.out.print("중복 제거 전: ");
				  System.out.println(dish);
			  })
			  .distinct() // Stream<FoodType>
			  .peek(dish -> {
				  System.out.println();
				  System.out.print("중복 제거 후: ");
				  System.out.println(dish);
			  })
			  .forEach(System.out::println); // void
		;
	}
	
	public static void printFishDishesName() {
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream() //List<Dish>
			  .filter(dish -> dish.getDishType() == DishType.FISH) // Stream<Dish>
			  .map(dish -> dish.getName())  // Stream<Dish>
			  .forEach(System.out::println) // void
		;
	}
	
	public static void printMultipleThreeNumbers() {
		List<String> strings = List.of("1", "2", "A", "3", "99", "ABC", 
									  "100", "장민창", "11", "12", "------9999", "-999", "1543211251");
		strings.stream() // Stream<String>
			  .filter(Mapping::isIntFormat) // Stream<String>
			  .map(str -> Integer.parseInt(str)) // Stream<Integer>
			  .filter(number -> number % 3 == 0) // Stream<Integer>
//			  .filter(Mapping::isMultiple) // Stream<Integer>
			  .forEach(System.out::println) // void
		;
	}
	
	public static void printStringToNumber2() {
		// 모든 문자열들을 숫자로 변경해서 출력한다.
		List<String> strings = List.of("1", "2", "A", "3", "99", "ABC", 
									  "100", "장민창", "11", "12", "------9999", "-999", "1543211251");
		// 숫자 형태의 문자들만 숫자로 변경해서 출력한다.
		strings.stream() // Stream<String>
//			  .filter((str) -> str.matches("^-{0,1}[0-9]+$")) // Stream<String>
			  .filter(Mapping::isIntFormat)
			  .map((str) -> Integer.parseInt(str)) // Stream<Integer>
			  .forEach(System.out::println) // void
		;
	}
	
//	public static boolean isMultiple(int num) {
//		if ( num % 3 == 0) {
//			return true;
//		}
//		return false;
//	}
	
	public static boolean isIntFormat(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	public static void printStringToNumber() {
		// 모든 문자열들을 숫자로 변경해서 출력한다.
		List<String> strings = List.of("1234", "12345", "22322", "1111", 
									   "2222", "55555", "46546", "99099");
		strings.stream() // Stream<String>
			  .map((str) -> Integer.parseInt(str)) // Stream<Integer>
			  .forEach(System.out::println) // void
	;
	}
	
	public static void printOddToEven() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // 불변
			// 모든 숫자들에게 2를 곱해서 짝수로 만들어 출력
		numbers.stream() // Stream<Integer>
			  .map( (n) -> n * 2)// Stream<R>: T는 Integer, R은 반환되는 값의 타입으로 결정 
			  					// => Stream<Integer>
			  .forEach(System.out::println) // void
		;
	}
	
	public static void main(String[] args) {
		printOddToEven();
		System.out.println("=".repeat(50));
		printStringToNumber();
		System.out.println("=".repeat(50));
		printStringToNumber2();
		System.out.println("=".repeat(50));
		printMultipleThreeNumbers();
		System.out.println("=".repeat(50));
		printDishesUniqueFoodType();
		
		compareString();
	}

}
