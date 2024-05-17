import java.util.Arrays;
class Ex08{
	public static void main(String[] args) {
		int[] lotto = new int[6];
		lotto[0] = 2;
		lotto[1] = 43;
		lotto[2] = 21;
		lotto[3] = 7;
		lotto[4] = 16;
		lotto[5] = 33;

		for (int i = 0 ;i < lotto.length;i++ )
		{
			System.out.printf("%5d", lotto[i]);
		}

	}
}
