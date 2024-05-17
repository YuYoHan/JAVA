import java.util.Scanner;
class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bornMonth;

		System.out.println("출생월를 적어줘 ");
		bornMonth = sc.nextInt();

/*
		if(bornMonth >= 1 && bornMonth <= 12) {
				if(bornMonth >= 3 && bornMonth <=5) {
				System.out.println("봄 출생");
			} else {
				System.out.println("봄 출생x");
			}
		 } else {
			System.out.println("제대로 적어줘");
		}

*/

		if(bornMonth < 1 && bornMonth > 12) {
			System.out.println("제대로 적어줘");
			return;
		}
		if(bornMonth >= 3 && bornMonth <=5) {
			System.out.println("봄 출생");
		} else {
			System.out.println("봄 출생x");
		}
	}
}
