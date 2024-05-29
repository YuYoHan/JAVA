package game03;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel implements KeyListener {
    // 이미지 파일을 참조하기 위한 변수 선언
    BufferedImage image = null;
    // 클래스의 필드에 현재 위치를 저장하는 변수 추가
    private int x = 0;
    private int y = 0;

    // 이동 거리를 저장하는 변수 추가
    private int moveAmount = 10;

    public MyPanel() throws IOException {
        image = ImageIO.read(new File("c.png"));
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, x, y, null);
        // 키보드 이벤트를 등록시킨다.
        addKeyListener(this);
        // 패널은 원래부터 무슨 글자를 입력하는 용도가 아니다.
        // 그래서 키보드이벤트를 등록해도 동작하지 않는다.
        // 패널에 키보드 이벤트를 등록하려면
        // 포커스를 설정해야 합니다.
        requestFocus();
        setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    System.out.println("왼쪽 방향키");
                    x -= moveAmount; // 왼쪽으로 이동
                    break;
                case KeyEvent.VK_UP:
                    System.out.println("위쪽 방향키");
                    y -= moveAmount; // 위쪽으로 이동
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("오른쪽 방향키");
                    x += moveAmount; // 오른쪽으로 이동
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("아래 방향키");
                    y += moveAmount; // 아래로 이동
                    break;
            }
            // 다시 그려줘
            repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
