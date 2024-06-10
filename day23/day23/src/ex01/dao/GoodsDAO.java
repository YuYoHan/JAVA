package ex01.dao;


import ex01.config.JDBCConfig;
import ex01.dto.GoodsDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GoodsDAO {
    public static Connection connection;
    public static Statement statement;
    public static ResultSet rs;
    public static ArrayList<GoodsDTO> goodsList = new ArrayList<>();

    // 상품 등록
    public static int insert(GoodsDTO goods) {
        ArrayList<GoodsDTO> select = select();
        System.out.println(select);
        int result = 0;
        for (GoodsDTO goodsDTO : select) {
            if (goods.getNumId() == goodsDTO.getNumId()) {
                return -1;
            }
            String sql = "insert into goods values ("
                    + "'" + goods.getItem() + "', "
                    + goods.getQty() + ", "
                    + goods.getPrice() + ")";
            result = connectDB(sql);
        }
        return result;
    }

    // 상품 수정
    public static int update(GoodsDTO goods) {
        String sql = "update goods set "+
                "item = '" + goods.getItem() + "', " +
                "qty = " + goods.getQty() + ", " +
                "price = " + goods.getPrice() + " where numId = " + goods.getNumId();

        return connectDB(sql);
    }

    // 상품 삭제
    public static int delete(int numId) {
        String sql = "delete from goods where numId = " + numId;
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

    // 조회
    public static ArrayList<GoodsDTO> select() {
        String sql = "select * from goods";
        try {
            connection = JDBCConfig.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                GoodsDTO goodsDTO = new GoodsDTO();
                goodsDTO.setNumId(rs.getInt(1));
                goodsDTO.setItem(rs.getString(2));
                goodsDTO.setQty(rs.getInt(3));
                goodsDTO.setPrice(rs.getInt(4));
                System.out.println(goodsDTO);
                goodsList.add(goodsDTO);
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
        return goodsList;
    }
}
