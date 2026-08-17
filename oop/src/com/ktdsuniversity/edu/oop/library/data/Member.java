package com.ktdsuniversity.edu.oop.library.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 회원 정보
 */
public class Member {

	private int id;
	private String name;
	private String phone;
	private int fine;
	private int overReturnCount;
	private List<Book> rentBooks;
	
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.rentBooks = new ArrayList<>();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getFine() {
		return this.fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	public int getOverReturnCount() {
		return this.overReturnCount;
	}

	public void setOverReturnCount(int overReturnCount) {
		this.overReturnCount = overReturnCount;
	}

	public List<Book> getRentedBooks() {
		return this.rentBooks;
	}

	public void setRentedBooks(List<Book> rentBooks) {
		this.rentBooks = rentBooks;
	}
	
}
