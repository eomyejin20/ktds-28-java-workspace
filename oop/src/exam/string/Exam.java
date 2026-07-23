package exam.string;

public class Exam {

	public static void main(String[] args) {
		
		
		/** address에  "서울"이 포함되어 있는지 확인*/
//		String address = "서울특별시 서초구 효령로 176";
//		boolean isSeoul = address.contains("서울");
//		System.out.println(isSeoul);
		
		/** address기 179으로 끝나는지 확인*/
//		String address = "서욽특별시 서초구 효령로 176";
//		boolean isSeoul = address.endsWith("176");
//		System.out.println(isSeoul);

		/** name이 ktdsUniversity와 정확히 같은지 비교*/
//		String name = "ktdsUniversity";
//		boolean isEqual = name.equals("ktdsUniversity");
//		System.out.println(isEqual);
		
		/** name이 ktdsUniversity와 같은지 비교(대소문자 비교안함)*/
//		String name = "ktdsuniversity";
//		boolean isEqual = name.equalsIgnoreCase("ktdsUniversity");
//		System.out.println(isEqual);
		
		/** 문자 c의 인덱스(위치)찾기*/
//		String alphabets = "abcdefg";
//		int letterCIndex = alphabets.indexOf('c');
//		System.out.println(letterCIndex);
		
		/** 문자 C의 인덱스(위치) 찾기*/
//		String alphabets = "abcdefg";
//		int letterCIndex = alphabets.indexOf('C');
//		System.out.println(letterCIndex); // -1
		
		/** 문자 def의 인덱스(위치)찾기*/
//		String alphabets = "abcdefg";
//		int letterDEFIndex = alphabets.indexOf("def");
//		System.out.println(letterDEFIndex); // 3

		/** str이 비어있거나 공백으로만 이루어져있는지 확인*/
//		String str = "   ";
//		// Since Java11
//		boolean isBlank = str.isBlank();
//		System.out.println(isBlank); //false

		/** str이 공백으로 비워져있는지 확인*/
//		String str = "    ";
//		boolean isEmpty = str.isEmpty();
//		System.out.println(isEmpty); // false
		
		/** message와 name을 “, “ 으로 연결하기*/
//		String message = "안녕하세요";
//		String name = "홍길동님";
//		String helloMessage = String.join(", ", message, name);
//		System.out.println(helloMessage);

		/** message에서 “a”의 마지막 인덱스(위치) 찾기*/
//		String message = "abcdefgaijkb";
//		int letterALastIndex = message.lastIndexOf("a");
//		System.out.println(letterALastIndex);

		/** message에서 “jj”의 마지막 인덱스(위치) 찾기*/
//		String message = "abcdefgaijkb";
//		int letterJJLastIndex = message.lastIndexOf("jj");
//		System.out.println(letterJJLastIndex); // -1
		
		/** message의 문자열 길이 구하기 */
//		String message = "abcdefgaijkb";
//		int length = message.length();
//		System.out.println(length);

		/** phone이 숫자인지 확인하기 */
//		String phone = "01012341234";
//		boolean isNumber = phone.matches("^[0-9]+$");
//		System.out.println(isNumber);

		/** message에서 홍길동을 ktds로 변경하기*/
//		String message = "안녕하세요, 홍길동님, 안녕히 가세요, 홍길동님.";
//		message = message.replace("홍길동", "ktds");
//		System.out.println(message);
		
		/** phone에서 숫자가 아닌 문자를 공백문자(“”)로 변경하기*/
//		String phone = "010-1234-1234";
//		phone = phone.replaceAll("[^0-9]", "");
//		System.out.println(phone);
		
		/** phone을 “-”로 잘라 배열에 할당하기*/
//		String phone = "010-1234-1234";
//		String[] phoneArea = phone.split("-");
//		System.out.println(phoneArea[0]);
//		System.out.println(phoneArea[1]);
//		System.out.println(phoneArea[2]);

		
		/** phone이  +82 로 시작하는지 확인하기*/
//		String phone = "+82-010-1234-1234";
//		boolean isKoreaNum = phone.startsWith("+82");
//		System.out.println(isKoreaNum);

		/** datetime에서 2023(연) 글자만 잘라내어 할당하기*/
//		String datetime = "2023-05-02 14:56:13";
//		String year = datetime.substring(0, 4);
//		System.out.println(year);

		/** datetime에서 14(시) 글자만 잘라내어 할당하기*/
//		String datetime = "2023-05-02 14:56:13";
//		String hour = datetime.substring(11, 13);
//		System.out.println(hour);
		
		/** datetime에서 14:56:13(시:분:초) 글자만 잘라내어 할당하기 */
//		String datetime = "2023-05-02 14:56:13";
//		String time = datetime.substring(11);
//		System.out.println(time);

		/** datetime에서 앞뒤 공백모두 제거하기*/
//		String datetime = "  2023-05-02 14:56:13  ";
//		System.out.println(datetime.length()); //23
//		System.out.println(datetime);
//		datetime = datetime.trim();
//		System.out.println(datetime.length()); //22
//		System.out.println(datetime);


		/**int 타입 1을 문자열로 변경하기 (Overloaing)*/
//		String iStr = String.valueOf(1);
//		System.out.println(iStr);


		
		
		// binding?
		// 값을 특정 부분에 대입한다.
		
		int biggestNumber = Integer.MAX_VALUE;
		System.out.println(biggestNumber); //2147483647
		
		String numberString = "%,d".formatted(biggestNumber); // d(정수)를 ,로 바인딩
		System.out.println(numberString); //2,147,483,647
		
		
		
		// format binding(static method)
		String messageFormat = "%s에서 교육하는 %s과정, %d시간 %d일 과정, %f (%.2f) 진행했습니다.";
		String message = String.format(messageFormat, 
										"ktds University",
										"Java Programming",
										800, 
										100, 
										8 / 100d, 
										8 / 100d);
		System.out.println(message);
		
		// format binding (instance method)
		String message2 = messageFormat.formatted(
								"ktds University",
								"Java Programming",
								800, 
								100, 
								8 / 100d, 
								8 / 100d);

		System.out.println(message2);
		
	}
}
