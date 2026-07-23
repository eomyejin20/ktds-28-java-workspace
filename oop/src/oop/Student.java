package oop;

/**
 * 학생 평균 및 학점 구하기
 */

public class Student {
	
	/**
	 * 점수
	 */
	private int java;
	private int python;
	private int cpp;
	private int csharp;
	
	/**
	 * 모든 학생이 100점
	 */
	public Student() {
//		this.java = 100;
//		this.python = 100;
//		this.cpp = 100;
//		this.csharp = 100;
		
		// 생성자 내부에서는 다른 생성자를 호출할 수있음.
		// 호출방법 : this();
		//this(); //파라미터가 없는 생성자호출
		this(100, 100, 100, 100);
	}
	
	/**
	 * 점수를 할당
	 * @param java
	 * @param python
	 * @param cpp
	 * @param csharp
	 */
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	/**
	 * 합계
	 * @return 점수의 합계
	 */
	private int getSumAllScores() {
		return java + python + cpp + csharp;
	}
	
	/**
	 * 평균
	 * @return 평균
	 */
	public double getAverage() {
		double avg = (getSumAllScores() / 4.00 * 100);
		return avg / 100.0;
	}
	/**
	 * 학점을 계산
	 * @return 학점
	 */
	public double getCourseCredit() {
		if(getAverage() < 55) {
			return 0.1;
		}
		double result = (getAverage() - 55) / 10.0 * 100;
		return result /100.0;
	}
	
	/**
	 * 학점 반환
	 * @return 학점 
	 */
	public String getABCDF() {
		double score = getCourseCredit();
		if (score >= 4.1) {
			return "A+";
		}
		else if (score >= 3.6) {
			return "A";
		}
		else if (score >=3.1) {
			return "B+";
		}
		else if (score >= 2.6) {
			return "B";
		}
		else if (score >= 1.6) {
			return "C";
		}
		else if (score >= 0.6) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	public static void main(String[] args) {
		//							  java python cpp csharp
		Student student = new Student(100, 90, 80, 70);
		Student kim = new Student(); //모든 점수가 100점인 학생 인스턴스
		
		int sum = student.getSumAllScores();
		double average = student.getAverage();
		double courseCredit = student.getCourseCredit();
		String abcde = student.getABCDF();
		
		System.out.println("합계: " + sum); //377
		System.out.println("평균: " + average); // 95.25
		System.out.println("학점: " + courseCredit); // 3.92
		System.out.println("등급: " + abcde); // A
		}


}
