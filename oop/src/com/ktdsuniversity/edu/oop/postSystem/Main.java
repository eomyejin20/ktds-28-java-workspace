package com.ktdsuniversity.edu.oop.postSystem;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		PostSystem community = new Community(keyboard);
		
		while (true) {
			System.out.println("게시판 시스템을 시작합니다.");
			System.out.println("원하는 기능의 숫자를 입력하세요.");
			System.out.println("1. 게시글 작성하기");
			System.out.println("2. 모든 게시글 조회하기");
			System.out.println("3. 게시글 조회하기");
			System.out.println("4. 게시글 수정하기");
			System.out.println("5. 게시글 삭제하기");
			System.out.println("6. 게시글 개수 조회하기");
			System.out.println("7. 게시글의 댓글 작성하기");
			System.out.println("8. 게시글의 댓글 삭제하기");
			System.out.println("9. 댓글 추천하기");
			System.out.println("10. 게시글 제목으로 검색하기");
			System.out.println("11. 게시글 모두 삭제하기");
			System.out.println("12. 게시글의 댓글 모두 삭제하기");
			
			int choose;
			
			// 입력값 예외처리
			try {
				choose = Integer.parseInt(keyboard.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("숫자로 다시 입력해주세요.");
				continue;
			}
			
			int postId = -1;
			int commentId = -1;
			
			switch (choose) {
			case 1:
				community.createPost();
				break;

			case 2:
				community.getAllPost();
				break;

			case 3:
				System.out.print("게시글 번호를 입력하세요: ");
				postId = Integer.parseInt(keyboard.nextLine().trim());
				community.getPost(postId);
				break;

			case 4:
				System.out.print("게시글 번호를 입력하세요: ");
				postId = Integer.parseInt(keyboard.nextLine().trim());
				community.updatePost(postId);
				break;

			case 5:
				System.out.print("게시글 번호를 입력하세요: ");
				postId = Integer.parseInt(keyboard.nextLine().trim());
				community.deletePost(postId);
				break;

			case 6:
				community.getPostCount();
				break;

			case 7:
				System.out.print("게시글 번호를 입력하세요: ");
				postId = Integer.parseInt(keyboard.nextLine().trim());
				community.createComment(postId);
				break;

			case 8:
				System.out.print("게시글 번호를 입력하세요: ");
				postId = Integer.parseInt(keyboard.nextLine().trim());
				System.out.print("댓글 번호를 입력하세요: ");
				commentId = Integer.parseInt(keyboard.nextLine().trim());
				community.deleteComment(postId, commentId);
				break;

			case 9:
				System.out.print("게시글 번호를 입력하세요: ");
				postId = Integer.parseInt(keyboard.nextLine().trim());
				System.out.print("댓글 번호를 입력하세요: ");
				commentId = Integer.parseInt(keyboard.nextLine().trim());
				community.recommendComment(postId, commentId);
				break;

			case 10:
				System.out.print("검색어를 입력하세요: ");
				String keyword = keyboard.nextLine().trim();
				community.searchPost(keyword);
				break;

			case 11:
				community.deleteAllPost();
				break;

			case 12:
				System.out.print("게시글 번호를 입력하세요: ");
				postId = Integer.parseInt(keyboard.nextLine().trim());
				community.deleteAllComment(postId);
				break;
			}
		}
	}
		
}
