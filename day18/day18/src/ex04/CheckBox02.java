package ex04;

import javax.swing.*;
import java.awt.*;

public class CheckBox02 extends JFrame {
    JCheckBox box1;
    JCheckBox box2;
    JLabel label;

    public CheckBox02() {
        setLayout(new FlowLayout());
        box1 = new JCheckBox("사과");
        box2 = new JCheckBox("포도");
        label = new JLabel();

        add(box1);
        add(box2);
        add(label);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box1.addActionListener(e -> {
            if (box1.isSelected() && box2.isSelected()) {
                label.setText("사과, 포도 선택");
            } else if (box1.isSelected()) {
                label.setText("사과 선택");
            } else if (box2.isSelected()) {
                label.setText("포도 선택");
            } else {
                label.setText("아무것도 선택하지 않았습니다.");
            }
        });

        box2.addActionListener(e -> {
            if (box1.isSelected() && box2.isSelected()) {
                label.setText("사과, 포도 선택");
            } else if (box1.isSelected()) {
                label.setText("사과 선택");
            } else if (box2.isSelected()) {
                label.setText("포도 선택");
            } else {
                label.setText("아무것도 선택하지 않았습니다.");
            }
        });
    }

    public static void main(String[] args) {
        new CheckBox02();
    }
}
