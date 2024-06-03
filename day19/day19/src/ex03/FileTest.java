package ex03;

import java.io.File;

// c://data/bus.png 파일을 삭제하는 프로그램
public class FileTest {
    public static void main(String[] args) {
        File file = new File("c:/data/bus.png");
        System.out.println("3초 뒤에 삭제됩니다.");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        boolean delete = file.delete();
        if(delete) {
            System.out.println("삭제되었습니다.");
        } else {
            System.out.println("삭제하는데 실패했습니다.");
        }
    }
}
