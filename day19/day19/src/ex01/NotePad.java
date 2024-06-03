package ex01;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;

public class NotePad extends JFrame {
    JTextArea jta;


    public NotePad() {
        super("메모장");

        jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp, BorderLayout.CENTER);
        // 컨테이너 역할
        JMenuBar jmb = new JMenuBar();
        JMenu menu_file = new JMenu("파일");
        JMenuItem file_new = new JMenuItem("새파일");
        JMenuItem file_open = new JMenuItem("열기");
        JMenuItem file_save = new JMenuItem("저장");
        menu_file.add(file_new);
        menu_file.add(file_open);
        menu_file.add(file_save);
        jmb.add(menu_file);
        setJMenuBar(jmb);


        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        file_new.addActionListener(e -> {
            System.out.println("새파일 클릭");
        });
        file_open.addActionListener(e -> {
            System.out.println("열기 클릭");
            try {
                FileReader fr = new FileReader("c:/data/meno.text");
                int ch;
                String text = "";
                // 파일의 끝이 아니라면
                while ((ch = fr.read()) != -1) {
                    text += (char)ch;
                }
                jta.setText(text);

            }catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        });
        file_save.addActionListener(e -> {
            System.out.println("저장 클릭");
            String text = jta.getText();
            System.out.println(text);

            try {
                FileWriter fw = new FileWriter("c:/data/meno.text");
                fw.write(text);
                fw.close();
                System.out.println("파일을 생성했습니다.");
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        new NotePad();
    }
}
