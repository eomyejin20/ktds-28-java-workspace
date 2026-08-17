package com.ktdsuniversity.edu.oop.tvschedule.exception;

/**
 * 편성표 시간 이외 시간대 입력 시 예외 처리
 */
public class NotFoundProgramException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NotFoundProgramException() {
		super("방영중인 시간이 아닙니다.");
	}
}
