package com.ktdsuniversity.edu.oop.interfaces.market.Item;

public class FreshItem extends Item{
	/**보관 온도*/
	public static final int FRESH_TEMPERATURE  = 2;
	
	/**유통기한*/
	private String sellByDate;
	

	public FreshItem(String name, int price, 
			String sellByDate) {
		super(name, price);
		this.sellByDate = sellByDate;
	}
	
	public String getSellByDate() {
		return sellByDate;
	}
	
	@Override
	public String toString() {
		return "FreshItem [sellByDate=" + this.sellByDate + ", storageTemperature=" + this.FRESH_TEMPERATURE
				+ ", getName()=" + super.getName() + ", getPrice()=" + super.getPrice() + "]";
	}

}
