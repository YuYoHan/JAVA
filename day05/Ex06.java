class Ex06 
{
	public static void main(String[] args) 
	{
		String data;
		data = "HelloHello";
		char ch;
		int cnt =0;

		// System.out.println(data.charAt(0));
		for (int i = 0; i < data.length(); i++){
			ch = data.charAt(i);
			if (ch == 'o'){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
