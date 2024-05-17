package j2day2;
// 2-3
public class Teacher extends Human {

	@Override
	public void print() {
		System.out.println("저는 선생님입니다. 성별은 " +this.getType() + " 입니다.");
		
		// protected는 상속 받은 자식에서만 접근가능
		this.age =  20;
		System.out.println("저의 나이는 " + this.age + "입니다.");
	
	}
}
