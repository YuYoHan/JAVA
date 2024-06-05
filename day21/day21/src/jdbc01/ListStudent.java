package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListStudent {
    public static void main(String[] args) {
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
                int eng = rs.getInt(2);
                int math = rs.getInt(4);
                System.out.println(name + " : " + kor + ", " + eng + ", " + math);
            }

        } catch (Exception e) {
            System.out.println("예외 발생 : " +e.getMessage());
        } finally {
            try {
                if(rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("예외 발생 : " + e.getMessage());
            }
        }
    }
}
