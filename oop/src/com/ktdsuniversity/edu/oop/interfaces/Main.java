package com.ktdsuniversity.edu.oop.interfaces;

public class Main {

	public static void main(String[] args) {
		
		//ArticleSystem is a ArticleService
		ArticleService articleService  = new ArticleSystem();
		articleService.write();
		articleService.delete();
		articleService.view();
		
		
		//ArticleSystem is a ReplyService
		ReplyService replyService = new ArticleSystem();
		replyService.addReply();
		replyService.deleteReply();
		replyService.recommendReply();
		
		/*====================================================*/
		//MemberService, VipMemberService의 인스턴스 생성
		//VipMemberService is a MemberService
		
		//MemberClass is a MemberService
		MemberService system1 = new MemberClass();
		system1.deleteMe();
		system1.join();
		system1.login();
		system1.logout();
		
		//VipClass is a VipMemberService
		VipMemberService system2 = new VipClass();
		system2.deleteMe();
		system2.join();
		system2.login();
		system2.logout();
		system2.addPoint(100);
		
		//VipClass is a MemberService
		MemberService system3 = new VipClass();
		system3.deleteMe();
		system3.join();
		system3.login();
		system3.logout();
		if(system3 instanceof VipMemberService vip) {
			vip.addPoint(12);
		}
		
		
		/*=======================================================*/
		// SomeInterface의 인터페이스를 생성해보기
		// Interface는 인스턴스로 생성할수없다.
		// => Java의 인스턴스는 모든 메소드가 구현되어있어야 한다.
		SomeInterface inf = new SomeClass2();
		inf.doSomething1();
		inf.doSomething2();
		inf.doSomething3();
		
		int value = inf.getSomething();
		System.out.println(value) ;
		
		String str = inf.getString();
		System.out.println(str);
	}
}
