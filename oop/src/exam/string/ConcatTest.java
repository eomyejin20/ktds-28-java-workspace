package exam.string;


public class ConcatTest {
	public static void changeStr(StringBuffer str) {
		str.append("바뀌었을까요?");
		System.out.println(str);
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		StringBuffer message = new StringBuffer();
		// StringBuffer의 인스턴스.append("문자열");
		message.append("원본입니다.");
	
		System.out.println(message);
		
		changeStr(message);
		System.out.println(message);
	}
}
