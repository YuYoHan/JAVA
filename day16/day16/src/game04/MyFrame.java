package game04;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("My Game");
        add(new MyPanel());
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
