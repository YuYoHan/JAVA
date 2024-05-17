package j2day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamExam {
	public static void main(String[] args) throws Exception {
		// 파일입출력스트림 방식은 한글과 중국어의 2바이트 이상의 문자들은 깨지는 문제가 있다.
		FileInputStream fis = new FileInputStream("D:\\java_1900_yohan\\memo\\memo\\file_in.txt");
		
		// 파일에서 맨 앞의 한 글자를 읽고 위치는 다음 글자로 이동한다.
		System.out.println((char)fis.read());		// 첫번째 글자 : 1
		System.out.println((char)fis.read());		// 두번째 글자 : a
		// 세번째 글자 : ? (가 ← 이렇게 나와야는데 한글과 중국어는 1byte라 읽지를 못함)
		System.out.println((char)fis.read());
		
		int data = 0;
		while(data != -1) {	// 파일 문장의 마지막에 가면 -1을 반환한다. 
							// 파일의 마지막에 가면 null이 반환, end of file이라는 값으로 -1 반환
			data = fis.read();
			// while(data != -1) 이것때문에 마지막에 ?가 뜨는데 if(data != -1)로 방어코드를 작성해서
			// 마지막 것까지 출력
			if(data != -1) {
			System.out.println((char)data);
		}
		}	
		fis.close();
		System.out.println("파일 읽기 종료");
		
		// 파일 출력
		FileOutputStream fos = new FileOutputStream("D:\\java_1900_yohan\\memo\\memo\\file_out.txt");
	
		//  해당 파일에 한글자를 쓰고 다음 위치로 이동
		fos.write('1');
		fos.write('2');
		fos.write('\n');
		fos.write('3');
		
		fos.close();
		System.out.println("파일 쓰기 종료");
	
	}
}
