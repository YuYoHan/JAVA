package review;

// 추상 클래스
abstract class Human {
	private char type; // 성별
	private String name;
	private int age;

	public Human() {
		this.type = 0;
		this.name = "";
		this.age = 0;
	}
	
	public Human(char type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age = age;
	}
	
	// 추상 메소드 모든 자식은 일단 무조건 구현해야한다.
	public abstract void print();

	// getter
	public char getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setter
	public void setType(char type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}