package com.druid;

import cn.icast.util.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidD2 {
    // 使用新的工具类

    public static void main(String[] args) {
        /*
        * 完成添加操作
        *
        * */
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DruidUtils.getConnection();
            String sql = "insert into user (username, password) values (?,?)";
            // huoqu pstm
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "zhaozhou");
            pstmt.setString(2, "1234567");

            int count = pstmt.executeUpdate();
            System.out.println(count);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUtils.close(pstmt, conn);
        }


    }



}
