package com.ktdsuniversity.edu.oop.interfaces.market.customer;
import com.ktdsuniversity.edu.oop.interfaces.market.Item.Item;
public interface RegularCustomer extends CustomerInterface{

	int free(Item[] item, int amount);
}
