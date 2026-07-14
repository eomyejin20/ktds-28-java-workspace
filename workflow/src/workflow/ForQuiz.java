package workflow;

public class ForQuiz {
	public static void main(String[] args) {
		
		// 1번 문제. 1부터 100까지의 합
		int result1 = 0; 
		
		for (int i = 1; i <= 100; i++) {
			result1 += i;
		}
		System.out.println(result1);
		
		
		//2번 문제
		int result2 = 0;
		for (int j = 1; j <= 100; j += 2) {
			result2 += j;
		}
		System.out.println(result2);
		
		//3번 문제
		int result3 = 0;
		for (int k = 1; k <= 100; k++) {
			if (k % 3 == 0 && k % 5 == 0 && k % 6 == 0) {
				result3 += k;
			}
		}
		System.out.println(result3);
		
		//4번 문제
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */
		for (int l = 0; l < 5; l++) {
			for(int m = 0; m <= l; m++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
	}

}
