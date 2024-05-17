package review;
// 1-4
public class Aschool {
	public static void main(String[] args) {
		// Teacher 클래스 객체 생성 및 테스트
		Teacher te = new Teacher("컴퓨터 공학과", '남', "홍길동", 40);
		te.print();

		System.out.println("\n");
		
		// Student 클래스 객체 생성 및 테스트
		Student st = new Student("컴퓨터 공학과", '남', "김유신", 16, 90);
		st.print();
		
		// Teacher setter/getter 테스트
		System.out.println("\n");
		te.setClassName("디자인 공학과");
		te.setName("김유리");
		te.setAge(30);
		te.setType('여');
		
		System.out.println("학과 : " + te.getClassName());
		System.out.println("이름 : " + te.getName());
		System.out.println("나이 : " + te.getAge());
		System.out.println("성별 : " + te.getType());
		
		// Student setter/getter 테스트
		System.out.println("\n");
		st.setClassName("디자인 공학과");
		st.setName("김남수");
		st.setAge(20);
		st.setScore(90);
		st.setType('남');
		
		System.out.println("학과 : " + st.getClassName());
		System.out.println("이름 : " + st.getName());
		System.out.println("나이 : " + st.getAge());
		System.out.println("점수 : " + st.getScore());
		System.out.println("성별 : " + st.getType());
	}
}
