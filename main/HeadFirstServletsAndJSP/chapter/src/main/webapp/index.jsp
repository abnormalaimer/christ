<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page errorPage="errorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--<h1><%= "Hello World!"%>--%>
<%--</h1>--%>

<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%--<a href="Beer/Beer.html">beer</a>--%>
we're sorry ... you need
<form action="Hello.jsp" method="get">
    name:<input name="username" type="text">
    <input name="submit" type="submit">
</form>
</body>
</html>