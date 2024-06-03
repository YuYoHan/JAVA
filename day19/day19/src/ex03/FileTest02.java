package ex03;

import java.io.File;
import java.util.Arrays;

public class FileTest02 {
    public static void main(String[] args) {
        File file = new File("c:/data/");
        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));

        for (File i : files) {
            System.out.println(i);
        }
    }
}
