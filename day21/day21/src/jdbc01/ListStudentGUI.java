package jdbc01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class ListStudentGUI extends JFrame {
    JTextArea jta;

    public ListStudentGUI() {
        jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
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

        button_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setText("");
            }
        });

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
                        jta.append(name + " : " + kor + ", " + eng + ", " + math);
                        jta.append("\n");
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

    public static void main(String[] args) {
        new ListStudentGUI();
    }
}
