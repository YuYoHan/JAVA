package ex11;

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {

    // 설정한 그리드의 수와 컴포넌트의 수가 맞지 않으면
    // 컴포넌트의 수에 알아서 맞춰 준다.
    public GridLayoutTest() {
        // 배치 관리자를 FlowLayout으로 설정
        setLayout(new GridLayout(3, 5));
        for (int i = 1; i <= 12; i++) {
            add(new JButton("버튼" +i));
        }
        // 창 크기 조절
        setSize(400, 300);
        // 눈에 보이게 설정
        setVisible(true);
        // x를 누르면 창이 꺼짐
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
