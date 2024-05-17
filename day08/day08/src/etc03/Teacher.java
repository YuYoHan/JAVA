package etc03;

public class Teacher extends Human {
    private String className;
    private String name;
    private int age;

    public Teacher() {
        super();
    }

    public Teacher(char type,
                   String className,
                   String name,
                   int age) {
        super(type);
        this.className = className;
        this.name = name;
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    // print 메소드
    public void print() {
        System.out.println("============ 나의 선생님 정보 =============");
        System.out.println(className + "입니다.");
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("성별은" + type + "입니다.");
        System.out.println("나이는 " + age + "입니다.");
        System.out.println("=====================================");
    }
}
