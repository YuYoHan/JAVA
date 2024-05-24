package ex02;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinePanel extends Panel implements MouseListener {
    int x1, y1, x2, y2;
    LinkedList<GrapicInfo> info;

    public LinePanel() {
        info = new LinkedList<>();
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        // 사각형 그리기는 x, y, width, height를 전달해야 한다.
        // 그래서 시작점과 끝점을 통해서 width, height를 계산한다.
        int x = x1;
        int y = y1;
        int width = x2 - x1;
        int height = y2 - y1;

        // x2가 x1보다 더 작은가?
        if(x2 < x1) {
            x = x2;
            width = x1 - x2;
        }
        // y2가 y1보다 더 작은가?
        if(y2 < y1) {
            y = y2;
            height = y1 - y2;
        }

        g.drawRect(x, y, width, height);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("마우스 눌러짐");
        x1 = e.getX();
        y1 = e.getY();
        info.add(new GrapicInfo(x1, y1, x2, y2));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("마우스 때어짐");
        x2 = e.getX();
        y2 = e.getY();
        info.add(new GrapicInfo(x1, y1, x2, y2));
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
