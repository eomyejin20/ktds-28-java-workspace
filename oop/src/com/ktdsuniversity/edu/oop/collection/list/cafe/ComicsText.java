package com.ktdsuniversity.edu.oop.collection.list.cafe;

import cafe.ComicsBook;

public class ComicsText {

	public static void main(String[] args) {
		ComicsBookCafe cafe = new ComicsBookCafe();
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		cafe.addBook(new ComicsBook("만화책1권", false, 3000));
		
		cafe.displayBooks();
		
		Visitor v = new Visitor(10000);
		v.rent(cafe, 0);
		v.rent(cafe, 2);
		v.rent(cafe, 8);
		v.rent(cafe, 1);
		
		
	}
}
