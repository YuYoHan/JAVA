package ex10;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
// Panel은 복잡한 화면구성을 위한 서브컨테이너 역할이나
// 그래픽을 표현하기 위하여 사용하는 화면 구성요소 입니다.
// 아래의 LinePanel은 그래픽을 표현하기 위하여 panel클래스로 부터 상속받고
// 마우스 움직임에 대한 이벤트 처리를 위하여 MouseListener 인터페이스를 구현합니다.
public class LinePanel extends Panel implements MouseListener {
    // 현재의 선의 시작점 x1, y1과 끝점 x2, y2를 저장하기 위한 멤버변수 선언
    int x1, y1, x2, y2;
    // 화면에 그려진 모든 선을 담기 위하여 리스트를 선언했다.
    // 리스트에는 그래픽의 정보를 표현하기 위한 GrapicInfo만 담도록 한정합니다.
    ArrayList<GrapicInfo> info;

    // 생성자이며 객체 생성시 자동 동작한다.
    public LinePanel() {
        // 객체가 생성시 바로 리스트가 생성되도록 생성자 안에 리스트 생성
        info = new ArrayList<>();
        // 마우스 이벤트 처리 담당자가 자신임을 등록해준다.
        addMouseListener(this);
    }

    // 선을 그리는 역할을 하는 메서드
    // 윈도우 프로그래밍(GUI 프로그래밍)에서는 화면을 다시 그려줘야 할 필요가 있으면
    // 다음의 paint의 메서드가 자동으로 동작한다.
    // 처음 LinePanel을 생성하여 프레임에 담으면 이 paint메서드가 자동으로 동작하고
    // 또 프레임의 크기를 조절하면 그 속에 있는 패널의 크기도 변경되기 때문에
    // 그때도 paint가 자동으로 동작한다.
    // 무언가 다시 그려줘야 할 필요가 있을 때 paint가 자동으로 동작한다.
    // 그러나 원래 윈도는 모르는 사항에 대해서 다시 그려줄것을 요청하려면
    // 우리가 paint를 직접 호출할 수 는 없고 repaint메서드를 호출하여
    // paint를 요청할 수 있다.
    @Override
    public void paint(Graphics g) {
        // 사용자가 그려진 선의 모든 정보는
        // 리스트에 담겨져 있기 때문에 리스트에 담긴 요소만큼
        // 반복실행하여 모든 선을 그려줍니다.
        for (GrapicInfo grapicInfo1 : info) {
            g.drawLine(grapicInfo1.getX1(), grapicInfo1.getY1(), grapicInfo1.getX2(), grapicInfo1.getY2());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("마우스 눌러짐");
        // 마우스가 눌러졌을 때 동작하는 메서드이고
        // 눌러진 마우스의 위치정보를 매개변수 MouseEvent e가 받아온다.
        // 이를통해 마우스가 눌러진 x,y를 선의 시작점인 x1, y1에 저장한다.
        x1 = e.getX();
        y1 = e.getY();
        info.add(new GrapicInfo(x1, y1, x2, y2));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("마우스 때어짐");
        // 마우스를 때었을 때 동작하는 메서드이고
        // 그때의 x, y를 선의 끝점을 위한 x2, y2에 저장한다.
        x2 = e.getX();
        y2 = e.getY();
        // 현재 그려진 선의 시작점 x1, y1 끝점 x2, y2를
        // 가지고 GrapicInfo객체를 생성하여 리스트에 담는다.
        info.add(new GrapicInfo(x1, y1, x2, y2));
        // 리스트에 담긴 그래픽의 정보만큼 모두 다시 그려줄 것을 요청
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
