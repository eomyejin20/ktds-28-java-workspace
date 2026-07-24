package com.ktdsuniversity.edu.oop.pgs;

import java.util.Arrays;
public class PGS_181867 {
	
	public static void stringArr(String str) {
		String[] strArr = str.split("x", -1); //["o", "oo", "o", "", "o", ""]
		System.out.println(strArr.length);
		
		int arr[] = new int[strArr.length];
		for(int i = 0; i < strArr.length; i++) {
			arr[i] = strArr[i].length();
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void main(String[] args) {
		String myString = "oxooxoxxox";
		stringArr(myString);
		
	}

}
