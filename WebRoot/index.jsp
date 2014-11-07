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
<form id="form1" name="form1" method="post" action="index">
  <label>
  <div align="right">
    <select name="choose" id="choose">
      <option value="1">科研经费到款情况</option>
      <option value="2">科研项目验收情况</option>
      <option value="3">软件著作权管理</option>
      <option value="4">专利管理</option>
      <option value="5">获奖情况管理</option>
      <option value="6">出版专著管理</option>
      <option value="7">学术团体管理</option>
      <option value="8">国内外进修及学习情况管理</option>
      <option value="9">国际合作情况管理</option>
    </select>
  </div>
  </label>
  <p>
    <label></label>
    <label>
    <div align="right">
      <input type="submit" name="Submit" value="提交" />
      <input type="reset" name="Submit2" value="重置" />
    </div>
    </label>
    <label></label>
  </p>
  <p align="right">&nbsp; </p>
</form>
<p align="center">&nbsp;</p>
</body>
</html>