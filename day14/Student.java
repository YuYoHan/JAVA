package review;

import java.util.Arrays;

import project.Human;

public class Student extends Human {
	// final 키워드는 상수로 만들기 위한 키워드이다.
	// static 키워드는 공용 변수로 만들기 위한 키워드이다.
	// 즉, 아래는 공용 상수로 JOB 상수를 선언 및 초기화 한 것이다.
	final static String JOB = "학생";
	
	// 멤버 변수
	private String className;
	private int[] score;

	public Student() {
		super();
		className = "";
		score = new int[5];
	}

	// 생성자
	public Student(String className, char type, String name, int age, int[] score) {
		super(type, name, age);
		this.className = className;
		this.score = score;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	// setter
	public void setScore(int index, int score) {
		this.score[index] = score;
	}

	public String getClassName() {
		return this.className;
	}

	// getter
	public int getScore(int index) {
		return this.score[index];
	}
	
	// print 메소드(추상 메소드 오버라이드)
	@Override
	public void print() {
		System.out.println("============ 나의 학생 정보 =============");
		System.out.println(className + "입니다.");
		System.out.println("이름은 " + this.getName() + "입니다.");
		System.out.println("나이는 " + this.getAge() + "입니다.");
		// Arrays.toString을 이용하여 배열의 값을 문자열로 표시
		System.out.println("점수는 " + Arrays.toString(score) + "점 입니다.");
		System.out.println("총점은 " + this.getTotal() + "점입니다.");
		System.out.println("평점은 " + this.getAverage() + "점입니다.");
		System.out.println("=====================================");
	}

	// 총점 계산하기 메소드
	public int getTotal() {
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		return total;
	}

	// 평균 계산하기 메소드
	public double getAverage() {
		return getTotal() / this.score.length;
	}
}