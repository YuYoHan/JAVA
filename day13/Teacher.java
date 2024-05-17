package review;

public class Teacher extends Human {
	private String className;
	// age, name은 부모 클래스로 이동했다.

	public Teacher() {
		// super() 메소드를 이용한 초기화로 부모의 생성자이용하여 초기화할 수 있다.
		// type, name, age는 이제 여기서 초기화된다.
		super();

		this.className = "";
	}

	public Teacher(String className, char type, String name, int age) {
		// super() 메소드를 이용한 초기화로 부모의 생성자이용하여 초기화할 수 있다.
		// type, name, age는 이제 여기서 초기화된다.
		super(type, name, age);
		
		this.className = className;
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}
	
	// setName, setAge은 Human 클래스에 있다.
	
	// getter
	public String getClassName() {
		return className;
	}
	
	// getName, getAge은 Human 클래스에 있다.

	// print 메소드(추상 메소드 오버라이드)
	@Override
	public void print() {
		System.out.println("============ 나의 선생님 정보 =============");
		System.out.println(className + "입니다.");
		System.out.println("이름은 " + this.getName() + "입니다.");
		System.out.println("나이는 " + this.getAge() + "입니다.");
		System.out.println("성별은 " + this.getType() + "입니다.");
		System.out.println("=====================================");
	}
}
