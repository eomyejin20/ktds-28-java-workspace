package com.ktdsuniversity.edu.oop.postSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * 게시글 리스트
 */
public class Posts {
	
	List<Post> posts;
	
	public Posts(Post post) {
		this.posts = new ArrayList<>();
	}

}
