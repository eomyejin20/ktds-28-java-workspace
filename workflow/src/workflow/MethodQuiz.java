package workflow;

public class MethodQuiz {
	
	// 1. 정수 두 개를 받아서 사칙연산(+,-, X, /) 의 결과를 출력하는 메소드를 만들고 호출해보세요.
	public static void calculate(int num1, int num2) {
	
		int addResult = num1 + num2;
		int subResult = num1 - num2;
		int mulResult = num1 * num2;
		int divResult = num1 / num2;
		
		System.out.println(addResult);
		System.out.println(subResult);
		System.out.println(mulResult);
		System.out.println(divResult);
	}
	
	//	2. 정수 한 개를 받아서 짝수라면 true를, 홀수라면 false를 반환하는 메소드를 만들고 호출해보세요.
	public static void decideEven(int num3) {
		boolean isEvenNumber = false;
		
		if ( num3 % 2 == 0 ) {
			isEvenNumber = true;
		}
		
		System.out.println(isEvenNumber);
	}
	
	//	3. 정수 세 개를 받아서 가장 큰 수를 출력하는 메소드를 만들고 호출해보세요.
	public static void maxNumber(int num4, int num5, int num6) {
		int temp = 0;
		
		if ( num4 > num5 ) {
			temp = num4;
		} else temp = num5;
		
		if( temp < num6 ) {
			temp = num6;
		}
		System.out.println(temp);
	}
	
	//	4. 정수 한 개를 받아서 소수(prime number)라면 true를 아니라면 false를 반환하는 메소드를 만들고 호출해 보세요.
	public static void decidePrime(int num7) {
		boolean isPrimeNumber = true;
		for (int i = 2; i < num7; i++) {
			if (num7 % i == 0) {
				isPrimeNumber = false;
			}
		}
		System.out.println(isPrimeNumber);
	}
	
	// main 함수
	public static void main(String[] args) {
		
		calculate(10, 5);
		decideEven(7);
		maxNumber(90, 150, 30);
		decidePrime(17);
		
	}

}
