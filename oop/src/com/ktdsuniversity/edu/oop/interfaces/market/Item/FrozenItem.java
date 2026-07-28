package com.ktdsuniversity.edu.oop.interfaces.market.Item;

public class FrozenItem extends Item{
	
	/**보관온도*/
	public static final int FROZEN_TEMPERATURE  = -10;
	/**유통기한*/
	private String sellByDate;
	
	public FrozenItem(String name, int price, 
			String sellByDate) {
		super(name, price);
		this.sellByDate = sellByDate;
	}
	
	public String getSellByDate() {
		return sellByDate;
	}
	
	@Override
	public String toString() {
		return "FrozenItem [sellByDate=" + this.sellByDate + ", storageTemperature=" + this.FROZEN_TEMPERATURE
				+ ", getName()=" + super.getName() + ", getPrice()=" + super.getPrice() + "]";
	}
}
