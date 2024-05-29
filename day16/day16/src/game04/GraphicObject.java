package game04;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// 미래에 만들어질 적, 미사일, 플레이어이 가져야할 공통적인 속성과 동작을
// 뽑아서 일반화를 시킨다. (부코 클래스를 만들어요)
public class GraphicObject {
    // 적, 미사일, 플레이어을 나타낼 이미지를 담을 변수
    BufferedImage image = null;
    // 이미지를 출력할 좌표 x, y
    int x = 0, y = 0;
    // 생성자를 만든다.
    // 생성시에 이미지 파일명을 매개명으로 전달받아서
    // BufferedImage를 생성해준다.
    public GraphicObject(String name) {
        try {
            image = ImageIO.read(new File(name));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
