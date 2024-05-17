package project;

import java.util.Scanner;

public class ScanRoom {
	// Scanner 클래스 객체를 하나 선언한다.
	private Scanner sc;
	private String className = "";	// 학과명 저장을 위해 선언
	
	// 생성자
	public ScanRoom() {
		// Scanner 객체를 초기화(생성)한다.
		sc = new Scanner(System.in);
		className = "";
	}

	// ScanRoom 클래스의 사용법을 표시하는 메소드 
	public void printGuide() {
		System.out.println("1. 학과명을 입력합니다.");
		System.out.println("2. 선생님 정보를 입력합니다.");
		System.out.println("3. 학생 정보를 입력합니다.");
		System.out.println("4. 모든 입력은 한줄에 띄어쓰기로 구분해서 입력하세요.");
		System.out.println("5. 입력예는 아래와 같습니다.");
		System.out.println("====================================================");
		System.out.println("학과 이름을 입력 : 컴퓨터공학과");
		System.out.println("선생님 정보 입력(성별 이름 나이) : 남 홍길동 50");
		System.out.println("학생 정보 입력(성별 이름 나이) (1) : 남 김유신 23");
		System.out.println("학생 정보 입력(성별 이름 나이) (2) : 남 이순신 21");
		System.out.println("학생 정보 입력(성별 이름 나이) (3) : 여 유관순 20");
		System.out.println("......");
		System.out.println("학생 정보 입력(성별 이름 나이) (10) : 여 김영희 18");
		System.out.println("====================================================");
		System.out.println();
	}
	
	// 사용자로부터 학과명을 입력받기 위한 메소드 
	public String scanClassName() {
		System.out.print("학과 이름을 입력 : ");
		className = sc.next();
		return className;
	}

	// 사용자로부터 선생님 정보를 입력받기 위한 메소드
	// 사용예 : 선생님 정보 입력(성별 이름 나이) : 남 홍길동 50
	public Teacher scanTeacher() {
		System.out.print("선생님 정보 입력 : ");
		char type = sc.next().charAt(0);
		String name = sc.next();
//		int age = sc.nextInt();
		// Wrapper 클래스를 이용해 형변환하여 받는 방법
		int age = Integer.valueOf(sc.next());

		Teacher object = new Teacher(className, type, name, age);
		return object;
	}
	
	// 사용자로부터 사용자 정보를 입력받기 위한 메소드
	// 사용예 : 학생 정보 입력(성별 이름 나이) (1) : 남 김유신 23
	public Student scanStudent(int no) {
		System.out.printf("학생 정보 입력(성별 이름 나이) (%d) : ", no);
		char type = sc.next().charAt(0);
		String name = sc.next();
		int age = sc.nextInt();
		int score[] = new int[5];
		
		// 학생들의 점수는 random 메소드를 이용해 0~100점까지의 점수를 생성합니다.
		// 5번 랜덤을 * 100을 한 이유는 random은 0.0 ~ 0.1까지의 
		// 소수를 반환하므로 *100을하여 0 ~ 100까지의 숫자를 만들기 위함
		int random = (int)(Math.random() * 100);

		score[0] = random;
		score[1] = random;
		score[2] = random;
		score[3] = random;
		score[4] = random;
		
		//for 문이용하기
//		for (int i = 0; i < score.length; i++) {
//			score[i] = random;
//		}

		Student object = new Student(className, type, name, age, score);
		return object;
	}
	
	// 학과명을 자동 테스트하기 위한 메소드 
	public String makeClassName() {
		className = "컴퓨터공학과";
		return className;
	}
	
	// 선생님 정보를 자동 테스트하기 위한 메소드
	public Teacher makeTeacher() {
		return new Teacher(this.className, '남', "홍길동", 30);
	}
	
	// 학생정보를 자동 테스트하기 위한 메소드
	public Student makeStudent() {
		// 점수는 그냥 random으로 받자.
		int random = (int)(Math.random() * 100);
		int score[] = new int[]{random, random, random, random, random};
		
		// random 값이 짝수면 '여' 홀수면 '남'으로 설정하자.
		char type = random % 2 == 0 ? '여' : '남';
		// 타입이 '여'이면 이름을 영희로 '남'이면 철수로 설정하자.
		String name = type == '여' ? "김영희" : "박철수";
		
		return new Student(this.className, type, name, 30, score);
	}
}
