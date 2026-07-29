package com.ktdsuniversity.edu.oop.exceptions;

public class ExceptionTest {
	
	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
//		int[] n = new int[3];
//		
//		n[0] = 10;
//		n[2] = 20;
//		n[3] = 10;
		
		String name = null;
		// name이라는 인스턴스의 값이 null이라면 "이름을 입력해주세요"를 출력한다.
		// name이라는 인스턴스의 값이 null이 아니라면 값을 출력한다.
//		if (name != null) {
		if(StringUtils.isEmpty(name)) {
			System.out.println(name);
		} else {
			System.out.println("이름을 입력해주세요.");
		}
		
		String job = "  ";
		// name이라는 인스턴스의 값이 ""이라면 직업을 입력해주세요"를 출력한다.
		// 아니라면 값을 출력한다.
//		if (job.isEmpty()) {
//		if (job == null || job.equals("")) {
//		if (job == null || job.isBlank()) {
//		if (job == null || job.trim().length() == 0) {
		if (StringUtils.isEmpty(job)) {
			System.out.println("직업을 입력해주세요.");
		} else {
			System.out.println(job);
		}
		
		String address = "    ";
		// address라는 인스턴스의 값이 공백으로만 이루어져있다면 "주소를 입력해주세요"를 출력한다.
		// 아니라면 값을 출력한다.
//		if (address.isBlank()) {
//			System.out.println("주소를 입력해주세요.");
//			
//		} else {
//			System.out.println(address);
//		}
		String message = StringUtils.emptyToDefault(address, "주소를 입력해주세요");
		System.out.println(message);
	}
}
