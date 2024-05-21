package ex02;

public abstract class Employee {
    protected String name;    //이름
    protected String no;    //사번

    public Employee(String name, String no) {
        super();
        this.name = name;
        this.no = no;
    }

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void computeSalary() {    //급여를 계산하는 메소드
        //월급제사원과 시간제 사원의 급여계산방식이 다르기 때문에
        //부모클래스를 만드는 시점에서 메소드의 body를 구체화 할 수 없어요.
        //그래 비워둡니다.
    }
}
