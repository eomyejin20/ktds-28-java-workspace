package com.ktdsuniversity.edu.oop.library.exception;

/**
 * 이미 대여중인 책을 대여하려고 하면 예외처리
 */
public class DuplicatedRentBookException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DuplicatedRentBookException() {
		super("이미 대여중인 책입니다.");
	}
}
