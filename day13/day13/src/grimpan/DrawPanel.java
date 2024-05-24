package grimpan;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class DrawPanel extends Panel implements MouseListener {
    int x1, y1, x2, y2;
    ArrayList<GrapicInfo> list;
    int drawType; // 0: 선 1: 사각형 2: 원
    Color color;

    public DrawPanel() {
        list = new ArrayList<>();
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        int x, y, width, height;

        //info에 들어 있는 drawType에 따라
        //해당 그래픽(선,사각형,원)을 그리도록 코드를 수정합니다.
        for (GrapicInfo info : list) {
            g.setColor(info.getColor());
            x = info.getX1();
            y = info.getY1();
            width = info.getX2() - info.getX1();
            height = info.getY2() - info.getY1();

            if (info.getX2() < info.getX1()) {
                x = info.getX2();
                width = info.getX1() - info.getX2();
            }

            if (info.getY2() < info.getY1()) {
                y = info.getY2();
                height = info.getY1() - info.getY2();
            }

            switch (info.getDrawType()) {
                case 0:
                    g.drawLine(info.getX1(), info.getY1(),
                            info.getX2(), info.getY2());
                    break;
                case 1:
                    g.drawRect(x, y, width, height);
                    break;
                case 2:
                    g.drawOval(x, y, width, height);
                    break;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("마우스 눌러짐");
        x1 = e.getX();
        y1 = e.getY();
        list.add(new GrapicInfo(x1, y1, x2, y2, drawType, color));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("마우스 때어짐");
        x2 = e.getX();
        y2 = e.getY();
        list.add(new GrapicInfo(x1, y1, x2, y2, drawType, color));
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
