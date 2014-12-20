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
	background-color:#C00;
	margin: 0px auto;
	padding: 0px;
	width: 1200px;
}
#banner li {
	list-style:none;
	float:left;
	padding:0;
	margin:0;
}
#nav li a {
	text-decoration: none;
	display:block;
	height: 27px;
	width: 118px;
	font-family: "宋体";
	font-size: 14px;
	color: #000;
	background-color: #f7bc5c;
	text-align: center;
	margin-right: 2px;
	padding-top: 8px;
}
#nav li a:hover{
	background-color:#F30;
	color:#FFF;
}
#banner ul{
	padding:0px;
	margin:0px;
}
#banner1 {
	margin: 0px auto;
	padding: 0px;
	width: 1200px;
	height:200px;
	background-image: url(550c471cb80028a2d51e31ecb9a0f23a.jpg);
}

</style>

<body>
<div id="banner1"><h1 align="center"><br>欢迎来到科研成果管理系统</h1>

<p align="center">&nbsp;</p></div>
<div id="banner">
<ul id="nav">
    <li><s:url id="editURL" action="query_funds"></s:url>
		<s:a href="%{editURL}">科研经费到款情况</s:a></li>
    <li><s:url id="editURL" action="query_accept">
		</s:url>
		<s:a href="%{editURL}">科研项目验收情况</s:a></li>
    <li><s:url id="editURL" action="query_software">
		</s:url>
		<s:a href="%{editURL}">软件著作权管理</s:a></li>
    <li><s:url id="editURL" action="query_patent">
		</s:url>
		<s:a href="%{editURL}">专利管理</s:a></li>
    <li><s:url id="editURL" action="query_priz">
		</s:url>
		<s:a href="%{editURL}">获奖情况管理</s:a></li>
    <li><s:url id="editURL" action="query_publ">
		</s:url>
		<s:a href="%{editURL}">出版专著管理</s:a></li>
    <li><s:url id="editURL" action="query_team">
		</s:url>
		<s:a href="%{editURL}">学术团体兼职情况</s:a></li>
    <li><s:url id="editURL" action="query_study">
		</s:url>
		<s:a href="%{editURL}">国内外进修及学习</s:a></li>
    <li><s:url id="editURL" action="query_coope">
		</s:url>
		<s:a href="%{editURL}">国际合作情况管理</s:a></li>
    <li> <a href="index.jsp">
	返回系统首页
	</a></li>
  </ul>
</div>
</body>
</html>