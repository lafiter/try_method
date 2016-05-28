<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>result</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
 %>
 从request页面传过来的值:<% =request.getParameter("param") %><br/>
 客户端的IP地址:<% =request.getRemoteAddr() %>
</body>
</html>