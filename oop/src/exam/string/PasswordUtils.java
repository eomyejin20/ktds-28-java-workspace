package exam.string;

public class PasswordUtils {

	/**
	 * 영대/소문자, 숫자로 이루어진 새 비밀번호 생성.
	 * @param wordLength 비밀번호를 구성할 문자의 개수
	 * @param numberLength 비밀번호를 구성할 숫자의 개수
	 * @return 새로운 비밀번호
	 */
	public static String createNewRandomPassword(int wordLength, int numberLength) {
		
		char[] characters = new char[52];
		for (int i = 0; i < 26; i++) {
			characters[i] = (char)(i + 97);
		}
		
		for (int i = 0; i < 26; i++) {
			characters[i + 26] = (char)(i + 65);
		}
		
		String newPassword = "";
		for (int i = 0; i < wordLength; i++) {
			newPassword += characters[(int)(Math.random() * characters.length)];
		}
		
		for (int i = 0; i < numberLength; i++) {
			newPassword += (int)(Math.random() * 10);
		}
		
		return shuffle(newPassword);
	}
	
	/**
	 * 문자열을 뒤섞음
	 * @param str 뒤섞을 문자열
	 * @return 뒤섞인 문자열
	 */
	private static String shuffle(String str) {
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			int moveIndex = (int) (Math.random() * str.length());
			char temp = arr[i];
			arr[i] = arr[moveIndex];
			arr[moveIndex] = temp;
		}
		
		return new String(arr);
	}
	
	public static void main(String[] args) {
		String newPassword = createNewRandomPassword(6, 4);
		System.out.println(newPassword);
	}
	
}