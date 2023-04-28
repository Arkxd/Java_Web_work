<%--
  Created by IntelliJ IDEA.
  User: Arkxd
  Date: 2023/4/26
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>buyBook</title>
</head>
<body>
<form method="post" action="receiveUser.jsp">
    请输入个人信息并选择要购买的图书<br>
    <label>
        帐号：<input type="text" name="name"><br>
        密码：<input type="text" name="password"><br>
        图书：
        <select name="select_book">
            <option value="-1"></option>
            <option value="1">爬虫从入门到入狱</option><
            <option value="2">C++从入门到入土</option>
            <option value="3">Java从看懂到看开</option>
        </select>
        <br>
        <input type="submit" value="提交">
        <input type="reset" value="清空">
        <br>
    </label>
</form>
</body>
</html>
