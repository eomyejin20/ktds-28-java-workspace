package com.ktdsuniversity.edu.oop.library.exception;

/**
 * 회원이 없을 경우 예외 처리
 */
public class NotFoundMemberException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NotFoundMemberException() {
		super("회원을 찾을 수 없습니다.");
	}
}
