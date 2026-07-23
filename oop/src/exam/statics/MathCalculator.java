package exam.statics;

/**
 * 사칙연산ㄱ기
 */
public class MathCalculator {
	
	/** 계산하려는 첫 번째 정수*/
	private int firstNumber;
	/** 계산하려는 두 번째 정수*/
	private int secondNumber;
	
	public MathCalculator(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	/**
	 * 숫자 두 개를 연산하여 반환
	 * @param operator 연산 종류
	 * @see oop.exam.statics.Operators 연산자 종류
	 * @return operator 값에 따른 결과 반환
	 */
	public int getComputerResult(int operator) {
		
		if (operator == Operators.ADD) {
			return this.firstNumber + this.secondNumber;
		} else if (operator == Operators.SUB) {
			return this.firstNumber - this.secondNumber;
		} else if (operator == Operators.MUL) {
			return this.firstNumber * this.secondNumber;
		} else if (operator == Operators.DIV) {
			return this.firstNumber / this.secondNumber;
		} else if (operator == Operators.MOD) {
			return this.firstNumber % this.secondNumber;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		MathCalculator math = new MathCalculator(10, 2);
		System.out.println(math.getComputerResult(Operators.ADD)); //더하기
		System.out.println(math.getComputerResult(Operators.SUB)); //빼기
		System.out.println(math.getComputerResult(Operators.MUL)); //곱하기
		System.out.println(math.getComputerResult(Operators.DIV)); //나누기 몫
		System.out.println(math.getComputerResult(Operators.MOD)); //나누기 나머지
	}

}
