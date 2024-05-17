import java.util.Scanner;
class Ex14{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,n2, d = 1, d2 = 1;
		String str = "*";

		System.out.println("별 몇줄 : ");
		n = sc.nextInt();
		System.out.println("별 몇칸 : ");
		n2 = sc.nextInt();

		while(d <= n) {
			while(d2 <= n2 ) {
				System.out.print("*");
				d2++;
			}
			d++;
		}
		System.out.println();
	}
}
