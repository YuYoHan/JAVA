import java.util.Scanner;
class Ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sell;
		int pay;

		System.out.println("입력: ");
		sell = sc.nextInt();

		// 가격
		int price = 100;
		// 할인율
		int discount = (sell * price) /10;

		if(sell >= 10) {
			pay = (sell * price) - discount;
		} else {
			pay = price * sell;
		}
		System.out.println(pay);



	}
}
