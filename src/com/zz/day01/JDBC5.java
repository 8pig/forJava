package com.zz.day01;

import cn.icast.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBC5 {
    public static void main(String[] args)  {
        List<Emp> list = new JDBC5().findAll();
        System.out.println(list);
        System.out.println(list.size());

    }
    public List<Emp> findAll(){
        Statement statement = null;
        Connection conn = null;
        ResultSet resultSet = null;
        List<Emp> list = null;
        // 1. 注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // 2 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            // 3 定义sql
            String sql = "select * from emp";
            // 4 获取执行sql 对象
            statement = conn.createStatement();
            // 5 执行
            resultSet = statement.executeQuery(sql);
            // 6 遍历结果集 封装对象 装载集合
            Emp emp = null;

            list = new ArrayList<>();

            while (resultSet.next()){
                // 7 获取
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                double salary = resultSet.getDouble("salary");
                Date join_date = resultSet.getDate("join_date");
                emp = new Emp();
                emp.setId(id);
                emp.setName(name);
                emp.setGender(gender);
                emp.setJoin_data(join_date);
                emp.setSalary(salary);
                list.add(emp);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement != null){
                try {
                    statement.close();
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
        return list;
    }
}
