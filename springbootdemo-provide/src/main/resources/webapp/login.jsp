<%--
  Created by IntelliJ IDEA.
  User: 86132
  Date: 2022/8/4
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>登录</title>
</head>
<body>
<form role="form" action = "/user/login" method="post">
    账号：<input type="text" id="name" name = "username"> <br>
    密码：<input type="password" id = "password" name = "password"> <br>
    <input type="submit" id = "login" value = "login">
</form>
</body>
</html>
