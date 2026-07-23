package exam.string; 

import java.util.Scanner;

public class WordGame {
	
	public static void main(String[] args) {
		
		/*
		 * 방법1. String L = word.charAt() +" ";
		 * 방법2. word.split("")[]
		 * 방법3. toCharArray
		 * 방법4. substring()
		 */
		
		// "끝말잇기 게임 시작"을 출력
		System.out.println("끝말잇기 게임 시작");
		
		// 시작단어를 지정
		String startWord = "자전거";
		
		// 시작단어를 출력
		System.out.println(startWord);
		
		// 끝 단어를 잘라서 저장
		String finalWord = startWord.substring(startWord.length() -1);
		System.out.println(finalWord);
		
		
		//char[] nextWordArray = nextWord.toCharArray();
		int relayCount = 0;
		
		// Scanner 생성
		Scanner keyboard  = new Scanner(System.in);
		String nextWord = null;
		
		while(true) {
			// Scanner 생성 => 메모리누수 발생
//			Scanner keyboard  = new Scanner(System.in);
			// 이전단어의 마지막 글자로 시작하는 다음 단어 입력
			nextWord = keyboard.nextLine();
			
			// 좌우의 공백 제거
			nextWord = nextWord.trim();
			
			// 단어 사이에 공백 제거 => replace 
			
			if (nextWord.startsWith(finalWord)) {
				// 3글자 이상인가
				if (nextWord.length() >= 3) {
					// 입력단어 출력
					System.out.println(nextWord);
					finalWord = nextWord.substring(nextWord.length()-1);
					
				
				} else {
					break;
				}
				
			} else {
				break;
			}
			if (nextWord.startsWith(finalWord) && nextWord.length() >= 3)
			
			
			relayCount++;
		}
		
		System.out.println("이어나간 단어의 수: " + relayCount);
	}

}
