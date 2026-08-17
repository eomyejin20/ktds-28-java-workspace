package com.ktdsuniversity.edu.oop.tvschedule.exception;

/**
 * 편성표 공통 예외 처리
 */
public class TvException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public TvException(String message) {
		super(message);
	}
}
