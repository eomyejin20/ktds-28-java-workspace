package com.ktdsuniversity.edu.oop;

/**
 * 판매하는 클래스
 */
public class Sale {
	
	public static void main(String[] args) {
		Seller seller한 = new Seller("한", 1000, 4);
		Buyer buyer영 = new Buyer("영", 10000);
		
		System.out.println("구매한 수량 " + buyer영.buy(seller한, 3));
	}
}
