package ex11;

public class ReplaceTest {
    public static void main(String[] args) {
        String data = "hello java hello oracle";
//        String data2 = data.replace("hello", "안녕");
        String data2 = data.replaceAll("hello", "안녕");
        System.out.println(data);
        System.out.println(data2);
    }
}
