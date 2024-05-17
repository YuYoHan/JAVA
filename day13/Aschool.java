package review;

public class Aschool {
	public static void main(String[] args) {
		// ClassRoom 클래스 객체 생성 및 테스트
		ClassRoom room = new ClassRoom("컴퓨터 공학과");
		
		// 선생님 클래스를 생성하여 클래스 room에 설정한다.
		Teacher te = new Teacher(room.getClassName(), '남', "이성계", 50);
		room.setTeacher(te);
		
		String clsname = room.getClassName();

		// 첫번째 학생의 성적을 배열로 생성 및 초기화한다.
		int[] arr1 = new int[]{10, 80, 80, 90, 70};
		// 첫번째 학생 클래스의 객체를 생성한다(학생을 생성한다)
		Student st1 = new Student(clsname, '남', "이순신", 22,  arr1);	// scores 배열도 설정
		// room 객체에 학생을 설정한다(교실을 배정한다).
		room.setStudent(0, st1);

		// 두번째 학생 클래스의 객체를 생성과 동시에 성적을 배열을 생성 및 초기화.
		Student st2 = new Student(clsname, '남', "이순신", 22,  new int[]{10, 80, 80, 90, 70});
		// room 객체에 학생을 넣는다(교실을 배정한다).
		room.setStudent(1, st2);
		
		// 세번째부터는 학생 클래스 객체의 생성과 설정을 동시에 간단하게.
		room.setStudent(2, new Student(clsname, '남', "김유신", 22,  new int[]{30, 80, 80, 90, 70}));
		room.setStudent(3, new Student(clsname, '남', "김영철", 22,  new int[]{40, 80, 80, 90, 70}));
		room.setStudent(4, new Student(clsname, '남', "김대한", 22,  new int[]{50, 80, 80, 90, 70}));
		room.setStudent(5, new Student(clsname, '남', "김민국", 22,  new int[]{60, 80, 80, 90, 70}));
		room.setStudent(6, new Student(clsname, '여', "안녕히", 22,  new int[]{70, 80, 80, 90, 70}));
		room.setStudent(7, new Student(clsname, '여', "김말순", 22,  new int[]{80, 80, 80, 90, 70}));
		room.setStudent(8, new Student(clsname, '여', "이복길", 22,  new int[]{90, 80, 80, 90, 70}));
		room.setStudent(9, new Student(clsname, '여', "한강희", 22,  new int[]{100, 80, 80, 90, 70}));
		
		// 프린트 메소드 테스트
		room.printClassName();
		room.printTeacher();
		room.printStudents();
	}
}
