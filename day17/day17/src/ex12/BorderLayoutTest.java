package ex12;

import javax.swing.*;
import java.awt.*;

// 화면을 동, 서, 남, 북, 가운데 5개의 영역으로 분할하여 배치하는 방식
// 보통 5개의 영역에 모두 배치하기 보다는 가운데를 중심으로 하여 중요한 컨텐츠를 가운데 놓고 부가적인
// 메뉴등을 위, 아래, 왼쪽, 오른쪽 배치하여 사용한다.
public class BorderLayoutTest extends JFrame {

    public BorderLayoutTest() {
        setLayout(new BorderLayout());
        add(new JButton("위"), BorderLayout.NORTH);
        add(new JButton("아래"), BorderLayout.SOUTH);
        add(new JButton("왼쪽"), BorderLayout.WEST);
        add(new JButton("오른쪽"), BorderLayout.EAST);
//        add(new JButton("가운데"), BorderLayout.CENTER);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
