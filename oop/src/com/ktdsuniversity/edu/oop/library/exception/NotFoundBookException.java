package com.ktdsuniversity.edu.oop.library.exception;

/**
 * 책을 찾을 수 없을 때 예외 처리
 */
public class NotFoundBookException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NotFoundBookException() {
		super("도서를 찾을 수 없습니다.");
	}
}
