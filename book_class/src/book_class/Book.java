package book_class;

/**
 * 도서
 */

public class Book {
	
	/**
	 * 도서 고유 값 (ISBN)
	 */
	// int isbn; 숫자가아닌 문자로 취급
	String isbn;
	
	/**
	 * 도서 제목
	 */
	String title;
	
	/**
	 * 출판사
	 */
	String publisher;
	
	/**
	 * 장르
	 */
	String genre;
	
	/**
	 * 가격
	 */
	int price; // 계산 가능(총 주문 금액)
	
	
	/**
	 * 재고
	 */
	int store;
	
	/**
	 * 책의 페이지 수
	 */
	int page; //계산 가능할까

}
