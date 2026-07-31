package com.ktdsuniversity.edu.oop.collection.list.goods;

public class Main {
	
	public static void main(String[] args) {
		GoodsHolder holder = new GoodsHolder();
		holder.printGoods();
		
		holder.addGoods("선풍기", 20000, true);
	}

}