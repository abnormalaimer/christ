<%--
  Created by IntelliJ IDEA.
  User: 25149
  Date: 2024/6/11
  Time: 上午9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
welcome to our page!
<% if (request.getParameter("username") == null) { %>
   <jsp:forward page="index.jsp"></jsp:forward>
<%}%>
hello ${param.username}
</body>
</html>
