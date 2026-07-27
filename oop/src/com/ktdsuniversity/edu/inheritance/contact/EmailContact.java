package com.ktdsuniversity.edu.inheritance.contact;

public class EmailContact extends Contact{
	
	private String email;
	
	public EmailContact(String name, String phone, String email) {
//		this(); // 나의 기본생성자를 호출해라
//		super(); // 부모의 기본생성자를 호출해라
		super(name, phone); // 부모의 생성자 호출(파라미터 타입)=>Contact에게 값을 전달
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}

}
