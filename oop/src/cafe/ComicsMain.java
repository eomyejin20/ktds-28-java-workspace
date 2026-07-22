package cafe;

/**
 * 모든 기능을 제어
 */

public class ComicsMain {

	public static void main(String[] args) {
		ComicsBook[] books = new ComicsBook[3];
		books[0] = new ComicsBook("슬램덩크 1권", false, 500);
		books[1] = new ComicsBook("슬램덩크 2권", false, 500);
		books[2] = new ComicsBook("슬램덩크 3권", false, 500);
		
		ComicsBookCafe playtoon = new ComicsBookCafe(books);
		
//		books[0] = null;
//		books[1] = null;
//		books[2] = null;

		Visitor me = new Visitor(4000);
		Visitor other = new Visitor(50000);
		
		//플레이툰이 보유중인 만화책 목록을 노출시킨다.
		playtoon.displayBooks();
		
		//고객이 플레이툰에서 슬램덩크 1권을 빌린다.
		me.rent(playtoon, 0); //[0]에 할당
		
		//고객이 플레이툰에서 슬램덩크 3권을 빌린다.
		me.rent(playtoon, 2); //[1]에할당
		
		//다른 고객이 플레이툰에서 슬램덩크 3권을 빌린다.
		other.rent(playtoon, 2);
		
		//슬램덩크1권을 플레이툰에게 반납
		me.toReturn(0);
		
		//고객이 대여한 만화책 목록을 출력
		me.printBooks();
		/*
		// 다른고객이 대여한 만화책 목록을 출력
		other.printBooks();*/
		
	}
}
