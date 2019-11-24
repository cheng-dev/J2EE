<%--
  Created by IntelliJ IDEA.
  User: xiao
  Date: 2019/11/24
  Time: 下午 1:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="atm" class="domain.Atm" scope="request">
    <%--    Atm atm = (Atm) request.getAttribute("atm")--%>
    <%--    if(atm == null){--%>
    <%--        atm = Class.forName("domain.Atm").newInstance();--%>
    <%--        request.setAttribute("atm",atm);--%>
</jsp:useBean>
<jsp:setProperty name="atm" property="aname"></jsp:setProperty>
<jsp:setProperty name="atm" property="abalance"></jsp:setProperty>
<jsp:setProperty name="atm" property="apassword"></jsp:setProperty>
<jsp:setProperty name="atm" property="*"></jsp:setProperty><%--一个顶三个--%>
<jsp:forward page="Register">
    <jsp:param name="testKey1" value="testValue1"/>
    <jsp:param name="testKey2" value="testValue2"/>
</jsp:forward>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
