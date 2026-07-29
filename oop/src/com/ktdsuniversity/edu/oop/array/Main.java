package com.ktdsuniversity.edu.oop.array;

public class Main {

	public static void main(String[] args) {
		/**12. 상품을 표현하는 클래스의 배열 변수를 만들어보세요.*/
		ArrayItem[] item = new ArrayItem[3];
		item[0] = new ArrayItem("향수", 36000, 2);
		item[1] = new ArrayItem("바디워시", 9900, 5);
		item[2] = new ArrayItem("스킨", 26000, 3);
		
		for (int i = 0; i < item.length; i++) {
			System.out.print("상품명: " + item[i].getName() + " ");
			System.out.print("가격: " + item[i].getPrice() + " ");
			System.out.println("재고: " + item[i].getStock() + " ");
		}

		/**13. 상품을 표현하는 클래스의 배열 변수에서 가장 비싼 상품의 이름을 출력해보세요.*/
		int maxValue = 0;
		for (int i = 0; i < item.length; i++) {
			if (item[i].getPrice() > item[maxValue].getPrice()) {
				maxValue = i;
			}
		}
		System.out.println("가장 비싼 상품의 이름: " + item[maxValue].getName());

		/**14. 상품을 표현하는 클래스의 배열 변수내의 모든 상품의 이름을 출력해보세요.*/
		System.out.print("상품의 이름을 출력합니다: ");
		for (int i = 0; i < item.length; i++) {
			System.out.print(item[i].getName() +" ");
		}
		System.out.println();
	}
}
