package project;

public class Teacher extends Human {
	final static String JOB = "선생님";
	// 멤버 변수
	private String className;

	// 생성자
	public Teacher() {
		super();
		this.className = "";
	}

	public Teacher(String className, char type, String name, int age) {
		super(type, name, age);
		this.className = className;
	}

	// setter
	public void setClassName(String className) {
		this.className = className;
	}
	
	// getter
	public String getClassName() {
		return className;
	}

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
