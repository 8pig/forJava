package cn.icast.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/*
jdbc 工具类

* */
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String passworld;

    static {
        /*
        * 读取资源文件
        * */
        try {
            // 1
            Properties pro = new Properties();
            // 获取src 路径下的文件 ClassLoader
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL res = classLoader.getResource("jdbc.properties.properties");

            String path = res.getPath();
            // 加载文件
            pro.load(new FileReader(path));
            // 获取数据 赋值
            String url = pro.getProperty("url");
            String user = pro.getProperty("user");
            String password = pro.getProperty("password");
            String driver = pro.getProperty("driver");
            // 注册驱动
            Class.forName(driver);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
    * 获取连接
    *
    * */
    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(url,user,passworld);
    }

    public static void close (Statement stmt, Connection conn){
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close (ResultSet res, Statement stmt, Connection conn){
        if(res != null){
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
