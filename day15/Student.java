package review;

import java.util.Arrays;

public class Student extends Human {
	final static String JOB = "학생";
	// 멤버 변수
	private String className;
	private int[] score;

	// 생성자
	public Student() {
		super();
		className = "";
		score = new int[5];
	}

	public Student(String className, char type, String name, int age, int[] score) {
		super(type, name, age);
		this.className = className;
		this.score = score;
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}

	public void setScore(int index, int score) {
		this.score[index] = score;
	}

	// getter
	public String getClassName() {
		return this.className;
	}

	public int getScore(int index) {
		return this.score[index];
	}
	
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

	// Object 클래스의 equals() 메소드 오버라이딩(재정의)
	@Override
	public boolean equals(Object obj) {
		// 이와 같이 해도 문제는 없지만 오류에 취약한다.
//		return this.value == ((ObjectTest)obj).value;

		// 그래서 예상 가능한 오류를 처리한다.
		if(obj instanceof Student) {
			Student st = (Student)obj;
			// equals(Object obj) {
            // 에서 매개변수로 받은 obj를 Student st = (Student)obj로 형변환하고
			// 자신이 가지고 있는 this.score와 외부에서 받은 Student의 score를 비교하는 코드

			boolean a = st.getType() == this.getType(); 
			boolean b = st.getAge() == this.getAge();
			boolean c = st.getClassName().equals(this.className); 
			boolean d = st.getName().equals(this.getName()); 
			boolean e = Arrays.equals(st.score, this.score);	// this.score은 Student클래스 9번째 줄에 선언

			if( a && b && c && d && e) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

		// 좀더 간력하게하는 방법.
//		if(obj instanceof Student) {
//			Student st = (Student)obj;
//
//			boolean a = st.getType() == this.getType(); 
//			boolean b = st.getAge() == this.getAge();
//			boolean c = st.getClassName().equals(this.className); 
//			boolean d = st.getName().equals(this.getName()); 
//			boolean e = Arrays.equals(st.score, this.score);
//
//			if( a && b && c && d && e) return true;
//		}
//
//		return false;
	}
		

	// Object 클래스의 toString() 메소드 오버라이딩(재정의)
	@Override
	public String toString() {
		return this.className + " " + this.getName() + " " + this.getAge();
//			return super.toString();
	}
	
	public Student max(Student st) {
		return this.getTotal() > st.getTotal() ? this : st;
	}
}