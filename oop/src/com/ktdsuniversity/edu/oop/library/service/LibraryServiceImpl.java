package com.ktdsuniversity.edu.oop.library.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.library.data.Book;
import com.ktdsuniversity.edu.oop.library.data.Library;
import com.ktdsuniversity.edu.oop.library.data.Member;
import com.ktdsuniversity.edu.oop.library.exception.DuplicatedRentBookException;
import com.ktdsuniversity.edu.oop.library.exception.LibraryException;
import com.ktdsuniversity.edu.oop.library.exception.NotFoundBookException;
import com.ktdsuniversity.edu.oop.library.exception.NotFoundDisposeBookException;
import com.ktdsuniversity.edu.oop.library.exception.NotFoundMemberException;
import com.ktdsuniversity.edu.oop.library.util.ScannerUtil;

/**
 * 도서관 관리 기능 구현
 */
public class LibraryServiceImpl implements LibraryService{
	public static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final Library LIBRARY;
    private static final int POPULAR_STANDARD = 10;
    private static final int BLACK_LIST = 3;
    
    public LibraryServiceImpl() {
    	this.LIBRARY = new Library();
    }
    
    /** 신규 책 입고 기능 */
	@Override
	public void stockInNewBook() {
		
		System.out.println("입고할 책 정보를 입력하세요.");
		String title = ScannerUtil.nextLine("제목: ").trim();
		if(title == null || title.isBlank()) {
			throw new LibraryException("제목은 필수로 입력해야합니다.");
		}
		
		String subTitle= ScannerUtil.nextLine("부제목: ").trim();
		if(subTitle == null || subTitle.isBlank()) {
			throw new LibraryException("부제목은 필수로 입력해야합니다.");
		}
		
		String genre = ScannerUtil.nextLine("장르: ").trim();
		if(genre == null || genre.isBlank()) {
			throw new LibraryException("장르는 필수로 입력해야합니다.");
		}
		
		String publisher = ScannerUtil.nextLine("출판사: ").trim();
		if(publisher == null || publisher.isBlank()) {
			throw new LibraryException("출판사는 필수로 입력해야합니다.");
		}
		
		String author = ScannerUtil.nextLine("저자: ").trim();
		if( author == null ||  author.isBlank()) {
			throw new LibraryException("저자는 필수로 입력해야합니다.");
		}
		
		String pubDateStr = ScannerUtil.nextLine("출판일: (예시: 2026-08-17)").trim();
		if(pubDateStr == null || pubDateStr.isBlank()) {
			throw new LibraryException("출판일은 필수로 입력해야합니다.");
		}
		LocalDate pubDate = LocalDate.parse(pubDateStr, FORMAT);
		
		long printPageCount = ScannerUtil.nextLong("인쇄 회차: ");
		if (printPageCount < 0) {
			throw new LibraryException("인쇄 회차를 잘못 입력하셨습니다.");
		}
		
		int price = ScannerUtil.nextInt("가격: ");
		if (price < 0) {
			throw new LibraryException("가격을 잘못 입력하셨습니다.");
		}
		
		String isbn = ScannerUtil.nextLine("ISBN: ").trim();
		if (isbn == null || isbn.isBlank()) {
			throw new LibraryException("ISBN은 필수로 입력해야합니다.");
		}
		
		Book newBook = new Book(title, subTitle, genre, publisher, author, pubDate,
				printPageCount, price, isbn);
		
		// 관리 고유번호를 임의로 부여
		newBook.setBookId(LIBRARY.increaseBookId());
		
		LIBRARY.createBook(newBook);
		System.out.println("신규 책이 입고되었습니다.");
	}

	/** 책 폐기처리 기능 */
	@Override
	public void disposeOldBook() {
		
		System.out.println("책 폐기처리를 시작합니다.");
		
		if (findAllBooks().size() == 0) {
			throw new NotFoundBookException();
		}
		
		boolean isDispose = false;
		List<Book> disposeBook = new ArrayList<>();
		for (Book book : findAllBooks()) {
			if (book.getPubDate().plusYears(10).isBefore(LocalDate.now())) {
				disposeBook.add(book);
			}
		}
		
		int bookId = -1;
		for (Book book : disposeBook) {
			bookId = book.getBookId();
			LIBRARY.deleteBook(book);
			System.out.println("bookId: " + bookId + "번을 폐기했습니다.");
	        isDispose = true;
		}
		
		if (!isDispose) {
			throw new NotFoundDisposeBookException();
		}
		
	}

	/** 반납일이 다가오거나 지난 회원 조회 기능 */
	@Override
	public void findByMemberWithReturnDate() {
		
		System.out.println("책을 반납해야하는 회원을 조회합니다.");
		if (findAllMembers().size() == 0) {
			throw new NotFoundMemberException();
		}
		
		List<Member> returnMembers = new ArrayList<>();
		for (Member member : findAllMembers()) {
			for (Book book : member.getRecentBooks()) {
	            if (!book.getReturnDate().plusDays(-2).isAfter(LocalDate.now())) {
	                returnMembers.add(member);
	                break;
	            }
	        }
	    }
		
		if (returnMembers.size() == 0) {
	        throw new NotFoundMemberException();
	    }
		
		for (Member member : returnMembers) {
			System.out.println("====회원 목록====");
			System.out.println(member.getName());
		}
		
	}

	/** 인기 도서 목록 조회 기능 */
	@Override
	public void showPopularBooks() {
		
		System.out.println("인기 도서 목록입니다.");
		
		if (findAllBooks().size() == 0) {
			throw new NotFoundBookException();
		}
		
		boolean isFound = false;
		for (Book book : findAllBooks()) {
	        if (book.getRentCount() > POPULAR_STANDARD) {
	            System.out.println(book.getTitle());
	            isFound = true;
	        }
	    }
		
		if (!isFound) {
			throw new NotFoundBookException();
		}
	}

	/** 비인기 도서 목록 조회 기능 */
	@Override
	public void showUnpopularBooks() {
		System.out.println("비인기 도서 목록입니다.");
		
		if (findAllBooks().size() == 0) {
			throw new NotFoundBookException();
		}
		
		boolean isFound = false;
		for (Book book : findAllBooks()) {
	        if (book.getRentCount() <= POPULAR_STANDARD) {
	            System.out.println(book.getTitle());
	            isFound = true;
	        }
	    }
		
		if (!isFound) {
			throw new NotFoundBookException();
		}
	}

	/** 상습미반납 회원 조회 기능 */
	@Override
	public void findBlackListMembers() {
		
		System.out.println("상습 미반납 회원을 조회합니다.");

		if (findAllMembers().size() == 0) {
	        throw new NotFoundMemberException();
	    }

	    boolean isFound = false;
	    for (Member member : findAllMembers()) {
	        if (member.getOverReturnCount() >= BLACK_LIST) {
	            System.out.println(member);
	            isFound = true;
	        }
	    }

	    if (!isFound) {
	        throw new NotFoundMemberException();
	    }
	
	}

	/** 도서 검색 기능 */
	@Override
	public void searchBook() {
		String keyword = ScannerUtil.nextLine("검색어를 입력하세요: ").trim();
	    if (keyword == null || keyword.isBlank()) {
	        throw new LibraryException("검색어는 필수로 입력해야 합니다.");
	    }

	    boolean isFound = false;
	    for (Book book : findAllBooks()) {
	        if (book.getPublisher().contains(keyword) || book.getAuthor().contains(keyword)
	                || book.getGenre().contains(keyword)) {
	            System.out.println(book);
	            isFound = true;
	        }
	    }

	    if (!isFound) {
	        throw new NotFoundBookException();
	    }
	}
	
	/** 도서 대여 기능*/
	@Override
	public void rentBook() {
		System.out.println("도서 대여를 시작합니다.");
		
		int memberId = ScannerUtil.nextInt("회원 id: ");
		if (memberId < 0 || memberId >= findAllMembers().size()) {
			throw new NotFoundMemberException();
		}
		Member member = findByMemberId(memberId);
		
	    int bookId = ScannerUtil.nextInt("도서 id: ");
	    if (bookId < 0 || bookId > findAllBooks().size()) {
	    	throw new NotFoundBookException();
	    }
	    Book book = findByBookId(bookId);

	    if (member.getOverReturnCount() >= BLACK_LIST) {
	        throw new LibraryException("미반납회수 초과로 대여할 수 없습니다.");
	    }

	    if (book.isRented()) {
	        throw new DuplicatedRentBookException();
	    }
	    
	    book.setRentCount(book.getRentCount() + 1);
	    book.setRented(true);
	    book.setRentDate(LocalDate.now());
	    book.setReturned(false);
	    book.setReturnDate(book.getRentDate().plusDays(7));
	    book.setMemberName(member.getName());

	    member.getRecentBooks().add(book);
	    System.out.println("도서를 대여했습니다.");
	}
	
	/** 도서 반납 기능*/
	@Override
	public void returnBook() {
		
	}
	
	/** id로 책 정보 가져오기 */
	public Book findByBookId(int bookId) {
		for (Book book : LIBRARY.getBooks()) {
			if (book.getBookId() == bookId) {
				return book;
			}
		}
		return null;
	}

	/** 모든 책 정보 가져오기 */
	public List<Book> findAllBooks() {
		return LIBRARY.getBooks();
	}
	
	/** id로 책 정보 가져오기 */
	public Member findByMemberId(int memberId) {
		for (Member member : LIBRARY.getMembers()) {
			if (member.getId() == memberId) {
				return member;
			}
		}
		return null;
	}
	
	/** 모든 회원 정보 가져오기 */
	 public List<Member> findAllMembers() {
		 return LIBRARY.getMembers();
	 }

}
