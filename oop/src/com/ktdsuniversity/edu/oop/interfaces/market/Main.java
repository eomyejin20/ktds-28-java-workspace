package com.ktdsuniversity.edu.oop.interfaces.market;

import com.ktdsuniversity.edu.oop.interfaces.market.Item.Drink;
import com.ktdsuniversity.edu.oop.interfaces.market.Item.FreshItem;
import com.ktdsuniversity.edu.oop.interfaces.market.Item.FrozenItem;
import com.ktdsuniversity.edu.oop.interfaces.market.Item.Item;
import com.ktdsuniversity.edu.oop.interfaces.market.customer.Customer;
import com.ktdsuniversity.edu.oop.interfaces.market.customer.CustomerInterface;

public class Main {
	
	public static void main(String[] args) {
		Item snack = new Item("치토스", 1500);
		Item vegitable = new FreshItem("상추", 2000, "2026-07-29");
		Item sashimi = new FreshItem("회", 15000, "2026-07-28");
		Item dumpling  = new FrozenItem("만두", 10000, "2027-07-28");
		Item whisky = new Drink("조니워커", 335000, 40);
		Item conac = new Drink("Markers Mark", 50000, 40);
		
		Customer cust1 = new Customer("A", 500_000, 16);
		Customer cust2 = new DiscountCustomer("B", 30_000, 20);
		Customer cust3 = new NopayCustomer("C", 1_000_000, 51);
		
		cust1.buy(new Item[] {whisky, dumpling, dumpling, snack});
		cust2.buy(new Item[] {whisky, dumpling, dumpling, snack});
		cust3.buy(new Item[] {whisky, dumpling, dumpling, snack});
		
		System.out.println(cust1);
		System.out.println(cust2);
		System.out.println(cust3);
	}

}
