package ex01;



import ex02.UserDAO;
import ex02.UserDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

public class UserInfo extends JFrame{
    private JTextField userLoginId;
    private JTextField userPassword;
    private JTextField userEmail;
    private JTextField userNickName;
    private Vector<String> colNames;
    private Vector<Vector<String>> rowData;
    private JTable table;
    private String selectedId;

    public UserInfo(Index mainPage) {
        userLoginId = new JTextField(5);
        userPassword = new JTextField(7);
        userEmail = new JTextField(7);
        userNickName = new JTextField(10);

        JPanel p = new JPanel();
        p.add(new JLabel("아이디"));
        p.add(userLoginId);
        p.add(new JLabel("비밀번호"));
        p.add(userPassword);
        p.add(new JLabel("이메일"));
        p.add(userEmail);
        p.add(new JLabel("닉네임"));
        p.add(userNickName);

        JButton btnUpdate = new JButton("수정");
        JButton btnCancel = new JButton("취소");
        p.add(btnUpdate);
        p.add(btnCancel);
        colNames = new Vector<>();
        colNames.add("아이디");
        colNames.add("비밀번호");
        colNames.add("이메일");
        colNames.add("닉네임");
        rowData = new Vector<>();
        table = new JTable(rowData, colNames);
        JScrollPane jsp = new JScrollPane(table);
        add(p, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);

        loadUser();

        setSize(650, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // JTable의 데이터를 갖고 있는 rowData로 부터 선택한 행의 정보를 가지고 온다.
                int idx = table.getSelectedRow();
                // 가지고 온 정보를 찾아서 Vector에 넣어준다.
                Vector<String> row = rowData.get(idx);
                // 갖고온 벡터로 부터 이름을 뽑아온다.
                System.out.println(row.get(0));
                selectedId = row.get(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        // 수정
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowData.clear();
                UserDTO user = new UserDTO();

                user.setUserPw(use.getText());
                user.setUserEmail(userAddr.getText());
                user.setNickName(userPhone.getText());
                System.out.println(user);
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                mainPage.showBoard();
            }
        });
    }

    public void loadUser() {
        //JTable에 출력하는 메소드
        rowData.clear();
        String selected = selectedId;
        UserDTO select = UserDAO.select(selected);
        Vector<String> v = new Vector<>();
        v.add(select.getUserId() + "");
        v.add(select.getUserLoginID());
        v.add(select.getUserPw());
        v.add(select.getUserEmail());
        v.add(select.getNickName());
        rowData.add(v);
        table.updateUI();
    }
}
