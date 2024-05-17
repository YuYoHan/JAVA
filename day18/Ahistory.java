package project;
/*
 * 7차 프로젝트 과제 목표
 *  ScanRoom 이라는 나만의 유틸리티 클래스를 만들어보자.
 * 
 * 리스트 자료 구조를 이용해 학생 배열을 컬렉션으로 변경하자.
 * 학생 정보 출력을 좀더 간단하게 출력하자.
 * 메번 테스트시마다 ScanRoom 클래스로 입력을 받는게 힘들므로
 * 테스트를 위한 make() 메소드들을 추가해보자
 */

/*
 * 1.
 * ScanRoom을 만들어 사용자로 부터 데이트를 입력받아 테스트
 * 테스트를 위해 3개의 scanXXX 메소드를 만든다(사용자 입력 테스트).
 * 테스트를 위해 3개의 makeXXX 메소드를 만들자(자동 생성 테스트).
 * 
 * 테스트를 위한 메소드 추가
 * 생성자
 * 	public ScanRoom() {
		sc = new Scanner(System.in);
	}
 *
 * 멤버 변수
 * 	private Scanner sc;
 * 	private String className = "";
	
 * 멤버 메소드
 * 	public void printGuide()
 * 
 * 	// 테스트 코드를 사용자(Console)로부터 입력받는 코드
 * 	public String scanClassName()
 * 	public Teacher scanTeacher()
 * 	public Student scanStudent(int no)
 * 
 * 	// 테스트 코드 자동 생성
 * 	public String makeClassName()
 * 	public Teacher makeTeacher()
 * 	public Student makeStudent()
 * 
 * hint>
 * 	char type = sc.next().charAt(0)
 * 	int age = sc.nextInt() or 
 * 	int age = Integer.valueOf(sc.next());
 * 
 * 	score는 입력 받지 않으므로 0이로 초기화하기 위해
 * 	int score[] = new int[5];	// 0으로 자동 초기화 됨
 * 
 * 구현은 아래와 같이 하자.
 	public String makeClassName() {
		className = "컴퓨터공학과";
		return className;
	}
	
	public Teacher makeTeacher() {
		return new Teacher(this.className, '남', "홍길동", 30);
	}
	
	public Student makeStudent() {
		int value = (int)(Math.random() * 100);
		int score[] = new int[]{value, value, value, value, value};
		char type = value % 2 == 0 ? '여' : '남';
		String name = type == '여' ? "김영희" : "박철수";
		return new Student(this.className, type, name, 30, score);
	}
 */

/* 2.
 * School 클래스를 만들고 여기에 main() 메소드를 추가한다.
 * 그리고 아래와 같이 위에서 만들어진 클래스들을 테스트한다. 
 * 
	public static void main(String[] args) {
		// Console에서 사용자로부터 입력 받아 처리하는 테스트
		// testCreateClassRoom(1);
	
		// 자동으로 코드를 통해 예제를 만들어 처리하는 테스트
		testMakeClassRoom(5);
		
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
			room.setStudent(i, student);
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

	출력결과 1.
	
	1. 학과명을 입력합니다.
	2. 선생님 정보를 입력합니다.
	3. 학생 정보를 입력합니다.
	4. 모든 입력은 한줄에 띄어쓰기로 구분해서 입력하세요.
	5. 입력예는 아래와 같습니다.
	====================================================
	학과 이름을 입력 : 컴퓨터공학과
	선생님 정보 입력(성별 이름 나이) : 남 홍길동 50
	학생 정보 입력(성별 이름 나이) (1) : 남 김유신 23
	학생 정보 입력(성별 이름 나이) (2) : 남 이순신 21
	학생 정보 입력(성별 이름 나이) (3) : 여 유관순 20
	......
	학생 정보 입력(성별 이름 나이) (10) : 여 김영희 18
	====================================================
	
	학과 이름을 입력 : 전자공학과
	선생님 정보 입력 : 남 홍길동 50
	학생 정보 입력(성별 이름 나이) (1) : 남 김유신 23
	
	컴퓨터공학과입니다.
	==========================================================
	컴퓨터공학과 선생님 : 홍길동(50) 학생: 1명	총점: 495 평균: 99.0
	
	----------------------------------------------------------
	번호   이름   나이  국어   영어  수학   사회  과학  총점     평균
	----------------------------------------------------------
	 1   김유신   30   99   99   99   99   99  495	 99.0
	==========================================================
	
	출력결과 2.
	
	컴퓨터공학과입니다.
	==========================================================
	컴퓨터공학과 선생님 : 홍길동(30) 학생: 5명	총점: 1800 평균: 72.0
	
	----------------------------------------------------------
	번호   이름   나이  국어   영어  수학   사회  과학  총점     평균
	----------------------------------------------------------
	 1   박철수   30   99   99   99   99   99  495	 99.0
	 2   김영희   30   92   92   92   92   92  460	 92.0
	 3   김영희   30   16   16   16   16   16   80	 16.0
	 4   박철수   30   81   81   81   81   81  405	 81.0
	 5   김영희   30   72   72   72   72   72  360	 72.0
	==========================================================

 * 
 */
