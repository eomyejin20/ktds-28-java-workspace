package oop;

import java.util.Random;
/**
 * 인형뽑기 게임
 */
public class CraneGameMachine {

	/**
	 * 동전을 넣었는지 확인
	 */
	boolean isInsertCoin; // 기본값 false
	
	/**
	 * 인형의 개수
	 */
	int dolls;
	
	/**
	 * 동전을 넣음
	 */
	public void isInsertCoin() {
		if (dolls <= 0) {
			isInsertCoin = false;
		}
		else isInsertCoin  = true;
		
	}
	/**
	 * 인형뽑기 게임
	 * @return 뽑으면 1, 뽑지못하면 0
	 */
	public int doGame() {
		int result =-1;
		if(isInsertCoin) {
			// Random 클래스
			Random random  = new Random();
			// random.nextType(0~bound)
			result = (int) random.nextInt(2); //0에서 bound - 1까지의 범위를 지정
			if (result == 1) {;
			dolls--;
			}
			isInsertCoin = false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		CraneGameMachine cgm = new CraneGameMachine();
		// cgm.isInsertCoin = false;
		cgm.dolls = 10;

		while (cgm.dolls > 0) {
			cgm.isInsertCoin();
			int result = cgm.doGame();
			System.out.println("남은 인형개수: " + cgm.dolls);
			System.out.println("뽑은 인형개수: " + result);
			System.out.println();
		}
	}

}
