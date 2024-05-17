package review;
// 1-1
class Human {
	char type; // 성별  // 멤버 변수

	public Human() {
		this.type = 0;
	}
	// 초기화 생성자
	public Human(char type) {
		this.type = type;
	}
	
	// getter
	public char getType() {
		return type;
	}

	// setter
	public void setType(char type) {
		this.type = type;
	}
}