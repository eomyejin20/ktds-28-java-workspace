package com.ktdsuniversity.edu.oop.pgs;

import java.util.Arrays;

public class PGS_181853 {
	
	public static void sortAlgorithm(int[] num) {
		Arrays.sort(num);
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println(num[i]);
			
		}
	}
	
	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		sortAlgorithm(num_list);
	}

}
