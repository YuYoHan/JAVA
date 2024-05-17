import java.util.Scanner;
public class Test02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		int avg = 0;
		int total = 0;
		String result = "";

		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("국어 점수 를 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 를 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 를 입력하세요 : ");
		math = sc.nextInt();

		total = kor + eng + math;
		avg = total/3;


		System.out.println("*** 성적 처리 결과 ***");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		if(avg >= 60) {
			result = "합격";
		}  else {
			result = "불합격";
		}
		System.out.println("결과 : " + result);
	}
}