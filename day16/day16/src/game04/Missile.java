package game04;

import java.awt.event.KeyEvent;

public class Missile extends GraphicObject{
    // 미사일이 발사되었는지 판별하기 위한 변수
    boolean launched = false;

    public Missile(String name) {
        // 여기에 name이 받아오면 GraphicObject의 즉, 부모 클래스의
        // 생성자에 보내준다. 그리고 name 파일명을 불러온다.
        super(name);
        y = -200;
    }

    public void update() {
        if(launched) y -= 1;
        // y위치가 화면에서 벗어나면(-100보다 작아지면)
        if(y < -100) launched =false;
    }


    public void keyPressed(KeyEvent event, int x, int y) {
        // 만약 스페이스 키가 눌러지면
        if(event.getKeyCode() == KeyEvent.VK_SPACE) {
            // 미사일을 발사하기 위해 true를 담아줌
            launched = true;
            // 미사일을 플레이어의 위치에서 부터 발사시키기 위하여
            // 미사일의 x, y를 매개변수로 전달받은 플레이어의 위치 x, y로 설정
            this.x = x;
            this.y = y;
        }
    }

}
