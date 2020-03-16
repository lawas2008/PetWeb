<%--
  Created by IntelliJ IDEA.
  User: DELU78
  Date: 2020/3/16
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
    <form action="login" method="post">
        用户名:<input type="text" name="userName"/><br/>
        密码:<input type="password" name="userPwd"/><br/>
        <input type="submit" name="login" value="登录"/>
        <input type="reset" name="clear" value="重置"/>
    </form>
</body>
</html>
