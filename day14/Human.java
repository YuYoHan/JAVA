package review;

// 추상 클래스
abstract class Human {
	private char type;

	// 이름과 나이를 여기로 일반화 하자
	// 모든 인간은 이름과 나이가 있다고 가정한다.
	private String name;
	private int age;

	public Human() {
		this.type = 0;
		
		// 초기화
		this.name = "";
		this.age = 0;
	}
	
	public Human(char type, String name, int age) {
		this.type = type;
		
		// 초기화
		this.name = name;
		this.age = age;
	}
	
	// 추상 메소드
	public abstract void print();

	// getter
	public char getType() {
		return type;
	}

	// getName, getAge 메소드 추가
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

	// setName, setAge 메소드 추가
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}