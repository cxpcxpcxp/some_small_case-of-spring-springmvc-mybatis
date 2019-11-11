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
    <title>文件上传</title>
</head>
<body>
<form action="/file/unload" method="post" enctype="multipart/form-data">
    <input type="file" name="iconLoad">
    <input type="submit">
</form>
</body>
</html>
