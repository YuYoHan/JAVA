package jdbc01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudentGUI extends JFrame {
    JTextField jtf_name;
    JTextField jtf_kor;
    JTextField jtf_eng;
    JTextField jtf_math;

    public InsertStudentGUI() {
        setLayout(new FlowLayout());
        jtf_name = new JTextField(5);
        jtf_kor = new JTextField(5);
        jtf_eng = new JTextField(5);
        jtf_math = new JTextField(5);

        add(new JLabel("이름"));
        add(jtf_name);
        add(new JLabel("국어"));
        add(jtf_kor);
        add(new JLabel("영어"));
        add(jtf_eng);
        add(new JLabel("수학"));
        add(jtf_math);


        JButton button = new JButton("등록");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection conn = null;
                Statement stmt = null;
                String name = jtf_name.getText();
                int kor = Integer.parseInt(jtf_kor.getText());
                int eng = Integer.parseInt(jtf_eng.getText());
                int math = Integer.parseInt(jtf_math.getText());

                String sql = "insert into student (name, kor, eng, math) " +
                        "values ('" + name + "', " + kor + ", " + eng + ", " + math + ")";
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
                    int re = stmt.executeUpdate(sql);
                    if (re == 1) {
                        System.out.println("레코드 추가 성공");
                    } else {
                        System.out.println("레코드 추가 실패");
                    }

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                } finally {
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        });
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new InsertStudentGUI();
    }
}
