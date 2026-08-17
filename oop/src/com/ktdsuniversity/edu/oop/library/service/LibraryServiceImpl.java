package com.ktdsuniversity.edu.oop.library.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.library.data.Book;
import com.ktdsuniversity.edu.oop.library.data.Library;
import com.ktdsuniversity.edu.oop.library.exception.LibraryException;
import com.ktdsuniversity.edu.oop.library.exception.NotFoundDisposeBookException;
import com.ktdsuniversity.edu.oop.library.util.ScannerUtil;

/**
 * 도서관 관리 기능 구현
 */
public class LibraryServiceImpl implements LibraryService{
	public static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final Library LIBRARY;
    
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
		
		LIBRARY.createBook(newBook);
		System.out.println("신규 책이 입고되었습니다.");
	}

	/** 책 폐기처리 기능 */
	@Override
	public void disposeOldBook() {
		boolean isDispose = false;
		List<Book> disposeBook = new ArrayList<>();
		
		if (findAllBooks().size() == 0) {
			throw new NotFoundDisposeBookException();
		}
		
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
		// TODO Auto-generated method stub
		
	}

	/** 인기 도서 목록 조회 기능 */
	@Override
	public void showPopularBooks() {
		// TODO Auto-generated method stub
		
	}

	/** 비인기 도서 목록 조회 기능 */
	@Override
	public void showUnpopularBooks() {
		// TODO Auto-generated method stub
		
	}

	/** 상습미반납 회원 조회 기능 */
	@Override
	public void findBlackListMembers() {
		// TODO Auto-generated method stub
		
	}

	/** 도서 검색 기능 */
	@Override
	public void searchBook() {
		// TODO Auto-generated method stub
		
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
}
