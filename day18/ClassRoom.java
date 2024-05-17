package project;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassRoom {
	private String className;
	private Teacher teacher;
	private ArrayList<Student> students;

	ClassRoom() {
		className = "";
		teacher = new Teacher();
		
		// 생성만하고 초기화는 필요없다
		students = new ArrayList<>();
	}
	
	ClassRoom(String className) {
		this();	// 초기화를 꼭 해줘야 한다.
		this.setClassName(className);
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
		for (Iterator<Student> iter = students.iterator(); iter.hasNext();) {
			Student student = (Student)iter.next();
			// print 메서드를 깔끔하게 한번 정리하고 가자
			student.print();
		}
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
	
	public ArrayList<Student> getStudents() {
		return this.students;
	}
	
	// ClassRoom의 정보(학과, 선생님, 학생 정보 등)를 화면에 출력하는 메소드
	public void print() {
		Teacher tc = this.getTeacher();
		System.out.println("==========================================================");
		System.out.printf("%s 선생님 : %s(%d) 학생: %d명",
				className, tc.getName(), tc.getAge(), this.getStudentCount());
		System.out.printf("\t총점: %d 평균: %.1f", this.getTotal(), this.getAverage());
		System.out.println();

		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.printf("번호   이름   나이  국어   영어  수학   사회  과학  총점     평균\n");
		System.out.println("----------------------------------------------------------");
		
		// for (Iterator<Student> iter = students.iterator(); iter.hasNext();)
		// 문을 보다 편리하게 사용할수 있는 for(일반적으로 foreach라 부른다) 문
		int no = 1;
		for (Student item : students) {
			System.out.printf("%2d ", no++);
			System.out.printf("%5s ", item.getName());
			System.out.printf("%4d ", item.getAge());
			
			for (int i = 0; i < 5; i++) {
				System.out.printf("%4d ", item.getScore(i));
			}
			
			System.out.printf("%4d\t", item.getTotal());
			System.out.printf("%5.1f", item.getAverage());
			System.out.println();
		}		
		System.out.println("==========================================================");
	}
}
