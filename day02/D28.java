class D27
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 5;
		
		// a의 값을 1증가 시키고 그 a를 i에 저장한다.
		int i = ++a;
		// b의 값을 j에 저장하고 b에 값을 1증가 시킨다.
		int j = b++;

		System.out.println(a); // 6
		System.out.println(b); // 6
		System.out.println(i); // 6
		System.out.println(j); // 5
	}
}
