package com.ktdsuniversity.edu.oop.pgs;

public class PGS_181854 {
	
	public static void sumArray(int[] arr, int n) {
		//홀수
		if (arr.length % 2 == 1) {
			for (int i = 0; i < arr.length; i += 2) {
				arr[i] += n;
			}
		} else {
			for (int i = 1; i < arr.length; i += 2) {
				arr[i] += n;
			}
		}
		for (int arrayNum : arr) {
			System.out.println(arrayNum);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		sumArray(arr, n);
	}

}
