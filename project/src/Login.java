import config.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.HashMap;

public class Login extends JFrame {
    private JTextField idField;
    private JPasswordField passwordField;
    private Index mainFrame;

    public Login(Index mainFrame) {
        this.mainFrame = mainFrame;

        // 로그인 폼을 구현할 패널 생성
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        JPanel panel2 = new JPanel();

        // 로그인 폼 필드 추가
        panel.add(new JLabel("아이디:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("비밀번호:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        // 로그인 버튼 추가
        JButton loginButton = new JButton("로그인");
        JButton loginCancel = new JButton("취소");
        panel2.add(loginButton);
        panel2.add(loginCancel);

        // 패널을 프레임에 추가
        add(panel, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        // JFrame 설정
        setSize(300, 150);
        setLocationRelativeTo(null); // 화면 가운데 정렬
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 아이디와 비밀번호 가져오기
                String id = idField.getText();
                String password = new String(passwordField.getPassword());

                // 아이디와 비밀번호를 DB와 비교하여 로그인 시도
                String sql = "SELECT * FROM user WHERE userid = '" + id + "' AND password = '" + password + "'";
                HashMap<String, String> container = DBConnection.getConnection(sql);
                if (container != null) {
                    System.out.println("로그인 성공");
                    Session.getInstance().setLoggedInUserId(id); // 로그인한 사용자 ID 저장
                    dispose(); // 현재 창 닫기
                    mainFrame.showBoard(); // 게시판 창 보여주기
                } else {
                    System.out.println("로그인 실패");
                    JOptionPane.showMessageDialog(Login.this, "로그인에 실패하였습니다.");
                }
            }
        });

        loginCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 현재 창 닫기
                mainFrame.setVisible(true); // 메인 창 다시 보이기
            }
        });
    }
}
