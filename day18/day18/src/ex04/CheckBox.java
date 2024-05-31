package ex04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame {
    JCheckBox box1;
    JCheckBox box2;

    public CheckBox() {
        setLayout(new FlowLayout());
        box1 = new JCheckBox("사과");
        box2 = new JCheckBox("포도");


        add(box1);
        add(box2);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        box1.addActionListener(e -> {
            if (box1.isSelected()) {
                System.out.println("사과를 선택 ");
            } else {
                System.out.println("사과를 해제 ");
            }
        });

        box2.addActionListener(e -> {
            if (box2.isSelected()) {
                System.out.println("포도를 선택 ");
            } else {
                System.out.println("포도를 해제 ");
            }
        });
    }

    public static void main(String[] args) {
        new CheckBox();
    }
}
