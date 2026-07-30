package com.ktdsuniversity.edu.oop.collection.list.mart.inf;

import com.ktdsuniversity.edu.oop.interfaces.market.Item.Item;

public interface RegularCustomer extends CustomerInterface{

	int free(Item item, int amount);
}
