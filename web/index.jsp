<%--
  Created by IntelliJ IDEA.
  User: 张瑞
  Date: 2017/3/29
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h3>GET方式提交</h3>
  <form action="/demo" method="get">
    用户名：<input type="text" name="name"><br>
    密码：<input type="password" name="password" ><br>
    <input type="submit" value="提交"></form>

    <h3>POST方式提交</h3>
    <form action="/demo" method="post">
      用户名：<input type="text" name="name"><br>
      密码：<input type="password" name="password" ><br>
      <input type="submit" value="提交"></form>

  </body>
</html>
