package ex03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class FileTest03 extends JFrame {
    JList<?> list;
    JTextArea jta;
    File file;
    Vector<String> v;

    public FileTest03() {
        v = new Vector<>();
        file = new File("c:/data/");
        String[] fileList = file.list();

        for (String name : fileList) {
            if(name.endsWith(".txt")) {
                v.add(name);
            }
        }

        list = new JList<>(v);
        jta = new JTextArea();
        JScrollPane jsp_list = new JScrollPane(list);
        JScrollPane jsp_jta = new JScrollPane(jta);
        add(jsp_list, BorderLayout.WEST);
        add(jsp_jta, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        list.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int clickCount = e.getClickCount();
                System.out.println(clickCount);
                String name = list.getSelectedValue().toString();
                if(clickCount == 2) {
                    file = new File("c:/data/"+name);
                    boolean delete = file.delete();
                    if(delete) {
                        System.out.println("삭제되었습니다.");
                    } else {
                        System.out.println("삭제 실패했습니다.");
                    }
                    jta.setText("");
                    File dir = new File("c:/data");
                     String[] arr = dir.list();
                    v.clear();
                    for (String s : arr) {
                        if(s.endsWith(".txt")) {
                            v.add(s);
                        }
                    }
                    // 벡터의 내용이 바뀌었으니 리스트를 다시 그려줄 것을 요청
                    list.updateUI();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                String name = list.getSelectedValue().toString();
                System.out.println(name);
                FileReader fr = null;
                try {
                    fr = new FileReader("c:/data/"+name);
                    int ch;
                    StringBuilder data = new StringBuilder();
                    while ((ch = fr.read()) != -1) {
                        data.append((char) ch);
                    }
                    jta.setText(data.toString());
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                } finally {
                    if(fr != null) {
                        try {
                            fr.close();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new FileTest03();
    }
}
