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
  <p align="center">&nbsp;</p>
<table border="1" align="center">
  <tr>
    <td width="91" nowrap="nowrap">人员姓名</td>
  </tr>
  <s:iterator value="l10"> <!-- l 为action 中 list -->
  <tr>
    <td><s:url id="editURL" action="cal_author">
		<s:param name="per" value="%{per}"></s:param>
		</s:url>
		<s:a href="%{editURL}">${per}</s:a></td>
    
  
  </s:iterator>
  
</table>

<br>
    <a href="index.jsp">
	返回系统首页
	</a>
</html>
