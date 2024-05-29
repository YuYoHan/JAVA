package ex06;

public class Test {
    public static void main(String[] args) {
        CountDownEvent count = new CountDownEvent(10000, "hello");
        count.start();
    }
}
