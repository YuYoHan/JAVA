package game03;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MyFrame extends JFrame {
    MyPanel panel;

    public MyFrame() throws IOException {
        // 프레임의 배경색을 흰색으로 설정
        setBackground(Color.white);
        panel = new MyPanel();
        add(panel);
        setSize(400, 300);
        setVisible(true);
        // 프레임을 닫으면 프로그램을 종료하도록 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
