<%--
  Created by IntelliJ IDEA.
  User: Arkxd
  Date: 2023/4/28
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    String book = null;
    book = request.getParameter("select_book");
    out.println(name + "您好！<br>");
    out.println("你要购买的图书为：");
    switch (Integer.parseInt(book)) {
        case 1: out.println("爬虫从入门到入狱");   break;
        case 2: out.println("C++从入门到入土");   break;
        case 3: out.println("Java从看懂到看开");  break;
        default:break;
    }
%>
</body>
</html>
