package review;

public class Aschool {
	public static void main(String[] args) {
		// 교실 클래스에 대한 객체 생성 및 테스트
		ClassRoom cls = new ClassRoom();
		
		// setter 메소드 사용하여 값 설정
		cls.setClassName("컴퓨터공학과");
		cls.setStudent(0, "홍길동");
		cls.setStudent(1, "김유신");
		cls.setStudent(2, "강감찬");

		System.out.println("==================================");
		
		// getter 메소드 사용하여 값 읽어오기
		System.out.println("학과명 : " + cls.getClassName());
		System.out.println("1번 학생 : " + cls.getStudent(0));
		System.out.println("2번 학생 : " + cls.getStudent(1));
		System.out.println("3번 학생 : " + cls.getStudent(2));
		
		System.out.println("==================================");
		
		// print 메소드 사용
		cls.setTeacher("아이나");			// 선생님 이름 설정
		cls.printClassName();
		cls.printTeacher();
		cls.printStudents();
		
		System.out.println("==================================");
		
		// 학생 클래스에 대한 객체 생성 및 테스트
		Student stud = new Student();
		
		// setter 메소드
		stud.setClassName("컴퓨터공학과");
		stud.setName("홍길동");

		// getter 메소드
		System.out.println("==================================");
		System.out.println("학과명 : " + stud.getClassName());
		System.out.println("1번 학생 : " + stud.getName());
		
		// print 메소드
		System.out.println("==================================");
		stud.printClassName();
		stud.printName();
		stud.printInfo();
	}
}
