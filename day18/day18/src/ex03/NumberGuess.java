package ex03;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NumberGuess extends JFrame {
    JTextField jtf_input;
    JLabel jLabel_result;
    int inputNum;
    int comNum;
    int cnt;

    public NumberGuess() {
        setTitle("숫자게임");
        setLayout(new FlowLayout());
        jtf_input = new JTextField(20);
        add(new JLabel("숫자를 추측하시오."));
        add(jtf_input);

        Random r = new Random();
        comNum = r.nextInt(100) + 1;

        jLabel_result = new JLabel("여기에 결과가 나옵니다.");
        add(jLabel_result);

        JButton ok = new JButton("      다시 한번       ");
        JButton x = new JButton("       종료      ");
        add(ok);
        add(x);

        setSize(250, 150);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ok.addActionListener(e -> {
            inputNum = Integer.parseInt(jtf_input.getText());
            System.out.println(inputNum);
            System.out.println(comNum);
            if(inputNum > comNum) {
                System.out.println("유저 숫자가 큽니다.");
                jLabel_result.setText("유저 숫자가 큽니다.");
                repaint();
            }
            if(inputNum == comNum) {
                System.out.println("유저 숫자와 컴터 숫자가 동일합니다.");
                jLabel_result.setText("유저 숫자와 컴터 숫자가 동일합니다.");
                repaint();
            }
            if(inputNum < comNum) {
                System.out.println("컴터 숫자가 큽니다..");
                jLabel_result.setText("컴터 숫자가 큽니다.");
            }



        });
        x.addActionListener(e -> {
            jtf_input.setText("");
            jLabel_result.setText("여기에 결과가 나옵니다.");
        });
    }

    public static void main(String[] args) {
        new NumberGuess();
    }
}
