<%--
  Created by IntelliJ IDEA.
  User: miao
  Date: 2019/10/29
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc组件的灵活运用</title>
</head>
<body>
<form action="/string2date/mydate" method="post">
    用户名:<input type="text" name="name">
    密  码:<input type="password" name="pwd">
    生  日:<input type="text" name="birth">
    <input type="submit">
</form>
<br>

<form action="/string2date/myexception" method="post">
    用户名:<input type="text" name="name">
    密  码:<input type="password" name="pwd">
    <input type="submit">
</form>


<form action="/string2date/myintercepter" method="post">
    用户名:<input type="text" name="name">
    密  码:<input type="password" name="pwd">
    <input type="submit">
</form>

</body>
</html>
