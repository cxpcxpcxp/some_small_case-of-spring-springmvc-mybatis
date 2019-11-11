<%--
  Created by IntelliJ IDEA.
  User: miao
  Date: 2019/10/31
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<table border="1px" align="center">
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>密码</td>
    </tr>

<c:forEach items="${userList}" var="i">
    <tr>
        <td>${i.id}</td>
        <td>${i.user_name}</td>
        <td>${i.user_pwd}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
