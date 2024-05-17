import java.util.Scanner;
class Ex04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math;
		String result = "불합격";

		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 : ");
		math = sc.nextInt();

		int total = kor + eng + math;
		double avg = (double)total /3;

		if(avg >= 60 &&
			kor >= 40 &&
			eng >= 40 &&
			math >= 40) {
			result = "합격";
		}

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t결과");
		System.out.println("===============================");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",
							name, kor, eng, math, total, avg, result);

	}
}
