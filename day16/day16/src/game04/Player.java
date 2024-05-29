package game04;

import java.awt.event.KeyEvent;

public class Player extends GraphicObject {
    public Player(String name) {
        super(name);
        x = 150;
        y = 350;
    }

    public void keyPressed(KeyEvent event) {
        // 왼쪽을 누르면 왼쪽으로 10이동
        if (event.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 10;
        }
        // 오른쪽을 누르면 오른쪽으로 10이동
        if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 10;
        }
        // 위쪽을 누르면 위쪽으로 10이동
        if (event.getKeyCode() == KeyEvent.VK_UP) {
            x -= 10;
        }
        // 밑을 누르면 밑으로 10이동
        if (event.getKeyCode() == KeyEvent.VK_DOWN) {
            x += 10;
        }
    }

}
