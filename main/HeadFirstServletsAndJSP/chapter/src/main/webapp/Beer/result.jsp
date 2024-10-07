<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: 25149
  Date: 2024/5/8
  Time: 下午10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="align-content: center">Beer JSp</h1>
<p>
<%
        List styles=(List)request.getAttribute("style");
        for(Object style: styles){
          out.print("<br>try: "+style);
        }
        %>
</body>
</html>
