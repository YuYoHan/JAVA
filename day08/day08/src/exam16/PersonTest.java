package exam16;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("김채원", 20);
        System.out.println(p1.hashCode());
        System.out.println(p1.toString());
        System.out.println(p2.hashCode());
        System.out.println(p2.toString());
    }
}
