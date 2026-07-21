package oop;

/**
 * 자판기에 상품을 고정시키기 위한 홀더
 */

public class ItemHolder {
	
	Item[] items;
	
	/**
	 * 생성자
	 * @param items
	 */
	public ItemHolder(Item[] items) {
		this.items = items;
	}

}
