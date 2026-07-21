package oop;

/**
 * 구매자
 */
public class Buyer {
	
	/**
	 * 구매자 이름
	 */
	String name;
	
	/**
	 * 현금
	 */
	int cash;
	
	/**
	 * 장바구니
	 */
	int cart;
	
	/**
	 * 생성자
	 * @param name
	 * @param cash
	 * @param cart
	 */
	public Buyer(String name, int cash) {
		this.name = name;
		this.cash = cash;
		this.cart = 0;
	}

	/**
	 * 상품을 구매한다.
	 * @param seller
	 * @param request
	 * @return
	 */
	public int buy(Seller seller, int request) {
		if (request < 0 || seller.stock < request) {
			return 0;
		}
		int possibleBuy = Math.min(request, seller.stock);
		
		if (cash < possibleBuy * seller.price) {
			return 0;
		}
		
		possibleBuy = seller.sell(possibleBuy);
		
		cash -= (possibleBuy * seller.price);
		cart += possibleBuy;
		return possibleBuy;
	}
}
