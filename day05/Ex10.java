import java.util.Scanner;
class Ex10 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int total =0, avg;
		int[] score = new int[5];

		for (int i = 0; i < score.length;i++ ){
			System.out.println("학생 점수 입력");
			score[i] = sc.nextInt();
			total += score[i];
		}

		avg = total / score.length;
		System.out.printf("총점은 %d이고 평균은 %d이다.", total, avg);

	}
}
