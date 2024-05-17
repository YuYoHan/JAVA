package review;
/*
 * 자바2-1 과제 목표
 * 	객체지향 프로그래밍
 * 	상속
 */

/* 1.
 * Human 부모 클래스를 만들고 아래와 같이 추가하자
 * 생성자
 * 	Human() {
		this.type = 0;
	}
 * 	Human(char type) {
		this.type = type;
	}
 * 
 * 멤버 변수
 * 	char type;		// 성별
 * 
 * 멤버 함수
 * 	// setter
 * 	setType(char type) 
 * 	// getter
 * 	getType()
 *  
 */

/* 2.
 * Teacher 클래스를 만들고 Human을 상속한다.
 * 그리고 아래와 같은 멤버들을 추가한다.
 * 생성자
 * 	Teacher()
 * 	Teacher(String className, char type, String name, int age)
 * 
 * 멤버 변수
 * 	String className;
 * 	String name;
 * 	int age;
 * 
 * 멤버 함수
 *  
 *  // setter
 *  setClassName(String className)
 *  setName(String name)
 *  setAge(int age)
 *  
 *  // getter
 *  String getName()
 *  int getAge()
 *  
 *  // 메소드
 *  void print()
 *  ============ 나의 선생님 정보 =============
	컴퓨터 공학과입니다.
	이름은 홍길동입니다.
	성별은남입니다.
	나이는 40입니다.
	=====================================
 */

/* 3.
 * Student 클래스를 만들고 Human을 상속한다.
 * 그리고 아래와 같이 멤버들을 추가한다.
 * 기존에 있는 Student는 삭제후 하거나 또는 아래에 맞도록 수정한다. 
 * 
 * 생성자
 * 	Student()
 * 	Student(String className, char type, String name, int age, int score)
 * 
 * 멤버 변수
 * 	String className;
 * 	String name;
 *  int age;
 * 	int score;
 * 
 * 멤버 함수
 *  
 *  // setter
 *  setClassName(String className)
 *  setName(String name)
 *  setAge(int age)
 *  setScore(int score)
 *  
 *  // getter
 *  String getClassName()
 *  String getName()
 *  int getAge()
 *  int getScore(index)
 *   
 *  void print()
 *  출력 결과
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 김유신입니다.
	성별은 남입니다.
	나이는 16입니다.
	점수는 90점 입니다.
	=====================================
 */

/* 4.
 * ClassRoom 클래스는 일단 그대로 두고
 * School 클래스를 만들고 여기에 main() 메소드를 추가한다.
 * 그리고 아래와 같이 위에서 만들어진 클래스들을 테스트한다. 
 * 
	// Teacher 클래스 객체 생성 및 테스트
	Teacher te = new Teacher("컴퓨터 공학과", '남', "홍길동", 40);
	te.print();

	System.out.println("\n");
	
	// Student 클래스 객체 생성 및 테스트
	Student st = new Student("컴퓨터 공학과", '남', "김유신", 16, 90);
	st.print();
	
	// Teacher setter/getter 테스트
	System.out.println("\n");
	te.setClassName("디자인 공학과");
	te.setName("김유리");
	te.setAge(30);
	te.setType('여');
	
	System.out.println("학과 : " + te.getClassName());
	System.out.println("이름 : " + te.getName());
	System.out.println("나이 : " + te.getAge());
	System.out.println("성별 : " + te.getType());
	
	// Teacher setter/getter 테스트
	System.out.println("\n");
	st.setClassName("디자인 공학과");
	st.setName("김남수");
	st.setAge(20);
	st.setScore(90);
	st.setType('남');
	
	System.out.println("학과 : " + st.getClassName());
	System.out.println("이름 : " + st.getName());
	System.out.println("나이 : " + st.getAge());
	System.out.println("점수 : " + st.getScore());
	System.out.println("성별 : " + st.getType());
	
	
	
	 ============ 나의 선생님 정보 =============
	컴퓨터 공학과입니다.
	이름은 홍길동입니다.
	성별은남입니다.
	나이는 40입니다.
	=====================================
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 김유신입니다.
	성별은 남입니다.
	나이는 16입니다.
	점수는 90점 입니다.
	=====================================
	
	
	학과 : 디자인 공학과
	이름 : 김유리
	나이 : 30
	성별 : 여
	
	
	학과 : 디자인 공학과
	이름 : 김남수
	나이 : 20
	점수 : 90
	성별 : 남
 */