package com.ktdsuniversity.edu.oop.enums;

public enum CalcType {
	ADD("덧셈"), SUB("뺄셈"), MUL("곱셈"), DIV("나눗셈");
	
	private String name; // 멤버변수
	
	CalcType(String name) { // 생성자에서 멤버변수의 값을 할당
		this.name  = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}