class Ex02{
	public static void main(String[] args) {
		for (int i = 1; i<=10 ; i++){
			// 탈출 감행!
			if(i % 3 ==0) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("작업종료");
	}
}
