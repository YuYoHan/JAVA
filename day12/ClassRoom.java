package review;

public class ClassRoom {
	// 멤버 변수
	String className;		// 학과명
	String teacher;			// 선생님 이름
	String[] students;		// 학생들 이름

	// 생성자(기본 생성자)
	public ClassRoom() {
		className = "";				// 문자열에서 지원하는 자동 초기화
		teacher = new String();		// 문자열 클래스 생성자를 이용한 초기화(객체 생성)
		
//		String str= new String();
		
		
		students = new String[3];	// 1차원 배열 생성
		
		students = new String[]{"","",""};	// 1차원 배열 생성 및 초기화(문자열에서만 가능)
		// 1차원 배열 생성 및 초기화(클래스 생성자를 이용한 객체 생성)
		students = new String[]{new String(),new String(),new String()};

		// 반복문으로 초기화(이 방법을 더 많이 사용한다)
		for(int i = 0; i < students.length; i++) {
			students[i] = new String("");
		}
	}

	// setter 메소드
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void setTeacher(String name) {
		teacher = name;
	}
	
	// students가 배열이므로 각 배열 요소에 값을 저장하기 위해
	   // index는 배열 요소의 위치를 나타낸다.
	   public void setStudent(int index, String name) {
	     students[index]=name;
	      
	      // index = 0이면 this.students[0] 요소에 매개변수 name를 저장;
	      // index = 1이면 this.students[1] 요소에 매개변수 name를 저장;
	      // index = 2이면 this.students[2] 요소에 매개변수 name를 저장;
	      // index = 3이면 this.students[3] 요소에 매개변수 name를 저장;
	      // index = 4이면 this.students[4] 요소에 매개변수 name를 저장;
	   }
	
	// getter 메소드
	public String getClassName() {
		return this.className;
	}
	
	public String getTeacher() {
		return teacher;
	}
	
	// students가 배열이므로 각 배열 요소에 값을 가져오기 위해
		// index는 배열 요소의 위치를 나타낸다.	
		public String getStudent(int index) {
			return students[index];
			
			// index = 0이면 this.students[0] 요소에 객체를 반환;
			// index = 1이면 this.students[1] 요소에 객체를 반환;
			// index = 2이면 this.students[2] 요소에 객체를 반환;
			// index = 3이면 this.students[3] 요소에 객체를 반환;
			// index = 4이면 this.students[4] 요소에 객체를 반환;		
		}

	// print 메소드
	public void printClassName() {
		System.out.println("저의 학과명은 " + className + "입니다.");
	}
	
	public void printTeacher() {
		System.out.println("우리반 선생님 " + teacher + "님 입니다.");
	}
	
	public void printStudents() {
		// students는 배열이므로...
		for(int i = 0; i < students.length; i++) {
			System.out.println("우리반 학생 : " + students[i]);
		}
	}
	
	public static void main(String[] args) {
		ClassRoom cl= new ClassRoom();
		cl.className= "국어국문학과";
	}
}
