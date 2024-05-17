package j2day5;

class ObjectText {
	int value;
	
	ObjectText(int value) {
		this.value = value;
	}
	
	// 보통 일반적으로 equals를 오버라이딩하여 기능 재정의를 한다.
	@Override
	public boolean equals(Object obj) {
//		boolean iseq = this.value == ((ObjectText)obj).value;
//		return iseq;
		
		// 예상 가능한 오류를 처리한다.
		if(obj instanceof ObjectText) {
			return this.value == ((ObjectText)obj).value;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.value + "입니다.";
//		return super.toString();
	}
	
	
}


public class ObjectExam {

	public static void main(String[] args) {
		String a = new String("10");
		String b = new String("10");
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(a == b);  		// 주소 비교
		System.out.println(a.equals(b)); 	// 클래스 비교
		System.out.println(a.toString());
		
		ObjectText ot1 = new ObjectText(10);
		ObjectText ot2 = new ObjectText(10);
		
		System.out.println(ot1 == ot2);		// false
		System.out.println(ot1.equals(ot2));
	}

}
