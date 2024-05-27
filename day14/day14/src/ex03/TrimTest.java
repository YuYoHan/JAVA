package ex03;

public class TrimTest {
    public static void main(String[] args) {
        String data = "   hello  ";
        System.out.println(data.length());
        String trim = data.trim();
        System.out.println(trim);
    }
}
