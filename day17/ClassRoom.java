
import java.util.ArrayList;
import java.util.Iterator;

public class ClassRoom {
	private String className;
	private Teacher teacher;
	/*
	 * 학생 클래스에 대한 배열 객체를 컬렉션(List) 배열로 변경하자.
	 * 기존의 일반 클래스 배열과 컬렉션 배열로 변경한 가장 큰 차이는
	 * 배열의 경우 한번 정해진 배열 사이즈(크기, 여기서는 10으로 설정)는
	 * 실행중에 동적으로 변경이 불가능하다.
	 * 하지만, 컬렉션의 경우는 사용된 개수만큼 사이즈가 유동적으로 변경된다.
	 * 즉, 예를 들어 각 교실마다 10명, 20, 13, 20명 식으로
	 * 사용되는 상황에 따라 크기를 조절하며 사용할 수 있다.
	 * 리스트의 경우 더 정확히는 사용된 크기만큼만 배열 개수가 만들어진다.  
	 */
	private ArrayList<Student> students;

	ClassRoom() {
		className = "";
		teacher = new Teacher();
		
		// 생성만하고 초기화는 필요없다(정확히는 현재 빈 공간만 만들어져 있다.)
		students = new ArrayList<>();
	}
	
	ClassRoom(String className) {
		this();
		this.className = className;
	}
	
	public void setClassName(String className) {
		// 내 클래스의 멤버 변수에 먼저 저장하고
		this.className = className;
		
		// 선생님과 학생들도 변경해주자.
		this.teacher.setClassName(className);

		// 컬렉션은 Iterator을 이용해서 반복해야한다.		
		for (Iterator<Student> iter = students.iterator(); iter.hasNext();) {
			Student student = (Student)iter.next();
			student.setClassName(className);
		}
	}

	// 컬렉션의 set 메소드를 이용해야한다.
	public void setStudent(int index, Student student) {
		// 오류 발생 outOfBounds error를 방어하기위한 방어 코드
		int length = students.size();
		if(index > length-1) {
			System.err.printf("index(%d) 가 List length(%d) 보다 크므로 설정할수 없습니다.\n", index, length);
			return;
		}

		students.set(index, student);
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getClassName() {
		return this.className;
	}
	
	// 컬렉션의 get 메소드를 이용해아한다.
	public Student getStudent(int index) {
		return students.get(index);
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void printClassName() {
		System.out.println(className + "입니다.");
	}
	
	public void printTeacher() {
		this.teacher.print();
	}

	public void printStudents() {		
		// 컬렉션은 Iterator을 이용해서 반복해야한다.
//		for (Iterator<Student> iter = students.iterator(); iter.hasNext();) {
//			Student student = (Student)iter.next();
//			// print 메서드를 깔끔하게 한번 정리하고 가자
//			student.print();
//		}
		
		// 하지만 더 편리하 foreach 라는 방법을 사용할 수도 있다.
		// students 라는 배열을 처음부터 끝까지 순회하면서 각 요소의 객체를 가져온다.
		for (Student student : students) {
			student.print();
		}
	}
	
	// 컬렉션의 set 메소드를 이용해야한다.
	public void addStudent(char type, String name, int age, int[] score) {
		/*
		 * 클래스 외부에서 메소드를 통해 입력한 각각의 정보를 이용해
		 * 내부에서 클래스 객체를 만들어 이 객체를
		 * 멤버 객체 변수인 teacher에 저장한다.
		 */
		students.add(new Student(this.className, type, name, age, score));
	}
	
	// 컬렉션의 set 메소드를 이용해야한다.
	public void setStudent(int index, char type, String name, int age, int[] score) {
		/*
		 * 클래스 외부에서 메소드를 통해 입력한 각각의 정보를 이용해
		 * 내부에서 클래스 객체를 만들어 이 객체를
		 * 멤버 객체 변수인 teacher에 저장한다.
		 */
		students.set(index, new Student(this.className, type, name, age, score));
	}
	
	public void setTeacher(char type, String name, int age) {
		/*
		 * 클래스 외부에서 메소드를 통해 입력한 각각의 정보를 이용해
		 * 내부에서 클래스 객체를 만들어 이 객체를
		 * 멤버 객체 변수인 teacher에 저장한다.
		 */
		this.teacher = new Teacher(this.className, type, name, age);
	}
	
	// 컬렉션 size 메소드를 이용
	public int getStudentCount() {
		return students.size();
	}

	public int getTotal() {
		int total = 0;
		// for (Iterator<Student> iter = students.iterator(); iter.hasNext();)
		// 문을 보다 편리하게 사용할수 있는 for(일반적으로 foreach라 부른다) 문
		for (Student student : students) {
			total += student.getTotal();
		}
		
		return total;
	}
	
	// 컬렉션 size 메소드를 이용
	public double getAverage() {
		// List 배열의 크기가 0보다 작으면 / by zero 오류가 발생
		if(students.size() <= 0) return 0;

		return this.getTotal() / students.size() / 5.0;
	}
	
	// 학생을 list 컬렉션의 마자막에 추가하는 메소드 추가
	// 추가하고 난후 사이즈를 반환하자.
	public int addStudent(Student student) {
		students.add(student);
		return students.size();
	}
	
	// 외부에서 배열 객체를 사용할 경우를 위해 배열 객체를 반환하는 메소드를 추가했다.
	// 즉 외부에서 Student 컬렉션 배열 객체를 for 문 등을 통해 사용하고자 할 경우 사용가능
	public ArrayList<Student> getStudents() {
		return this.students;
	}
}
