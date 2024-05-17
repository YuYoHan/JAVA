package project;

public class Aschool {
	public static void main(String[] args) {
		// Console에서 사용자로부터 입력 받아 처리하는 테스트
//		 testCreateClassRoom(1);

		// 자동으로 코드를 통해 예제를 만들어 처리하는 테스트
		testMakeClassRoom(10);
	}
	
	static public void testCreateClassRoom(int count) {
		// 입력 테스트를 위한 유틸리티 클래스 객체를 생성하자.
		ScanRoom scan = new ScanRoom();
		
		// 사용자 입력을 위한 가이드를 출력하자.
		scan.printGuide();
		
		// 학과명를 console 화면을 통해 입력받는 메소드
		String clsname = scan.scanClassName();
		// 입력받은 학과명을 ClassRoom에 저장
		ClassRoom room = new ClassRoom(clsname);
		
		// 선생님 정보를 console 화면을 통해 입력받아 Teacher 객체를 반환하는 메소드
		Teacher teacher = scan.scanTeacher();
		// teacher 객체를 ClassRoom에 저장
		room.setTeacher(teacher);

		// count번 반복하여 count명의 학생 정보를 입력 받는다.
		for(int i=0; i < count; i++) {
			Student student = scan.scanStudent(i+1);			
			room.addStudent(student);
		}
		
		room.print();
	}
	
	static public void testMakeClassRoom(int count) {
		// 입력 테스트를 위한 유틸리티 클래스 객체를 생성하자.
		ScanRoom scan = new ScanRoom();

		// 학과 정보를 입력받아 ClassRoom에 저장한다.
		// scanClassName => makeClassName 사용
		ClassRoom room = new ClassRoom(scan.makeClassName());
		
		// 선생님 정보를 입력받아 ClassRoom에 저장한다.
		// scanTeacher => makeTeacher 사용
		room.setTeacher(scan.makeTeacher());
		
		// 5번 반복하여 5명의 학생 정보를 입력 받는다.
		for(int i=0; i < count; i++) {
			// scanStudent => makeStudent 사용
			room.addStudent(scan.makeStudent());
		}
		
		room.print();
	}
}