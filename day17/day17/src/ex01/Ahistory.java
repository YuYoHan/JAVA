
/*
 * 6차 프로젝트 과제 목표
 * List
 * 
 */

/* 1. 
 * ClassRoom 클래스를 아래와 같이 수정하세요
 * 
 * 학생의 멤버 변수를 자료구조형으로 변환하는 과제
 * Student[] 배열형으로 컬렉션의 List를 이용하여 변경한다.
 * Student[] => ArrayList
 * 
 * 멤버 변수 변경
 * private ArrayList<Student> students;
 * 
 * 수정해야할 멤버 함수(내부 처리 코드만 변경된다.)
 * ClassRoom()
 * public void setClassName(String className)
 * public void setStudent(int index, Student student) 
 * public Student getStudent(int index)
 * public void printStudents()
 * public int getStudentCount()
 * public int getTotal()
 * public int getAverage()
 * 
 * 추가할 멤버 함수
 * public void setTeacher(char type, String name, int age)
 * public void setStudent(int index, char type, String name, int age, int[] score)
 * 
 * Student를 List 컬렉션 배열로 변경함에따라
 * 학생을 추가하기 위한 메소드를 하나 추가한다.
 * 반환값은 int로 추가하고 난후 list의 size를 반환한다.
 * public int addStudent(Student student)
 * 
 */

/* 2.
 * 
 * School 클래스를 만들고 여기에 main() 메소드를 추가한다.
 * 그리고 아래와 같이 위에서 만들어진 클래스들을 테스트한다. 
 * 
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
		room.addStudent(new Student(clsname, '여', "한강희", 22,  new int[]{100, 80, 80, 90, 70}));
		
		// index 위치의 요소를 변경하고자 한다면 아래와 같이 setStudent() 메소드를 사용할수 있다.
		//room.setStudent(9, new Student(clsname, '여', "한예슬", 21,  new int[]{100, 80, 80, 90, 70}));
		
		// 입력 정보를 확인하자.
		room.printClassName();
		room.printTeacher();
		room.printStudents();
	
		System.out.println("반 총점 = " + room.getTotal());
		System.out.println("반 평균 = " + room.getAverage());
	}
	
	
	출력결과
	
	============ 나의 직업 정보 =============
	코리아IT학교의 교장선생님입니다.
	이름은 강감찬입니다.
	나이는 40입니다.
	방번호는 101호 입니다.
	직급으로는 10레벨 입니다.
	=====================================
	컴퓨터 공학과입니다.
	============ 나의 선생님 정보 =============
	컴퓨터 공학과입니다.
	이름은 이성계입니다.
	나이는 50입니다.
	성별은 남입니다.
	=====================================
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 이순신입니다.
	나이는 22입니다.
	점수는 [10, 80, 80, 90, 70]점 입니다.
	총점은 330점입니다.
	평점은 66.0점입니다.
	=====================================
	.
	.
	.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 한강희입니다.
	나이는 22입니다.
	점수는 [100, 80, 80, 90, 70]점 입니다.
	총점은 420점입니다.
	평점은 84.0점입니다.
	=====================================
	반 총점 = 3750
	반 평균 = 75

 */
