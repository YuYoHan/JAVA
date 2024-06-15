package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConfig {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USERNAME = "c##madang";
    public static final String PASSWORD = "madang";

    // static 메서드이며 매개변수는 없고 커넥션을 변환하는 메서드
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println("에러 발생 : " + e.getMessage());
        }
        return connection;
    }

    // 매개변수 connection, statement, resultSet을 받아서 close
    public static void close(Connection connection,
                             Statement statement,
                             ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println("에러 발생 : " + e.getMessage());
        }
    }

    public static void close(Statement statement,
                             Connection connection) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println("에러 발생 : " + e.getMessage());
        }
    }
}
