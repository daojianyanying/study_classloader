package spi.jdbc.mysql;

import java.sql.*;

public class JDBCUtils {

    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC&characterEncoding=UTF-8";
    private static String user = "root";
    private static String password = "Liu3574153123";

    static{

    }

    //获取数据库的连接
    public static Connection getSQLConnection(){
        Connection sqlConnect = null;
        try {
            sqlConnect = DriverManager.getConnection(url,user,password);

        } catch (SQLException e) {
            throw new RuntimeException("MySQL数据库连接异常"+e);
        }
        return sqlConnect;
    }

    //3.释放资源
    public static void close(Connection conn, Statement stat, ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat != null){
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}
