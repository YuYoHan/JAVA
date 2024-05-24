package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 어떤 사람의 이름, 주소, 전화를 입력받아 출ㄺ하는 프로그램
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name;
        String addr;
        String phone;
        System.out.print("이름 입력 : ");
        name = sc.next();

        System.out.print("주소 입력 : ");
        addr = sc.next();

        System.out.print("폰 번호 입력 : ");
        phone = sc.next();

        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("번호 : " + phone);

        try {
            // 여기에 출력해~ 한잔해~
            // 이거는 기존의 내용을 덮어쓰기 해준다.
            // FileWriter fw = new FileWriter("c:/data/info.txt");
            // 파일 생성시에 두번째 매개변수(append mode)에 true를 주면
            // 파일이 없다면 새로 만들고 있다면 내용을 추가해준다.
            FileWriter fw = new FileWriter("c:/data/info.txt", true);
            fw.write("이름 : " + name + "\n");
            fw.write("주소 : " + addr + "\n");
            fw.write("전화 : " + phone + "\n");
            fw.close();
            System.out.println("파일이 생성되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
