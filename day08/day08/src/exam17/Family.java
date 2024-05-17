package exam17;

public class Family {
    private String name;
    private int age;
    private static String addr;

    public Family(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("name: " + name + ", age: " + age);
    }

    public static void pro() {
        System.out.println("static 체크");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getAddr() {
        return addr;
    }

    public static void setAddr(String addr) {
        Family.addr = addr;
    }


}
