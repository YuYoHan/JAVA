package ex10;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton[] button = new JButton[15];

    public MyFrame() {
        // 배치 관리자를 FlowLayout으로 설정
        setLayout(new GridLayout(3, 5));
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(String.valueOf(i + 1));
            add(button[i]);
        }

        // 창 크기 조절
        setSize(400, 300);
        // 눈에 보이게 설정
        setVisible(true);
        // x를 누르면 창이 꺼짐
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
