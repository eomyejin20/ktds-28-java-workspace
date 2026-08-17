package com.ktdsuniversity.edu.oop.library.exception;

public class LibraryException extends RuntimeException {

	/**
	 * 도서관 관리 공통 예외 처리
	 */
	private static final long serialVersionUID = 1L;
	
	public LibraryException(String message) {
		super(message);
	}

}
