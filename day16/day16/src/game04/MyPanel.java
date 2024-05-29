package game04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {
    Enermy enermy;
    Player player;
    Missile missile;

    public MyPanel() {
        super();
        // 여기서 동작할거다.
        this.addKeyListener(this);
        // 패널에 키보드 이벤트를 등록하려면
        // 포커스를 설정해야 합니다.
        this.requestFocus();
        setFocusable(true);
        enermy = new Enermy("enemy.png");
        player = new Player("player.png");
        missile = new Missile("missile.png");

        // 쓰레드를 상속받는다.
        class MyTread extends Thread {
            // 쓰레드를 사용할 수 있게 오버라이딩
            @Override
            public void run() {
                while (true) {
                    // 각각 장소를 세팅해준다.
                    enermy.update();
                    player.update();
                    missile.update();
                    // 다시 그려달라고 요청
                    repaint();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        MyTread t = new MyTread();
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        enermy.draw(g);
        player.draw(g);
        missile.draw(g);
    }

    public void keyPressed(KeyEvent event) {
        player.keyPressed(event);
        missile.keyPressed(event, player.x, player.y);
    }

    public void keyReleased(KeyEvent arg0) {
    }

    public void keyTyped(KeyEvent arg0) {
    }


}
