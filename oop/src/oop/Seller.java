package oop;

/**
 * 판매자
 */
public class Seller {
	
	/**
	 * 판매자 이름
	 */
	String name;
	
	/**
	 * 상품 가격
	 */
	int price;
	
	/**
	 * 재고
	 */
	int stock;
	
	/**
	 * 매출액
	 */
	int totalPrice;
	
	/**
	 * 생성자
	 * @param name 
	 * @param price 
	 * @param stock
	 */
	public Seller(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	/**
	 * 상품을 판매한다.
	 * @param request
	 * @return
	 */
	public int sell(int buyerRequest) {
		if (buyerRequest > stock || buyerRequest < 0) {
			return 0;
		}
		
		int possibleSell = Math.min(buyerRequest, stock);
		
		
		stock -= possibleSell;
		totalPrice += price * possibleSell;
			
		return possibleSell;
		
	}

}
