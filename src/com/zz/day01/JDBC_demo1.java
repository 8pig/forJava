package com.day02;

import cn.icast.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
* 事务
* */
public class JDBC_demo1 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try {
            // 获取链接
            conn = JDBCUtils.getConnection();
            // 2 定义sql
            // 2.1 张三 -500
            // 李四 + 500;
            conn.setAutoCommit(false); // 开启事务
            String sql1 = "update student set chinnes = chinnes - ? where id = ?";
            String sql2 = "update student set chinnes = chinnes + ? where id = ?";
            // 3 获取 sql 执行对象
            pstmt1 =  conn.prepareStatement(sql1);
            pstmt2 =  conn.prepareStatement(sql2);
            // 设置参数
            pstmt1.setDouble(1,40);
            pstmt1.setInt(2,15);
            pstmt2.setDouble(1,40);
            pstmt2.setInt(2,14);
            // 执行
            pstmt1.executeUpdate();
            System.out.println(100/0);
            pstmt2.executeUpdate();
            conn.commit();



        } catch (Exception e) {
            e.printStackTrace();
            try {
                if(conn != null){
                    conn.rollback();

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            JDBCUtils.close(pstmt1, conn);
            JDBCUtils.close(pstmt2, null);
        }


    }


}
