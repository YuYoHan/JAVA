package day09;

import project.Student;

class Student1 {
	String name;
	int eng;
	int kor;
	
	Student1() {
		name = " ";
		eng = 0;
		kor = 0;
	}
	
//	Student(String a, int b, int c) {
//		name = a;
//		eng = b;
//		kor = c;
//	}
	
	// this는 내 자신을 가르킨다.
	Student1(String name, int eng, int kor) {
		this.name = name;
		this.eng = eng;
		this.kor = kor;
	}
	
	// 이름을 출력하는 메소드
	public void printName() {
		System.out.println("학생의 이름은 " + name + "입니다.");
	}
	
	// 성적을 출력하는 메소드
	public void printScore() {
		System.out.println("영어 점수는 " + eng + "입니다.");
		System.out.println("국어 점수는 " + kor + "입니다.");
	}
	
	
	// 이름과 총점을 출력하는 메소드
	public void printInfo() {
		System.out.println("제 이름은 " +name+ "이고, 점수는 " + (eng + kor) + "입니다.");
	}
}

public class ClassConst {

	public static void main(String[] args) {
		Student1 st = new Student1();
		
		// 멤버 변수 값 저장(사용)
		st.name = "홍길동";
		st.eng = 90;
		st.kor = 100;
		
		Student1 st3 = new Student1("홍길동", 90, 100);
		
		// 멤버 함수 사용
		st.printName();			// 이름출력
		st.printScore();		// 점수출력
		st.printInfo();			// 정보출력
	
		Student1 st1 = new Student1("김유신", 90, 100);
		st1.printInfo();
		Student1 st2 = new Student1("이순신", 90, 100);
		st2.printInfo();
		
		// 생성과 초기화를 동시에
//		int a;					// 선언
//		a = 10;					// 초기화
//		int a = 10;

		
	}

}
