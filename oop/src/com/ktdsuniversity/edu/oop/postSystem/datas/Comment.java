package com.ktdsuniversity.edu.oop.postSystem.datas;

/**
 * 댓글 정보
 */
public class Comment {
	
	/** 해당 게시글 고유 ID */
	private int postId;
	/** 댓글을 구분하는 고유 ID */
	private int commentId;
	/** 댓글 내용 */
	private String content;
	/** 댓글 작성자 이름*/
	private String userName;
	/** 댓글 작성 시간*/
	private String createdAt;
	/** 댓글 추천수 */
	private int recommendCount;
	
	public Comment(int postId, int commentId, String content, String userName, 
			String createdAt, int recommendedCount) {
		this.postId = postId;
		this.commentId = commentId;
		this.content = content;
		this.userName = userName;
		this.createdAt = createdAt;
		this.recommendCount = recommendedCount;
	}
	
	public int getPostId() {
		return this.postId;
	}
	
	public int getCommentId() {
		return this.commentId;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
	
	public int getRecommendCount() {
		return this.recommendCount;
	}
	
	/** 댓글 추천수 증가 */
	public void increaseRecommendCount() {
		this.recommendCount++;
	}
}
