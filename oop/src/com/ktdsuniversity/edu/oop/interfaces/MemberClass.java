package com.ktdsuniversity.edu.oop.interfaces;

public class MemberClass implements MemberService{

	@Override
	public void join() {
		System.out.println("가입한다.");
		
	}

	@Override
	public void login() {
		System.out.println("로그인한다.");
		
	}

	@Override
	public void deleteMe() {
		System.out.println("탈퇴한다.");
		
	}

	@Override
	public void logout() {
		System.out.println("로그아웃한다.");
		
	}

}
