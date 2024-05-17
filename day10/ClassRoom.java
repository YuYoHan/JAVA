package review;

/* 2.
 * ClassRoom 라는 클래스를 만들고
 * 멤버 변수는 아래와 같이 정의한다.
 * 학과 표시
 * 선생님 이름 표시
 * 학생들 표시(최대 5명)
 * 단, 학생들은 위에서 만든 Student 클래스를 사용하여 배열로 선언한다.
 * hint) Student[] students = new Student[5];
 * 
 * 멤버 함수는 아래와 같이 정의한다.
 * 출력하기 함수
 * 		학과명 표시
 * 		학생 명단 표시
 * 		학생 이름 및 총점 표시
 * 설정하기(Setter) 함수
 * 		학과명 설정(학과명을 변경하면 하위의 모든 학생의 학과명도 변경한다)
 * 		학생별 정보 설정(이름, 영어, 국어), 학과설정은 하지 않는다.
 * 		hint) setStudent(index, 이름, 영어, 국어) > (0, "홍길동", 90, 90)
 * 가져오기(Getter) 함수
 * 		학과명 가져오기
 * 		학생별 정보 가져오기
 * 		hint) getStudent(index) return "홍길동, 90, 90" 문자열로 반환
 * 		학생전체 반총점 가져오기
 * 		학생전체 반평균 가져오기
*/

public class ClassRoom extends Object { 
	// 멤버변수
	String className;
	String teacher;
//	Student stud = new Student();	// 객체 생성(클래스) -> 참조변수
//	int[] arr = new int[5];			// 배열 생성		-> 참조변수
	
	Student[] students = new Student[5];	// 배열 생성과 객체 생성

	// 클래스를 이용한 배열 변수


	// 생성자
	public ClassRoom() {
		this.className = "";
		this.teacher = "";
		
		System.out.println("학생수는 " + students.length + "명");
		// students는 배열입니다.
		for (int i = 0; i < students.length; i++) {
			//arr[i] = 0;
			students[i] = new Student();
//			students[i] = new Student("", "", 0, 0);
		}
	}

	// print 메소드
	public void printClassName() {
		System.out.println("저의 학과명은 " + className + "입니다.");
	}
	
	public void printStudents() {
		for (int i = 0; i < students.length; i++) {
			Student item = students[i];			
			item.printInfo();
//			System.out.println(i+1 + "번 " + item.getName() + " 영어 = " + item.getEng() + ", 국어 = " + item.getKor() + "점 입니다.");
		}
	}
	
	// 학생들의 총점을 출력
	public void printTotal() {
		for (int i = 0; i < students.length; i++) {
			Student a = students[i];
			System.out.println(a.getName() + " 총점 " + a.getTotal());
		}
	}

	// setXXX 메소드[setter 메소드]
	public void setClassName(String className) {
		this.className = className;	// 교실의 학과 명 설정
		for (int i = 0; i < students.length; i++) {
			Student a = students[i];
			a.setClassName(className);	// 학생들의 학과 명 설정
		}
	}
	
	public void setStudent(int index, String name, int kor, int eng) {
		// 학생들 1명씩 설정
//		students[index] = new Student(this.className, name, eng, kor);
		this.students[index].setClassName(this.className);
		this.students[index].setName(name);
		this.students[index].setKor(kor);
		this.students[index].setEng(eng);
	}

	// getXXX 메소드[getter 메소드]
	public String getClassName() {
		return this.className;
	}
	
	public String getStudent(int index) {
		// 학생 1명만 가져오자
		Student a = students[index]; 
		return a.getName() + ", " + a.getKor() + ", " + a.getEng();
	}

	public int getTotal() {
		int total = 0;
		for (int i = 0; i < students.length; i++) {
			total += students[i].getTotal();
		}
		return total;
	}
	
	// 전체 반 평균 천체 학생의 총점 / 학생수 / 과목수 
	public int getAverage() {
		System.out.println(this.getTotal());
		System.out.println(students.length);

		int avg = this.getTotal() / students.length / 2;
		return avg;
	}
}

