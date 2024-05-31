package ex01;

import javax.swing.*;
import java.awt.*;

public class KorToEng extends JFrame {
    JTextArea txt01;
    JTextArea txt02;

    public KorToEng() {
        txt01 = new  JTextArea(10, 50);
        txt02 = new  JTextArea(10, 50);

        // 버튼 생성
        JButton change = new JButton("변환");
        JButton cancel = new JButton("취소");

        // 패널 생성
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        // 패널 레이아웃 설정
        p1.setLayout(new GridLayout(1, 2, 10, 10));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));

        JScrollPane jsp01 = new JScrollPane(txt01);
        JScrollPane jsp02 = new JScrollPane(txt02);

        // 패널에 글 넣기
        p1.add(jsp01);
        p1.add(jsp02);
        // 패널에 버튼 추가
        p2.add(change);
        p2.add(cancel);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new KorToEng();
    }
}
