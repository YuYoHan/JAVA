package day09;

import java.util.Arrays;

import project.ClassRoom;

// ★내가 만든 클래스
class ClassRoom {
	String teacher = "김말순";
	String[] students = {"안유진", "김민주"};
	
	public void teach( ) {
		System.out.println(teacher + " 선생님이 영어를 가르칩니다." );
	}
	public void study() {
		String names = Arrays.toString(students);
		System.out.println(names + " 학생들이 영어를 배웁니다.");
	}
}

// 자바 컴파일러가 무조건 최초로 실행하는 클래스
public class ClassExam {

	public static void main(String[] args) {
		System.out.println("메인 메서드 ====");
		
		// ClassRoom 내가 만든 클래스를 사용해 보자
		// 생성자, 객체화, 인스턴스
		ClassRoom cls = new ClassRoom();
		// 멤버 변수를 사용하여 출력
		System.out.println(cls.teacher);
		
		// 멤버 메소드를 사용/
		cls.teach();
		cls.study();
	}

}
