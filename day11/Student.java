package review;
// 1-3
// extends를 통해 Human 클래스를 상속 받는다.
// 즉, Human이 부모 클래스가 되고 Student는 자식 클래스가 된다.
public class Student extends Human {
	// 멤버 변수
	String className;
	String name;

	// age, score 멤버 변수 추가
	int age;
	int score;

	// 생성자(기본 생성자)
	public Student() {
		className = "";
		name = "";
		
		// 초기화 추가
		age = 0;
		score = 0;
	}

	// 생성자(초기화 생성자)
	public Student(String className, char type, String name, int age, int score) {
		this.className = className;
		this.name = name;

		// 초기화 추가
		this.age = age;
		this.score = score;

		// 상속한 부모의 멤버 변수 type 값을 설정한다.
		this.type = type;
	}

	// setter 메소드
	public void setClassName(String className) {
		this.className = className;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// setType()은 부모가 가지고 있으므로 정의하지 않는다. 

	// getter 메소드
	public String getClassName() {
		return this.className;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getScore() {
		return this.score;
	}
	
	// getType()은 부모가 가지고 있으므로 정의하지 않는다.

	// print 메소드
	public void print() {
		System.out.println("============ 나의 학생 정보 =============");
		System.out.println(className + "입니다.");
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("성별은 " + type + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
		System.out.println("점수는 " + score + "점 입니다.");
		System.out.println("=====================================");
	}
}