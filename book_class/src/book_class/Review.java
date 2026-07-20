package book_class;

public class Review {

	/**
	 * 리뷰의 고유 값
	 */
	int reviewId;
	
	/**
	 * 사용자 아이디
	 */
	String userId;
	
	/**
	 * 리뷰 내용
	 */
	String content;
	
	/**
	 * 리뷰 작성날짜
	 */
	int createdDate;
	
	/**
	 * 좋아요 고유 값
	 */
	int liked_id;
	
	/**
	 * 좋아요 여부
	 */
	boolean isLike;
	
	/**
	 * 댓글 고유 값
	 */
	int commentId;
	
	/**
	 * 댓글 내용
	 */
	String commentContent;
	
	/**
	 * 1 ~ 4 평점 (실수)
	 */
	float rating;
}
