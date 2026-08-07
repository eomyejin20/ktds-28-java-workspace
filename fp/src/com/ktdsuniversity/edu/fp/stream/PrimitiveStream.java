package com.ktdsuniversity.edu.fp.stream;

import java.util.IntSummaryStatistics;
import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;

public class PrimitiveStream {
	
	public static void printSummaryStatisticsOfDishes() {
		// 모든 Dish의 Calory를 가진 Intstream으로 변환해서
		// summaryStatistics()를 호출한 결과를 출력해본다. //count //
		List<Dish> dishes = DishList.makeDishList();
		IntSummaryStatistics iss = dishes.stream() // Stream<Dish>
										 .mapToInt(Dish::getCalories) // IntStream
										 .summaryStatistics() // IntSummaryStatistics
		;
		System.out.println(iss);
		
		int min = iss.getMin();
		System.out.println("min: " + min);
		
		double avg = iss.getAverage();
		System.out.println("avg: " + avg);
		
		long sum = iss.getSum(); // long -> 경우의 수: 대량의 데이터를 연산하기 위해
		System.out.println("sum: " + sum);
		
		long count = iss.getCount(); // long
		System.out.println(count);
	}
	
	public static void printDishesAverageCalory() {
		// 모든 Dish의 평균 Calory를 구해서 출력한다.
		List<Dish> dishes = DishList.makeDishList();
		double avg = dishes.stream() // Stream<Dish>
					    .mapToInt(Dish::getCalories) // IntStream
					    .average() // OptionalDouble
					    .orElse(-1) // double
		;
		System.out.printf("%.2f\n", avg);
	}
	
	public static void printMinNumber() {
		List<String> numbers = List.of("42", "6431", "874", "8765412","44444424", 
									   "44", "54544", "54454");
		int min = numbers.stream() // Stream<String>
						 .mapToInt(Integer::parseInt) // IntStream
						 .min() // OptionalInt, 내부에서 reduce
						 .orElse(-1) // Int
		;
		System.out.println(min);
	}
	
	public static void printMaxNumber() {
		List<Integer> numbers = List.of(544, 454, 872, 543, 433, 54, 8441, 
				44621, 87, 5434);
		int max = numbers.stream() // Stream<Integer>
			   .mapToInt(num -> num) // IntStream
			   .max() // OptionalInt
			   .orElse(-1) // Int
		;
		System.out.println(max);
	}
	
	public static void printSumNumbers() {
		List<Integer> numbers = List.of(544, 454, 872, 543, 433, 54, 8441, 
										44621, 87, 5434);
		int sum = numbers.stream() //Stream<Integer>
						 .mapToInt(num -> num) // IntStream
						 .sum() // Int
		;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printSumNumbers();
		printMaxNumber();
		printMinNumber();
		printDishesAverageCalory();
		printSummaryStatisticsOfDishes();
	}

}
