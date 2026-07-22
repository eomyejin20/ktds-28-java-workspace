package restaurant;

/**
 * 고객
 */
public class Customer {
	
	/**
	 * 고객 ID
	 */
	private String customerId;
	
	/**
	 * 나이
	 */
	private int age;
	
	/**
	 * 부모 동반
	 */
	private boolean withParent;
	
	/**
     * 포만감
     */
    private int full;

    /**
     * 취기
     */
    private int alcohol;
	
	/**
	 * 주문한 음식
	 */
	private Food food;
	
	/**
	 * 주문한 주류
	 */
	private Drink drink;

	/**
	 * 고객 생성자
	 * @param customerId
	 * @param age
	 * @param withParent
	 */
	public Customer(String customerId, int age, boolean withParent) {
        this.customerId = customerId;
        this.age = age;
        this.withParent = withParent;
        this.full = 0;
        this.alcohol = 0;
        this.food = new Food();
        this.drink = new Drink();
    }
	
	/**
	 * 주류를 마실수 있나?
	 * @return
	 */
	public boolean isDrink() {
		//성년이거나 미성년의 부모 동반은 가능
		if (this.age >= 19 || this.age < 19 && withParent) {
			return true;
		} else {
			return false;
		}
	}
	

	// 기능
	/**
	 * 육류를 먹는다
	 */
	public void eatBeef(int request) {
		if (this.full > 100) {
			System.out.println("포만감 초과");
            return;
        }
		food.beefOrder(request);
		this.full += request * 25;
	}
	
	/**
	 * 채소를 먹는다
	 */
	public void eatVegetable(int request) {
        if (this.full > 100) {
        	System.out.println("포만감 초과");
            return;
        }
        food.vegetableOrder(request);
        this.full += request * 13;
        this.alcohol -= request * 5;
        if (this.alcohol < 0) {
            this.alcohol = 0;
        }
    }
	
	/**
	 * 과일을 먹는다
	 */
	public void eatFruit(int request) {
		if (this.full > 100) {
			System.out.println("포만감 초과");
            return;
		}
        food.fruitOrder(request);
        this.full += request * 13;
        this.alcohol -= request * 5;
        if (this.alcohol < 0) {
            this.alcohol = 0;
        }
	}
	
	/**
	 * 생선을 먹는다
	 */
	public void eatFish(int request) {
		if (this.full > 100) {
			System.out.println("포만감 초과");
            return;
        }
        food.fishOrder(request);
        this.full += request * 7;
	}
	
	
	/**
	 * 소주를 마신다.
	 */
	public void drinkSoju(int request) {
		// 주류 마실 수 있는 나이 체크
		if (!isDrink()) {
			System.out.println("미성년입니다.");
            return;
        }
		// 취기 60 초과 체크
        if (this.alcohol > 60) {
        	System.out.println("취기 초과");
            return;
        }
        drink.orderSoju(request);
        this.alcohol += request * 17;
        this.full -= request * 7;
        if (this.full < 0) {
            this.full = 0;
        }
	}

	 /**
     * 맥주를 마신다.
     */
    public void drinkBeer(int request) {
        if (!isDrink()) {
        	System.out.println("미성년입니다.");
            return;
        }
        if (this.alcohol > 60) {
        	System.out.println("취기 초과");
            return;
        }
        // 맥주는 포만감 체크
        if (this.full > 100) {
			System.out.println("포만감 초과");
            return;
        }
        drink.orderBeer(request);
        this.alcohol += request * 6;
        this.full += request * 8;
    }

    /**
     * 위스키를 마신다.
     */
    public void drinkWhisky(int request) {
        if (!isDrink()) {
        	System.out.println("미성년입니다.");
            return;
        }
        if (this.alcohol > 60) {
        	System.out.println("취기 초과");
            return;
        }
        drink.orderWhisky(request);
        this.alcohol += request * 40;
        this.full -= request * 7;
        if (this.full < 0) {
            this.full = 0;
        }
    }

    /**
     * 꼬냑을 마신다.
     */
    public void drinkCognac(int request) {
        if (!isDrink()) {
        	System.out.println("미성년입니다.");
            return;
        }
        if (this.alcohol > 60) {
        	System.out.println("취기 초과");
            return;
        }
        drink.orderCognac(request);
        this.alcohol += request * 40;
        this.full -= request * 7;
        if (this.full < 0) {
        	this.full = 0;
        }
    }
    
    /**
     * Getter 포만감
     * @return
     */
    public int getFull() {
        return this.full;
    }

    /**
     * Getter 취기
     * @return
     */
    public int getAlcohol() {
        return this.alcohol;
    }
}
