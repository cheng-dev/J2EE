<%--
  Created by IntelliJ IDEA.
  User: xiao
  Date: 2019/11/24
  Time: 上午 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function () {
            var registerButton = document.getElementById("register");
            registerButton.onclick = function () {
                window.location.href = "register.jsp"

            }

        }
    </script>
</head>
<body>
<form action="" method="post">
    账号: <input type="text" value="" name="account">
    密码: <input type="password" value="" name="password">
    <input type="submit" value="登录">
    <input id="register" type="button" value="注册 ">
</form>

</body>
</html>
