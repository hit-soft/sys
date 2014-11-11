<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show_by_author.jsp' starting page</title>
    
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
	background-color: #CCCCCC;
}
-->
</style></head>

<body>
<h1 align="center">下面表格是您所查询的内容</h1>
<hr />
<p align="center">&nbsp;</p>
<table border="1" align="center">
  <tr>
    <td>进jhfakgnjkdfgblfdja习单位</td>
    <td>进修dhjbashj</td>
    <td>开始时间</td>
    <td>结束时间</td>
    <td>人员姓名</td>
    <td width="51">操作1</td>
    <td width="53">操作2</td>
  </tr>
 <s:iterator value="l"> <!-- l 为action 中 list -->
  <tr>
    <td><input type=text value="${org}"></td>
    <td><input type=text value="${substance}"></td>
    <td><input type=text value="${start}"></td>
    <td><input type=text value="${end}"></td>
    <td><input type=text value="${person}"></td>
    <td><s:url id="editURL" action="del_study">
		<s:param name="org" value="%{org}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
    <td><s:url id="editURL" action="upp_study">
		<s:param name="org" value="%{org}"></s:param>
		<s:param name="substance" value="%{substance}"></s:param>
		<s:param name="start" value="%{start}"></s:param>
		<s:param name="end" value="%{end}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
  </tr>
  </s:iterator>
</table>
<p>&nbsp; </p>
</body>
</html>
