package ex04;

import javax.swing.*;
import java.awt.*;

public class JComboBoxImageLabelTest extends JFrame {
    JLabel jLabel;
    JComboBox<String> jComboBox;
    ImageIcon icon;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon icon4;
    ImageIcon icon5;

    public JComboBoxImageLabelTest() {
        icon = new ImageIcon("apple.gif");
        icon2 = new ImageIcon("banana.gif");
        icon3 = new ImageIcon("grape.gif");
        icon4 = new ImageIcon("peach.gif");
        icon5 = new ImageIcon("persimmon.gif");

        jComboBox = new JComboBox<>();
        jComboBox.addItem("사과");
        jComboBox.addItem("바나나");
        jComboBox.addItem("포도");
        jComboBox.addItem("복숭아");
        jComboBox.addItem("감");

        jLabel = new JLabel();
        add(jComboBox, BorderLayout.NORTH);
        add(jLabel, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jComboBox.addActionListener(e -> {
            String item = (String) jComboBox.getSelectedItem();
            // 선택된 항목에 따라 해당하는 이미지를 설정합니다.
            switch (item) {
                case "사과":
                    jLabel.setIcon(icon);
                    break;
                case "바나나":
                    jLabel.setIcon(icon2);
                    break;
                case "포도":
                    jLabel.setIcon(icon3);
                    break;
                case "복숭아":
                    jLabel.setIcon(icon4);
                    break;
                case "감":
                    jLabel.setIcon(icon5);
                    break;
                default:
                    // 디폴트는 아무 이미지도 표시하지 않음
                    jLabel.setIcon(null);
            }
        });
    }

    public static void main(String[] args) {
        new JComboBoxImageLabelTest();
    }
}
