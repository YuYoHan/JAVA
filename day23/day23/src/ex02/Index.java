package ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame {

    public Index() {
        JLabel jLabel = new JLabel("메인페이지", SwingConstants.CENTER);
        setBackground(Color.CYAN);

        // 버튼을 담을 패널 생성
        JPanel jPanel = new JPanel();
        // JLabel을 JPanel에 담기위한 패널
        jPanel.setLayout(new GridLayout(1, 1));
        // 패널에 라벨을 추가
        jPanel.add(jLabel);

        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));

        // 버튼 생성
        JButton signUpButton = new JButton("회원가입");
        jPanel2.add(signUpButton);
        JButton loginButton = new JButton("로그인");
        jPanel2.add(loginButton);
        JButton exitButton = new JButton("나가기");
        jPanel2.add(exitButton);

        setLayout(new BorderLayout());
        add(jPanel, BorderLayout.CENTER);
        add(jPanel2, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 회원가입
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SingUp(Index.this);
                setVisible(false);
            }
        });
        // 로그인 버튼 클릭 시
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login(Index.this); // 로그인 창 보여주기
                setVisible(false); // 현재 창 숨기기
            }
        });
        // 나가기
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 현재 윈도우를 닫음
            }
        });
    }
    // 로그인 후 보이는 창
    public void afterLogin() {
        // 기존 컴포넌트들을 제거
        getContentPane().removeAll();
        String currentUser = SessionManager.getCurrentUser();
        System.out.println("현재 접속중인 닉네임 : " + currentUser);

        JButton logout_button = new JButton("로그아웃");


        logout_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("로그아웃 메뉴를 선택하였습니다.");
                SessionManager.logoutUser();
                dispose(); // 현재 윈도우를 닫음
                setVisible(true);
            }
        });

    }
}
