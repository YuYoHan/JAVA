package game;

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

    public MyPanel() throws IOException {
        image = ImageIO.read(new File("c.png"));
    }


    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 100, 100, null);
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
        int keyCode = e.getKeyCode();
        if(keyCode == 37) {
            System.out.println("왼쪽 누름");
        }
        if(keyCode == 39) {
            System.out.println("오른쪽 누름");
        }
        if(keyCode == 32) {
            System.out.println("스페이스 누름");
        }
        if(keyCode == 38){
            System.out.println("위쪽 누름");
        }
        if(keyCode == 40) {
            System.out.println("아래쪽 누름");
        }
        System.out.println(keyCode);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
