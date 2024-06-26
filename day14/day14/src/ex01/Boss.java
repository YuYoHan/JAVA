package ex01;

// Boss 클래스의 부모는 Teacher
// 인터페이스를 상속(구현)하는 방법 implements SpecialJob
public class Boss extends Teacher implements SpecialJob {
	final static String JOB = "교장선생님";
	final static String SCHOOL = "코리아IT학교";

	private int joblevel;
	private String jobname;
	private int roomno;
	
	public Boss() {
		this('남', "", 0);
		
	}
	
	public Boss(char type, String name, int age) {
		// 교장선생님은 맡은 반이 없다.
		// 그래서 className을 학교이름으로 설정
		super(SCHOOL, type, name, age);

		jobname = JOB;
		joblevel = 10;
		roomno = 101;
	}
	
	@Override
	public int getJobLevel() {
		return joblevel;
	}

	@Override
	public String getJobName() {
		return jobname;
	}

	public int getRoomNo() {
		return roomno;
	}
	
	public String getSchool() {
		return this.getClassName();
	}

	@Override
	public void setJobLevel(int joblevel) {
		this.joblevel = joblevel;
	}

	@Override
	public void setJobName(String jobname) {
		this.jobname = jobname;		
	}
	
	public void setRoomNo(int roomno) {
		this.roomno = roomno;
	}
	
	public void setSchool(String school) {
		this.setClassName(school);
	}
	
	@Override
	public void print() {
		System.out.println("============ 나의 직업 정보 =============");
		System.out.println( this.getClassName() + "의 " + jobname + "입니다.");
		System.out.println("이름은 " + this.getName() + "입니다.");
		System.out.println("나이는 " + this.getAge() + "입니다.");
		System.out.println("방번호는 " + roomno + "호 입니다.");
		System.out.println("직급으로는 " + joblevel + "레벨 입니다.");
		System.out.println("=====================================");
	}
}
