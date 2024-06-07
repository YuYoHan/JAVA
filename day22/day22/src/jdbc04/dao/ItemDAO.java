package jdbc04.dao;

import jdbc03.dto.GoodsDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemDAO {
    public static String driver = "oracle.jdbc.driver.OracleDriver";
    public static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    public static String userName = "c##madang";
    public static String password = "madang";
    public static Connection connection;
    public static Statement statement;
    public static ArrayList<GoodsDTO> goodsList = new ArrayList<>();

    // 상품 등록
    public static int insert(GoodsDTO goods) {
        ArrayList<GoodsDTO> select = select(goods);
        for (GoodsDTO goodsDTO : select) {
            if (goods.getNumId() == goodsDTO.getNumId()) {
                return -1;
            }
            String sql = "insert into goods values ("
                    + goods.getNumId() + ", "
                    + "'" + goods.getItem() + "', "
                    + goods.getQty() + ", "
                    + goods.getPrice() + ")";
            return connectDB(sql);
        }
        return -1;
    }

    // 상품 수정
    public static int update(GoodsDTO goods) {
        String sql = "update goods set numId = "
                + goods.getNumId() + ", " +
                "item = '" + goods.getItem() + "', " +
                "qty = " + goods.getQty() + ", " +
                "price = " + goods.getPrice() + " where numId = " + goods.getNumId();

        return connectDB(sql);
    }

    // 상품 삭제
    public static int delete(GoodsDTO goods) {
        String sql = "delete from goods where numId = " + goods.getNumId();
        return connectDB(sql);
    }

    // DB에 등록, 수정, 삭제하는 메서드
    private static int connectDB(String sql) {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            int re = statement.executeUpdate(sql);
            if (re > 0) {
                System.out.println("생성 성공");
                return re;
            } else {
                System.out.println("생성 실패");
                return -1;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
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

    // 조회
    public static ArrayList<GoodsDTO> select(GoodsDTO goods) {
        if (goods != null) {
            int numId = goods.getNumId();
            String sql = "select * from goods where numId = " + numId;
            getGoods(sql);
        } else {
            String sql = "select * from goods";
            getGoods(sql);
        }
        return null;
    }

    // 상품을 조회하는 메서드
    private static void getGoods(String sql) {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                GoodsDTO goodsDTO = new GoodsDTO();
                goodsDTO.setNumId(resultSet.getInt("numId"));
                goodsDTO.setItem(resultSet.getString("item"));
                goodsDTO.setQty(resultSet.getInt("qty"));
                goodsDTO.setPrice(resultSet.getInt("price"));
                System.out.println(goodsDTO);
                goodsList.add(goodsDTO);
            }
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
                System.out.println("에러 발생 : " + e.getMessage());
            }
        }
    }

}
