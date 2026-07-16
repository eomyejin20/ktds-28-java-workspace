package workflow;

public class CU {
	
	public static int cashPoss(int amount, int cash) {
		if ( amount <= cash ) {
			cash -= amount;
			amount = 0;
			System.out.println("남은 잔액: " + cash + "원");
			System.out.println("계산완료");
			
		} else {
			System.out.println("현금이 부족합니다.");
			System.out.println();
		}
		return amount;
	}
		
	public static int checkCardPoss(int amount, int remainAccount ) {
		if ( amount <= remainAccount ) {
			remainAccount -= amount;
			amount = 0;
			System.out.println("체크카드 결제 완료");
			System.out.println("계좌 잔액: " + remainAccount);
			System.out.println("계산완료");
		} else {
			System.out.println("체크카드 계좌의 잔액이 부족합니다.");
			System.out.println();
		}
		return amount;
	}
	
	public static int unLimitCardPoss(int amount, int CARD_LIMIT, int cardPaidMoney) {
		if  ( amount <= CARD_LIMIT - cardPaidMoney ) {
			if ( amount >= 50000 ) {
				System.out.println("할부 / 일시불?");
				// 할부 == 0, 일시불 == 1
				int payType = (int)(Math.random() * 2);
				if(payType == 0) {
					System.out.println("할부를 선택했습니다.");
					int duration = (int)(Math.random() * 4) + 2;
					System.out.println(duration + "개월 할부 결제 합니다.");
					System.out.println(duration + "개월 동안 월 " + (amount / duration) + "원 결제 합니다.");
				} else {
					System.out.println("일시불을 선택했습니다.");
				}
				
				System.out.println("서명을 해주세요.");
			}
			cardPaidMoney += amount;
			amount = 0;
			System.out.println("신용카드 결제 완료");
			System.out.println("현재 사용금액: " + cardPaidMoney);
			System.out.println("계산완료");
		} 
		else  {
			System.out.println("한도가 부족합니다.");
			System.out.println();
		}
		return amount;
	}
	
	
	public static int pointPoss(int amount, int point) {
		// TODO 포인트 선결제했을 때 포인트를 최종결제 금액만큼 차감.
		if ( amount <= point ) {
			point -= amount;
			amount = 0;
			System.out.println("잔여 포인트: " + point);
			System.out.println("잔여 결제 금액: " + amount);
			System.out.println("계산완료");
		} else {
			amount -= point; 
			point = 0;
			System.out.println("포인트가 차감되었습니다.");
			System.out.println();
		}
		return amount;
	}
	
	
	
	// 결제 수단
	public static int pay(int amount, int cash, int CARD_LIMIT, int cardPaidMoney, int remainAccount, int point) {
			
		int payment = (int) (Math.random() * 5);
			
		System.out.println("결제를 시작합니다.");
		System.out.println("결제 금액: " + amount);
		System.out.println();
			
		
		//현금
		// TODO 현금 결제 기능을 하는 메소드 작성
		// TODO amount = 현금 결제 후 잔여금액을 반환
		if ( payment == 0 ) {
			System.out.println("현금 결제 선택");
			System.out.println("현재 잔액: " + cash + "원");
			amount  = cashPoss(amount, cash);
		}
		//체크카드
		// TODO 체크카드 결제 기능을 하는 메소드 작성
		// TODO amount = 체크카드 결제 후 잔여금액을 반환
		else if (payment == 1) {
			System.out.println("체크 카드 결제 선택");
			amount = checkCardPoss(amount, remainAccount);
		}
		//신용카드
		// TODO 신용카드 결제 기능을 하는 메소드 작성
		// TODO amount = 신용카드 결제 후 잔여금액을 반환
		else if (payment == 2) {
			System.out.println("신용 카드 결제 선택");
			amount = unLimitCardPoss(amount, CARD_LIMIT, cardPaidMoney);
		}
		
		//포인트 선결제
		// TODO 포인트 선결제 기능을 하는 메소드 작성
		// TODO amount = 포인트 선 결제 후 잔여금액을 반환
		else if ( payment == 3 ) {
			System.out.println("포인트 선결제 선택");
			amount = pointPoss(amount, point);
		}
		
		else if (payment  == 4) {
			System.out.println("포기. 물건을 두고 가세요.");
			amount = 0;
			
		}
		// 잔여 결제 금액;
		return amount;
}

	
	// 봉투 구매
	public static int buyPlasticBag(int[] items, int SPLIT_COUNT, int BAG_PRICE) {
		int bagCount = items.length / SPLIT_COUNT;
		if (items.length % SPLIT_COUNT > 0) {
			bagCount++;
		}
	
		// 한줄로 작성하면
		// int bagCount = (int) Math.ceil(items.length / (double) SPLIT_COUNT);
		System.out.println("봉투 " + bagCount + "개 구매");
		System.out.println("봉투가격: " + bagCount * BAG_PRICE + "원");
		System.out.println();
		return bagCount * BAG_PRICE;
	}
	
	// 상품의 가격
	public static int buyItems(int[] items, float[] dc) {
		int itemPrice = 0;
		for (int i = 0; i < items.length; i++) {
			itemPrice += (int) (items[i] * (1 - dc[i]));
		}
		return itemPrice;
	}
	
	// 포인트 적립
	public static int plusPoint(int amount) {
		int plusPoint =(int) (amount * 0.1f);
		System.out.println("적립 포인트: " + plusPoint + "점");
		return plusPoint; //point -> float 타입;
	}
	
	
	public static void main(String[] args) {
		
		// 편의점 draw.io 파일을 토대로 작성한 코드.
		
		// 시작
		// 손님이 바구니에 담아온 상품의 가격 정보. => 배열
		int[] items = new int[5];
		items[0] = 5000;
		items[1] = 1800;
		items[2] = 3200;
		items[3] = 30000;
		items[4] = 1300;
		
		// 손님이 바구니에 담아온 상품의 할인 정보
		float[] dc = new float[5];
		dc[0] = 0;
		dc[1] = 0.1f; // 1800원 상품을 10% 할인
		dc[2] = 0.2f; // 3200원 상품을 20% 할인
		dc[3] = 1; // 30000원 상품을 100% 할인
		dc[4] = 0;
				
		// 봉투가격
		final int BAG_PRICE = 100;
		// 한 봉투에 넣을 수 있는 상품의 수
		final int SPLIT_COUNT = 2;
		
		int itemPrice = 0;
		
		// 고객의 자금 상황
		final int CARD_LIMIT = 1_000_000;
		// 현재까지 사용한 카드 결제 금액
		int cardPaidMoney = 150_000;
		
		
		// 체크카드 계좌잔액
		int remainAccount = 4_000;
		
		// 보유한 현금
		int cash = 30_000;
		
		//보유한 포인트
		int point = 1_750;
		
		// 최종 결제 금액
		int amount = 0;
		
		// 포인트 적립(0==>적립, 1==>적립안한다.)
		int addPoint  = (int) (Math.random() *2 ); //0 과 1
		
		// 결제 수단 선택 (0 ==> 현금, 1 ==> 신용카드. 2 ==> 체크카드, 3 ==> 포인트 선결제, 4 ==> 포기)
		int payment = (int) (Math.random() * 4);
		
		// TODO 손님이 가져온 상품 목록의 결제 금액 계산해서 amount에 할당.
		// 할인율 계산 필요
		
		// 1. 물건을 계산대에 올려놓는다.
		
		amount += buyItems(items, dc);
		
		
		
		// 2. 봉투 필요 여부를 묻고 봉투를 계산한다. 
		int isNeed = (int) (Math.random() * 2);
		if ( isNeed == 0 ) {
			amount += buyPlasticBag(items, SPLIT_COUNT, BAG_PRICE);
		}  
		
		
		// TODO 적립을 할 경우 (addPoint == 0)이라면 총 결제금액에서 10% 적립.
		if( addPoint == 0) {
			point += plusPoint(amount);
			System.out.println("누적 포인트: " + point + "점");
			System.out.println();
		}
		
		// TODO 결제수단 선택
		while (amount > 0) {
			amount = pay(amount, cash, CARD_LIMIT, cardPaidMoney, remainAccount, point);
		}
	}
}

	

