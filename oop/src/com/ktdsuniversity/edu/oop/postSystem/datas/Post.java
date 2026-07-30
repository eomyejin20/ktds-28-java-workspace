package com.ktdsuniversity.edu.oop.postSystem.datas;

import java.util.ArrayList;
import java.util.List;

/**
 * 게시글 정보
 */
public class Post {

	/** 게시글을 구분하는 고유 ID */
//	private int postId;
	/** 게시글 제목 */
	private String postTitle;
	/** 게시글 작성자 */
	private String postUser;
	/** 게시글 작성 시간 */
	private String createdAt;
	/** 게시글 내용 */
	private String content;
	/** 게시글 조회수 */
	private int viewCount;
	/** 댓글 목록 */
	private List<Comment> comments = new ArrayList<>();
	
	
	public Post(String postTitle, String postUser, 
			String createdAt, String content, int viewCount) {
//		this.postId = postId;
		this.postTitle = postTitle;
		this.postUser = postUser;
		this.createdAt = createdAt;
		this.content = content;
		this.viewCount = viewCount;
		
	}
	
//	public int getPostId() {
//		return this.postId;
//	}
	
	public String getPostTitle() {
		return this.postTitle;
	}
	
	public String getPostUser() {
		return this.postUser;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public int getViewCount() {
		return this.viewCount;
	}
	
	public List<Comment> getComments() {
		return this.comments;
	}
	
	/** 게시글 조회수 증가 */
	public void increaseViewCount() {
		this.viewCount++;
	}
	
}
