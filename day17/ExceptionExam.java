package j2day8;

import java.io.IOException;

public class ExceptionExam {
	public static void main(String[] args) {
		// 오류로 시스템이 종료하는 상황
//		System.out.println("1. 시스템 시작");
//		int score = 100;
//		int avg = score/0;
//		System.out.println(avg);
//		System.out.println("2. 시스템 종료");
		
		// 시스템이 종료하지 않도록 try catch를 사용해 보자
		System.out.println("1. 시스템 시작");
		try {
			// 여기에 우리가 사용하는 일반적인 코드를 작성한다.
			int score = 100;
			int avg = score/0;
			System.out.println(avg);
		} catch (Exception e) {
			// 예외상황(오류) 발생시 작성할 코드를 작성한다.
			System.err.println("3. 오류가 발생했습니다.");
//			e.printStackTrace();
		}
		System.out.println("2. 시스템 종료");
		
		try {
			print(0);
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("5. Throws 오류 입니다.");
		}
		System.out.println("4. 프로그램 종료");		
	}
	
	public static int print(int a) throws Exception {
		int score = 100;
		int avg = score/a;
		return avg;
	}
}
