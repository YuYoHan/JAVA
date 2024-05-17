package review;
/*
 * 4차 프로젝트 과제 목표
 * 	인터페이스
 *  static & final
 * 
 * static & final 사용 방법
 * 인터페이스 클래스를 이용한 다중 상속 방법
 * Boss 클래스 생성
 */

/* 1.
 * static/final 지시어를 사용하여 변하지 않는 공용상수를 만든다.
 * 
 * Student 클래스에서 아래와 같은 상수를 만드세요
 * final static String JOB = "학생";
 * 
 * Teacher 클래스에서 아래와 같은 상수를 만드세요
 * final static String JOB = "선생님";
 *  
 */

/* 2.
 * SpecialJob 인터페이스를 아래와 같은 조건으로 만드세요.
 * 
 * 인터페이스 메소드
 *	public abstract getJobLevel();
 *	public abstract setJobLevel();
 *	public abstract getJobName();
 *	public abstract setJobName();
 * 
 */

/* 3.
 * Boss 클래스를 아래와 같은 조건으로 만드세요.
 * Teacher 클래스를 상속받는다.
 * SpecialJob 인터페이스를 구현한다.
 * hint) class Boss extends Teacher implements SpecialJob {}
 * 
 * 클래스 상수
 * 	final static String SCHOOL = "코리아IT학교";
 *	final static String JOB = "교장선생님";
 *
 * 생성자
 * 
	public Boss() {
		this('남', "", 0);
		joblevel = 10;
		roomno = 101;
	}
	
	public Boss(char type, String name, int age) {
		// 교장선생님은 맡은 반이 없다.
		// 그래서 className을 학교이름으로 설정
		super(SCHOOL, type, name, age);

		school = SCHOOL;
		jobname = JOB;
		joblevel = 10;
		roomno = 101;
	}
 * 
 * 멤버 변수
 * 	int roomno;	// 교장실 번호
 * 
 * 멤버 함수
 * 	// setter
 * 	getRoomNo()
 * 	getJobLevel()
 * 	getJobName()
 *  getSchool()
 *  
 * 	// getter
 * 	setRoomNo(char type) 
 * 	setJobLevel()
 * 	setJobName()
 * 	setSchool()
 * 
 * 	// 추상 메서드
 * 	public abstract void print()
 * 
 * 단, setSchool()과 getSchool()은 className 변수를 재활용하자.
 * 교장선생님은 따로 맡은 반이 없으므로 부모의 남는 변수를 재활용한다.
 * 	
 * public String getSchool() {
		return this.getClassName();
	}
	public void setSchool(String school) {
		this.setClassName(school);
	}
 */


/* 4.
 * School 클래스를 만들고 여기에 main() 메소드를 추가한다.
 * 그리고 아래와 같이 위에서 만들어진 클래스들을 테스트한다. 
 * 
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
	=====================================
	1번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 이순신입니다.
	나이는 22입니다.
	점수는 [10, 80, 80, 90, 70]점 입니다.
	총점은 330점입니다.
	평점은 66.0점입니다.
	=====================================
	2번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 홍길동입니다.
	나이는 22입니다.
	점수는 [20, 80, 80, 90, 70]점 입니다.
	총점은 340점입니다.
	평점은 68.0점입니다.
	=====================================
	.
	.
	.
	10번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 한강희입니다.
	나이는 22입니다.
	점수는 [100, 80, 80, 90, 70]점 입니다.
	총점은 420점입니다.
	평점은 84.0점입니다.
	=====================================
 */