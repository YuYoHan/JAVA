import java.util.Scanner;
class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n",n, i, (n*i)); 
		}

		// 2~9단 
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n",i, j, (i*j)); 
			}
		}
	}
}
