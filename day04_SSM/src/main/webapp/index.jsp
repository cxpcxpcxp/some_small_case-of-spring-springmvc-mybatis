<%--
  Created by IntelliJ IDEA.
  User: miao
  Date: 2019/10/31
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/user/findall">findall1</a><br>
<a href="/user/findUser">findall2</a>
<form action="/user/saveUser" method="post">
    用户名：<input type="text" name="user_name"><br>
    密  码：<input type="text" name="user_pwd">
    <input type="submit">
</form>
</body>
</html>
