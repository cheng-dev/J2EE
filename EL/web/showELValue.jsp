<%--
  Created by IntelliJ IDEA.
  User: xiao
  Date: 2019/11/24
  Time: 下午 3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%
    String str = (String) request.getAttribute("str");
    //没判断会500 空指针异常
    if (str != null) {
        out.write(str);
    }
%>--%>
${requestScope.value mod 2}<br>
strValue:${requestScope.strValue}<br>
strValue+10:${requestScope.strValue + 10}<br>
${requestScope.value >= 10}<br>
${requestScope.value < 10}<br>
${requestScope.value ge 10}<br>
${requestScope.value ne 10}<br>
<hr>
param.testName获取url?testName =xxx的xxx:${param.testName}<br>
<hr>
${requestScope.user}<br>
${requestScope.user.uname}<br>
${requestScope.user.upassword}<br>
${requestScope.user.testGetValue()}<br>
<hr>
${sessionScope.intArray}<br>
${sessionScope.intArray[0]}--${sessionScope.intArray[1]}--${sessionScope.intArray[2]}<br>
${sessionScope.intArray[10]}<br>
${requestScope.userArray}<br>
${requestScope.userArray[0].uname}--${requestScope.userArray[1].upassword}<br>
${requestScope.strDoubleArray[0][0]}--${requestScope.strDoubleArray[0][1]}<br>
<hr>
${requestScope.floatList.size()}<br>
${requestScope.floatList.get(0)}<br>
${requestScope.userList.get(0).uname}--${requestScope.userList.get(0).upassword}<br>
<hr>
${requestScope.userSet}<br>
${requestScope.userSet.size()}<br>
<hr>
${requestScope.strMap}<br>
${requestScope.strMap.size()}<br>
${requestScope.strMap.get("aaa")}--${requestScope.strMap.get("bbb")};

<hr>
${paramValues.hobby}

</body>
</html>
