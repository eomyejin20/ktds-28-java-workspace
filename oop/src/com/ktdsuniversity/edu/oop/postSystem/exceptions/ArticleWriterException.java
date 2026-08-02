package com.ktdsuniversity.edu.oop.postSystem.exceptions;

/**
 * 게시글 작성자 이름이 입력되지 않았을 때 발생하는 예외
 */
public class ArticleWriterException extends RuntimeException{
	
	private static final long serialVersionUID = -4766163612547661107L;
	
	public ArticleWriterException(String message) {
		super(message);
	}
}
