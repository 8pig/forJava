package cn.zz.web;

import cn.zz.dao.UserDao;
import cn.zz.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);

        if(user == null){
            System.out.println("登陆失败");
            request.getRequestDispatcher("/failServlet").forward(request, response);
        }else {
            System.out.println(user);
            request.getRequestDispatcher("/successServlet").forward(request, response);
        }

    }
}
