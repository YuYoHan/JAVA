package review;

/* 1.
 * Student 라는 클래스를 만들고 사용하는 예제
 * 멤버 변수는 아래와 같이 정의한다.
 * 학과 표시
 * 학생 이름 표시
 * 영어, 수학 점수
 * 
 * 멤버 함수는 아래와 같이 정의한다.
 * 출력하기 함수
 * 		학과명 표시
 * 		학생이름 표시
 * 		영어, 국어 점수 표시
 * 		학생 정보 표시
 * 설정하기(Setter) 함수
 * 		학과명 설정하기
 * 		학생이름 설정하기 
 * 		영어, 국어 각각의 점수 설정하기
 * 가져오기(Getter) 함수
 * 		학과명 가져오기
 * 		학생 이름 가져오기
 * 		영어, 국어 각각의 점수 가져오기
 * 		총점 가져오기
 *  
 * 기본 생성자에서 멤버 변수를 초기값으로 초기화한다.
 * 초기 설정은 생성자를 통해 (학과, 학생명, 영어, 국어)을 설정한다.
 * 가져오는 함수는 함수명 앞에 getXXXX로 정의한다.
 * 설정하기 함수는 함수명 앞에 setXXXX로 정의한다.
 * 출력하기 함수는 자유롭게 명명하여 정의한다(print or show 등등).
*/

public class Student { 
	// 멤버변수	// OOP(객체지향프로그램) -> 캡슐화
	private String className;	// 외부에서 접근 불가(캡슐화)
	private String name;			// 외부에서 접근 가능
	private int eng;
	private int kor;

	// 기본 생성자 : 멤버 변수들을 기본값으로 초기화한다.
	Student() {
		className = "";
		name = "";
		eng = 0;
		kor = 0;
	}
	
	Student(String className, String name, int eng, int kor) {
		this.className = className;
		this.name = name;
		this.eng = eng;
		this.kor = kor;
	}

	// print 메소드
	public void printClassName() {
		System.out.println("저의 학과 명은" + className + "입니다.");
	}
	public void printName() {
		System.out.println("저의 이름은 " + name + "입니다.");
	}
	public void printEng() {
		System.out.println("저의 영어 점수는 " + eng + "점 입니다.");
	}
	public void printKor() {
		System.out.println("저의 국어 점수는 " + kor + "점 입니다.");
	}

	// print 메소드 재사용
	public void printInfo() {
		System.out.println("============ 나의 학생 정보 =============");
		printClassName();
		printName();
		printEng();
		printKor();
		System.out.println("=====================================");
	}

	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	// getter인가요? X 
	public int getTotal() {
		return eng + kor;
	}
}

