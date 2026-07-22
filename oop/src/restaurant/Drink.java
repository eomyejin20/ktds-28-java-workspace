package restaurant;

 /**
  * 주문한 주류
  */
public class Drink {
	
	/**
	 * 소주 주문 개수
	 */
	private int sojuOrder;
	
	/**
	 * 맥주 주문 개수
	 */
	private int beerOrder;
	
	/**
	 * 위스키 주문 개수
	 */
	private int whiskyOrder;
	
	/**
	 * 꼬냑 주문 개수
	 */
	private int cognacOrder;
	
	/**
	 * 처음의 주류 기본 생성자
	 */
	public Drink() {
		this.sojuOrder = 0;
		this.beerOrder = 0;
		this.whiskyOrder = 0;
		this.cognacOrder = 0;
	}
	
	/**
	 * 소주를 주문한다.
	 */
	public void orderSoju(int request) {
		this.sojuOrder += request;
	}
	
	/**
	 * 맥주를 주문한다.
	 */
	public void orderBeer(int request) {
		this.beerOrder += request;
	}
 
	/**
	 * 위스키를 주문한다.
	 */
	public void orderWhisky(int request) {
		this.whiskyOrder += request;
	}
 
	/**
	 * 꼬냑을 주문한다.
	 */
	public void orderCognac(int request) {
		this.cognacOrder += request;
	}
 
}
