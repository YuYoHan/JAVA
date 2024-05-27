package ex13;

public class SplitTest02 {
    public static void main(String[] args) {
        String data = "홍길동 임유나 변시우 조영흔 유요한";
        // ,로 분리
        String[] splitData = data.split(" ");
        for (String name : splitData) {
            System.out.println(name);
        }

    }
}
