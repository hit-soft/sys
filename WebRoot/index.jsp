<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Book Management System starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <style type="text/css">
<!--
body {
	background-color: #999999;
}
-->
</style></head>

<body>
<h1 align="center">欢迎来到图书查询系统</h1>
<hr />
<p align="center">&nbsp;</p>
<p align="center">通过该页面您可以选择您需要的服务</p>
<hr />
<p align="center">&nbsp;</p>
<p align="right">请选择您所需要的服务：</p>

<td><s:url id="editURL" action="action1">
		</s:url>
		<s:a href="%{editURL}">添加信息</s:a></td>
<br>

<td><s:url id="editURL" action="action2">
		</s:url>
		<s:a href="%{editURL}">更新信息</s:a></td>
<br>

<p align="center">&nbsp;</p>
</body>
</html>