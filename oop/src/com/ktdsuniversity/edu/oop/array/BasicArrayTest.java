package com.ktdsuniversity.edu.oop.array;

import java.util.Random;
import java.util.Arrays;

public class BasicArrayTest {

	public static void main(String[] args) {
		
		/**1. 정수형 배열 변수를 만들고 값을 할당해 보세요.*/
		int[] arrInt = new int[] {0, 1, 2, 3};
		
		System.out.print("정수형 배열: ");
		for (int i : arrInt) {
			System.out.print(arrInt[i] +" ");
		}
		System.out.println();

		/**2. 정수형 배열 변수의 합을 계산해 출력해보세요.*/
		int sum = 0;
		
		for (int i : arrInt) {
			sum += arrInt[i];
		}
		System.out.println("정수형 배열 합: " + sum);

		/**3. 실수형 배열 변수를 만들고 랜덤한 값을 할당해보세요.*/
		Random random = new Random();
		float[] arrFloat = new float[3];
		
		System.out.print("실수형 배열: ");
		for (int i = 0; i < arrFloat.length; i++) {
			arrFloat[i] = random.nextFloat();
			System.out.print(arrFloat[i]+ " ");
		}
		System.out.println();
		
		/**4. 실수형 배열 변수의 합을 계산해 출력해보세요.*/
		float sumF = 0; 
		
		for(float i : arrFloat) {
			sumF += i;
		}
		System.out.println("실수형 배열 합: " + sumF);
		
		/**5. 실수형 배열 변수 내의 가장 큰 값을 출력해보세요 .*/
		Arrays.sort(arrFloat);
		
		System.out.println("실수형 배열에서 가장 큰 값: " 
		+ arrFloat[arrFloat.length-1]);
		
		/**6. 실수형 배열 변수 내의 가장 작은 값을 출력해보세요.*/
		System.out.println("실수형 배열에서 가장 작은 값: " + arrFloat[0]);

		/**7. 문자열형 배열 변수를 만들어 값을 할당해 보세요.*/
		String[] strArr = new String[] {"난", "오리가", "되고싶다", "아니면", "라면"};
		
		System.out.print("문자열 배열: ");
		for(String i : strArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/**8. 문자열형 배열 변수 내의 값 중 길이가 가장 긴 문자열을 출력해보세요.*/
		int longIndex = 0;
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() > strArr[longIndex].length()) {
			        longIndex = i;
			}
		}
		System.out.println("가장 긴 문자열: " + strArr[longIndex]);
		
		/**9. 정수형 배열 변수를 만들고 랜덤한 값을 할당해보세요.*/
		int[] arrInt2 = new int[10];
		System.out.print("정수형 배열2: ");
		for (int i = 0; i < arrInt2.length; i++ ) {
			arrInt2[i] = random.nextInt();
			System.out.print(arrInt2[i] + " ");
		}
		
		System.out.println();
		
		/**10. 정수형 배열 변수 내의 값 중 평균 이상의 값들만 출력해보세요.*/
		int avg = 0;
		sum = 0;
		
		for(int i : arrInt2) {
			sum += i;
		}
		avg = sum / arrInt2.length;
		System.out.println("평균: " + avg);
		
		System.out.print("평균 이상의 값들: ");
		for(int i : arrInt2) {
			if (i >= avg) {
				System.out.print(i + " ");
			} 
		}
		System.out.println();
		
		
		/**15. 숫자 형태의 문자열 배열 변수를 만들어보세요.*/
		String[] strNum = new String[] {"123", "54", "6861"};

		/**16. 숫자 형태의 문자열 배열 변수의 값을 정수로 변환한 뒤 정수의 합과 평균을 출력해보세요.*/
		int[] num = new int[strNum.length];
		int count = 0;
		sum = 0;
		avg = 0;
		for (int  i = 0; i < strNum.length; i++) {
			if (strNum != null) {
				strNum[i] = strNum[i].replace("^[0-9]", "");
				num[i] = Integer.parseInt(strNum[i]);
				sum += num[i];
				count++;
			}
		}
		avg = sum / count;
		System.out.println("합: " + sum + ", 평균: " + avg);

		/**17. 불린 형태의 배열 변수를 만들고 값을 랜덤하게 할당해보세요.*/
		boolean[] binaryArr = new boolean[10];
		System.out.print("불린 배열: ");
		for (int i = 0; i < binaryArr.length; i++ ) {
			binaryArr[i] = random.nextBoolean();
			System.out.print(binaryArr[i] + " ");
		}
		
		System.out.println();
		
		/**18. 불린 형태의 배열 변수 내에서 true의 개수는 몇 개인지 세어 출력해보세요.*/
		count = 0;
		for (boolean i : binaryArr) {
			if (i) {
				count++;
			}
		}
		System.out.println("true의 개수: " + count);

		/**19. 불린 형태의 배열 변수 내에서 false가 존재하는 비율은 몇 %인지 계산해 출력해보세요.*/
		double falseCount = 0.00;
		for (boolean i : binaryArr) {
			if (!i) {
				falseCount++;
			}
		}
		double radio = (falseCount / binaryArr.length) * 100;
		System.out.println("false 존재 비율: " + radio + "%");

		/**20. 문자열 형태의 배열 변수를 만들고 값을 랜덤하게 할당해보세요.*/
		String[] str = new String[10];
		String[] randomStr = new String[] {"촛불", "템플스테이", "점심", "캠핑", "카페",
				"커피", "생선", "떡볶이", "친구", "과제"}; 
		System.out.print("랜덤한 문자열 배열: ");
		for (int i = 0; i < str.length; i++) {
			str[i] = randomStr[random.nextInt(randomStr.length)]; // 0부터 ~ X미만
			System.out.print(str[i] + " ");
		}
		System.out.println();
		
		/**21. 문자열 형태의 배열 변수 내의 모든 문자열의 길이를 합한 값을 계산해 출력해보세요.*/
		sum = 0;
		for (int i = 0; i < str.length; i++) {
			sum += str[i].length();
		}
		System.out.println("문자열 길이의 합: " + sum);
	}
}
