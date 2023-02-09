<%--
  Created by IntelliJ IDEA.
  User: nima
  Date: 11/19/2022 AD
  Time: 01:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Rest Demo</title>
</head>
<body>
Spring Rest Demo
<br>
<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
<br>
<a href="${pageContext.request.contextPath}/api/students">Students</a>
</body>
</html>
