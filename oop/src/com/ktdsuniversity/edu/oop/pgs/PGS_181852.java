package com.ktdsuniversity.edu.oop.pgs;

import java.util.Arrays;

public class PGS_181852 {
	
	public static void sortAlgorithm(int[] num) {
		//오름차순 정렬
		Arrays.sort(num);
		
		for (int i = 5; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
	
	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		sortAlgorithm(num_list);
		
	}

}
