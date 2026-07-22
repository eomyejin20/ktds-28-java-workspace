package restaurant;

/**
 * 주문한 음식
 */
public class Food {
	/**
	 * 육고기 주문 개수
	 */
	private int beefOrder;
	
	/**
	 * 채소 주문 개수
	 */
	private int vegetableOrder;
	
	/**
	 * 과일 주문 개수
	 */
	private int fruitOrder;
	
	/**
	 * 생선 주문 개수
	 */
	private int fishOrder;
	
	/**
	 * 처음의 음식 기본생성자
	 */
	public Food() {
		this.beefOrder = 0;
		this.vegetableOrder = 0;
		this.fruitOrder = 0;
		this.fishOrder = 0;
	}
	
	// 기능: 포만감
	/**
	 * 육류를 주문하면 25포만감 증가
	 * @return
	 */
	public void beefOrder(int request) {
		// 주문 개수를 추가
		this.beefOrder += request;
	}
	
	/**
	 * 채소를 주문하면 13포만감 증가
	 */
	public void vegetableOrder(int request) {
		// 주문 개수를 추가
		this.vegetableOrder += request;
	}
	
	/**
	 * 과일을 주문하면 13포만감 증가
	 */
	public void fruitOrder(int request) {
		// 주문 개수를 추가
		this.fruitOrder += request;
	}
	
	/**
	 * 생선을 주문하면 7포만감 증가
	 */
	public void fishOrder(int request) {
		// 주문 개수를 추가
		this.fishOrder += request;
	}

	
}
