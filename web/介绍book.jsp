<%--
  Created by IntelliJ IDEA.
  User: Arkxd
  Date: 2023/4/28
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>介绍</title>
</head>
<body>
<%
    String book = request.getParameter("introduce_book");
    if (book.equals("1"))
        response.sendRedirect("software test.jsp");
    else if (book.equals("2"))
        response.sendRedirect("Python.jsp");
%>
</body>
</html>
