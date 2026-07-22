package restaurant;

/**
 * 레스토랑
 */
public class Restaurant {
	
	public static void main(String[] args) {
		
		Customer adultA = new Customer("1", 26, false);
		// 성인 A고객이 육류를 주문한다.
		adultA.eatBeef(5);
		// 성인 A고객이 소주를 주문한다.
		adultA.drinkSoju(3);
		System.out.println("포만감 : " + adultA.getFull());
		System.out.println("취기 : " + adultA.getAlcohol());
		
		Customer childA = new Customer("2", 15, false);
		// 미성년 B고객이 채소를 주문한다.
		childA.eatVegetable(5);
		// 미성년 B고객이 위스키를 주문한다.
		childA.drinkWhisky(2);
		System.out.println("포만감 : " + childA.getFull());
		System.out.println("취기 : " + childA.getAlcohol());
	}

}
