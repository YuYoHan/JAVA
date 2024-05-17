package review;

import day10.Overloading;

public class OverExam {
	
	public static void testStudent() {
		Student st = new Student("전자공학과","홍길동", 80, 90);
//		st.className = "기계공학과";	// private 이기에 접근 불가
		
		st.printClassName();	// 학과명
		st.printName();			// 이름
		st.printKor();			// 국어점수
		st.printEng();			// 영어점수

		st.printInfo();			// 정보

		// setter 메소드 테스트 : 데이터 저장
		// st.ClassName = "컴퓨터공학과";
		st.setClassName("컴퓨터공학과");
		st.setName("김유신");	// st.name ="김유신";
		st.setEng(90);
		st.setKor(90);
		
		// getter 메소드 테스트 : 데이터 가져오기
		System.out.println("학과명 : " + st.getClassName());
		System.out.println("성명 : " + st.getName());
		System.out.println("영어점수 : " + st.getEng());
		System.out.println("국어점수 : " + st.getKor());
		
		// total 메소드 테스트
		System.out.println("총점 : " + st.getTotal());
	}
	
	public static void testClassRoom() {
		ClassRoom clsroom = new ClassRoom();	// 교실 객체 생성
		
		// 교실 명 설정
		clsroom.setClassName("컴퓨터공학과");
		
		// setter 메소드 사용(교실의 학생들 정보 설정)
		clsroom.setStudent(0, "홍길", 90, 90);	// 0
		clsroom.setStudent(1, "김유신", 80, 80);	// 1
		clsroom.setStudent(2, "강감찬", 70, 70);	// 2
		clsroom.setStudent(3, "이순신", 60, 60);	// 3
		clsroom.setStudent(4, "이성계", 50, 50);	// 4동

		// print 메소드 활용
		clsroom.printClassName();
		clsroom.printStudents();
		clsroom.printTotal();

		// getter 메소드 사용
		System.out.println("==================================");
		System.out.println("학과명 : " + clsroom.getClassName());
		System.out.println("1번 학생 : " + clsroom.getStudent(0));
		System.out.println("반 총점 : " + clsroom.getTotal());
		System.out.println("반 평균 : " + clsroom.getAverage());
	}

	
	void exam01() {
		Overloading over = new Overloading();

		over.print();
		over.print(0);
		over.print();
		over.print("홍길동", 10);
	}
	
	public static void main(String[] args) {
		//exam01();
//		testStudent();
		testClassRoom();
		
	}
}
