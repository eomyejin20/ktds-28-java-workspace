package workflow;

public class FlowAssignment {

	public static void main(String[] args) {
//		소수(Prime Number)는 약수가 1과 자신만 존재하는 수 입니다.
//
//		7은 1과 7로만 나누어지는 소수 입니다.
//
//		7이 소수인지 아닌지 판단하는 과정을 그림으로 그려, 업로드하세요. (핸드폰 캡쳐 가능)
//
//		 
//
//		그림의 형태는 제한이 없습니다.
		
		
		for (int i = 2; i < 7; i++) {
			if(7 % i == 0) {
				System.out.println("소수가 아니다.");
			}
			else {
				System.out.println("소수이다.");
			}
		}
	
	}
}
