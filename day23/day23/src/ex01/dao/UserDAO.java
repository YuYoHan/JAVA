package ex01.dao;

import ex01.config.JDBCConfig;
import ex01.dto.GoodsDTO;
import ex01.dto.UserDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class UserDAO {
    public static Connection connection;
    public static Statement statement;
    public static ResultSet rs;
    public static ArrayList<UserDTO> userList = new ArrayList<>();

    // 상품 등록
    public static int insert(UserDTO user) {
        ArrayList<UserDTO> select = select();
        System.out.println(select);
        int result = 0;
        for (UserDTO u : select) {
            if (user.getUserId() == u.getUserId()) {
                return -1;
            }
            String sql = "insert into members values ("
                    + "'" + user.getUserName() + "', "
                    + "'" + user.getUserPw() + ", "
                    + "'" + user.getUserAddr() + ", "
                    + "'" + user.getUserPhone() + "')";
            result = connectDB(sql);
        }
        return result;
    }

    // 상품 수정
    public static int update(UserDTO user) {
        String sql = "update members set "+
                "userPw = '" + user.getUserPw() + "', " +
                "userAddr = " + user.getUserAddr() + ", " +
                "userPhone = " + user.getUserPhone() + " where userId = " + user.getUserId();

        return connectDB(sql);
    }

    // 상품 삭제
    public static int delete(int userId) {
        String sql = "delete from goods where numId = " + userId;
        return connectDB(sql);
    }

    // DB에 등록, 수정, 삭제하는 메서드
    private static int connectDB(String sql) {
        try {
            connection = JDBCConfig.getConnection();
            int re = statement.executeUpdate(sql);
            if (re > 0) {
                System.out.println("실행 성공");
                return re;
            } else {
                System.out.println("실행 실패");
                return -1;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                JDBCConfig.close(statement, connection);
            } catch (Exception e) {
                System.out.println("에러 발생 : " + e.getMessage());
            }
        }
    }

    // 전체 조회
    public static ArrayList<UserDTO> selectAll() {
        String sql = "select * from MEMBERS";
        try {
            connection = JDBCConfig.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                UserDTO userDTO = new UserDTO();
                userDTO.setUserId(rs.getInt(1));
                userDTO.setUserName(rs.getString(2));
                userDTO.setUserPw(rs.getString(3));
                userDTO.setUserAddr(rs.getString(4));
                userDTO.setUserPhone(rs.getString(5));
                System.out.println(userDTO);
                userList.add(userDTO);
            }
        } catch (Exception e) {
            System.out.println("에러 발생 : " + e.getMessage());
        } finally {
            try {
                JDBCConfig.close(rs, statement, connection);
            } catch (Exception e) {
                System.out.println("에러 발생 : " + e.getMessage());
            }
        }
        return userList;
    }
    // 조회
    public static UserDTO select(String name) {
        String sql = "select * from MEMBERS where USERNAME = '" + name + "'";
        UserDTO userDTO = null;
        try {
            connection = JDBCConfig.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            userDTO = new UserDTO();
            while (rs.next()) {
                userDTO.setUserId(rs.getInt(1));
                userDTO.setUserName(rs.getString(2));
                userDTO.setUserPw(rs.getString(3));
                userDTO.setUserAddr(rs.getString(4));
                userDTO.setUserPhone(rs.getString(5));
                System.out.println(userDTO);
            }
        } catch (Exception e) {
            System.out.println("에러 발생 : " + e.getMessage());
        } finally {
            try {
                JDBCConfig.close(rs, statement, connection);
            } catch (Exception e) {
                System.out.println("에러 발생 : " + e.getMessage());
            }
        }
        return userDTO;
    }
}
