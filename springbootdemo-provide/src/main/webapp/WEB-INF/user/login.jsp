<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>登录</title>
</head>
<body>.
<form role="form" action = "/user/login" method="post">
    账号：<input type="text" id="name" name = "username"> <br>
    密码：<input type="password" id = "password" name = "password"> <br>
    <input type="submit" id = "login" value = "提交">
</form>
</body>
</html>
