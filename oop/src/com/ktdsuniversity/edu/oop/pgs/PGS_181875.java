package com.ktdsuniversity.edu.oop.pgs;

public class PGS_181875 {
	
	public static void solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 1) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
               strArr[i] = strArr[i].toLowerCase();
            }
        }
        
        for (int i = 0; i < strArr.length; i++) {
        	System.out.print(strArr[i]);
        }
    }
	
	public static void main(String[] args) {
		String[] strArr = {"AAA","BBB","CCC","DDD"};
		solution(strArr);
	}

}
