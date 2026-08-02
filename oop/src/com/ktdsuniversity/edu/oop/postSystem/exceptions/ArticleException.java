package com.ktdsuniversity.edu.oop.postSystem.exceptions;

/**
 * // 게시글 제목에서 발생하는 예외
 */
public class ArticleException extends RuntimeException {
	
	private static final long serialVersionUID = -4766163612547661107L;
	
	public ArticleException(String message) {
		super(message);
	}
}
