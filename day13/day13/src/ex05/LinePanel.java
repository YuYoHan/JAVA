package ex05;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        int x, y, width, height;
        for (GrapicInfo grapicInfo : info) {
            x = grapicInfo.getX1();
            y = grapicInfo.getY1();
            width = grapicInfo.getX2() - grapicInfo.getX1();
            height = grapicInfo.getY2() - grapicInfo.getY1();
            if(grapicInfo.getX2() < grapicInfo.getX1()) {
                x = grapicInfo.getX2();
                width = grapicInfo.getX1() - grapicInfo.getX2();
            }
            if(grapicInfo.getY2() < grapicInfo.getY1()) {
                y = grapicInfo.getY2();
                height = grapicInfo.getY1() - grapicInfo.getY2();
            }
            g.drawLine(x, y, width, height);
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
