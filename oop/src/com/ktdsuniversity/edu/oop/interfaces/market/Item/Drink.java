package com.ktdsuniversity.edu.oop.interfaces.market.Item;

public class Drink extends Item{
	/**구매제한 나이*/
	public static final int AGE = 19; 
	/**보관 온도*/
	public static final int DRINK_TEMPERATURE  = 10;
	
	/**알코올 함량*/
	private int alcohol;
	

	public Drink(String name, int price, int alcohol) {
		super(name, price);
		this.alcohol = alcohol;
	}
	
	public int getAlchol() {
		return alcohol;
	}
	
	@Override
	public String toString() {
		return "AlcoholicBeverages [storageTemperature=" + this.DRINK_TEMPERATURE + ", purchageAgeLimit=" + this.AGE
				+ ", alcoholContent=" + this.alcohol + ", getName()=" + super.getName() + ", getPrice()=" + super.getPrice()
				+ "]";
	}

}
