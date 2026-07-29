package com.ktdsuniversity.edu.oop.exceptions;

public class GoodsHolder {

	private Goods[] goods;
	private int goodsIndex;
	
	public GoodsHolder(int goodsCount) {
		if (goodsCount < 0) {
			goodsCount = 0;
		}
		this.goods = new Goods[goodsCount];
	}
	
	public void addGoods(String name, int price) {
		if (this.goodsIndex < this.goods.length) {
			this.goods[this.goodsIndex++] = new Goods(name, price);
		}
	}
	
	public void removeGoods(int goodsIndex) {
		if (goodsIndex >= 0 && goodsIndex < this.goods.length) {
			this.goods[goodsIndex] = null;
		}
//		if (goods[goodsIndex] != null) {
//			this.goods[goodsIndex] = null;
//		}
		
	}
	
	public void printGoodsAt(int index) {
		Goods goods = null;
		
		if (index >= 0 && index < this.goods.length) {
			goods = this.goods[index];
		}
		
		if (goods != null) {
			String message = "%d. %s(%d)".formatted(index + 1, goods.getName(), goods.getPrice());
			System.out.println(message);
		}
		
	}
	
	public void printGoods() {
		if (goods != null) {
			for (int i = 0; i < this.goods.length; i++) {
				this.printGoodsAt(i);
			}
		}
	}
}
