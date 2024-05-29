package ex07;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel {
    // 이미지 파일을 참조하기 위한 변수 선언
    BufferedImage image = null;

    public MyPanel() throws IOException {
        image = ImageIO.read(new File("c.png"));
    }


    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 100, 100, null);
    }
}
