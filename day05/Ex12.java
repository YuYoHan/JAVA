import java.util.Scanner;
class Ex12 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int total =0, avg, cnt= 0;
		int[] score = new int[10];

		for (int i = 0; i < score.length;i++ ){
			System.out.println((i+1) + "번째 학생 점수 입력");
			score[i] = sc.nextInt();
			total += score[i];
		}

		avg = total / score.length;
		for (int i = 0; i < score.length;i++ )
		{
			if(score[i] < avg) {
				cnt++;
			}
		}
		
		System.out.printf("총점은 %d이고 평균은 %d이다.\n", total, avg);
		System.out.println("평균보다 낮은 학생 수 : " + cnt);

	}
}
