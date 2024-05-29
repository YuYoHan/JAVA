package ex07;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MyFrame extends JFrame {
    MyPanel panel;

    public MyFrame() throws IOException {
        panel = new MyPanel();
        add(panel);
        setSize(400, 300);
        setVisible(true);
    }
}
