package ex01;


import ex01.dao.UserDAO;
import ex01.dto.UserDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends JFrame {
    private JTextField nameFile;
    private JTextField userPhone;
    private JTextField addr;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private Index mainFrame;

    public SignUp(Index mainFrame) {
        this.mainFrame = mainFrame;
        // 회원가입 폼을 구현할 패널 생성
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        JPanel panel2 = new JPanel();

        // 회원가입 폼 필드 추가
        panel.add(new JLabel("이름:"));
        nameFile = new JTextField();
        panel.add(nameFile);

        panel.add(new JLabel("비밀번호 : \n(조건: 대문자,소문자,숫자,특문 포함하여 8글자 ~ 20글자)"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        panel.add(new JLabel("비밀번호 확인 : "));
        confirmPasswordField = new JPasswordField();
        panel.add(confirmPasswordField);

        panel.add(new JLabel("주소 입력 : "));
        addr = new JTextField();
        panel.add(addr);
        panel.add(new JLabel("휴대폰 번호 입력 : "));
        userPhone = new JTextField();
        panel.add(userPhone);

        // 확인 버튼 추가
        JButton signUpButton = new JButton("가입하기");
        panel2.add(signUpButton);
        JButton cancelButton = new JButton("취소");
        panel2.add(cancelButton);

        // 패널을 프레임에 추가
        add(panel, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        // JFrame 설정
        setSize(400, 350);
        setLocationRelativeTo(null); // 화면 가운데 정렬
        setVisible(true);


        // 회원가입
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 각 필드에서 데이터 가져오기
                String name = nameFile.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());
                String addrText = addr.getText();
                String phone = userPhone.getText();
                System.out.println(name + " : " + password + ", " + confirmPassword + ", " + addrText + ", " + phone);

                if (check(name)) {
                    System.out.println("사용 가능한 아이디");
                    if (checkpw(password) && checkpw(confirmPassword)) {
                        System.out.println("사용 가능한 비밀번호");
                        if (checkPhone(phone)) {
                            System.out.println("회원 가입 성공");

                            UserDTO user = new UserDTO();
                            user.setUserName(name);
                            user.setUserPw(password);
                            user.setUserAddr(addrText);
                            user.setUserPhone(phone);
                            System.out.println(user);

                            int insert = UserDAO.insert(user);
                            if (insert > 0) {
                                JOptionPane.showMessageDialog(null, "회원 가입 성공");
                                dispose(); // 현재 창 닫기
                                mainFrame.setVisible(true); // 메인 창 다시 보이기
                            } else {
                                JOptionPane.showMessageDialog(null, "회원 가입 실패");
                            }
                        }
                    }
                }
            }
        });

        // 취소
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // 현재 창 닫기
                mainFrame.setVisible(true); // 메인 창 다시 보이기
            }
        });
    }

    // 해당 이름으로 있는지 체크
    public boolean check(String name) {
        try {
            UserDTO select = UserDAO.select(name);
            if (select == null) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("이미 존재하는 회원인지 체크 실패 : " + e.getMessage());
            return false;
        }
        return false;
    }

    // 소문자, 대문자, 0~9 숫자, 특수문자 8자리 이상!(소문자, 대문자 같이 안써도 됨!)
    // 위에서 비밀번호를 생성하기위한 조건을 주기위해서 메소드 만들었다!
    public boolean checkpw(String userpw) {
        String passwordPolicy = "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,20}$";

        Pattern pattern_pwd = Pattern.compile(passwordPolicy);
        Matcher matcher_pwd = pattern_pwd.matcher(userpw);

        return matcher_pwd.matches();
    }

    public boolean checkPhone(String phone) {
        String regex = "^\\d{3}-\\d{3,4}-\\d{4}$";
        return phone.matches(regex);
    }
}
