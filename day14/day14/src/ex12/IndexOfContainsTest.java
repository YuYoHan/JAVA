package ex12;

public class IndexOfContainsTest {
    public static void main(String[] args) {
        String data = "hello java hello oracle";
        if(data.indexOf("java") != -1) {
            System.out.println("자바를 포함");
        } else {
            System.out.println("자바를 포함하지 않음");
        }
    }
}
