package com.ktdsuniversity.edu.fp.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class NativeFunction {
	
	public static void main(String[] args) {
		
		// Predicate<T> => T를 받아서 boolean을 반환시킨다. 
		Predicate<String> isEmpty = (str) -> str == null || str.isBlank();
		System.out.println(isEmpty.test(null)); // boolean test(T t);
		System.out.println(isEmpty.test("   "));
		System.out.println(isEmpty.test("adlkjlk"));
		
		//Consumer<T> => T를 받아서 void를 반환시킨다.
		Consumer<String> print = (str) -> {
			System.out.println(str);
		};
		print.accept("dkjlkj"); // void accept(T t);
		
		//Function<T, R> => T를 받아서 R을 반환시킨다.
		//String을 파라미터로 전달해서 문자열의 길이를 반환시키는 함수
		Function<String, Integer> getLength = (str) -> str.length();
		int len = getLength.apply("fljdfl"); // R apply(T t);
		System.out.println(len);
		
		//String을 파라미터로 전달해서 숫자로 변경해주는 함수/
		Function<String, Integer> toInteger = (str) -> Integer.parseInt(str);
		len = toInteger.apply("5433154");
		System.out.println(len);
		
		
		//Integer를 파라미터로 전달해서 문자로 변경해주는 함수.
		Function<Integer, String> toString = (num) -> num +"";
		String str = toString.apply(4452);
		System.out.println(str);
		
		//Integer를 파라미터로 전달해서 2의 배수만 true로 반환시켜주는 함수
		Function<Integer, Boolean> toBoolean = (num2) -> {
			if (num2 % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		boolean isDouble = toBoolean.apply(8888);
		System.out.println(isDouble);
		
		
		DishSummary summary = new DishSummary();
		summary.printAllDishesBy( (dish) -> dish.getDishType() == DishType.MEAT);
		System.out.println();
		summary.printAllDishesBy((dish) -> true);
		System.out.println();
		summary.printAllDishesBy((dish) -> false);
		System.out.println();
		summary.printAllDishesBy((dish) -> dish.getFoodType() == FoodType.VEGETABLES);
	}

}
