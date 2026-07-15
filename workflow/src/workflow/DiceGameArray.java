package workflow;

import java.util.Scanner;

public class DiceGameArray {
	
	public static boolean isNotArrive(int[] playerPosition) {
		final int FINAL_GOAL = 127;
		boolean isPlaying  = true;
		for (int i = 0; i < playerPosition.length; i++) {
			if( playerPosition[i] >= FINAL_GOAL) {
				isPlaying = false; 
				break;
			} 
		}
		return isPlaying;
	}
		
	
	public static int roleDice() {
		//주사위 두 개를 굴려 반환시키는 코드
		int dice1 = (int) (Math.random() * 10) + 1;
		int dice2 = (int) (Math.random() * 10) + 1;
		
		//두 주사위 값의 합
		int distance = dice1 + dice2;
		
		// 주사위 규칙 조건문
		if (distance % 3 == 0) {
			 distance *= -1; 
		} 
		else if (dice1 == dice2) {
			distance *= 2;
		}
		return distance;
	}
	
	public static void main(String[] args) {
		
		int[] playerPosition = new int[4];

		final int FINAL_GOAL = 127;
		
		int dice1 = 0;
		int dice2 = 0;
		int distance = 0;
		
		// 모든 플레이어가 127 미만의 위치에 있는가?
		boolean isPlaying = isNotArrive(playerPosition);
		
		while (isPlaying) {
			System.out.println(); // 빈 줄 출력
			
			// 배열에 있는 플레이어 모두가 한 번씩 주사위를 던져 이동한다.
			for ( int i = 0; i < playerPosition.length; i++) {
				
				/*주사위 굴리기 => method호출
				dice1 = (int) (Math.random() * 20) + 1;
				dice2 = (int) (Math.random() * 20) + 1;
				
				//두 주사위 값의 합
				distance = dice1 + dice2;
				
				// 주사위 규칙 조건문
				if (distance % 3 == 0) {
					 distance *= -1; 
				} 
				else if (dice1 == dice2) {
					distance *= 2;
				}
				*/
			
				distance = roleDice();
				distance += roleDice(); // 2번 굴린다. 
				
				//플레이어 이동
				playerPosition[i] += distance;
				if (playerPosition[i] < 0) {
					playerPosition[i] = 0;
				}
				
				System.out.println("현재 플레이어는 플레이어는 " + i + "입니다."); 
				System.out.println("주사위의 값 " + dice1 + " " + dice2);
				System.out.println("이동할 칸의 수 " + distance);
				System.out.println("현재 위치값 " + playerPosition[i]);
				
			}
			
			isPlaying = isNotArrive(playerPosition);
//			for (int i = 0; i < playerPosition.length; i++) {
//				if( playerPosition[i] >= FINAL_GOAL) {
//					isPlaying = false; 
//					break;
//				} 
//			}
		}
	}

}
