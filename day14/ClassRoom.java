package review;

import review.Student;
import review.Teacher;

//학급 클래스로 선생님 객체와 학생 객체들을 가지고 있는 클래스이다.
public class ClassRoom {
	// 멤버 변수
	private String className;
	private Teacher teacher;
	private Student[] students;

	// 생성자
	ClassRoom() {
		className = "";
		teacher = new Teacher();
		students = new Student[10];
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
	}
	
	ClassRoom(String className) {
		this();
		this.className = className;
	}
	
	// setter
	public void setClassName(String className) {
		this.className = className;
		this.teacher.setClassName(className);
		for(int i = 0; i < students.length; i++ ) {
			students[i].setClassName(className);
		}
	}
	
	public void setStudent(int index, Student student) {
		this.students[index] = student;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	// getter
	public String getClassName() {
		return this.className;
	}
	
	public Student getStudent(int index) {
		return this.students[index];
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	// print 메소드
	public void printClassName() {
		System.out.println(className + "입니다.");
	}
	
	public void printTeacher() {
		this.teacher.print();
	}

	public void printStudents() {
		for(int i = 0; i < students.length; i++) {
			System.out.println(i+1 + "번 학생정보.");
			students[i].print();
		}
	}
}
