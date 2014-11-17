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
    <td width="91">项目名称</td>
    <td width="91">项目来源</td>
    <td width="91">项目负责人</td>
    <td width="91">开始时间</td>
    <td width="91">结束时间</td>
    <td width="91">合同额</td>
    <td width="91">已到款</td>
    <td width="91">未到款</td>
    <td width="91">课题合同号</td>
    <td width="91">人员</td>
    <td width="91">排名顺序</td>
    <td width="91">项目类型</td>
    <td width="51">操作1</td>
    <td width="53">操作2</td>
  </tr>
  <s:iterator value="l3"> <!-- l 为action 中 list -->
  <tr>
    <td><input type=text value="${name}"></td>
    <td><input type=text value="${source}"></td>
    <td><input type=text value="${leader}"></td>
    <td><input type=text value="${start}"></td>
    <td><input type=text value="${end}"></td>
    <td><input type=text value="${contract}"></td>
    <td><input type=text value="${already}"></td>
    <td><input type=text value="${non}"></td>
    <td><input type=text value="${number}"></td>
    <td><input type=text value="${person}"></td>
    <td><input type=text value="${per_level}"></td>
    <td><input type=text value="${type}"></td>
    
    <td><s:url id="editURL" action="del_funds">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
		
    <td><s:url id="editURL" action="upp_funds">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="source" value="%{source}"></s:param>
		<s:param name="leader" value="%{leader}"></s:param>
		<s:param name="start" value="%{start}"></s:param>
		<s:param name="end" value="%{end}"></s:param>
		<s:param name="contract" value="%{contract}"></s:param>
		<s:param name="already" value="%{already}"></s:param>
		<s:param name="non" value="%{non}"></s:param>
		<s:param name="number" value="%{number}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
		<s:param name="per_level" value="%{per_level}"></s:param>
		<s:param name="type" value="%{type}"></s:param>
		
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
  </tr>
  </s:iterator>
</table>
	<td><s:url id="editURL" action="action3">
		</s:url>
		<s:a href="%{editURL}">返回查询其他人员总分</s:a></td>
	<br>
<br>
    <a href="index.jsp">
	返回系统首页
	</a>
</html>
