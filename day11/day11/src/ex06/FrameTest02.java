package ex06;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends Frame implements MouseListener {

    public MyFrame(String title) {
        // 부모 생성자에게 데이터를 넘겨줌
        super(title);
        setSize(400, 300);
        setVisible(true);
        // 마우스 일처리 담당자를 등록합니다.
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("마우스 클릭함");
    }


    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("마우스 누름");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("마우스 때어짐");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("마우스 들어옴");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("마우스 나감");
    }
}

public class FrameTest02 {
    public static void main(String[] args) {
        new MyFrame("체크 중");
    }
}
