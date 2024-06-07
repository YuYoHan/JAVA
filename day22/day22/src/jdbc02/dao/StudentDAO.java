package jdbc02.dao;

import jdbc02.vo.StudentVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentDAO {
    public static String driver = "oracle.jdbc.driver.OracleDriver";
    public static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    public static String userName = "c##madang";
    public static String password = "madang";
    public static Connection connection;
    public static Statement statement;
    ArrayList<StudentVO> studentVOS = new ArrayList<>();

    public ArrayList<StudentVO> studentList() {
        String sql = "select * from student";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                int kor = resultSet.getInt("kor");
                int eng = resultSet.getInt("eng");
                int math = resultSet.getInt("math");
                StudentVO studentVO = new StudentVO(name, kor, eng, math);
                studentVOS.add(studentVO);
            }
            return studentVOS;
        } catch (Exception e) {
            System.out.println("에러 발생 : " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static int insert(StudentVO student) {
        try {
            String sql = "insert into student values('" + student.getName() +
                    "'," + student.getKor() + "," +
                    student.getEng() + "," + student.getMath() + ")";
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            int re = statement.executeUpdate(sql);
            if (re > 0) {
                System.out.println("등록 성공");
                return re;
            } else {
                System.out.println("등록 실패");
                return -1;
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static StudentVO select(StudentVO student) {
        try {
            String sql = "select * from student where NAME = '" + student.getName() + "'";
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                StudentVO studentVO = new StudentVO();
                studentVO.setName(rs.getString("NAME"));
                studentVO.setKor(Integer.parseInt(rs.getString("KOR")));
                studentVO.setEng(Integer.parseInt(rs.getString("ENG")));
                studentVO.setMath(Integer.parseInt(rs.getString("MATH")));
                System.out.println(studentVO);
                return studentVO;
            }
        } catch (Exception e) {
            System.out.println("예외 발생 : " + e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static int delete(String name) {
        try {
            String sql = "delete student where name = '" + name + "'";
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            int re = statement.executeUpdate(sql);
            if (re > 0) {
                System.out.println("삭제 성공");
                return re;
            } else {
                System.out.println("삭제 실패");
                return -1;
            }
        } catch (Exception e) {
            System.out.println("예외발생 : " + e.getMessage());
            return -1;
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int update(StudentVO student) {
        try {
            String sql = "update student " +
                    "set KOR = '" + student.getKor() +
                    "', ENG ='" + student.getEng() +
                    "', MATH = '" + student.getMath() + "'" +
                    "where NAME = '" + student.getName() + "'";

            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            int re = statement.executeUpdate(sql);
            if (re > 0) {
                System.out.println("수정 성공");
                return re;
            } else {
                System.out.println("수정 실패");
                return -1;
            }
        } catch (Exception e) {
            System.out.println("예외 발생 :" + e.getMessage());
            return -1;
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
