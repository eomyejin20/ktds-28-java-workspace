package com.ktdsuniversity.edu.oop.pgs;

public class PGS_181856 {
	
	public static void bigger(int[] a, int[] b) {
		if (a.length > b.length) {
			System.out.println(1);
		}
		else if (a.length < b.length) {
			System.out.println(-1);
		}
		else {
			int aSum = 0;
			int bSum = 0;
			
			for (int i = 0; i < a.length; i++) {
				aSum += a[i];
				bSum += b[i];
			}
			if (aSum > bSum) {
				System.out.println(1);
			}
			else if (aSum < bSum) {
				System.out.println(-1);
			}
			else {
				System.out.println(0);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};
		bigger(arr1, arr2);
	}
}
