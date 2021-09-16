package cn.zz.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // 获取消息体
//        BufferedReader reader = request.getReader();
//        // 读取数据
//        String data = null;
//        while ((data = reader.readLine())!= null ){
//            System.out.println(data);
//        }
//        System.out.println("----------");

        String username = request.getParameter("username");
        System.out.println("post"+":"+username);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("get"+":"+username);
        request.getRequestDispatcher("/servlet2").forward(request,response);
    }
}
