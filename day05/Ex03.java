class Ex03{
	public static void main(String[] args) {
		for (int i = 1; i<=10 ; i++){
			// 2번을 건너띄기
			if(i == 2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("작업종료");
	}
}
