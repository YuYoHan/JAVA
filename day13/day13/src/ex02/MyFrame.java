package ex02;

import java.awt.*;

public class MyFrame extends Frame {
    // MyFrame이 LinePanel을 가지고 있다.
    LinePanel lp;


    public MyFrame() {
        lp = new LinePanel();
        // 생셩된 LinePanel을 프레임에 담아준다.
        // 담지 않으면 패널이 보이지 않음
        add(lp);
        // 틀의 사이즈 조절
        setSize(400, 300);
        // 눈에 보여줄 수 있도록 true
        setVisible(true);
    }
}
