package day10;

public class Overloading {
	String name;
	int score;
	
	// 생성자
	Overloading() {
	}

	// 생성자 overloading(메소드 재정의)
	Overloading(String name) {	// 매개변수 1 개
		this.name = name;
	}
	
	// 생성자 오버로딩
	Overloading(int score) {	// 매개변수 1개
		
	}
	
	// 생성자 오버로딩
	Overloading(String name, int score) { // 매개변수 2개
	}
	
	// 매개변수의 갯수 또는 매개변수의 자료형(타입)이 다르면 이름이 같아도 오버로딩 OK
	// 메소드 오버로딩
	public void print() {		
		System.out.println("프린트 기본 메소드");
	}
	
	public void print(String name) {
		System.out.println("프린트 이름 : " + name);
		//100줄이라면
	}

	public void print(int score) {
		System.out.println("프린트 점수 : " + score);
		//100줄이라면
	}
	
	public void print(String name, int score) {
		// 메소드 재사용
		this.print(name);
		this.print(score);
	}
}
