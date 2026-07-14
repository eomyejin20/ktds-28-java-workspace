package operations;

public class Operations {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num++); // 10; 10+1=11; 후수행
		System.out.println(++num); // 12; 선수행
		
		System.out.println(num--); // 12; 12-1=11
		System.out.println(--num); // 10
		
		int num3 = 3;
		int num4 = 5;
		
		//int operResult = num++ + num3 * num4; //25;  num++은 그 줄이 끝나고(;후) 동작
		int operResult = num++ + num3 * num4; //26
		System.out.println(operResult);
		
		
		/*
		// 나누기의 나머지를 구한다.
		int num1 = 10;
		int num2 = 3;
		
		int mod = num1 % num2;
		System.out.println(mod);
		
		/*
		int bigNumber = 1_000_000_000;
		int powerResult = bigNumber*bigNumber;
		System.out.println(powerResult); //-1486618624
		
		/*
		int maxIntValue = Integer.MAX_VALUE;
		int minIntValue = Integer.MIN_VALUE;
		
		// 정수 오버플로우 
		/// byte = -128~127범위 밖: 127(0111 1111) +1 => -128(1000 0000) 오버플로우)
		maxIntValue = maxIntValue + 1; // 2147483647 +1 = -2147483648
		maxIntValue += 1;
		maxIntValue++;
		// 정수 언더플로우
		minIntValue = minIntValue - 1; // -2147483648 -1 = 2147483647
		minIntValue -= 1;
		minIntValue--;
		
		System.out.println(maxIntValue);
		System.out.println(minIntValue);
		*/
		
		/*
		//Screaming Snake Case
		// 상수: 자료형의 최소.최댓값 상수로 명시해놓음
		final float SUBJECT_COUNT = 3f;
		
		int kor = 80;
		int math = 90;
		int sci = 93;
		
		// 잘못된 예시
		//float avg = (kor + math + sci) / 3;
		
		// float 결과 리턴 방법: L실수로 변환
		//float avg = (kor+math+sci) / 3F;
		
		// 상수를 사용
		float avg = (kor+math+sci) / SUBJECT_COUNT;
		System.out.println(avg);
		*/
		
		/*
		// 정수 변수 두 개 만들어서 다른 정수 변수에 연산의 결과를 저장한 후 출력한다.
		int firstNumber = 30;
		int secondNumber = 10;
		
		// firstNumber + sencondNumber
		int addResult = firstNumber + secondNumber;
		int subResult = firstNumber - secondNumber;
		int mulResult = firstNumber * secondNumber;
		int divResult = firstNumber / secondNumber;
		
		float firstFloatNumber = 10.5f;
		float secondFloatNumber = 3.55f;
		float divFloatResult = firstFloatNumber / secondFloatNumber;
		System.out.println(divFloatResult); // 2.9577465
		
		System.out.println(addResult);
		System.out.println(subResult);
		System.out.println(mulResult);
		System.out.println(divResult); // 0
		*/
		
	}
}
