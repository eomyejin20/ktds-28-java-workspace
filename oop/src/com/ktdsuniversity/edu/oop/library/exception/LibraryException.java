package com.ktdsuniversity.edu.oop.library.exception;

/**
 * 도서관 관리 공통 예외 처리
 */
public class LibraryException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public LibraryException(String message) {
		super(message);
	}

}
