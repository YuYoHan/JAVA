package ex01;

import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class URLTest {
    public static void main(String[] args) {
        byte[] data = new byte[200];
        try {
            URL url = new URL("https://www.hanbit.co.kr/store/store_submain.html");
            System.out.println("url check : " + url);
            InputStream inputStream = url.openStream();
            System.out.println("inputStream 체크 : " + inputStream);

            String str = "";
            while (inputStream.read(data) != -1) {
                str += new String(data, StandardCharsets.UTF_8);
                // Java에서 배열의 모든 요소를 특정 값으로 채우기 위해 사용됩니다.
                // 이 코드의 의미는 data 배열의 모든 요소를 0으로 설정하는 것입니다.
                Arrays.fill(data, (byte) 0);
            }
            System.out.println("읽어온 데이터 : " + str);
            inputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
