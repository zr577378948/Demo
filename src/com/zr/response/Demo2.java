package com.zr.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 张瑞 on 2017/4/11.
 * 定时刷新
 */
@WebServlet(name = "Demo2",urlPatterns = "/demo2")
public class Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("refresh","3;url=https://www.baidu.com/");//三秒后跳转到百度页面
    }
}
