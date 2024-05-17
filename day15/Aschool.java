package review;

public class Aschool {
	public static void main(String[] args) {
		// 테스트를 위한 객체 3개를 만들자. 
		Student st1 = new Student("컴퓨터 공학과", '남', "이순신", 22,  new int[]{10, 80, 80, 90, 70});
		Student st2 = new Student("컴퓨터 공학과", '남', "이순신", 22,  new int[]{10, 80, 80, 90, 70});
		Student st3 = new Student("컴퓨터 공학", '남', "홍길동", 12,  new int[]{80, 70, 90, 90, 40});

		// toString을 오버라이드하여 "학과 이름 나이"를 반환한다. 
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3);	// 자동으로 toString() 호출
		System.out.println("======================");
		
		// equals을 오버라이드하여 "학과 성별 나이 이름 점수(개별점수)"를 비교한다.
		System.out.println("같은 값으로 비교 = " + st1.equals(st2));
		System.out.println("다른 값으로 비교 = " + st1.equals(st3));
		System.out.println("======================");
		
		System.out.println(st1.getAverage());
		System.out.println(st3.getAverage());
		System.out.println("======================");
		
		// 두 학생의 총점(total)을 비교하여 점수가 더 큰 학생의 객체를 반환한다.
		Student max = st1.max(st3);
		System.out.println(max.toString());
	}
}
