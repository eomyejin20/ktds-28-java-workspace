package com.ktdsuniversity.edu.oop.array;

public class ArrayItem {
	/**11. 상품을 표현하는 클래스를 만들어보세요.*/
	
	/**상품 이름*/
	private String name;
	/**가격*/
	private int price;
	/**재고*/
	private int stock;

	public ArrayItem(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
}
