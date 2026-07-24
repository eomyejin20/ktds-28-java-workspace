package com.ktdsuniversity.edu.oop.pgs;

public class PGS_181869 {
	public static void strSplit(String str) {
		String[] strArr = str.split(" ");
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}
				
		
	}
	
	public static void main(String[] args) {
		String my_string = " i    love  you";
		strSplit(my_string);
	}

}
