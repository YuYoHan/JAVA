package ex06;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest {
    public static void main(String[] args) {
        Frame frame = new Frame("우리반");
        System.out.println("창을 만듬");
        frame.setSize(300, 300);
        System.out.println("창의 크기 설정");
        // 창을 눈으로 보여줌
        frame.setVisible(true);


        // 창을 닫는 기능
        frame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }
}
