package com.ktdsuniversity.edu.oop.pgs;

public class PGS_181849 {
	
	public static void solution(String num_str) {
        String str = num_str.replace("0", "");
        String[] strArray = str.split("");
        
        int answer = 0;
        for(int i = 0; i < strArray.length; i++) {
            answer += Integer.parseInt(strArray[i]);  
        }
        System.out.println(answer);
       
    }
	
	public static void main(String[] args) {
		String num_str = "123456789";
	
		solution(num_str);
	}

}
