package ex13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTest extends JFrame implements ActionListener {

    JTextField jtf01;
    JTextField jtf02;
    JTextField jtf03;

    public AddTest() {
        jtf01 = new JTextField(10);
        jtf02 = new JTextField(10);
        jtf03 = new JTextField(10);

        JPanel p_center = new JPanel();
        JPanel p_south = new JPanel();

        p_center.setLayout(new GridLayout(3, 2));
        p_south.setLayout(new FlowLayout(FlowLayout.CENTER));
        p_center.add(new JLabel("첫번째 정수 :"));
        p_center.add(jtf01);
        p_center.add(new JLabel("두번째 정수 :"));
        p_center.add(jtf02);
        p_center.add(new JLabel("결과 :"));
        p_center.add(jtf03);

        JButton btnAdd = new JButton("Add");
        JButton btnClear = new JButton("Clear");

        p_south.add(btnAdd);
        p_south.add(btnClear);

        setLayout(new BorderLayout());
        add(p_center, BorderLayout.CENTER);
        add(p_south, BorderLayout.SOUTH);

        setSize(400, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnAdd.addActionListener(this);
        btnClear.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("버튼이 눌러짐");
        // 눌러진 버튼의 글자를 가져온다.
        String cmd = e.getActionCommand();
        System.out.println(cmd);

        if (cmd.equals("Add")) {
            String num1Str = jtf01.getText();
            String num2Str = jtf02.getText();

            if (num1Str.equals("") ||
                    num1Str.equals(" ") ||
                    num1Str.matches("\t^[a-zA-Z]*$") ||
                    num1Str.matches("\t^[가-힣]*$") ||
                    num1Str.isEmpty() || num1Str.isBlank()) {
                jtf01.setText("");
                jtf02.setText("");
                jtf03.setText("");
            } else if (num2Str.equals("") ||
                    num2Str.equals(" ") ||
                    num2Str.matches("\t^[a-zA-Z]*$") ||
                    num2Str.matches("\t^[가-힣]*$") ||
                    num2Str.isEmpty() || num2Str.isBlank()) {
                jtf01.setText("");
                jtf02.setText("");
                jtf03.setText("");
            }

            // 정수로 변환
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            // 합계 계산
            int sum = num1 + num2;

            jtf03.setText(Integer.toString(sum));
        }

        if (cmd.equals("Clear")) {
            jtf01.setText("");
            jtf02.setText("");
            jtf03.setText("");
        }

    }

    public static void main(String[] args) {
        new AddTest();
    }
}
