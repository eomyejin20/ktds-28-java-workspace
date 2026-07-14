package workflow;

import java.util.Scanner;

public class Battle {
	public static void main(String[] args) {
		/*
		 * BOSS 와 Player가 전투를 합니다.
		 * 
		 * BOSS의 체력과 Player의 체력중 하나라도 0이하가 된다면 게임은 종료됩니다.
		 * BOSS가 Player에게 공격을 합니다.(데미지는 랜덤한 정수 값)
		 * Player가 BOSS에게 공격을 합니다.(데미지는 랜덤한 정수 값)
		 * 
		 * 공격이 끝난 이후 서로의 체력을 출력합니다.
		 */
		
		/*
		int bossDemage;
		int playerDemage;
		int playerHP = 1000;
		int bossHP = 1000;
	
		double randomNumber = Math.random();
		double randomNumber2 = Math.random();
		System.out.println("전투를 시작합니다.");
		
		while(playerHP > 0 && bossHP > 0) {
			bossDemage = (int) (randomNumber * 100);
			playerDemage = (int) (randomNumber2 * 100);
			bossHP -= bossDemage;
			playerHP -= playerDemage;
			
		}
		
		System.out.println("BOSS 체력: " + bossHP + "Player 체력 " + playerHP);
		*/
		
		int bossHitPoint = 1_000;
		int playerHitPoint = 800;
		
	
		while(bossHitPoint > 0 && playerHitPoint > 0) {
			double randomDamage = Math.random() ;
			int bossDamage = (int) (randomDamage * 200);
			playerHitPoint -=bossDamage;
			
			randomDamage = Math.random();
			int playerDamage = (int) (randomDamage *250);
			bossHitPoint -= playerDamage;
			
			
		}
		System.out.println("Player의 체력");
		System.out.println(playerHitPoint);
		
		System.out.println("BOSS의 체력");
		System.out.println(bossHitPoint);
		
		
	}

}
