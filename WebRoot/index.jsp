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
	<style type="text/css">
body {
	background-color: #6FF;
	margin :0px;
	padding:0px;
}
#banner {
	background-color:#FFF;
	margin: 0px auto;
	padding: 0px;
	width: 1200px;
}
#banner2 a{
	text-decoration: none;
	height: 22px;
	width: 175px;
	font-family: "宋体";
	font-size: 14px;
	color: #000;
	text-align: center;
	margin-right: 2px;
	padding-top: 8px;
}
#banner2 a:hover{
	background-color:#F30;
	color:#FFF;
}
#banner1 {
	margin: 0px auto;
	padding: 0px;
	width: 1200px;
	height:200px;
	background-image: url(u=3014138032,1836098031&fm=21&gp=0.jpg);
	font-family: "宋体";
	color: #F00;
}
#banner2 {
	background-color: #0F6;
	float: right;
	height: 40px;
	width: 200px;
	background-image: url(550c471cb80028a2d51e31ecb9a0f23a.jpg);
	margin-top: 0px;
}
</style>

</head>
<body>

<div id="banner1"><h1 align="center">
  <p>&nbsp;</p>
  欢迎来到科研成果管理系统</h1>

<p align="center">&nbsp;</p></div>
<table width="1201" border="0" align="center">
  <tr>
    <td colspan="2" rowspan="3" bgcolor="#33CC00">我想要一大段文字</td>
    <td width="200" align="center"><div id ="banner2"><s:url id="editURL" action="action1">
		</s:url>
		<s:a href="%{editURL}">添加信息</s:a></div></td>
  </tr>
  <tr>
    <td align="center"><div id ="banner2"><s:url id="editURL" action="action2">
		</s:url>
		<s:a href="%{editURL}">更新信息</s:a></div></td>
  </tr>
  <tr>
    <td align="center"><div id ="banner2"><s:url id="editURL" action="action3">
		</s:url>
		<s:a href="%{editURL}">查询人员工作量统计结果</s:a></div></td>
  </tr>
</table>
</body>
</html>