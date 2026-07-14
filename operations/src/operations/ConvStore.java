package operations;

public class ConvStore {
	
	public static void main(String[] args) {
		
		// A편의점은 한 종류의 음료수만 판매합니다.
		// 음료수 하나의 가격은 3000원 입니다.=>상수
		final int DRINK  = 3000;
		
		// 손님이 가지고 있는 돈, 구매개수 => 변수
		// 5000원을 가지고 있는 손님이 음료수를 3개 구매하려고 합니다.
		int money = 5000;
		int count = 3;
		
		//구매할 수 있다면 음료수 가격 X 구매개수를 출력하고
		if (money >= DRINK * count) {
			System.out.println(DRINK +"X"+ count + "=" + DRINK * count);
		}
		//구매할 수 없다면 "금액이 부족합니다."를 출력한다.
		else {
			System.out.println("금액이 부족합니다.");
		}
		
		// ======================================================================== //
		// B편의점은 한 종류의 음료수만 판매합니다.
		// 총 다섯 개의 음료수가 있으며 음료수 하나의 가격은 4500원 입니다. =>상수
		final int DRINK_PRICE = 4500;
		int stock  = 5;
		// 30000원을 가지고 있는 손님이 음료수를 n개 구매하려 합니다.
		int moneyB = 10000;
		int n = 6;
		// 만약, 손님이 음료수를 5개 이하 개를 구매할 수 있으면(금액이 충분하면) 음료수 가격 * 구매개수를 출력합니다.
		if (n <= stock && moneyB >= n * DRINK_PRICE) {
			System.out.println(stock * DRINK_PRICE);
		}
		//  그러나 5개 이하개를 구매할 수 없으면(금액이 충분하지 않으면 ) " 금액이 부족합니다."를 출력합니다.
		else if (n <= stock && moneyB < n * DRINK_PRICE) {
			System.out.println("금액이 부족합니다.");
		}
		// 만약, 손님이 음료수를 6개 구매하려 한다면 "재고수가 충분하지 않습니다."를 출력합니다.
		else if (n > stock) {
			System.out.println("재고수가 충분하지 않습니다.");
		}
		
		// ======================================================================== //
		// 다른 방식
		int amount = DRINK_PRICE * n;
		
		if (n > stock) {
			System.out.println("재고수가 충분하지 않습니다.");
		}
		else if (moneyB > amount) {
			System.out.println(amount);
		}
		else {
			System.out.println("금액이 부족합니다.");
		}
		
	}

}
