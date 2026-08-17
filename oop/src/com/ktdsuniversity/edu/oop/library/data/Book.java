package com.ktdsuniversity.edu.oop.library.data;

import java.time.LocalDate;

/**
 * 도서 정보
 */
public class Book {
	
	private String title;
	private String subTitle;
	private String genre;
	private String publisher;
	private String author;
	private LocalDate pubDate;
	private long printPageCount;
	private LocalDate stockInDate;
	private int price;
	private String isbn;
	private int bookId;
	private int rentCount;
	private boolean isRented;
	private LocalDate rentDate;
	private boolean isReturned;
	private LocalDate returnDate;
	private String memberName;


	public Book(String title, String subTitle, String genre, String publisher, String author, LocalDate pubDate,
			long printPageCount, int price, String isbn) {
		this.title = title;
		this.subTitle = subTitle;
		this.genre = genre;
		this.publisher = publisher;
		this.author = author;
		this.pubDate = pubDate;
		this.printPageCount = printPageCount;
		this.stockInDate = LocalDate.now();
		this.price = price;
		this.isbn = isbn;
		++this.bookId;
	}



	public String getTitle() {
		return this.title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getSubTitle() {
		return this.subTitle;
	}



	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}



	public String getGenre() {
		return this.genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getPublisher() {
		return this.publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getAuthor() {
		return this.author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public LocalDate getPubDate() {
		return this.pubDate;
	}



	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}



	public long getPrintPageCount() {
		return this.printPageCount;
	}



	public void setPrintPageCount(long printPageCount) {
		this.printPageCount = printPageCount;
	}



	public LocalDate getStockInDate() {
		return this.stockInDate;
	}



	public void setStockInDate(LocalDate stockInDate) {
		this.stockInDate = stockInDate;
	}



	public int getPrice() {
		return this.price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getIsbn() {
		return this.isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public int getBookId() {
		return this.bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	

	public int getRentCount() {
		return this.rentCount;
	}



	public void setRentCount(int rentCount) {
		this.rentCount = rentCount;
	}



	public boolean isRented() {
		return this.isRented;
	}



	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}



	public LocalDate getRentDate() {
		return this.rentDate;
	}



	public void setRentDate(LocalDate rentDate) {
		this.rentDate = rentDate;
	}



	public boolean isReturned() {
		return this.isReturned;
	}



	public void setReturned(boolean isReturned) {
		this.isReturned = isReturned;
	}



	public LocalDate getReturnDate() {
		return this.returnDate;
	}



	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}



	public String getMemberName() {
		return this.memberName;
	}



	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
}
