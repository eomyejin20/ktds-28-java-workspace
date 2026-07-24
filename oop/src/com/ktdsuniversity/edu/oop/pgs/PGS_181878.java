package com.ktdsuniversity.edu.oop.pgs;

public class PGS_181878 {
	
	public static int solution(String myString, String pat) {
		myString = myString.toLowerCase();
		pat = pat.toLowerCase();
		
		if(myString.contains(pat)) {
			return 1;
		}
			return 0;
	}

	public static void main(String[] args) {
		int result = solution("AbCdEfG", "aBc");
		System.out.println(result);
		
		result = solution("aaAA", "aaaaa");
		System.out.println(result);
	}
	
}
