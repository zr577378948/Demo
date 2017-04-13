package com.zr.request;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/**
 * Created by 张瑞 on 2017/3/29.
 */
@WebServlet(name = "Demo",urlPatterns = "/demo")
public class Demo extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        System.out.println("POST方式");
        InputStream in = request.getInputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while((len=in.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }
        }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        System.out.println("GET方式获取实体内容");
        String value = request.getQueryString();
        System.out.println(value);
        System.out.println(".............................");
        Enumeration<String> enums = request.getParameterNames();
        while(enums.hasMoreElements()){
            String ParamName = enums.nextElement();
            String ParamValue = request.getParameter(ParamName);
            System.out.println(ParamName+"="+ParamValue);
        }

    }
}
