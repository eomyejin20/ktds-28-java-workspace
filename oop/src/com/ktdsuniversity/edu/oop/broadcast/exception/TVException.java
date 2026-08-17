package com.ktdsuniversity.edu.oop.broadcast.exception;

/**
 * 방송사별 편성표 공통 예외 처리
 */
public class TVException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public TVException(String message) {
		super(message);
	}

}
