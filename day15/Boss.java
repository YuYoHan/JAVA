package review;

public class Boss extends Teacher implements SpecialJob {
	final static String JOB = "교장선생님";
	final static String SCHOOL = "코리아IT학교";

	private int joblevel;
	private String jobname;
	private int roomno;
	
	// 기본 생성자를 생성 안해줘도 괜찮다.
	public Boss() {
		this('남', "", 0);
		joblevel = 10;
		roomno = 101;
	}
	
	public Boss(char type, String name, int age) {
		// 교장선생님은 맡은 반이 없다.
		// 그래서 className을 학교이름으로 설정
		// super로 부모 클래스 Teacher 클래스에서 Teacher(String className, char type, String name, int age);
		// 4개의 매개변수를 가지고 있는데 type, name, age는 그대로 넘겨주고 Boss는 교장선생님은 학과라는 개념이 없으니
		// className을 가져오지 않고 String인 className과 같은 타입인 SCHOOL을 가져온것(같은 타입이면 상관없음)
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
