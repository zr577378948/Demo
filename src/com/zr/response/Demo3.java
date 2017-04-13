package com.zr.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by 张瑞 on 2017/4/11.
 * contype-Type作用
 */
@WebServlet(name = "Demo3",urlPatterns = "/demo3")
public class Demo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //服务器发送给浏览器的数据类型
        response.setContentType("image/jpg");
        File file = new File("H:/11.jpg");
        //以下载的方式打开
        response.setHeader("Content-Disposition","attachment; filename="+file.getName());
        //发送图片
        FileInputStream in = new FileInputStream(file);
        byte[] buf = new byte[1024];
        int len = 0;
        //把内容写出到浏览器
        while ((len = in.read(buf))!=-1){
            response.getOutputStream().write(buf,0,len);
        }

    }
}
