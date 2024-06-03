package ex04;

import javax.swing.*;
import java.awt.*;

public class ImageButton extends JFrame {
    ImageIcon icon;
    ImageIcon icon2;
    ImageIcon icon3;
    JButton button;

    public ImageButton() {
        icon = new ImageIcon("apple.gif");
        icon2 = new ImageIcon("banana.gif");
        icon3 = new ImageIcon("grape.gif");

        button = new JButton(icon);
        button.setRolloverIcon(icon2);
        button.setPressedIcon(icon3);

        setLayout(new FlowLayout());
        add(button);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageButton();
    }
}
