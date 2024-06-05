package jdbc03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class ListStudentGUI_JTable02 extends JFrame {
    Vector<String> colName;
    Vector<Vector<String>> rowData;
    JTable table;

    public ListStudentGUI_JTable02() {
        colName = new Vector<>();
        colName.add("이름");
        colName.add("국어");
        colName.add("영어");
        colName.add("수학");

        rowData = new Vector<>();

        table = new JTable(rowData, colName);
        JScrollPane jsp = new JScrollPane(table);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton button = new JButton("읽어오기");
        JButton button_clear = new JButton("초기화");
        p.add(button);
        p.add(button_clear);

        add(jsp, BorderLayout.CENTER);
        add(p, BorderLayout.SOUTH);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addTableEvent();

        button_clear.addActionListener(e -> rowData.clear());

        addButtonEvent(button);
    }

    private void addButtonEvent(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "select * from student";
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;

                System.out.println(sql);
                try {
                    //1. JDBC 드라이버를 메모리로 로드한다.
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    //2. DB서버에 연결한다.
                    String url = "jdbc:oracle:thin:@localhost:1521:XE";
                    String username = "c##madang";
                    String password = "madang";
                    conn = DriverManager.getConnection(url, username, password);
                    // 3. 데이터베이스 명령어 실행 담당자 객체를 생성
                    stmt = conn.createStatement();
                    // 4. 명령어 실행 담당자를 통해서 데이터베이스 명령을 실행
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        String name = rs.getString(1);
                        int kor = rs.getInt(2);
                        int eng = rs.getInt(3);
                        int math = rs.getInt(4);
                        System.out.println(name + " : " + kor + ", " + eng + ", " + math);
                        Vector<String> row = new Vector<>();
                        row.add(name);
                        row.add(kor + "");
                        row.add(eng + "");
                        row.add(math + "");
                        rowData.add(row);
                        table.updateUI();
                    }

                } catch (Exception ex) {
                    System.out.println("예외 발생 : " + ex.getMessage());
                } finally {
                    try {
                        if (rs != null) {
                            rs.close();
                        }
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (Exception ex) {
                        System.out.println("예외 발생 : " + ex.getMessage());
                    }
                }
            }
        });
    }

    private void addTableEvent() {
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int idx = table.getSelectedRow();
                Vector<String> row = rowData.get(idx);
                String name = row.get(0);
                System.out.println(name);

                // 받아온 name으로 JDBC를 이용해서 DB에 조회
                String sql = "select * from student where NAME = '" + name + "'";
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;

                System.out.println(sql);
                try {
                    //1. JDBC 드라이버를 메모리로 로드한다.
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    //2. DB서버에 연결한다.
                    String url = "jdbc:oracle:thin:@localhost:1521:XE";
                    String username = "c##madang";
                    String password = "madang";
                    conn = DriverManager.getConnection(url, username, password);
                    // 3. 데이터베이스 명령어 실행 담당자 객체를 생성
                    stmt = conn.createStatement();
                    // 4. 명령어 실행 담당자를 통해서 데이터베이스 명령을 실행
                    rs = stmt.executeQuery(sql);
//                    while (rs.next()) {
                    // 학생의 이름이 중복되지 않는다면 검색 결과가 1건이니
                    // while문 보다는 if문을 사용하자
                    if(rs.next()){
                        name = rs.getString(1);
                        int kor = rs.getInt(2);
                        int eng = rs.getInt(3);
                        int math = rs.getInt(4);
                        System.out.println(name + " : " + kor + ", " + eng + ", " + math);
                    }

                } catch (Exception ex) {
                    System.out.println("예외 발생 : " + ex.getMessage());
                } finally {
                    try {
                        if (rs != null) {
                            rs.close();
                        }
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (Exception ex) {
                        System.out.println("예외 발생 : " + ex.getMessage());
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new ListStudentGUI_JTable02();
    }
}
