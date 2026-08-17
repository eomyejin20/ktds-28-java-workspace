package com.ktdsuniversity.edu.oop.library;

import com.ktdsuniversity.edu.oop.library.exception.LibraryException;
import com.ktdsuniversity.edu.oop.library.service.LibraryService;
import com.ktdsuniversity.edu.oop.library.service.LibraryServiceImpl;
import com.ktdsuniversity.edu.oop.library.util.ScannerUtil;

public class Main {
	
	private static final LibraryService LIBRARY_SERVICE = new LibraryServiceImpl();
	
	public static void main(String[] args) {
		System.out.println("도서관 관리 서비스입니다.");
		
		while (true) {
			System.out.println("===원하시는 기능을 선택하세요.===");
			System.out.println("1. 신규 책 입고하기");
			System.out.println("2. 책 폐기 처리하기");
			System.out.println("3. 반납일이 다가오거나 지난 회원 조회하기");
			System.out.println("4. 인기 도서 목록 조회하기");
			System.out.println("5. 비인기 도서 목록 조회하기");
			System.out.println("6. 상습미반납 회원 조회하기");
			System.out.println("0. 종료");
			
			int number = ScannerUtil.nextInt("번호: ");
			if (number == 0) {
				System.out.println("프로그램 종료");
				return;
			}
			
			try {
				runApp(number);
			} finally {
				ScannerUtil.close();
			}
		}
	}
	
	public static void runApp(int number) {
		if (number == 1) {
			LIBRARY_SERVICE.stockInNewBook();
		} else if (number == 2 ) {
			LIBRARY_SERVICE.disposeOldBook();
		} else if (number == 3 ) {
			LIBRARY_SERVICE.findByMemberWithReturnDate();
		} else if (number == 4 ) {
			LIBRARY_SERVICE.showPopularBooks();
		} else if (number == 5 ) {
			LIBRARY_SERVICE.showUnpopularBooks();
		} else if (number == 6 ) {
			LIBRARY_SERVICE.searchBook();
		} else {
			throw new LibraryException("잘못 입력하셨습니다.");
		}
	}

}
