package jdbc04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame {

    public Index() {
        beforeLogin();
    }

    public void beforeLogin() {
        // JLabel을 사용하여 여러 줄의 텍스트 표시
        JLabel jLabel =
                new JLabel("<html>안녕하세요.<br>KOSTA 게시글입니다.</html>", SwingConstants.CENTER);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        setBackground(Color.CYAN);


        // 버튼을 담을 패널 생성
        JPanel jp_center = new JPanel();
        // JLabel을 담기 위한 패널
        jp_center.setLayout(new GridLayout(1, 1));
        // 패널에 라벨을 추가
        jp_center.add(jLabel);


        JPanel jp_south = new JPanel();
        jp_south.setLayout(new FlowLayout(FlowLayout.CENTER));

        // 버튼 생성
        JButton signUpButton = new JButton("회원가입");
        jp_south.add(signUpButton);
        JButton loginButton = new JButton("로그인");
        jp_south.add(loginButton);
        JButton exitButton = new JButton("나가기");
        jp_south.add(exitButton);

        setLayout(new BorderLayout());
        add(jp_center, BorderLayout.CENTER);
        add(jp_south, BorderLayout.SOUTH);


        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 회원가입
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SignUp(Index.this);
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

    // 게시판 창 보여주는 메서드
    public void showBoard() {
        // 기존 컴포넌트들을 제거
        getContentPane().removeAll();
        String name = Session.getInstance().getLoggedInUserId();
        System.out.println("로그인 한 아이디 : " + name);

        // JLabel을 사용하여 여러 줄의 텍스트 표시
        JLabel jLabel =
                new JLabel("<html>" + name + "님 안녕하세요.<br>KOSTA 게시글입니다.</html>", SwingConstants.CENTER);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        setBackground(Color.CYAN);

        // 버튼을 담을 패널 생성
        JPanel jp_center = new JPanel();
        // JLabel을 담기 위한 패널
        jp_center.setLayout(new GridLayout(1, 1));
        // 패널에 라벨을 추가
        jp_center.add(jLabel);

        JPanel jp_south = new JPanel();
        jp_south.setLayout(new FlowLayout(FlowLayout.CENTER));

        // 버튼 생성
        JButton button1 = new JButton("회원정보");
        JButton button2 = new JButton("상품관리");
        JButton button4 = new JButton("로그아웃");

        // 버튼을 패널에 추가
        jp_south.add(button1);
        jp_south.add(button2);
        jp_south.add(button4);

        // 각 버튼에 액션 리스너 추가
        // 회원 정보 보기
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("회원정보 메뉴를 선택하였습니다.");
                dispose();
                new UserInfo(Index.this);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("차량검색 메뉴를 선택하였습니다.");
                dispose();
//                new Goods(Index.this);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("로그아웃 메뉴를 선택하였습니다.");
                dispose(); // 현재 윈도우를 닫음
                beforeLogin();
            }
        });

        // 패널을 프레임에 추가
        add(jp_south, BorderLayout.SOUTH);
        revalidate(); // 변경된 GUI를 다시 그리도록 갱신

        // JFrame 설정
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Index();
    }
}
