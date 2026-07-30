package com.ktdsuniversity.edu.oop.collection.list.mart;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.collection.list.mart.inf.CustomerInterface;
import com.ktdsuniversity.edu.oop.interfaces.market.Item.Drink;
import com.ktdsuniversity.edu.oop.interfaces.market.Item.Item;

public class Customer implements CustomerInterface{

	private String name;
	private int age;
	private int cash;
	private List<Item> item;
	
	public Customer(String name, int age, int cash) {
		this.name = name;
		this.age = age;
		this.cash = cash;
		this.item = new ArrayList<>();
	}
	
	@Override
	public void buy(Item item) {
		System.out.println();
		System.out.println(this.name + " 고객 계산 시작");
		int orderAmount = 0;
		Item itemUnit = null;

		for (int i = 0; i < this.item.size(); i++) {
			itemUnit = this.item.get(i);
			if (itemUnit instanceof Drink alcohol) {
				if (alcohol.AGE <= this.age) {
					orderAmount += itemUnit.getPrice();
					this.item.add(itemUnit);
				}
			} else {
				orderAmount += itemUnit.getPrice();
				this.item.add(itemUnit);
			}
		}

		System.out.println("결제 금액: " + orderAmount);
		System.out.println("보유 금액: " + this.cash);
		if (orderAmount > this.cash) {
			System.out.println("구매 불가능 사유: 잔액 부족");
//			this.item = new Item[10];
		} else {
			this.cash -= orderAmount;
			System.out.println("결제 후 보유 금액: " + this.cash);
		}
	}

	@Override
	public String toString() {
		return "NormalCustomer [name=" + this.name + ", money=" + this.cash + ", goods=" + this.item
				+ ", age=" + this.age + "]";
	
	}

}
