package ex04;

import javax.swing.*;
import java.awt.*;

public class JComboBoxTest extends JFrame {
    JComboBox<String> jbc;
    JLabel jlb;

    public JComboBoxTest() {
        jbc = new JComboBox<>();
        jbc.addItem("사과");
        jbc.addItem("포도");
        jbc.addItem("수박");
        jbc.addItem("딸기");
        jbc.addItem("오렌지");

        jlb = new JLabel();
        add(jbc, BorderLayout.NORTH);
        add(jlb, BorderLayout.CENTER);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jbc.addActionListener(e -> {
            String item = (String) jbc.getSelectedItem();
            jlb.setText(item + "을(를) 선택했습니다.");
        });
    }


    public static void main(String[] args) {
        new JComboBoxTest();
    }
}
