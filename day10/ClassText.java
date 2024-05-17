package review;

import project.ClassRoom;
import project.Student;

public class ClassText {

	public static void main(String[] args) {
		ClassRoom cls = new ClassRoom();
		Student std = new Student();
		
		cls.setClassName("컴퓨터공학과");
		cls.setStudent(0, "김민주", 100, 100);
		cls.setStudent(1, "김채원", 90, 90);
		cls.setStudent(2, "권은비", 80, 80);
		cls.setStudent(3, "안유진", 70, 70);
		cls.setStudent(4, "사쿠라", 60, 60);
		
		System.out.println("===========================");
		System.out.println("학과명 : " + cls.getClassName());
		System.out.println("1번 학생 : " + cls.getStudent(0));
		System.out.println("2번 학생 : " + cls.getStudent(1));
		System.out.println("3번 학생 : " + cls.getStudent(2));
		System.out.println("4번 학생 : " + cls.getStudent(3));
		System.out.println("5번 학생 : " + cls.getStudent(4));
		System.out.println("===========================");
		
		cls.printclassName();
		cls.printStudents();
		cls.printTotal();
		
		std.setClassName("컴퓨터공학과");
		std.setName("홍길동");
		
		System.out.println("===========================");
		System.out.println("학과명 : " + std.getClassName());
		System.out.println("1번 학생 : " + std.getName());
		System.out.println("===========================");
		std.printClassName();
		std.printName();
		std.printInfo();
		
	}

}
