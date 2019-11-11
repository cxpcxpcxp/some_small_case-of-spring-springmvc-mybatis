<%--
  Created by IntelliJ IDEA.
  User: miao
  Date: 2019/10/25
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>springmvc入门案例</title>
    <script src="/js/jquery.min.js"></script>
      <script>
        $(function () {
            $("#submit1").click(function () {
            //    异步请求
                $.post("/responseParamServlet/response2",{"username":"aa","userpwd":"147"},function (data) {
                    alert(data.username+"::"+data.userpwd);
                },"json")
            })
        })

        $(function () {
            $("#submit2").click(function () {
                //    异步请求
                $.ajax({
                    type:"post",
                    url:"/responseParamServlet/response3",
                    data:'{"username":"aa","userpwd":"147"}',
                    contentType:"application/json",
                    success:function (data) {
                        alert(data.username+"::"+data.userpwd)
                    },
                    dataType:"json"
                })
            })
        })
    </script>
</head>
<body>
<a href="/Base/hello">springmvc入门案例</a>
<br>

<%--一般方法获取请求参数--%>
<form action="/paramServlet/normalparams" method="get">
    <h4>一般方法获取请求参数</h4>
    用户名:<input type="text" placeholder="请输入用户名" name="username"><br>
    密  码:<input type="password" placeholder="请输入密码" name="userpwd"><br>
    <input type="submit">
</form>
<br>
<%--对象方法获取请求参数--%>
<form action="/paramServlet/objparams" method="get">
    <h4>对象方法获取请求参数</h4>
    用户名:<input type="text" placeholder="请输入用户名" name="username"><br>
    密  码:<input type="password" placeholder="请输入密码" name="userpwd"><br>
    <input type="submit">
</form>
<br>

<%--获取请求参数1
return==》String
param==》null
--%>
<a href="/getParamsServlet/getParams1">获取请求参数1</a>
<br>

<%--获取请求参数2
return==》String
param==》model
--%>
<a href="/getParamsServlet/getParams2">获取请求参数2</a>
<br>

<%--获取请求参数3
return==》ModelAndView
param==》null
--%>
<a href="/getParamsServlet/getParams3">获取请求参数3</a>
<br>

<a href="/getParamsServlet/getParams4">获取请求参数41</a>
<br>
<a href="/responseParamServlet/response1">获取请求参数42</a>
<br>

<%--响应数据 ajax异步请求--%>
<%--相关资源
jackson依赖
js框架文件
--%>
<input type="submit" id="submit1" value="异步请求测试1">
<br>
<input type="submit" id="submit2" value="异步请求测试2">
<br>

<form action="/responseParamServlet/response3" method="get">
    <h4>对象/集合数据展示</h4>
    用户名:<input type="text" placeholder="请输入用户名" name="username"><br>
    密  码:<input type="password" placeholder="请输入密码" name="userpwd"><br>
    账  号:    <input type="text" name="list.aname"><br>
    账户余额:  <input type="text" name="list.money"><br>
    <input type="submit">
</form>
<br>


</body>

</html>
