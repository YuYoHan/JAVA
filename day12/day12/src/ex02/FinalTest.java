package ex02;
class A {
    public void pro() {
        System.out.println("A클래스의 pro입니다.");
    }
    public final void test() {
        System.out.println("상속 금지");
    }
}
class B extends A {
    @Override
    public void pro() {
        System.out.println("B클래스의 pro입니다.");
    }
}

public class FinalTest {
    public static void main(String[] args) {
        B ob = new B();
        ob.pro();
    }
}
