package com.ktdsuniversity.edu.oop.pgs;

public class PGS_181861 {
	
	public static void repeatAppend(int[] num) {
		/*
		 * 1. 배열의 원소를 다 더해서 배열의 크기를 할당한다.
		 */
		
		int number = 0;
		for (int i = 0; i < num.length; i++) {
			number += num[i];
		}
		
		int[] newArray = new int[number];
		
		int indexcount = 0;
		for (int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i]; j++) {
				newArray[indexcount++] = num[i];
			}
			
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		
		//
	}

	public static void main(String[] args) {
		int[] positiveNum = {5, 1, 4};
		repeatAppend(positiveNum);
		
	}
}
