import java.util.Scanner;
class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String[] kor = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};

		System.out.println("0~9사이의 수를 입력하세요");
		n = sc.nextInt();
		
		if(n < 0 || n >9) {
			System.out.println("잘못된 숫자");
		}

		System.out.println(kor[n]);
		}

}
