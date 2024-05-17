import java.util.Scanner;
class D20 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor;
		int eng;
		int math;
		int total;
		float avg;

		System.out.print("학생의 이름 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();

		total = kor + eng + math;
		avg = total /(float)3.0;
		
		System.out.printf("총점은 %d이고 평균은 %.1f이다.", total, avg);
	}
}
