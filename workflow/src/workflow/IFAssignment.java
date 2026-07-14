package workflow;

public class IFAssignment {
	public static void main(String[] args) {
		int money = 1_000_000;
		int father = 40;
		int mother = 36;
		int daughter = 11;
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000; 
		
		// 3인 가족이 100만원으로 비행기를 타고 편도 여행을 가려합니다.
		// 부모님의 나이는 각각 40, 36세입니다.
		// 딸의 나이는 11세입니다.
		// 성인의 비행요금은 30만원
		// 아동의 비행요금은 12만원입니다. 성인 판단 기준은 19세 이상입니다.
		// 3인 가족은 여행을 떠날 수 있을까요?
		// 여행을 떠날 수 있다면 "여행가자!"
		// 여행을 떠날 수 없다면 "다음에가자"
		// 를 출력해보세요.
	
		/*
		 * 1. adult =  성인인지 구분하는 변수
		 * 2. 성인과 미성년 수 구하기
		 * 3. 총 여행 경비 구하기
		 * 4. money와 비교
		 */
		
		int adult = 19;
		int price = 0;
		
		// 딸이 성년일 때,
		if (daughter >= adult) {
			price = adultOneWayFlightFare * 3;
		}
		// 딸이 미성년이고, 부모가 모두 성인일때,
		else if (daughter < adult && mother >= adult && father >= adult) {
			price = kidOneWayFlightFare + adultOneWayFlightFare * 2;
		}
		// 딸이 미성년이고, 부모 중 한 명이라도 미성년일때
		else if (mother < adult || father < adult) {
			// 부모 모두 미성년
			if (mother < adult && father < adult) {
			price = kidOneWayFlightFare*3;
			}
			//한 명만 미성년
			else {
				price = kidOneWayFlightFare*2 + adultOneWayFlightFare;
			}
		}
		
		// 여행 갈 수 있는지 구하기
		if (money > price) {
			System.out.println("여행가자!");
		}
		else System.out.println("다음에 가자");
		
	}

}
