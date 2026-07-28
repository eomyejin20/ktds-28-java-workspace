package com.ktdsuniversity.edu.oop.interfaces.market.customer;

import java.util.Arrays;

import com.ktdsuniversity.edu.oop.interfaces.market.Item.Drink;
import com.ktdsuniversity.edu.oop.interfaces.market.Item.Item;

public class NopayCustomer implements RegularCustomer{

	private String name;
	private int age;
	private int cash;
	private Item[] item;
	
	public NopayCustomer(String name, int age, int cash) {
		this.name = name;
		this.age = age;
		this.cash = cash;
		this.item = new Item[10];
	}
	
	@Override
	public void buy(Item[] item) {
		System.out.println();
		System.out.println(this.name + " 고객 계산 시작");
		int orderAmount = 0;
		Item itemUnit = null;

		int haveGoodsIndex = 0;

		for (int i = 0; i < item.length; i++) {
			itemUnit = item[i];
			if (itemUnit instanceof Drink alcohol) {
				if (alcohol.AGE <= this.age) {
					orderAmount += itemUnit.getPrice();
					this.item[haveGoodsIndex++] = itemUnit;
				}
			} else {
				orderAmount += itemUnit.getPrice();
				this.item[haveGoodsIndex++] = itemUnit;
			}
		}
		orderAmount = this.free(item, orderAmount);

		System.out.println("최종 결제 금액: " + orderAmount);
		System.out.println("보유 금액: " + this.cash);
		if (orderAmount > this.cash) {
			System.out.println("구매 불가능 사유: 잔액 부족");
			this.item = new Item[10];
		} else {
			this.cash -= orderAmount;
			System.out.println("결제 후 보유 금액: " + this.cash);
		}
	}
	
	@Override
	public int free(Item[] item, int amount) {
		int freePrice = Integer.MAX_VALUE;
		
		Item itemUnit = null;
		for (int i = 0; i < item.length; i++) {
			itemUnit = item[i];

			if (itemUnit instanceof Drink alcohol) {
				if (alcohol.AGE <= this.age) {
					if (freePrice > itemUnit.getPrice()) {
						freePrice = itemUnit.getPrice();
					}
				}
			} else {
				if (freePrice > itemUnit.getPrice()) {
					freePrice = itemUnit.getPrice();
				}
			}
		}
		
		System.out.println("서비스 제공 상품 가격: " + freePrice);
		return amount - freePrice;
	}

	@Override
	public String toString() {
		return "NopayCustomer [name=" + this.name + ", money=" + this.cash + ", goods=" + Arrays.toString(this.item)
				+ ", age=" + this.age + "]";
	}

}
