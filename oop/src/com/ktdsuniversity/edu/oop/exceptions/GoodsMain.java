package com.ktdsuniversity.edu.oop.exceptions;

public class GoodsMain {
	
	public static void main(String[] args) {
		GoodsHolder capsuleHolder = new GoodsHolder(-1);

		capsuleHolder.addGoods("네스프레소 솔티드 카라멜 커피", 8_900);
		capsuleHolder.addGoods("null", 9_900);
		capsuleHolder.addGoods("", 7_800);
		capsuleHolder.addGoods("    ", 8_000);
		capsuleHolder.addGoods("일리 에스프레소", 7_900);
//		capsuleHolder.printGoods();
		capsuleHolder.printGoodsAt(-1);
		capsuleHolder.printGoodsAt(0);
		capsuleHolder.printGoodsAt(1);
		capsuleHolder.printGoodsAt(2);
		capsuleHolder.printGoodsAt(3);
		capsuleHolder.printGoodsAt(99);
		
		capsuleHolder.removeGoods(0);
		capsuleHolder.removeGoods(1);
		capsuleHolder.removeGoods(2);
		capsuleHolder.removeGoods(3);
		capsuleHolder.removeGoods(-1);
		capsuleHolder.removeGoods(99);
		capsuleHolder.printGoods();
		
		
	}

}
