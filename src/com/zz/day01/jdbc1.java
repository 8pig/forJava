package com.zz.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc1 {
    public static void main(String[] args) throws Exception {
//         1 导入jar 包
//        2 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
        // 定义一个sql 语句
        String sql = "update student set score = 100 where id = 3";
        // statement
        Statement stmt = conn.createStatement();
        // 执行
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        // 释放
        stmt.close();
        conn.close();
    }
}
