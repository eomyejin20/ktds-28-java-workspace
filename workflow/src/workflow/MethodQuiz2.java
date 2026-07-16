package workflow;

public class MethodQuiz2 {
	
//	9. 정수 배열을 파라미터로 받아, 2,5,8 배수인 숫자만 출력하는 메소드.
	public static void printArr(int[] arr) {
		for (int i = 0;  i < arr.length; i++) {
			if(arr[i] % 2 == 0 || arr[i] % 5 == 0 || arr[i] % 8 == 0)
			System.out.println(arr[i]);
		}
	}
	
	
	
//	8. 실수형 변수 4개를 파라미터로 받아, 가장 작은 수만 반환하는 메소드.
	public static double min(double num1, double num2, double num3, double num4) {
		double minNum = num1;
		
		if ( num1 < num2 ) {
			minNum = num1;
		}
		else minNum = num2;
		
		if ( num3 < minNum ) {
			minNum = num3;
		}
		if ( num4 < minNum ) {
			minNum = num4;
		}
		return minNum;
	}
	
//	7. 실수형 변수 2개를 파라미터로 받아, 가장 큰 수만 반환하는 메소드.
	public static double max(double num1, double num2) {
		double maxNum = num1;
		if ( num1 < num2 ) {
			maxNum = num2;
		}
		return maxNum;
	}
	
	/*
	public static double shift(int num1, double num2) {
		double fNum = 
		return fNum;
	}*/
	
//	4. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 출력하는 메소드.
	public static double div2(int num1, int num2) {
		double fNum = (double) num1 / num2;
		return fNum;
	}
	
//	4. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 출력하는 메소드.
	public static void div(int num1, int num2) {
		float fNum = (float) num1 / num2;
		System.out.println(fNum);
	}
	
//	3. 정수형 변수 3개를 파라미터로 받아, 합계를 반환하는 메소드.
	public static void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
//	2. 정수형 변수 2개를 파라미터로 받아, 합계를 출력하는 메소드.
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
//	1. 정수형 변수 2개를 파라미터로 받아, 값을 출력하는 메소드.
	public static void print(int num1, int num2) {
		System.out.println(num1);
		System.out.println(num2);
		
	}

	public static void main(String[] args) {
//		하나의 클래스에 아래 메소드를 모두 만들어 호출합니다.
//
//		작성한 자바 파일은 본인의 깃헙 레파지토리에 등록하고 주소를 댓글로 첨부하세요.
//
//		 
//
//		1. 정수형 변수 2개를 파라미터로 받아, 값을 출력하는 메소드.
		print(2, 5);
//
//		2. 정수형 변수 2개를 파라미터로 받아, 합계를 출력하는 메소드.
		add(90, 6);

//		3. 정수형 변수 3개를 파라미터로 받아, 합계를 반환하는 메소드.
		add(32, 5, 78);

//		4. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 출력하는 메소드.
		div(25, 10);
//
//		5. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 반환하는 메소드.
		double fNum = div2(25, 10);
		System.out.println(fNum);
//
//		6. 실수형 변수 1개와 정수형 파라미터 1개를 받아 소수점 이하 자리수를 변경하여 반환하는 메소드.
//
//		   -> 예> 소수점 변경(10.33333333, 2) ==> 10.33
//
//		   -> 예> 소수점 변경(10.33333333, 3) ==> 10.333
//
//		   -> 예> 소수점 변경(10.33333333, 1) ==> 10.3
//
//		   -> 예> 소수점 변경(10.33333333, 0) ==> 10.0
		//double sNum = shift(4, 3.2);
//
//		7. 실수형 변수 2개를 파라미터로 받아, 가장 큰 수만 반환하는 메소드.
		double maxNum = max(9.53213, 74.2421);
		System.out.println(maxNum);
//
//		8. 실수형 변수 4개를 파라미터로 받아, 가장 작은 수만 반환하는 메소드.
		double minNum = min(2.588, 1.862, 9.1654, 12.5412);
		System.out.println(minNum);
//
//		9. 정수 배열을 파라미터로 받아, 2,5,8 배수인 숫자만 출력하는 메소드.
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		printArr(arr); 
//
//		10. 문자열 1개와 정수형 변수 1개를 파라미터로 받아, 문자열을 정수형 변수만큼 반복 출력하는 메소드.
//
//		11. 정수형 변수 1개를 파라미터로 받아, 해당 정수의 구구단을 출력하는 메소드.
//
//		12. 정수형 변수 1개를 파라미터로 받아, 4부터 정수형 변수까지의 범위 중 소수(Prime Number)만 출력하는 메소드.
//
//		13. 정수형 배열 변수 1개와 정수형 변수 1개를 파라미터로 받아, 해당 배열의 정수형변수 인덱스에 의 값을 반환하는 메소드.
//
//		    -> 예> 값(길이가 5인 배열, 2) ==> 배열의 2번 인덱스의 값
//
//		    -> 예> 값(길이가 5인 배열, 4) ==> 배열의 4번 인덱스의 값
//
//		    -> 예> 값(길이가 5인 배열, 5) ==> 0
//
//		    -> 예> 값(길이가 5인 배열, -1) ==> 0
//
//		    -> 예> 값(길이가 5인 배열, 1) ==> 배열의 1번 인덱스의 값
//
//		    -> 예> 값(길이가 5인 배열, 0) ==> 배열의 0번 인덱스의 값
//
//		    -> 예> 값(길이가 5인 배열, 3) ==> 배열의 3번 인덱스의 값
//
//		    -> 예> 값(길이가 5인 배열, 7) ==> 0
//
//		14. 정수형 배열 변수 1개를 파라미터로 받아, 가장 처음 나오는 3의 배수만 반환하는 메소드   
//
//		    - 정수형 배열 변수내부에 3의 배수가 없을 경우 -1 을 반환.
//
//		15. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복값만 출력하는 메소드.
//
//		    -> 예> 중복([1,2,3,4,5], [9,7,454,1,2,3]) ==> 1 2 3
//
//		    -> 예> 중복([1,2,3,4,5], [1,2,3,4,5]) ==> ""
//
//		16. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복되지 않는 값만 출력하는 메소드.
//
//		    -> 예> 고유([1,2,3,4,5], [9,7,454,1,2,3]) ==> 4, 5, 9. 7, 454
//
//		    -> 예> 고유([1,2,3,4,5], [1,2,3,4,5]) ==> ""
//
//		17. 정수형 배열 변수 1개를 파라미터로 받아, 모든 값들을 배수로 만드는(반환X) 메소드.
//
//		    -> 호출 이후에 main 메소드 내부에서 배열 내부의 값들을 모두 출력.
	}
}
