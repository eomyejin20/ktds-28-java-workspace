package com.ktdsuniversity.edu.oop.pgs;

import java.util.*;

public class PGS_181868 {
	
	public static void strSplit(String str) {
		while (str.contains("  ")) {
			str = str.replace("  ", " ");
		}
		str = str.trim();
		String[] strArr = str.split(" ");
		
		for(int i = 0;  i< strArr.length; i++) {
			System.out.print(strArr[i]);
		}
		 
	}
	
	public static void main(String[] args) {
		String my_string = " i    love  you";
		strSplit(my_string);
	}

}
