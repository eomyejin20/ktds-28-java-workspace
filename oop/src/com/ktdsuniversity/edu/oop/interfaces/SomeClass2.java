package com.ktdsuniversity.edu.oop.interfaces;

public class SomeClass2 implements SomeInterface{

	@Override
	public void doSomething1() {
		System.out.println("점심을 먹는다.");
		
	}

	@Override
	public void doSomething2() {
		System.out.println("카페를 간다.");
		
	}

	@Override
	public void doSomething3() {
		System.out.println("산책을 한다.");
		
	}

	@Override
	public int getSomething() {
		return 123;
	}

	@Override
	public String getString() {
		return "내이름";
	}

}
