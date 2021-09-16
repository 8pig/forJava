package com.zz.day01;

import java.sql.*;

public class JDBC4 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            String sql = "select * from student";
            // 获取connection

            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(sql);
            //
            resultSet.next();
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            double chinnes = resultSet.getDouble("english");
            System.out.println(id+","+name+"," +chinnes);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(resultSet != null){
                try {
                     resultSet.close();
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
}
