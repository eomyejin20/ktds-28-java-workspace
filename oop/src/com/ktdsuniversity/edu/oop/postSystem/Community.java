package com.ktdsuniversity.edu.oop.postSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.oop.postSystem.datas.Comment;
import com.ktdsuniversity.edu.oop.postSystem.datas.Post;

public class Community implements PostSystem{
	List<Post> posts = new ArrayList();
	List<Comment> comments = new ArrayList();

	@Override
	public void createPost() {
		Scanner keyboard = new Scanner(System.in);
		
		// 게시글 제목
		String postTitle = keyboard.nextLine();
		
		// 게시글 작성자(Scanner)
		String postUser = keyboard.nextLine();
		
		// 게시글 작성시간(Scanner)
		String createdAt = keyboard.nextLine();
		
		// 게시글 내용
		String content = keyboard.nextLine();
		
		// 리스트에 추가
		this.posts.add( new Post(postTitle, postUser, createdAt, content, 0) );
		
	}

	@Override
	public void getAllPost() {
		for (int i = 0; i < this.posts.size(); i++) {
			Post post = this.posts.get(i);
			int commentCount = this.posts.get(i).getComments().size();
			System.out.println((i+1) + ". " + post.getPostTitle() 
			+ " (" + commentCount + ")");
		}
	}

	@Override
	public void getPost(int postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePost(int postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePost(int postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPostCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createComment(int postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(int postId, int commentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recommendComment(int postId, int commentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchPost(String keyword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllPost() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllComment(int postId) {
		// TODO Auto-generated method stub
		
	}

}
