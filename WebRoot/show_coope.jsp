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
  <p align="center">&nbsp;</p>
<table border="1" align="center">
  /*<tr>
     <td width="91">类别</td>
    <td width="91">出访人员名单</td>
    <td width="91">来访人员名单</td>
    <td width="91">开始时间</td>
    <td width="91">结束时间</td>
    <td width="91">出访地</td>
    <td width="91">来访地</td>
    <td width="91">访问目的</td>
    <td width="91">报告名称</td>
    <td width="51">操作1</td>
    <td width="53">操作2</td>
  </tr>*/
  <s:iterator value="l"> <!-- l 为action 中 list -->
  <tr>
    <td><input type=text value="${type}"></td>
    <td><input type=text value="${out_pe}"></td>
    <td><input type=text value="${in_pe}"></td>
    <td><input type=text value="${start}"></td>
    <td><input type=text value="${end}"></td>
    <td><input type=text value="${out_pl}"></td>
    <td><input type=text value="${in_pl}"></td>
    <td><input type=text value="${goal}"></td>
    <td><input type=text value="${name}"></td>
    <td><s:url id="editURL" action="del_coope">
		<s:param name="type" value="%{type}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
    <td><s:url id="editURL" action="upp_coope">
		<s:param name="type" value="%{type}"></s:param>
		<s:param name="out_pe" value="%{out_pe}"></s:param>
		<s:param name="in_pe" value="%{in_pe}"></s:param>
		<s:param name="num" value="%{num}"></s:param>
		<s:param name="start" value="%{start}"></s:param>
		<s:param name="end" value="%{end}"></s:param>
		<s:param name="out_pl" value="%{out_pl}"></s:param>
		<s:param name="in_pl" value="%{in_pl}"></s:param>
		<s:param name="goal" value="%{goal}"></s:param>
		<s:param name="name" value="%{name}"></s:param>
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
  </tr>
  </s:iterator>
</table>
</html>
