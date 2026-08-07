package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class Collecting {
	
	public static void printCaloryGroups() {
		// 칼로리별로 그룹을 나누어 출력
		// 400이하 => Diet
		// 700이하 => "Normal"
		// 700초과 => "Fat"
		// Map<String, List<Dish>>
		
		List<Dish> dishes = DishList.makeDishList();
		 Map<String, List<Dish>> groups = dishes.stream() // Stream<Dish>
			  .collect(Collectors.groupingBy(dish -> {
				  int calory = dish.getCalories();
				  if (calory <= 400) {
					 return "Diet"; 
				  } else if (calory <= 700) {
					  return "Normal";
				  } 
				  return "Fat";
			  })) // Map<String, List<Dish>>
		;
		
		// key: String, value: List<Dish>
		groups.forEach((key, value) -> {
			System.out.println(key + "=".repeat(50));
			value.forEach(System.out::println);
		});
	}
	
	public static void printFoodTypeGroups() {
		List<Dish> dishes = DishList.makeDishList();
		Map<FoodType, List<Dish>> groupMap = dishes.stream() // Stream<Dish>
												   .collect(Collectors.groupingBy(dish -> dish.getFoodType())) // Map<FoodType, List<Dish>>
		;
		System.out.println(groupMap);
	}
	
	public static void printDishTypeGroups() {
		// DishType별(=그룹핑) Dish 목록을 출력
		List<Dish> dishes = DishList.makeDishList();
		
		Map<DishType, List<Dish>> groupMap = dishes.stream() // Stream<Dish>
												   .collect(Collectors.groupingBy(dish -> dish.getDishType())) // Map<DishType, List<Dish>>
		;
		System.out.println(groupMap);
		System.out.println("OTHER => " + groupMap.get(DishType.OTHER));
		System.out.println("FISH => " + groupMap.get(DishType.FISH));
		System.out.println("MEAT => " + groupMap.get(DishType.MEAT));
		
		// map 반복하기
		groupMap.forEach((key, value) -> {
			System.out.println(key + "=> ");
			value.forEach(System.out::println);
		});
	}
	
	public static void printDishNames3() {
		List<Dish> dishes = DishList.makeDishList();
		// 메뉴의 이름들을 칼로리순으로 내림차순하여  칼로리를 "->"로 구분하여 출력한다.
		// 결과 예시: 800 -> 700 -> 550...
		String calory = dishes.stream() //Stream<Dish>
							  .sorted((dish1, dish2) -> 
							  		dish2.getCalories() - dish1.getCalories()) //Stream<Dish>
							  .map(dish -> dish.getCalories() + "") // Stream<Integer>
							  .collect(Collectors.joining(" -> ")) //String
		;
		System.out.println(calory);
	}
	
	public static void printDishNames2() {
		List<Dish> dishes = DishList.makeDishList();
		// 메뉴의 이름들을 칼로리순으로 오름차순하여 이름들을 "->"로 구분하여 출력한다.
		// 결과 예시: 계절 과일 -> 새우 -> 쌀밥
		String menuName = dishes.stream() // Stream<Dish>
								.sorted((dish1, dish2) -> 
										dish1.getCalories() - dish2.getCalories()) //Stream<Dish>
								.map(Dish::getName) //Stream<String>
								.collect(Collectors.joining(" -> ")) // String
		;
		System.out.println(menuName);
	}
	
	public static void printDishNames() {
		List<Dish> dishes = DishList.makeDishList();
		// 메뉴의 이름들을 ", " 로 구분해서 출력한다.
		// 결과 예시: 돼지고기, 소고기, 치킨...
		String menuName = dishes.stream() // Stream<Dish>
								.map(Dish::getName) //Stream<String>
								.collect(Collectors.joining(", ")) // String
		;
		System.out.println(menuName);
	}
	
	public static String ConcatStrings(List<String> strings, String seperator) {
		return strings.stream() // Stream<String>
			   .collect(Collectors.joining(seperator)) // String
		;
	}

	public static Dish getMinCaloryDish() {
		List<Dish> dishes = DishList.makeDishList();
		return dishes.stream() // Stream<Dish>
					 .collect( Collectors.minBy((dish1, dish2) -> 
					 		dish1.getCalories() - dish2.getCalories()) ) // Optional<Dish>
					 .orElse(null) // Dish
		;
	}
	
	
	public static Dish getMaxCaloryDish() {
		List<Dish> dishes = DishList.makeDishList();
		return dishes.stream() // Stream<Dish>
					 .collect( Collectors.maxBy((dish1, dish2) -> 
					 		dish1.getCalories() - dish2.getCalories()) ) // Optional<Dish>
					 .orElse(null) // Dish
		;
	}
	
	
	public static List<Integer> getDescendingOrderedList(List<Integer> intList) {
		return intList.stream() // Stream<Integer>
					  .sorted( (n1, n2) -> n2 - n1 ) // Stream<integer>
					  .collect(Collectors.toList()) // List<Integer>
		;
	}
	
	public static List<Integer> getOrderedList(List<Integer> intList){
		return intList.stream() // Stream<Integer>
					  .sorted() // Stream<Integer>
					  .collect(Collectors.toList()) // List<Integer>
				;
	}
	
	
	public static List<Integer> getEvenNumberList(List<Integer> intList) {
		return intList.stream() // Stream<Integer>
					  .filter(num -> num %2 == 0) // Stream<Integer>
					  .collect(Collectors.toList()) // List<Integer>
				;
	}
	
	public static void main(String[] args) {
		List<Integer> evenList = getEvenNumberList( 
							List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) );
		evenList.forEach(System.out::print);
		System.out.println();
		System.out.println("=".repeat(50));
		
		// 오름차순 정렬된 리스트를 반환
		List<Integer> orderedList = getOrderedList(List.of(1, 9, 6, 7, 5, -54));
		System.out.println(orderedList);
		System.out.println("=".repeat(50));

		// 내림차순 정렬된 리스트를 반환
		List<Integer> descList = getDescendingOrderedList(List.of(1, 9, 6, 7, 5, -54));
		System.out.println(descList);
		System.out.println("=".repeat(50));
		
		Dish dish = getMaxCaloryDish();
		System.out.println(dish);
		System.out.println("=".repeat(50));
		
		Dish dish2 = getMinCaloryDish();
		System.out.println(dish2);
		
		String result = ConcatStrings(List.of("A", "B", "C", "D", "E", "F", "G"), ", ");
		System.out.println(result); // A, B, C, D, E, F, G 
		result = ConcatStrings(List.of("A", "B", "C", "D", "E", "F", "G"), "");
		System.out.println(result); // ABCDEFG 
		
		System.out.println("=".repeat(50));
		printDishNames();
		printDishNames2();
		printDishNames3();
		
		System.out.println("=".repeat(50));
		printDishTypeGroups();
		printFoodTypeGroups();
		printCaloryGroups();
	}
}
