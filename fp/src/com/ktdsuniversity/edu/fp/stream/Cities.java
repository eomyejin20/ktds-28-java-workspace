package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ktdsuniversity.edu.fp.objects.City;
import com.ktdsuniversity.edu.fp.objects.CityList;

public class Cities {
	
	// 1. 모든 도시의 이름만 출력해본다.
	public static void printCityName(Stream<City> cityList) { // Stream<City>
		cityList.map(city -> city.getName()) // Stream<String>
				.forEach(System.out::println) // void
		;
	}
	
	// 2. countryName이 "South Korea"인 데이터의 Native를 중복없이 출력해본다.
	public static void printNative(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> city.getCountryName().equals("South Korea")) // Stream<City>
			    .map(City::getNativeStr) // Stream<String>
			    .distinct() // Stream<String>
			    .forEach(System.out::println) // void
		;
	}
	
	// 3. 모든 도시의 population을 출력해본다.
	public static void printPopulation(Stream<City> cityList) { // Stream<City>
		cityList.map(City::getPopulation) // Stream<Integer>
				.forEach(System.out::println) // void
		;
	}
	
	// 4. 모든 도시의 population을 출력해본다. 단, 0이상만 출력해본다.
	public static void printPopulationOfCondition(Stream<City> cityList) { // Stream<City>
		cityList.map(city -> city.getPopulation() >= 0) // Stream<Boolean>
				.forEach(System.out::println) // void
		;
	}
	
	// 5. countryName이 "A"로 시작하는 국가의 도시들의 TimeZone을 중복없이 출력해본다.
	public static void printTimeZone(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> city.getCountryName().startsWith("A")) // Stream<City>
				.map(City::getTimezone) // Stream<String>
				.distinct() // Stream<String>
				.forEach(System.out::println) // void
		;
	}
	
	// 6. countryId가 10 이상인 국가들의 도시명을 출력해본다.
	public static void printName(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> city.getCountryId() >= 10) // Stream<City>
				.map(City::getName) // Stream<String>
				.forEach(System.out::println) // void
		;
	}
	
	// 7. countryName이 "South Korea"인 도시의 population 총 합을 출력해본다.
	public static void printSumPopulation(Stream<City> cityList) { // Stream<City>
		int sum = cityList.filter(city -> city.getCountryName().equals("South Korea")) // Stream<City>
				.mapToInt(City::getPopulation) // IntStream
				.sum() // int
		;
		System.out.println(sum);
	}
	
	// 8. population 기준으로 내림차순 정렬해 10개 도시의 이름과 population을 출력해본다.
	// 병렬 => 직렬스트림으로 바꾸려면 List로 collecting을 먼저 하고 다시 스트림(직렬)으로 변경 
	// 병렬 => 직렬스트림으로 바꾸려면 sequantial()
	public static void printNameAndPopulation(Stream<City> cityList) { // Stream<City>
		cityList.sequential() // Stream<City>
				.sorted((city1, city2) -> city2.getPopulation() - city1.getPopulation())  // Stream<City>
		 		.forEach(city -> {
		 			for (int i = 0; i < 10; i++) {
		 				System.out.println(city.getName() +", " + city.getPopulation());
		 			}
		 		}) // void
		;
	}
	
	// 9. type이 "special self-governing province" 인 도시의 이름과 countryName을 출력해본다.
	public static void printNameAndCountryName(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> city.getType().equals("special self-governing province")) // Stream<City>
				.map(city -> city.getName() + ", " + city.getCountryName()) // Stream<String>
				.forEach(System.out::println) // void
		;
	}

	// 10. 모든 도시들을 id 별로 오름차순 정렬해 출력해본다.
	public static void printSortedId(Stream<City> cityList) { // Stream<City>
		cityList.sequential() // Stream<City>
				.sorted((city1, city2) -> city1.getId() - city2.getId()) // Stream<City>
				.forEach(System.out::println) // void
		;
	}

	// 11. iso2 값이 숫자 형태인 것만 출력해본다.
	public static void printNumberOfIso2(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> city.getIso2().matches("^[0-9]+$")) // Stream<City>
				.filter(city -> isIntFormat(city.getIso2())) // Stream<City>
				.forEach(System.out::println) // void
		;
	}

	// 12. iso2 값이 숫자형태가 아닌 도시의 국가명(countryName)을 오름차순 정렬해 출력해본다.
	public static void printNotNumberOfIso2(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> !city.getIso2().matches("^[0-9]+$")) // Stream<City>
//				.filter(city -> isIntFormat(city.getIso2())) // Stream<City>
				.sequential()
				.map(City::getCountryName)
				.sorted()
				.forEach(System.out::println) // void
		;
	}

	// 13. 국가명(countryName) 별 도시의 목록을 그룹핑하여 출력해본다.
	public static void printGroupByCountryName(Stream<City> cityList) { // Stream<City>
		Map<String, List<City>> groupMap = cityList.collect(Collectors.groupingBy(City::getCountryName)) // Map<String, List<City>>
		;
		System.out.println(groupMap);
	}

	// 14. latitude와 longitude가 없는 도시들의 이름만 출력해본다.
	public static void printName2(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> city.getLatitude().isEmpty() && city.getLongitude().isEmpty()) // Stream<City>
				.map(City::getName) // Stream<String>
				.forEach(System.out::println) // void
		;
	}

	// 15. 국가명(countryName)이 Canada인 도시 중 3개는 건너띄고 2개만 출력해본다.
	public static void printSkip(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> city.getCountryName().equals("Canada")) // Stream<City>
				.skip(3) // Stream<City>
				.forEach(city -> {
					for(int i = 0; i < 2; i++) {
						System.out.println(city);
					}
				}) // void
		;
	}

	// 16. level과 parentId가 0보다 큰 도시만 출력해본다
	public static void printLevelAndParentId(Stream<City> cityList) { // Stream<City>
		cityList.filter(city -> city.getLevel() > 0 && city.getParentId() > 0) // Stream<City>
				.forEach(System.out::println) // void
		;
	}
	
	public static boolean isIntFormat(String string) {
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	

	public static void main(String[] args) {
		
		String path = "C:\\Users\\User\\Desktop\\java-stream-countries-states-cities-database-master/csv";
		String filename = "states.csv";
		
		Stream<City> cityList = CityList.loadCityStream(path, filename);
//		cityList.forEach(System.out::println);
		
		System.out.println("1번");
		Stream<City> cityList1 = CityList.loadCityStream(path, filename);
		printCityName(cityList1);
		
		System.out.println("=".repeat(100));
		System.out.println("2번");
		Stream<City> cityList2 = CityList.loadCityStream(path, filename);
		printNative(cityList2);
		
		System.out.println("=".repeat(100));
		System.out.println("3번");
		Stream<City> cityList3 = CityList.loadCityStream(path, filename);
		printPopulation(cityList3);
		
		System.out.println("=".repeat(100));
		System.out.println("4번");
		Stream<City> cityList4 = CityList.loadCityStream(path, filename);
		printPopulationOfCondition(cityList4);
		
		System.out.println("=".repeat(100));
		System.out.println("5번");
		Stream<City> cityList5 = CityList.loadCityStream(path, filename);
		printTimeZone(cityList5);
		
		System.out.println("=".repeat(100));
		System.out.println("6번");
		Stream<City> cityList6 = CityList.loadCityStream(path, filename);
		printName(cityList6);
		
		System.out.println("=".repeat(100));
		System.out.println("7번");
		Stream<City> cityList7 = CityList.loadCityStream(path, filename);
		printSumPopulation(cityList7);
		
		System.out.println("=".repeat(100));
		System.out.println("8번");
		Stream<City> cityList8 = CityList.loadCityStream(path, filename);
		printNameAndPopulation(cityList8);
		
		System.out.println("=".repeat(100));
		System.out.println("9번");
		Stream<City> cityList9 = CityList.loadCityStream(path, filename);
		printNameAndCountryName(cityList9);
		
		System.out.println("=".repeat(100));
		System.out.println("10번");
		Stream<City> cityList10 = CityList.loadCityStream(path, filename);
		printSortedId(cityList10);
		
		
		System.out.println("=".repeat(100));
		System.out.println("11번");
		Stream<City> cityList11 = CityList.loadCityStream(path, filename);
		printNumberOfIso2(cityList11);
		
		System.out.println("=".repeat(100));
		System.out.println("12번");
		Stream<City> cityList12 = CityList.loadCityStream(path, filename);
		printNotNumberOfIso2(cityList12);
		
		System.out.println("=".repeat(100));
		System.out.println("13번");
		Stream<City> cityList13 = CityList.loadCityStream(path, filename);
		printGroupByCountryName(cityList13);
		
		System.out.println("=".repeat(100));
		System.out.println("14번");
		Stream<City> cityList14 = CityList.loadCityStream(path, filename);
		printName2(cityList14);
		
		System.out.println("=".repeat(100));
		System.out.println("15번");
		Stream<City> cityList15 = CityList.loadCityStream(path, filename);
		printSkip(cityList15);
		
		System.out.println("=".repeat(100));
		System.out.println("16번");
		Stream<City> cityList16 = CityList.loadCityStream(path, filename);
		printLevelAndParentId(cityList16);
		
	}
}
