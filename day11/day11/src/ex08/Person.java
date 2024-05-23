package ex08;

public abstract class Person {
    protected int age;
    protected String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();
    // 오버라이딩 불가능
    public final void print() {
        System.out.println("인상 정보");
    }
}
