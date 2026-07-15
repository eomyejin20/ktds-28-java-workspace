

import java.util.Scanner;

public class DiceGame {
	
	public static void main(String[] args) {
		/*
		 * 주사위를 굴려 최종목적지에 먼저 도착하는 플레이어가 승리하는 게임
		 * 위치값을 가진 4명의 플레이어가 있습니다.
		 * 모든 플레이어들의 위치값은 0부터 시작합니다.
		 * 각 플레이어들은 주사위 두개를 굴려 나온 수 만큼 이동합니다.
		 * 도착지의 위치값은 127입니다.
		 * 
		 * ===주사위 규칙===
		 * 1.두 개의 주사위를 굴린 값이 3,7이라면 위치값은10만큼 증가합니다.
		 * 2. 두 주사위가 똑같은 숫자가 나온다면 주사위 합의 배수만큼 이동합니다.
		 * 		4, 4=> 8*2=>16
		 * 3.두 주사위 값의 합이 3의 배수일경우 위치값은 합의수만큼 감소합니다.
		 * 		4,5 =>9=>-9
		 * 
		 * 플레이어의 위치값은 0보다 작아질 수 없습니다.
		 * 		현재 위치값이 8이고 이동할 칸의 수가 -9라면 위치값은 0이 되어야합니다.
		 * 플레이어가 주사위를 굴릴때마다 주사위의 값, 이동할 칸의 수. 현재 위치값을 표시합니다.
		 */
		
		
		int finalGoal = 127;
		int playerA = 0;
		int playerB = 0;
		int playerC = 0;
		int playerD = 0;
		
		while (playerA < finalGoal && playerB < finalGoal && playerC < finalGoal && playerD < finalGoal) {
			
			double randomDice1 = Math.random() ;
			double randomDice2 = Math.random() ;
			
			// 주사위 굴리기
			int dice1 = (int) (randomDice1 * 10);
			int dice2 = (int) (randomDice2 * 10);
			
			//두 주사위 값의 합
			int distance = dice1 + dice2;
			
			// 주사위 규칙 조건문
			if (distance % 3 == 0) {
				 distance *= -1; 
			} 
			else if (dice1 == dice2) {
				distance *= 2;
			}
		
			//플레이어 이동
			playerA += distance;
			if (playerA < 0) {
				playerA = 0;
			}
			
			System.out.println("현재 플레이어는 플레이어는 A입니다."); 
			System.out.println("주사위의 값 " + dice1 + " " + dice2);
			System.out.println("이동할 칸의 수 " + distance);
			System.out.println("현재 위치값 " + playerA);
			
			/*=============================================================================*/
			
			randomDice1 = Math.random() ;
			randomDice2 = Math.random() ;
			
			// 주사위 굴리기
			dice1 = (int) (randomDice1 * 10);
			dice2 = (int) (randomDice2 * 10);
			
			//두 주사위 값의 합
			distance = dice1 + dice2;
			
			// 주사위 규칙 조건문
			if (distance % 3 == 0) {
				 distance *= -1; 
			} 
			else if (dice1 == dice2) {
				distance *= 2;
			}
		
			//플레이어 이동
			playerB += distance;
			if (playerB < 0) {
				playerB = 0;
			}
			
			System.out.println("현재 플레이어는 플레이어는 B입니다."); 
			System.out.println("주사위의 값 " + dice1 + " " + dice2);
			System.out.println("이동할 칸의 수 " + distance);
			System.out.println("현재 위치값 " + playerB);
			
			/*=============================================================================*/
			
			randomDice1 = Math.random() ;
			randomDice2 = Math.random() ;
			
			// 주사위 굴리기
			dice1 = (int) (randomDice1 * 10);
			dice2 = (int) (randomDice2 * 10);
			
			//두 주사위 값의 합
			distance = dice1 + dice2;
			
			// 주사위 규칙 조건문
			if (distance % 3 == 0) {
				 distance *= -1; 
			} 
			else if (dice1 == dice2) {
				distance *= 2;
			}
		
			//플레이어 이동
			playerC += distance;
			if (playerC < 0) {
				playerC = 0;
			}
			
			System.out.println("현재 플레이어는 플레이어는 C입니다."); 
			System.out.println("주사위의 값 " + dice1 + " " + dice2);
			System.out.println("이동할 칸의 수 " + distance);
			System.out.println("현재 위치값 " + playerC);
			
			/*=============================================================================*/
			
			randomDice1 = Math.random() ;
			randomDice2 = Math.random() ;
			
			// 주사위 굴리기
			dice1 = (int) (randomDice1 * 10);
			dice2 = (int) (randomDice2 * 10);
			
			//두 주사위 값의 합
			distance = dice1 + dice2;
			
			// 주사위 규칙 조건문
			if (distance % 3 == 0) {
				 distance *= -1; 
			} 
			else if (dice1 == dice2) {
				distance *= 2;
			}
		
			//플레이어 이동
			playerD += distance;
			if (playerD < 0) {
				playerD = 0;
			}
			
			System.out.println("현재 플레이어는 플레이어는 D입니다."); 
			System.out.println("주사위의 값 " + dice1 + " " + dice2);
			System.out.println("이동할 칸의 수 " + distance);
			System.out.println("현재 위치값 " + playerD);
			
		}
		
	}

}
