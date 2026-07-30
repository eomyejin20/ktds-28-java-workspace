package com.ktdsuniversity.edu.oop.generics;

public class UserTest {

	public static void main(String[] args) {
		User<Integer, String> user01 = new User<>(1, "djadPwls");
		int id = user01.getId();
		String name = user01.getName();
		
		User<Integer, Long> user02 = new User<>(1355, 5412121l);
		int id2 = user02.getId();
		long name2 = user02.getName();
		
	}
}
