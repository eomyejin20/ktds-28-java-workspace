package com.ktdsuniversity.edu.oop.collection.list.vendingmachine;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.interfaces.market.Item.Item;

/**
 * 자판기에 상품을 고정시키기 위한 홀더
 */

public class ItemHolder {
	
	List<Item> items;
	
	/**
	 * 생성자
	 * @param items
	 */
	public ItemHolder(List<Item> 라면들) {
		this.items = new ArrayList<>();
	}

}
