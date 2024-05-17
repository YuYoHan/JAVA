package j2day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderExam {
	public static void main(String[] args) throws Exception {
		// 파일을 읽기 위한 객체를 생성
		FileReader fr = new FileReader("D:\\java_1900_yohan\\memo\\memo\\file_in.txt", Charset.forName("UTF-8"));
	
//		int data = 0;
//		while(data != -1) {	// 파일 문장의 마지막에 가면 -1을 반환한다. 
//							// 파일의 마지막에 가면 null이 반환, end of file이라는 값으로 -1 반환
//			data = fr.read();
//			// while(data != -1) 이것때문에 마지막에 ?가 뜨는데 if(data != -1)로 방어코드를 작성해서
//			// 마지막 것까지 출력
//			if(data != -1) {
//			System.out.println((char)data);
//		}
//		}
//		fr.close();
//		System.out.println("파일 읽기 종료");
		
		// 파일을 라인 단위로 읽기 방법
		BufferedReader br = new BufferedReader(fr);
//		FileReader fr = new FileReader("D:\\java_1900_yohan\\memo\\memo\\file_in.txt", Charset.forName("UTF-8"));
		
		// 한줄을 읽어온다.
//		String line = br.readLine();
		
		// 여러줄 읽어오기
		String line = "";
		while(true) {
			line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		
		br.close();
		fr.close();
		
		// 출력
		FileWriter fw = new FileWriter("D:\\java_1900_yohan\\memo\\memo\\file_out.txt", Charset.forName("UTF-8"));
		fw.write("안녕하세요.\n");
		fw.write("Hello");
		fw.close();
	}
}
