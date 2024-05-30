package ex06;

public class MainTest {
    public static void main(String[] args) {
        Product p = new Product();
        Producer pd = new Producer(p);
        Consumer c = new Consumer(p);
        pd.start();
        c.start();
    }
}
