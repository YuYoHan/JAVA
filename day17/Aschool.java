package project;

public class Aschool {
	public static void main(String[] args) {
		// 교실 클래스와는 무관하므로 독립적으로 클래스 객체 생성 및 테스트
		Boss boss = new Boss('남', "강감찬", 40);
		boss.print();
	
		// ClassRoom 클래스 객체 생성 및 테스트
		ClassRoom room = new ClassRoom("컴퓨터 공학과");
		
		// 선생님 클래스를 생성하여 클래스 room에 설정한다.
		room.setTeacher(new Teacher(room.getClassName(), '남', "이성계", 50));
		
		// 학생 클래스 객체의 생성과 설정을 동시에 간단하게.
		String clsname = room.getClassName();
		room.addStudent(new Student(clsname, '남', "이순신", 22,  new int[]{10, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '남', "홍길동", 22,  new int[]{20, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '남', "김유신", 22,  new int[]{30, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '남', "김영철", 22,  new int[]{40, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '남', "김대한", 22,  new int[]{50, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '남', "김민국", 22,  new int[]{60, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '여', "안녕히", 22,  new int[]{70, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '여', "김말순", 22,  new int[]{80, 80, 80, 90, 70}));
		room.addStudent(new Student(clsname, '여', "이복길", 22,  new int[]{90, 80, 80, 90, 70}));
		room.addStudent('여', "한강희", 22,  new int[]{100, 80, 80, 90, 70});
		
		// index 위치의 요소를 변경하고자 한다면 아래와 같이 setStudent() 메소드를 사용할수 있다.
//		room.setStudent(0, new Student(clsname, '여', "한예슬", 21,  new int[]{100, 80, 80, 90, 70}));

		// 입력 정보를 확인하자.
		room.printClassName();
		room.printTeacher();
		room.printStudents();

		System.out.println("반 총점 = " + room.getTotal());
		System.out.println("반 평균 = " + room.getAverage());
	}	
}
