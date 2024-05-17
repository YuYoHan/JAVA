package j2day2;
// 2-1
// 추상 클래스(상속 전용이야) → 선배, 고급 개발자들이 설계
public abstract class Human {
	private String type;	// 성별
	protected int age;		// 나이
	
	
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	// 추상 메소드(기능개발은 자식클래스에서 직접해)
	public abstract void print();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
