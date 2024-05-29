package game04;

import java.awt.event.KeyEvent;

public class Enermy extends GraphicObject{
    // 적이 왼쪽 끝에서 나옴
    int dx = -10;
    public Enermy(String name) {
        super(name);
        x = 500;
        y = 0;
    }

    public void update() {
        x += dx;
        // x의 위치가 왼쪽 끝에 도달하면
        // 다시 오른쪽으로 이동시키기 위하여 dx를 양수 10으로 설정
        if(x < 0) {
            dx += 10;
        }
        // x가 오른쪽 끝에 도달하면
        // 다시 왼쪽으로 이동시키기 위하여 dx를 음수 10으로 설정
        if(x > 500) {
            dx -= 10;
        }
    }


}
