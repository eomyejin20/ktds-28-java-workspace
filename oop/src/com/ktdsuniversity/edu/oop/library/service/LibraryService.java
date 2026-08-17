package com.ktdsuniversity.edu.oop.library.service;

public interface LibraryService {
	
	/** 신규 회원 등록 기능*/
	void register();

	/** 신규 책 입고 기능 */
	void stockInNewBook();
	
	/** 책 폐기처리 기능 */
	void disposeOldBook();
	
	/** 반납일이 다가오거나 지난 회원 조회 기능 */
	void findByMemberWithReturnDate();
	
	/** 인기 도서 목록 조회 기능 */
	void showPopularBooks();
	
	/** 비인기 도서 목록 조회 기능 */
	void showUnpopularBooks();
	
	/** 상습미반납 회원 조회 기능 */
	void findBlackListMembers();
	
	/** 도서 검색 기능 */
	void searchBook();
	
	/** 도서 대여 기능*/
	void rentBook();
	
	/** 도서 반납 기능*/
	void returnBook();
}
