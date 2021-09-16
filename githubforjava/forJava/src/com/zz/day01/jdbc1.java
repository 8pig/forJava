package com.zz.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc1 {
    public static void main(String[] args) throws Exception {
        //  1 导入jar 包
        //  2 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 3. 获取数据库连接对象 connection
        Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
        // 4. 定义一个sql 语句
        String sql = "update student set age = 10 where id = 3";
        // 5.  获取执行sql语句的对象 statement
        Statement stmt = conn.createStatement();
        // 6. 执行sql 接受返回结果
        int count = stmt.executeUpdate(sql);
        // 7.  处理结果
        System.out.println(count);
        // 8. 释放资源
        stmt.close();
        conn.close();
    }
}
