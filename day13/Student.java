package review;

import java.util.Arrays;

public class Student extends Human {
	private String className;
	// score를 배열로 변경하자.
	private int[] score;
	// age, name은 부모 클래스로 이동했다. 

	public Student() {
		// super() 메소드를 이용한 초기화로 부모의 생성자이용하여 초기화할 수 있다.
		super();	// type, name, age는 이제 여기서 초기화된다.

		className = "";
		
		// 배열 생성
		score = new int[5];
	}

	public Student(String className, char type, String name, int age, int[] score) {
		// super() 메소드를 이용한 초기화로 부모의 생성자이용하여 초기화할 수 있다.
		super(type, name, age);	// type, name, age는 이제 여기서 초기화된다.

		this.className = className;

		// 배열 초기값 설정
		this.score = score;	// 배열로 받은걸 그대로 배열로...
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}
	
	// setName, setAge은 Human 클래스에 있다.

	// score가 배열이므로 각 배열 요소에 값을 저장하기 위해
	// index는 배열 요소의 위치를 나타낸다.
	public void setScore(int index, int score) {
		// 각 점수 배열의 index에 해당하는 요소의 점수 설정
		this.score[index] = score;
		
		// index = 0이면 this.score[0] 요소에 score를 저장;
		// index = 1이면 this.score[1] 요소에 score를 저장;
		// index = 2이면 this.score[2] 요소에 score를 저장;
		// index = 3이면 this.score[3] 요소에 score를 저장;
		// index = 4이면 this.score[4] 요소에 score를 저장;
	}

	// getter
	public String getClassName() {
		return this.className;
	}

	// getName, getAge은 Human 클래스에 있다.
	
	// score가 배열이므로 각 배열 요소에 값을 가져오기 위해
	// index는 배열 요소의 위치를 나타낸다.
	public int getScore(int index) {
		// 각 점수 배열의 index에 해당하는 요소의 점수 가져오기
		return this.score[index];
		
		// index = 0이면 this.score[0] 요소에 값을 반환;
		// index = 1이면 this.score[1] 요소에 값을 반환;
		// index = 2이면 this.score[2] 요소에 값을 반환;
		// index = 3이면 this.score[3] 요소에 값을 반환;
		// index = 4이면 this.score[4] 요소에 값을 반환;
	}
	
	// print 메소드(추상 메소드 오버라이드)
	@Override
	public void print() {
		System.out.println("============ 나의 학생 정보 =============");
		System.out.println(className + "입니다.");
		System.out.println("이름은 " + this.getName() + "입니다.");
		System.out.println("나이는 " + this.getAge() + "입니다.");
		System.out.println("성별은 " + this.getType() + "입니다.");
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