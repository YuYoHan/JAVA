class Ex08 {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		// 비트 연산자
		// & : 두개가 똑같아야 1
		// | : 둘 중 하나라도 1이면 1
		// ^ : 두개를 비교해서 차이가 있으면 1
		int i = a & b;
		int j = a | b;
		int k = a ^ b;

		System.out.println("i : " + i); // 0 1 1 => 3
		System.out.println("j : " + j); // 1 1 1 => 7
		System.out.println("k : " + k); // 1 0 0 => 4
	}
}
