package com.ktdsuniversity.edu.oop.collection.list.vendingmachine;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.interfaces.market.Item.Item;

/**
 * 자판기
 * 음료가 들어있는 자판기에 돈을 넣고 음료의 번호를 입력하면 
 * 음료가 추출된다.
 * 거스름돈이 남았을 경우 사용자에게 돌려준다
 */
public class VendingMachine {
	ItemHolder holder;

	/**
	 * 생성자
	 * @param holder
	 */
	public VendingMachine(ItemHolder holder) {
		this.holder = holder;
	}
	
	/**
	 * 자판기에 새로운 라면을 추가한다.
	 * @param args
	 */
	
	public static void main(String[] args) {
		List<Item> 라면들 = new ArrayList<>();
		
		라면들.add( new Item("진라면 매운맛", 4500) );
		라면들.add( new Item("불닭 매운맛", 4300) );
		라면들.add( new Item("진라면 순한맛", 4800) );
		
		ItemHolder 라면홀더 = new ItemHolder(라면들);
		
		VendingMachine 한강라면 = new VendingMachine(라면홀더); 
		
	}
}
