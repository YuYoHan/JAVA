package ex09;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        int sel;
        Scanner sc = new Scanner(System.in);
        String name, addr, phone;

        while (true) {
            menu();
            sel = sc.nextInt();
            if (sel == 0) {
                break;
            } // end if
            switch (sel) {
                case 1:
                    insertStudent(students);
                    break;
                case 2:
                    searchStudent(students);
                    break;
                case 3:
                    deleteStudent(students);
                    break;
            }
        }// end while
        System.out.println("프로그램 종료");
    }

    private static void insertStudent(ArrayList<Student> data) {
        Scanner sc = new Scanner(System.in);
        String name, addr, phone;
        System.out.println("--- 학생 정보 추가 ---");
        System.out.print("이름 입력 : ");
        name = sc.next();
        System.out.print("주소 입력 : ");
        addr = sc.next();
        System.out.print("폰번호 입력 : ");
        phone = sc.next();

        Student s = new Student(name, addr, phone);
        // 매개변수로 받은 빈 리스트에 넣어준다.
        data.add(s);
        System.out.println("학생의 정보를 추가했습니다.");
        System.out.println("------------------------");
    }

    private static void searchStudent(ArrayList<Student> data) {
        Scanner sc = new Scanner(System.in);
        String phoneNum;
        System.out.print("전화번호로 검색 : ");
        phoneNum = sc.next();
        boolean flag = false;

        for (Student student : data) {
            if (student.getPhoneNum().equals(phoneNum)) {
                System.out.println("--- 찾고자 하는 학생의 정보 ---");
                System.out.println(student);
                System.out.println("-----------------------------");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("찾고자하는 학생의 정보가 없습니다.");
        }
    }

    private static void deleteStudent(ArrayList<Student> data) {
        Scanner sc = new Scanner(System.in);
        String phoneNum;
        System.out.print("전화번호로 삭제 : ");
        phoneNum = sc.next();
        boolean flag = false;
        for (Student s : data) {
            if(s.getPhoneNum().equals(phoneNum)) {
                data.remove(s);
                System.out.println("학생을 삭제했습니다.");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("해당 학생은 존재하지 않습니다.ㅌ");
        }
    }

    private static void menu() {
        System.out.println("1. 추가 2. 검색 3. 삭제 0. 종료");
        System.out.println("메뉴를 출력하세요 ==> ");
    }
}
