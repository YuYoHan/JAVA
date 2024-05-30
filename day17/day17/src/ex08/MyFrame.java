package ex08;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JButton button01;
    JButton button02;

    public MyFrame() {
        // 배치 관리자를 FlowLayout으로 설정
        setLayout(new FlowLayout());
        button01 = new JButton("남자");
        button02 = new JButton("여자");
        add(button01);
        add(button02);


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
