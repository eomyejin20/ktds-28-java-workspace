package cafe;

/**
 * 만화책 아이템
 */

public class ComicsBook {
	
	/*
	 * 만화책 제목
	 */
	private String bookTitle;
	
	/**
	 * 만화책 대여비
	 */
	private int bookPrice;
	
	/**
	 * 만화책 대여 가능 상태
	 */
	private boolean isRent;
	
	
	/**
	 * 만화책 인스턴스 만드는 생성자
	 * @param bookId
	 * @param bookTitle
	 * @param bookPrice
	 * @param bookStock
	 */
	public ComicsBook(String bookTitle, boolean isRent, int bookPrice) {
		
		this.bookTitle = bookTitle;
		this.isRent = isRent;
		this.bookPrice = bookPrice;
	}

	/**
	 * 책 제목 Getter
	 * @return
	 */
	public String getBookTitle() {
		return bookTitle;
	}
	
	/*
	 * 책의 대여 상태를 반환
	 */
	
	public boolean getIsRent() {
		return this.isRent;
	}
	
	/*
	 * 책의 대여 요금를 반환
	 */
	
	public int getBookPrice() {
		return this.bookPrice;
	}
	
	public void rent() {
		this.isRent = true;
	}
	
	
	public void toReturnBook() {
		this.isRent = false;
	}
	// 책의 대여 상태 업데이트
	/*
	public boolean setBookStatus(int newStock) {
		if (newStock < 0) {
			return this.isRent = false;
		}
		else return this.isRent = true;
	}
	*/
	
}
