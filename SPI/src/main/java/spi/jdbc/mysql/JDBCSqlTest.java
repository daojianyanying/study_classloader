package spi.jdbc.mysql;

import java.sql.Connection;

public class JDBCSqlTest {
    public static void main(String[] args) throws Exception{
        Connection connection = JDBCUtils.getSQLConnection();
        System.out.println(connection);

        //spi测试获取
        System.out.println("pi测试获取jdbc.driver");
    }
}
