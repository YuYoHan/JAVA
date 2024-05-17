package review;
/*
 * 5차 프로젝트 과제 목표
 * 	Object 클래스
 * 
 * toString() 메소드 오버라이딩
 * equals() 메소드 오버라이딩
 */

/* 1.
 *  
 * 모든 객체의 조상인 Object에 있는 
 * toString() 메소드를 오버라이딩하자.
 * 
 * Student 객체의 toString() 메소드를 
 * 만들어 아래와 같이 출력되도록 한다.
 * 
 * public String toString()
 * 반환값은 "학과명 이름 나이"를 반환하도록 한다.
 * 
 * 메소드 결과반환 예
 * 	컴퓨터 공학과 이순신 22
 */

/* 2.
 *  
 * 모든 객체의 조상인 Object에 있는 
 * equals() 메소드를 오버라이딩하자.
 * 
 * Student 객체의 equals() 메소드를 
 * 만들어 아래와 같이 내부를 구현한다.
 * 
 * 1. 학생 성별 비교
 * 2. 학생 나이 비교
 * 3. 학생 학과 비교
 * 4. 학생 이름 비교
 * 5. 학생 점수 비교
 * 
 * hint>
 * 3,4번 String의 비교는 equals() 메소드 이용
 * 5번 int[] 배열 비교는 Arrays.equals(a, b) 메소드 이용 
 */

/* 3.
 * 학생의 총점을 비교하여 값이 큰 학생 객체를 
 * 반환하는 메소드를 구현한다.
 * 
 * 메소드명
 *  public Student max(Student st)
 *  
 * 반환값
 * 	Student 객체
 * 
 */

/* 4.
 * School 클래스를 만들고 여기에 main() 메소드를 추가한다.
 * 그리고 아래와 같이 위에서 만들어진 클래스들을 테스트한다. 
 * 
	Student st1 = new Student("컴퓨터 공학과", '남', "이순신", 22,  new int[]{10, 80, 80, 90, 70});
	Student st2 = new Student("컴퓨터 공학과", '남', "이순신", 22,  new int[]{10, 80, 80, 90, 70});
	Student st3 = new Student("컴퓨터 공학", '남', "홍길동", 12,  new int[]{80, 70, 90, 90, 40});

	// toString을 오버라이드하여 "학과 이름 나이"를 반환한다. 
	System.out.println(st1.toString());
	System.out.println(st2.toString());
	System.out.println(st3.toString());
	System.out.println("======================");
	
	// equals을 오버라이드하여 "학과 성별 나이 이름 점수(개별점수)"를 비교한다.
	System.out.println("같은 값으로 비교 = " + st1.equals(st2));
	System.out.println("다른 값으로 비교 = " + st1.equals(st3));
	System.out.println("======================");
	
	System.out.println(st1.getAverage());
	System.out.println(st3.getAverage());
	System.out.println("======================");
	
	// 두 학생의 총점(total)을 비교하여 점수가 더 큰 학생의 객체를 반환한다.
	Student max = st1.max(st3);
	System.out.println(max.toString());
	
	출력결과

	컴퓨터 공학과 이순신 22
	컴퓨터 공학과 이순신 22
	컴퓨터 공학 홍길동 12
	======================
	같은 값으로 비교 = true
	다른 값으로 비교 = false
	======================
	66.0
	74.0
	======================
	컴퓨터 공학 홍길동 12
	
 */