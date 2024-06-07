package jdbc04;


import jdbc04.dao.UserDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Vector;

public class UserInfo extends JFrame{
    private JTextField name;
    private JTextField password;
    private JTextField userPhone;
    private JTextField userAddr;
    private Vector<String> colNames;
    private Vector<Vector<String>> rowData;
    private JTable table;
    private String selectedName;
    Index mainFrame;

    public UserInfo(Index mainFrame) {
        this.mainFrame = mainFrame;
        name = new JTextField(5);
        password = new JTextField(7);
        userPhone = new JTextField(7);
        userAddr = new JTextField(10);

        JPanel p = new JPanel();
        p.add(new JLabel("이름"));
        p.add(name);
        p.add(new JLabel("비밀번호"));
        p.add(password);
        p.add(new JLabel("폰번호"));
        p.add(userPhone);
        p.add(new JLabel("주소"));
        p.add(userAddr);

        JButton btnUpdate = new JButton("수정");
        JButton btnCancel = new JButton("취소");
        p.add(btnUpdate);
        p.add(btnCancel);
        colNames = new Vector<>();
        colNames.add("이름");
        colNames.add("비밀번호");
        colNames.add("폰번호");
        colNames.add("주소");
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
                selectedName = row.get(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rowData.clear();
                String sql =
                        "UPDATE your_table SET name=" + name.getText()
                                + ", password=" + password.getText()
                                + ", phone=" + userPhone.getText()
                                + ", address=" + userAddr.getText()
                                + " WHERE name=" + selectedName;
                UserDAO.getConnection(sql);
                loadUser();
                dispose();
                mainFrame.beforeLogin();
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                mainFrame.showBoard();
            }
        });
    }

    public void loadUser() {
        //JTable에 출력하는 메소드
        rowData.clear();

        String sql = "select * from user where name = '"+selectedName+"'";
        HashMap<String, String> con = UserDAO.getConnection(sql);
        String searchName = con.get("name");
        String searchPw = con.get("password");
        String searchPhone = con.get("phone");
        String searchAddr = con.get("address");

        Vector<String> vt = new Vector<String>();
        vt.add(searchName);
        vt.add(searchPw);
        vt.add(searchPhone);
        vt.add(searchAddr);
        rowData.add(vt);
        table.updateUI();
    }
}
