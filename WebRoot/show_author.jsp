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
    <link href="style3.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
  <p align="center">&nbsp;</p>
<table border="0" id="table3">
  <tr>
    <td width="91" nowrap="nowrap">人员姓名</td>
  </tr>
  <s:iterator value="l10"> <!-- l 为action 中 list -->
  <tr>
    <td><s:url id="editURL" action="cal_author">
		<s:param name="per" value="%{per}"></s:param>
		</s:url>
		<s:a href="%{editURL}">${per}</s:a></td>
		<s:a href="%{editURL}">${year}</s:a></td>
  </s:iterator>
  
</table>
<div id ="banner3"><a href="index.jsp">
	返回系统首页
	</a></div>
</body>
</html>
