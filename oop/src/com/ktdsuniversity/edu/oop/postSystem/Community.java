package com.ktdsuniversity.edu.oop.postSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.oop.postSystem.datas.Comment;
import com.ktdsuniversity.edu.oop.postSystem.datas.Post;
import com.ktdsuniversity.edu.oop.postSystem.exceptions.ArticleException;
import com.ktdsuniversity.edu.oop.postSystem.exceptions.ArticleWriterException;

/**
 * PostSystem을 구현한 클래스
 */
public class Community implements PostSystem{
	private List<Post> posts;
	private List<Comment> comments;
	private Scanner keyboard;
	
	// 생성자에서 초기화
	public Community(Scanner keyboard) {
		this.keyboard = keyboard;
		this.posts = new ArrayList<>();
		this.comments = new ArrayList<>();
	}
	
	/**
	 * 1. 게시글 작성하기
	 */
	@Override
	public void createPost() {
		int postId = this.posts.size() + 1;
				
		// 게시글 제목
		System.out.println("게시글의 제목을 입력하세요.");
		String postTitle = this.keyboard.nextLine().trim();
		if (postTitle.isBlank() || postTitle.length() > 30) {
			throw new ArticleException("게시글 제목은 30글자 내로 작성해야 합니다.");
		}
		
		// 게시글 작성자(Scanner)
		System.out.println("작성자를 입력하세요.");
		String postUser = this.keyboard.nextLine().trim();
		if(postUser.isBlank()) {
			throw new ArticleWriterException("게시글 작성자 이름은 필수로 입력해야 합니다.");
		}
		
		// 게시글 작성시간(Scanner)
		System.out.println("작성 날짜와 시간을 입력하세요.");
		String createdAt = this.keyboard.nextLine().trim();
		
		// 게시글 내용
		System.out.println("게시글 내용을 입력하세요.");
		String content = this.keyboard.nextLine().trim();
		
		// 리스트에 추가
		Post newPost = new Post(postId, postTitle, postUser, createdAt, content, 0);
		this.posts.add(newPost);
		
		System.out.println("게시글 작성이 완료되었습니다.");
	}

	/**
	 * 2. 모든 게시글 출력하기
	 */
	@Override
	public void getAllPost() {
		if ( this.posts.size() == 0) {
			System.out.println("아직 등록된 게시글이 없습니다.");
			return;
		}
		
		System.out.println("조회된 게시글입니다.");
		
		for (int i = 0; i < this.posts.size(); i++) {
			Post post = this.posts.get(i);
			
			// 모든 게시글의 조회수 증가
			post.increaseViewCount();
			
			int commentCount = this.findComments(post.getPostId()).size();
			System.out.println( post.getPostId() + ". " + post.getPostTitle() 
			+ " (" + commentCount + ")");
		}
	}

	/**
	 * 3. 게시글 번호로 게시글 정보 출력하기
	 */
	@Override
	public void getPost(int postId) {
		Post getPost = this.findPost(postId);

		if (getPost == null) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		
		// 조회수 증가
		getPost.increaseViewCount();
		
		System.out.println("조회된 게시글입니다.");
		System.out.println("게시글 번호: " + postId);
		System.out.println("게시글 제목: " + getPost.getPostTitle());
		System.out.println("게시글 작성자: " + getPost.getPostUser());
		System.out.println("게시글 작성일: " + getPost.getCreatedAt());
		System.out.println("게시글 내용: " + getPost.getContent());
		System.out.println("게시글 조회수: " + getPost.getViewCount());
		
		List<Comment> postComments = this.findComments(postId);
		if (postComments.size() == 0) {
			System.out.println("등록된 댓글이 없습니다.");
		} else {
			for (int i = 0; i < postComments.size(); i++) {
				Comment comment = postComments.get(i);
				
				System.out.println("게시글 " +comment.getPostId() + "의 댓글 목록입니다.");
				System.out.println("댓글 내용: " + comment.getContent());
				System.out.println("댓글 작성자: " + comment.getUserName());
				System.out.println("댓글 작성일: " + comment.getCreatedAt());
				System.out.println("댓글 추천수: " + comment.getRecommendCount());
			}
		}
	}

	/**
	 * 4. 게시글 수정하기
	 */
	@Override
	public void updatePost(int postId) {
		Post getPost = this.findPost(postId);

		if (getPost == null) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		
		System.out.println("수정할 제목을 입력하세요.");
		String newTitle = this.keyboard.nextLine().trim();
		if (newTitle.isBlank() || newTitle.length() > 30) {
			throw new ArticleException("게시글 제목은 30글자 내로 작성해야 합니다.");
		}

		System.out.println("수정할 내용을 입력하세요. ");
		String newContent = this.keyboard.nextLine().trim();

		getPost.setPostTtile(newTitle);
		getPost.setPostContent(newContent);
		
		System.out.println("게시글이 수정되었습니다.");
	}

	/**
	 * 5. 게시글 번호로 게시글 삭제하기
	 */
	@Override
	public void deletePost(int postId) {
		Post getPost = this.findPost(postId);

		if (getPost == null) {
			System.out.println("잘못된 게시글 번호입니다.");
			return;
		}
		
//		// 해당 게시글의 댓글 삭제
//		for (int i = this.comments.size() -1; i >= 0 ; i--) {
//			if (this.comments.get(i).getPostId() == postId) {
//				this.comments.remove(i);
//			}
//		}

		this.deleteAllComment(postId);
		this.posts.remove(getPost);
		
		// postId set
		for (Post post : this.posts) {
			if (post.getPostId() > postId) {
				post.setPostId(post.getPostId() - 1);
			}
		}
		
		// comment에서도 postId set
		for (Comment comment : this.comments) {
			if (comment.getPostId() > postId) {
				comment.setPostId(comment.getPostId() - 1);
			}
		}
		
		System.out.println("게시글이 삭제되었습니다.");
	}

	/**
	 * 6. 게시판에 등록된 게시글의 개수 출력하기
	 */
	@Override
	public void getPostCount() {
		if (this.posts.size() == 0) {
			System.out.println("등록된 게시글이 없습니다");
			return;
		}
		System.out.println(this.posts.size() + "개의 게시글이 등록되었습니다.");
	}

	/**
	 * 7. 게시글의 번호를 이용해 게시글에 댓글 작성하기
	 */
	@Override
	public void createComment(int postId) {
//		Post getPost = this.findPost(postId);

		if (this.findPost(postId) == null) {
			System.out.println("잘못된 게시글 번호입니다");
			return;
		}
		
		List<Comment> postComments = this.findComments(postId);
		if (postComments.size() >= 10) {
			System.out.println("댓글을 더 이상 등록할 수 없습니다.");
			return;
		}
		
		int commentId = postComments.size() + 1;

		System.out.println("댓글 내용을 입력하세요.");
		String content = this.keyboard.nextLine().trim();

		System.out.println("댓글 작성자를 입력하세요. ");
		String userName = this.keyboard.nextLine().trim();

		System.out.print("댓글 작성 날짜를 입력하세요.");
		String createdAt = this.keyboard.nextLine().trim();

		Comment newComment = new Comment(postId, commentId, content, userName, createdAt, 0);
		this.comments.add(newComment);
		
		System.out.println("댓글이 등록되었습니다.");
	}

	/**
	 * 8. 게시글에 등록된 댓글 삭제하기
	 */
	@Override
	public void deleteComment(int postId, int commentId) {
		if (this.findPost(postId) == null) {
			System.out.println("잘못된 게시글 번호입니다");
			return;
		}

		Comment getComment = this.findComment(postId, commentId);
		if (getComment == null) {
			System.out.println("잘못된 댓글 번호입니다");
			return;
		}

		this.comments.remove(getComment);
		
		for (Comment comment : this.comments) {
			if (comment.getPostId() == postId && comment.getCommentId() > commentId) {
				comment.setCommentId(comment.getCommentId() - 1);
			}
		}
		System.out.println("댓글이 삭제되었습니다.");
	}

	/**
	 * 9. 게시글에 등록된 댓글 하나 추천하기
	 */
	@Override
	public void recommendComment(int postId, int commentId) {
		if (this.findPost(postId) == null) {
			System.out.println("잘못된 게시글 번호입니다");
			return;
		}
		
		Comment comment = this.findComment(postId, commentId);
		if (comment == null) {
			System.out.println("잘못된 댓글 번호입니다");
			return;
		}

		comment.increaseRecommendCount();
		System.out.println("댓글이 추천되었습니다.");
		
	}

	/**
	 * 10. 게시글 제목으로 검색하기
	 */
	@Override
	public void searchPost(String keyword) {
		boolean isFind = false;
		
		for (Post post : this.posts) {
			if (post.getPostTitle().contains(keyword)) {
				getPost(post.getPostId());
				isFind = true;
			}
		} 
		
		if (!isFind) {
			System.out.println("검색된 게시글이 없습니다.");
		}
		
	}

	/**
	 * 11. 게시글 목록 전체 삭제하기
	 */
	@Override
	public void deleteAllPost() {
		if (this.posts.size() == 0) {
			System.out.println("제거할 게시글이 없습니다.");
		}
		
		int count = posts.size();
		
		this.comments.clear();
		this.posts.clear();
		System.out.println(count + "개의 게시글을 삭제했습니다.");
	}

	/**
	 * 12. 원하는 게시글의 모든 댓글 삭제하기
	 */
	@Override
	public void deleteAllComment(int postId) {
		if (this.findPost(postId) == null) {
			System.out.println("잘못된 게시글 번호입니다");
			return;
		}
		
		List<Comment> postComments = this.findComments(postId);
		if (postComments.size() == 0) {
			System.out.println("등록된 댓글이 없습니다");
			return;
		}
		
		int count = postComments.size();
		
		for (int i = this.comments.size() -1; i >= 0 ; i--) {
			if (this.comments.get(i).getPostId() == postId) {
				this.comments.remove(i);
			}
		}
		System.out.println(count + "개의 댓글을 삭제했습니다");
		
	}
	
	/**
	 * 해당 게시글 가져오기
	 * @param postId
	 * @return 게시글
	 */
	public Post findPost(int postId) {
		for (Post post : this.posts) {
			if (post.getPostId() == postId) {
				return post;
			}
		}
		return null;
	}
	
	/**
	 * 해당 게시글의 댓글 가져오기
	 * @param postId
	 * @param commentId
	 * @return 댓글
	 */
	public Comment findComment(int postId, int commentId) {
		for (Comment comment : this.comments) {
			if (comment.getPostId() == postId && comment.getCommentId() == commentId) {
				return comment;
			}
		}
		return null;
	}
	
	/**
	 * 해당 게시글의 모든 댓글 목록 가져오기
	 * @param postId
	 * @return 댓글 목록
	 */
	public List<Comment> findComments(int postId) {
		List<Comment> postComments = new ArrayList<>();
		for (Comment comment : this.comments) {
			if (comment.getPostId() == postId) {
				postComments.add(comment);
			}
		}
		return postComments;
	}

}
