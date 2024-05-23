package ex03;
final class Person {
    String name;
    int age;

    public void sayHello() {
        System.out.println("hello, " + name);
    }
}
// final 클래스로부터 상속받을 수 없다.
//class Student extends Person {
//    String major;
//    public void  study() {
//        System.out.println("study " + major);
//    }
//}

public class FinalTest {
    public static void main(String[] args) {

    }
}
