package com.ktdsuniversity.edu.oop.library.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 도서관 정보
 */
public class Library {
	
	private List<Book> books;
	private List<Member> members;
	private int bookId;
	
	
	public Library() {
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
	}


	public List<Book> getBooks() {
		return this.books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}


	public List<Member> getMembers() {
		return this.members;
	}


	public void setMembers(List<Member> members) {
		this.members = members;
	}
	
	/**
	 * 책 추가 기능
	 * @param book 입고시키는 책 정보
	 */
	public void createBook(Book book) {
		this.books.add(book);
	}
	
	/**
	 * 책 제거 기능
	 * @param book 출판 이후 10년이 지난 책 아이디
	 */
	public void deleteBook(Book book) {
		this.books.remove(book);
	}
	
	/**
	 * 신규 회원 등록 기능
	 * @param member 회원 정보
	 */
	public void createMember(Member member) {
		this.members.add(member);
	}
	
	/**
	 * 회원 삭제 기능
	 * @param memberId 삭제할 회원 아이디
	 */
	public void deleteMember(Member member) {
		this.members.remove(member);
	}
	
	/**
	 * 책 고유 아이디 관리
	 * @return
	 */
	public int increaseBookId() {
	    return ++this.bookId;
	}

}
