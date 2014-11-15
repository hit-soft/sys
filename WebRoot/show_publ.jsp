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

<hr />
<p align="center">&nbsp;</p>
<table border="1" align="center">
  <tr>
    <td width="91">著作权名称</td>
    <td width="91">著作权登记号</td>/*hsnssanndndncdn*/
    <td width="91">著作权daggfhgg人</td>
    <td width="91">授sggyahuauhf予单位</td>
    <td width="91">授予时间</td>
    <td width="91">人员名单</td>
    <td width="51">操作1</td>
    <td width="53">操作2</td>
  </tr>
  <s:iterator value="l"> <!-- l 为action 中 list -->
  <tr>
    <td><input type=text value="${name}"></td>
    <td><input type=text value="${press}"></td>
    <td><input type=text value="${time}"></td>
    <td><input type=text value="${person}"></td>
    <td><s:url id="editURL" action="del_publ">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="press" value="%{press}"></s:param>
		<s:param name="time" value="%{time}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
    <td><s:url id="editURL" action="upp_publ">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="press" value="%{press}"></s:param>
		<s:param name="time" value="%{time}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
  </tr>
  </s:iterator>
</table>
<p>&nbsp; </p>
</body>
</html>

