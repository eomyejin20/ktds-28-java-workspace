package workflow;

public class MethodQuiz2 {
//	17. 정수형 배열 변수 1개를 파라미터로 받아, 모든 값들을 배수로 만드는(반환X) 메소드.
	public static void arrMul(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
	}
	
//	16. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복되지 않는 값만 출력하는 메소드.
	public static void printNotDupl(int[] arr1, int[] arr2) {
		System.out.print("16번 정답: ");
		boolean isNull = true;
		
		// 첫 번째 배열 값을 비교
		for (int i = 0; i < arr1.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < arr2.length; j++) {
				if ( arr1[i] == arr2[j] ) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr1[i] + " ");
				isNull = false;
			}
		}
		
		// 두 번째 배열 값을 비교
		for (int i = 0; i < arr2.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < arr1.length; j++) {
				if ( arr2[i] == arr1[j] ) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr2[i] + " ");
				isNull = false;
			} 
		}
		
		if (isNull) {
			System.out.print("\"\"");
		}
		
		System.out.println();
	}
	
	
//	15. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복값만 출력하는 메소드.
	public static void printDupl(int[] arr1, int[] arr2) {
		System.out.print("15번 정답: ");
		boolean isNull = true;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if ( arr1[i] == arr2[j] ) {
					System.out.print(arr1[i]+ " ");
					isNull = false;
					break;
				}
			}
		}
		if (isNull) {
			System.out.print("\"\"");
		}
		System.out.println();
	}
	
	
//	14. 정수형 배열 변수 1개를 파라미터로 받아, 가장 처음 나오는 3의 배수만 반환하는 메소드
	public static int mulOfThree(int[] arr) {
		int result = -1;
		for (int i = 0; i < arr.length; i++) {
			if( arr[i] != 0 && arr[i] % 3 == 0 ) {
				result = arr[i];
				break;
			}
		}
		return result;
	}
	
//	13. 정수형 배열 변수 1개와 정수형 변수 1개를 파라미터로 받아, 해당 배열의 정수형변수 인덱스에 의 값을 반환하는 메소드.
	public static int returnIndex(int[] arr, int num) {
		if ( num < 0 || num >= arr.length ) {
			return 0;
		} else return arr[num];
	}
	
//	12. 정수형 변수 1개를 파라미터로 받아, 4부터 정수형 변수까지의 범위 중 소수(Prime Number)만 출력하는 메소드.
	public static void primeNum(int num) {
		System.out.print("12번 정답: ");
		for (int i = 4; i < num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if ( i % j == 0 ) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i +" ");
			}
		}
		System.out.println();
	}
	
//	11. 정수형 변수 1개를 파라미터로 받아, 해당 정수의 구구단을 출력하는 메소드.
	public static void multiplication(int num) {
		System.out.println("11번 정답: ");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}
	
//	10. 문자열 1개와 정수형 변수 1개를 파라미터로 받아, 문자열을 정수형 변수만큼 반복 출력하는 메소드.
	public static void repeat(String str, int num) {
		System.out.println("10번 정답: ");
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
	
//	9. 정수 배열을 파라미터로 받아, 2,5,8 배수인 숫자만 출력하는 메소드.
	public static void printArr(int[] arr) {
		System.out.print("9번 정답: ");
		for (int i = 0;  i < arr.length; i++) {
			if(arr[i] % 2 == 0 || arr[i] % 5 == 0 || arr[i] % 8 == 0) {
				System.out.print(arr[i]+ " ");
			}
		}
		System.out.println();
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
	
//	6. 실수형 변수 1개와 정수형 파라미터 1개를 받아 소수점 이하 자리수를 변경하여 반환하는 메소드.
	public static double shiftMethod(double d_num, int num) {
		// 10.3333333 2면 두 자릿수까지
		// 1033.xxxx
		int multi = 1;
		for (int i = 0; i < num; i++) {
			multi *= 10;
		}
		d_num *= multi; //1033.xxxx
		
		double result = (int) d_num; // 1033
		// System.out.println(result);
		result /= multi;
		// System.out.println(result);
		return result;
		
	}
	
//	5. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 반환하는 메소드.
	public static double div2(int num1, int num2) {
		double fNum = (double) num1 / num2;
		return fNum;
	}
	
//	4. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 출력하는 메소드.
	public static void div(int num1, int num2) {
		float fNum = (float) num1 / num2;
		System.out.print("4번 정답: ");
		System.out.println(fNum);
	}
	
//	3. 정수형 변수 3개를 파라미터로 받아, 합계를 반환하는 메소드.
	public static int add(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	
//	2. 정수형 변수 2개를 파라미터로 받아, 합계를 출력하는 메소드.
	public static void add(int num1, int num2) {
		System.out.print("2번 정답: ");
		System.out.println(num1 + num2);
	}
	
//	1. 정수형 변수 2개를 파라미터로 받아, 값을 출력하는 메소드.
	public static void print(int num1, int num2) {
		System.out.print("1번 정답: ");
		System.out.print(num1 + " ");
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
		int addResult = add(32, 5, 78);
		System.out.print("3번 정답: ");
		System.out.println(addResult);

//		4. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 출력하는 메소드.
		div(25, 10);
//
//		5. 정수형 변수 2개를 파라미터로 받아, 나누기의 결과(실수)를 반환하는 메소드.
		double fNum = div2(25, 10);
		System.out.print("5번 정답: ");
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
		double d_num = shiftMethod(10.3333333, 2);
		System.out.print("6번 정답: ");
		System.out.println(d_num);
//
//		7. 실수형 변수 2개를 파라미터로 받아, 가장 큰 수만 반환하는 메소드.
		double maxNum = max(9.53213, 74.2421);
		System.out.print("7번 정답: ");
		System.out.println(maxNum);
//
//		8. 실수형 변수 4개를 파라미터로 받아, 가장 작은 수만 반환하는 메소드.
		double minNum = min(2.588, 1.862, 9.1654, 12.5412);
		System.out.print("8번 정답: ");
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
		repeat("출력하세요", 3);
//
//		11. 정수형 변수 1개를 파라미터로 받아, 해당 정수의 구구단을 출력하는 메소드.
		multiplication(5);
//
//		12. 정수형 변수 1개를 파라미터로 받아, 4부터 정수형 변수까지의 범위 중 소수(Prime Number)만 출력하는 메소드.
		primeNum(99);
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
		int[] arr2 = new int[5];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i;
		}
		
		int arrResult  = returnIndex(arr2, 3);
		System.out.print("13번 정답: ");
		System.out.println(arrResult);
//
//		14. 정수형 배열 변수 1개를 파라미터로 받아, 가장 처음 나오는 3의 배수만 반환하는 메소드   
//
//		    - 정수형 배열 변수내부에 3의 배수가 없을 경우 -1 을 반환.
		int[] arr3 = new int[100];
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i;
		}
		
		int result = mulOfThree(arr3); 
		System.out.print("14번 정답: ");
		System.out.println(result);
		
//
//		15. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복값만 출력하는 메소드.
//
//		    -> 예> 중복([1,2,3,4,5], [9,7,454,1,2,3]) ==> 1 2 3
//
//		    -> 예> 중복([1,2,3,4,5], [1,2,3,4,5]) ==> ""
		int[] arrDupl1 = new int[100];
		int[] arrDupl2 = new int[100];
		
		for (int i = 0; i < arrDupl1.length; i++) {
			arrDupl1[i] = i*2;
			arrDupl2[i] = i*3;
		}
		
		printDupl(arrDupl1, arrDupl2);
//
//		16. 정수형 배열 변수 2개를 파라미터로 받아, 각 배열에 중복되지 않는 값만 출력하는 메소드.
//
//		    -> 예> 고유([1,2,3,4,5], [9,7,454,1,2,3]) ==> 4, 5, 9. 7, 454
//
//		    -> 예> 고유([1,2,3,4,5], [1,2,3,4,5]) ==> ""
		
		printNotDupl(arrDupl1, arrDupl2);
		
//		17. 정수형 배열 변수 1개를 파라미터로 받아, 모든 값들을 배수로 만드는(반환X) 메소드.
//
//		    -> 호출 이후에 main 메소드 내부에서 배열 내부의 값들을 모두 출력.
		int[] arr4 = new int[10];
		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = i;
		}
		arrMul(arr4);
		
		System.out.print("17번 정답: ");
		for(int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
	}
}
