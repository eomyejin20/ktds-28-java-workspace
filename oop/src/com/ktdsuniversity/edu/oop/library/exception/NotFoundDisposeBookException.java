package com.ktdsuniversity.edu.oop.library.exception;

/**
 * 폐기할 책이 없을 경우 예외 처리
 */
public class NotFoundDisposeBookException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public NotFoundDisposeBookException() {
		super("페기할 책이 없습니다.");
	}
}
