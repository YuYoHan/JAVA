import java.util.Scanner;
class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int lastDate =31;

		System.out.println("월을 입력하세요");
		n = sc.nextInt();
		
		if(n < 1 || n > 12) {
			System.out.println("입력오류");
			return;
		}

		switch(n) {
			case 4 : case 6 : case 9 : case 11 :
				lastDate = 30;
				break;
			case 2 : lastDate = 28; break;
		}
		System.out.println(lastDate);
		}
}
