import java.util.Scanner;
import java.util.Arrays;
class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ans = new int[10];
		int[] ansKey = {2, 3, 4, 1, 1, 3, 2, 2, 4,1};
		int result = 0;

		for (int i = 0;i < ans.length ;i++ ){
			System.out.println("정답을 적어주세요");
			ans[i] = sc.nextInt();
		}

		for (int i = 1;i <= ansKey.length ;i++ ){
			System.out.println(i + "\t");
		}
		System.out.println();

		for (int i = 0;i <= ansKey.length ;i++ ){
			if(ans[i] == anskey[i]) {
				System.out.println("O\t");
				result++;
			} else {
				System.out.println("X\t");
			}
		}
		System.out.println("\n정답수 : " + result);
		System.out.println("틀린답수 : " + (10-result));
	}
}
