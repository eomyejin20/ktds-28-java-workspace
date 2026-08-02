package com.ktdsuniversity.edu.oop.postSystem;

/**
 * 게시판 기능을 명시한 인터페이스
 */
public interface PostSystem {

	/** 게시글 작성하기 */
	void createPost();
	
	/** 모든 게시글 출력하기 */
	void getAllPost();
	
	/**
	 * 게시글 번호로 게시글 정보 출력하기
	 * @param postId 출력하려는 게시글 번호
	 */
	void getPost(int postId);
	
	/**
	 * 게시글 수정하기
	 * @param postId 수정하려는 게시글 번호
	 */
	void updatePost(int postId);
	
	/**
	 * 게시글 번호로 게시글 삭제 하기
	 * @param postId 수정하려는 게시글 번호
	 */
	void deletePost(int postId);
	
	/** 게시판에 등록된 게시글의 개수 출력하기 */
	void getPostCount();
	
	/**
	 * 게시글 번호로 게시글에 댓글 작성하기
	 * @param postId 게시글 번호
	 */
	void createComment(int postId);
	
	/**
	 * 게시글에 등록된 댓글 삭제하기
	 * @param postId 삭제하려는 댓글이 있는 게시글 번호
	 * @param commentId 삭제하려는 댓글 번호
	 */
	void deleteComment(int postId, int commentId);
	
	/**
	 * 게시글에 등록된 댓글 하나 추천하기
	 * @param postId 추천하려는 댓글이 있는 게시글 번호
	 * @param commentId 추천하려는 댓글 번호
	 */
	void recommendComment(int postId, int commentId);
	
	/**
	 * 게시글 제목으로 검색하기
	 * @param keyword 검색어
	 */
	void searchPost(String keyword);
	
	/** 게시글 목록 전체 삭제하기 */
	void deleteAllPost();
	
	/**
	 * 원하는 게시글의 모든 댓글 삭제하기
	 * @param postId 게시글 번호
	 */
	void deleteAllComment(int postId);
}
