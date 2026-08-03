package com.ktdsuniversity.edu.oop.postSystem;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		PostSystem community = new Community(keyboard);
		
		int choose;
		int postId = -1;
		int commentId = -1;
		boolean isFinish = false;
		
		while (!isFinish) {
			System.out.println();
			System.out.println("=========게시판 시스템을 시작합니다.=========");
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
			
			// 입력값 예외처리
			try {
				choose = Integer.parseInt(keyboard.nextLine().trim());
			} catch (NumberFormatException nfe) {
				System.out.println("숫자로 다시 입력해주세요.");
				continue;
			}
			
			if (choose == 1) {
				community.createPost();
			} else if(choose == 2) {
				community.getAllPost();
			} else if(choose == 3) {
				System.out.print("게시글 번호를 입력하세요: ");
				try {
					postId = Integer.parseInt(keyboard.nextLine().trim());
				} catch (NumberFormatException nfe){
					System.out.println("숫자로 다시 입력해주세요.");
					continue;
				}
				community.getPost(postId);
			} else if(choose == 4) {
				System.out.print("게시글 번호를 입력하세요: ");
				try {
					postId = Integer.parseInt(keyboard.nextLine().trim());
				} catch (NumberFormatException nfe){
					System.out.println("숫자로 다시 입력해주세요.");
					continue;
				}
				community.updatePost(postId);
			} else if(choose == 5) {
				System.out.print("게시글 번호를 입력하세요: ");
				try {
					postId = Integer.parseInt(keyboard.nextLine().trim());
				} catch (NumberFormatException nfe){
					System.out.println("숫자로 다시 입력해주세요.");
					continue;
				}
				community.deletePost(postId);
			} else if(choose == 6) {
				community.getPostCount();
			} else if(choose == 7) {
				System.out.print("게시글 번호를 입력하세요: ");
				try {
					postId = Integer.parseInt(keyboard.nextLine().trim());
				} catch (NumberFormatException nfe){
					System.out.println("숫자로 다시 입력해주세요.");
					continue;
				}
				community.createComment(postId);
			} else if(choose == 8) {
				System.out.println("게시글 번호와 댓글 번호를 입력하세요.");
				try {
					postId = Integer.parseInt(keyboard.nextLine().trim());
					commentId = Integer.parseInt(keyboard.nextLine().trim());
				} catch (NumberFormatException nfe){
					System.out.println("숫자로 다시 입력해주세요.");
					continue;
				}
				community.deleteComment(postId, commentId);
			} else if(choose == 9) {
				System.out.println("게시글 번호와 댓글 번호를 입력하세요.");
				try {
					postId = Integer.parseInt(keyboard.nextLine().trim());
					commentId = Integer.parseInt(keyboard.nextLine().trim());
				} catch (NumberFormatException nfe){
					System.out.println("숫자로 다시 입력해주세요.");
					continue;
				}
				community.recommendComment(postId, commentId);
			} else if(choose == 10) {
				System.out.print("검색어를 입력하세요: ");
				
				String keyword = null;
				try {
					keyword= keyboard.nextLine().trim();
				} catch (NumberFormatException nfe) {
					System.out.println("다시 입력해주세요.");
				}
				community.searchPost(keyword);
			} else if(choose == 11) {
				community.deleteAllPost();
			} else if(choose == 12) {
				System.out.print("게시글 번호를 입력하세요: ");
				try {
					postId = Integer.parseInt(keyboard.nextLine().trim());
				} catch (NumberFormatException nfe){
					System.out.println("숫자로 다시 입력해주세요.");
					continue;
				}
				community.deleteAllComment(postId);
			} else {
				isFinish = true; // 종료
				System.out.println("종료되었습니다.");
			}
			
			
			
			
		}
	}
		
}
