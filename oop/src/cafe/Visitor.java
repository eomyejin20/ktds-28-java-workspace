package cafe;

/**
 * 고객
 */
public class Visitor {
	/**
	 * 고객이 대여한 만화책 목록
	 */
	private ComicsBook[] books;
	/**
	 * 보유한 현금
	 */
	private int cash;
	

	/**
	 * 방문자의 인스턴스 만드는 생성자 (처음 방문)
	 * @param name
	 */
	public Visitor(int cash) {
		this.books = new ComicsBook[10]; // 10권의 만화책을 빌릴 수 있다.
		this.cash = cash;
	}
	
	
	//만화책을 대여한다.
	public void rent(ComicsBookCafe cafe, int bookId) {
		//cafe가 소지하고있는 0번 인덱스의 만화책이 대여중인가?

		ComicsBook[] cafeBooks = cafe.getBooks();
		// 배열의 범위를 벗어나는가?
		if(bookId< 0 || bookId >= cafeBooks.length) {
			System.out.println("존재하지 않는 만화책입니다.");
			return;
		}
		
		ComicsBook book = cafeBooks[bookId];
		
		//playtoon이 소지중인 "슬램덩크1권이 대여중인가?
		if(book.getIsRent()) {
			System.out.println("이미 대여중인 책입니다.");
		} else {
			//playtoon이 소지중인 "슬램덩크 1권의 대여비는 얼마인가?
			int bookPrice = book.getBookPrice();
			if(bookPrice <= this.cash) {
				//고객이 대여한 책 목록에 추가한다.
				for(int i = 0;  i< this.books.length; i++) {
					if(this.books[i] == null) {
						//대여한 책을 받고
						this.books[i] = book;
						//돈을내고
						this.cash -= bookPrice;
						//카페는 돈을 받고
						cafe.takeRentFee(bookPrice);
						//상태를 변경
						book.rent();
						
						break;
					}
				}
			} else {
				System.out.println("대여비가 모자랍니다.");
			}
			
		}
		
	}
	//만화책을 반납한다.
	public void toReturn(int bookId) {
		//고객이 반납할 책
		ComicsBook book = this.books[bookId];
		
		//책의 대여상태를 false롭 변경
		if (book != null) {
			book.toReturnBook();
		}
		
		// 고객이 대여한 책을 목록에서 제거
		this.books[bookId] = null;
	}
	
	public void printBooks() {
		System.out.println("==고객이 대여한 책 목록==");
		for(int i = 0; i < this.books.length; i++) {
			if(this.books[i] != null) {
				System.out.println("만화책 목록: " + i);
				System.out.println("만화책 이름: " + this.books[i].getBookTitle());	
			}
		}
	}
}
