package ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String sql = "insert into  student values('이순신',80,90,100)";
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

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {

            }
        }


    }
}

