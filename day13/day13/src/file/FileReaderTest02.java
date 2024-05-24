package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// /c:/data/info.txt 파일의 내용을 메모리로 읽어 들여 화면에 출력
public class FileReaderTest02 {
    public static void main(String[] args) {

        try {
            // 경로에 있는 파일을 읽는 역할을 한다.
            FileReader fr = new FileReader("c:/data/info.txt");
            int ch;
            StringBuilder data = new StringBuilder();

            while ((ch = fr.read()) != -1) {
                data.append((char) ch);
            }
            System.out.println(data);

            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
