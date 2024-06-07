package config;

import java.sql.*;
import java.util.HashMap;

public class DBConnection {
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static HashMap<String, String> container = new HashMap<>();

    public static HashMap<String, String> getConnection(String sql) {
        if (conn == null) {
            try {
                // JDBC 드라이버를 메모리로 로드
                // mysql 버전
//                Class.forName("com.mysql.cj.jdbc.Driver");
                // 오라클 버전
                Class.forName("oracle.jdbc.driver.OracleDriver");

                // 2. DB 서버에 연결
                // mysql
//                String url = "jdbc:mysql://localhost:3306/java_project02";
//                String user = "root";
//                String password = "1234";
                // oracle
                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                String user = "c##madang";
                String password = "madang";
                conn = DriverManager.getConnection(url, user, password);
                // 3. 데이터베이스 명령어 실행 담당자 객체를 생성
                stmt = conn.createStatement();
                boolean insert = sql.trim().toLowerCase().startsWith("insert");
                boolean update = sql.trim().toLowerCase().startsWith("update");
                boolean select = sql.trim().toLowerCase().startsWith("select");
                boolean delete = sql.trim().toLowerCase().toLowerCase().startsWith("delete");

                // 등록
                if (insert) {
                    int count = stmt.executeUpdate(sql);
                    if (count == 1) {
                        System.out.println("등록 성공");
                    } else {
                        System.out.println("등록 실패");
                    }
                }
                // 수정
                if (update) {
                    int count = stmt.executeUpdate(sql);
                    if (count == 1) {
                        System.out.println("수정 성공");
                    } else {
                        System.out.println("수정 실패");
                    }
                }
                // 조회
                if (select) {
                    rs = stmt.executeQuery(sql);
                    ResultSetMetaData metaData = rs.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    if (rs.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            System.out.println(metaData.getColumnName(i) + "\t");
                            System.out.print(rs.getString(i) + "\t");
                            container.put(metaData.getColumnName(i), rs.getString(i));
                        }
                        System.out.println();
                        return container;
                    } else {
                        System.out.println("회원이 존재하지 않습니다.");
                        return null;
                    }
                }
                // 삭제
                if (delete) {
                    int rowsAffected = stmt.executeUpdate(sql); // DELETE 쿼리 실행 후 영향을 받은 행의 수를 반환

                    if (rowsAffected > 0) {
                        System.out.println("삭제된 행의 수: " + rowsAffected);
                    } else {
                        System.out.println("삭제된 행이 없습니다.");
                    }
                }

            } catch (Exception e) {
                System.out.println("에러 발생 : " + e.getMessage());
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
        return null;
    }
}
