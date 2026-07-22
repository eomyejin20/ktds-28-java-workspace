package cafe;

/**
 * 만화카페
 */
public class ComicsBookCafe {
	// 멤버변수:
	private ComicsBook[] comicsBooks;
	// 매출액
	private int take;

	/**
	 * 만화책 아이템 배열 생성자
	 * 
	 * @param comicsbBooks
	 */
	public ComicsBookCafe(ComicsBook[] comicsBooks) {
		this.comicsBooks = comicsBooks;
	}

	public void displayBooks() {
		System.out.println("=====만화책 목록======");
		// ComicsBook book = this.comicsBooks[i];
		for (int i = 0; i < this.comicsBooks.length; i++) {
			ComicsBook book = this.comicsBooks[i];
			String state = "대여가능";
			if (book.getIsRent()) {
				state = "대여중";
			}

			System.out.println("만화책 번호: " + i);
			System.out.println("만화책 이름: " + book.getBookTitle());
			System.out.println("만화책 대여상태: " + state);
			System.out.println("만화책 대여비: " + book.getBookPrice());
		}
	}

	public void takeRentFee(int fee) {
		this.take += fee;
	}

	public ComicsBook[] getBooks() {
		return this.comicsBooks;
	}
	/**
	 * 만화책을 대여한다.
	 * 
	 * @param requestBook
	 */
	/*
	 * public void rent(ComicsBook comicsBooks, int visitorRequest) {
	 * 
	 * // 요청한 책의 재고 수가 만화카페의 재고 수보다 크면 종료 if ( visitorRequest >
	 * comicsBooks.getBookStock()) { return; }
	 * 
	 * // 빌릴 수 있는 책의 수 int possibleRent = Math.min(visitorRequest,
	 * comicsBooks.getBookStock());
	 * 
	 * // 재고는 줄어들고 int newStock = comicsBooks.getBookStock() - possibleRent;
	 * 
	 * // 대여가 가능한 상태를 검사: 재고가 < 0 이면 false로 상태를 변경
	 * comicsBooks.setBookStatus(newStock); }
	 */

	/**
	 * 만화책을 반납한다.
	 * 
	 * @param comicsBooks
	 * @param VisitorReturn
	 */
	/*
	 * public void toReturn(ComicsBook comicsBooks, int VisitorReturn) {
	 * 
	 * //고객이 책을 반납하면 재고수를 증가시키고 int newStock = comicsBooks.getBookStock() +
	 * VisitorReturn;
	 * 
	 * //대여가 가능한 상태를 업데이트 comicsBooks.setBookStatus(newStock);
	 * 
	 * }
	 */
}
