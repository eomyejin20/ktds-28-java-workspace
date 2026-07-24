package com.ktdsuniversity.edu.oop.pgs;

public class PGS_181941 {
	
	public static void ConcatString(String[] arr) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
		
	}
	
	/*
	 *  public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
	 */
	

	public static void main(String[] args) {
		String[] arr = {"a","b","c"};
		ConcatString(arr);
	}
}
