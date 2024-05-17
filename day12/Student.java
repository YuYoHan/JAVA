package review;

public class Student {
	// 멤버 변수
	String className;	// 학과명
	String name;		// 성명
	
	// 생성자(기본 생성자)
	public Student() {
		className = "";
		name = "";
	}
	
	// 생성자(초기화 생성자)
	public Student(String className, String name) {
		this.className = className;
		this.name = name;
	}

	// setter 메소드
	public void setClassName(String className) {
		this.className = className;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	// getter 메소드
	public String getClassName(){
		return this.className;
	}
	
	public String getName(){
		return this.name;
	}
	
	// print 메소드
	public void printClassName() {
		System.out.println("저의 학과 명은 " + className + "입니다.");
	}
	
	public void printName() {
		System.out.println("저의 이름은 " + name + "입니다.");
	}
	
	public void printInfo() {
		System.out.println("============ 나의 학생 정보 =============");
		// printClassName 메소드 재사용
		printClassName();
		// printName 메소드 재사용
		printName();
		System.out.println("=====================================");
	}
	
	
}