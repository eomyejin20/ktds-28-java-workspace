package com.ktdsuniversity.edu.oop.interfaces.market.Item;

public class Item{
	
	/**상품의 이름*/
	private String name;
	
	/**가격*/
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + this.name + ", price=" + this.price + "]";
	}

}
