class Ex12 {
	// & 과 |는 논리연산자로 사용할 수 있다.
	public static void main(String[] args) {
		int age = 28;
		int age2 = 29;
		
		// 이 두사람이 모두 내년에는 30대가 되는지 판별해 봅시다.
		if(++age >= 30 && ++age2 >= 30) {
			System.out.println("두사람 모두 내년에는 30대 입니다.");
		} else {
			System.out.println("두사람 모두 내년에는 30대가 아닐 수 있다.");
		}
	}
}
