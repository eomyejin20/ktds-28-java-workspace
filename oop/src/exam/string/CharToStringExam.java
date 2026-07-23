package exam.string;

public class CharToStringExam {

	public static void main(String[] args) {
		// char 타입을 String으로 변환.
		// String + anything ==> String
		// String + char ==> String
		char character = 'a';
		String str = character + "";
		System.out.println(str); // a
		
		character = 'a';
		character += 1;
		str = character + "";
		System.out.println(str);
		
		character = 65;
		str = character + "";
		System.out.println(str);
		
		character = 97;
		str = character + "";
		System.out.println(str);
		
		// a 부터 z 까지 출력
		for (char c = 'a'; c <= 'z'; c++) {
			String newChar = c + "";
			System.out.println(newChar);
		}
		
		char[] lowerCharacters = new char[('z' - 'a') + 1];
		for (int i = 0; i < lowerCharacters.length; i++) {
			lowerCharacters[i] = (char)(i + 97);
		}
		
		char[] upperCharacters = new char[('Z' - 'A') + 1];
		for (int i = 0; i < upperCharacters.length; i++) {
			upperCharacters[i] = (char)(i + 65);
		}
		
		
		
	}
	
}