package ex04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox03 extends JFrame {
    JLabel result;
    String[] arr = {"사과", "포도", "수박", "바나나", "오렌지"};
    JCheckBox[] jcb = new JCheckBox[arr.length];

    public void checkedList() {
        String r = "";

        for (int i = 0; i < jcb.length; i++) {
            if (jcb[i].isSelected()) {
                r += jcb[i].getText() + ",";
            }
        }

        if (r.equals("")) {
            r = "선택 해 주세요!";
        } else {
            r = r.substring(0, r.length() - 1);
            r += "를(을) 선택하였습니다.";
        }
        result.setText(r);
    }

    public CheckBox03() {
        setLayout(new FlowLayout());

        for (int i = 0; i < arr.length; i++) {
            jcb[i] = new JCheckBox(arr[i]);
            add(jcb[i]);
            jcb[i].addActionListener(e -> checkedList());
        }

        result = new JLabel("선택 해 주세요!");
        add(result);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new CheckBox03();
    }
}
