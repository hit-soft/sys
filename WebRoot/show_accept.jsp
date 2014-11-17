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
  <tr>
    <td width="91" nowrap="nowrap">项目名zxvzv称</td>
    <td width="91" nowrap="nowrap">项目cxvzv来源</td>
    <td width="91" nowrap="nowrap">项目vzxv负责人</td>
    <td width="91" nowrap="nowrap">开始时vx间</td>
    <td width="91" nowrap="nowrap">结束cvz时间</td>
    <td width="91" nowrap="nowrap">合同额</td>
    <td width="91" nowrap="nowrap">类型</td>
    <td width="91" nowrap="nowrap">验收时间</td>
    <td width="47" nowrap="nowrap">验收单位</td>
    <td width="78" nowrap="nowrap">课题合同号</td>
    <td width="29" nowrap="nowrap">经费卡号</td>
    <td width="19" nowrap="nowrap">备注</td>
    <td width="51" nowrap="nowrap">操作1</td>
    <td width="121" nowrap="nowrap">操作2</td>
  </tr>
  <s:iterator value="l"> <!-- l 为action 中 list -->
  <tr>
    <td><input type=text value="${name}"></td>
    <td><input type=text value="${source}"></td>
    <td><input type=text value="${leader}"></td>
    <td><input type=text value="${start}"></td>
    <td><input type=text value="${end}"></td>
    <td><input type=text value="${contract}"></td>
    <td><input type=text value="${type}"></td>
    <td><input type=text value="${time}"></td>
    <td><input type=text value="${org}"></td>
    <td><input type=text value="${number}"></td>
    <td><input type=text value="${card}"></td>
 	<td><input type=text value="${remark}"></td>
    <td><s:url id="editURL" action="del_accept">
		<s:param name="name" value="%{name}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
    <td><s:url id="editURL" action="upp_accept">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="source" value="%{source}"></s:param>
		<s:param name="leader" value="%{leader}"></s:param>
		<s:param name="start" value="%{start}"></s:param>
		<s:param name="end" value="%{end}"></s:param>
		<s:param name="contract" value="%{contract}"></s:param>
		<s:param name="type" value="%{type}"></s:param>
		<s:param name="time" value="%{time}"></s:param>
		<s:param name="org" value="%{org}"></s:param>
		<s:param name="number" value="%{number}"></s:param>
		<s:param name="card" value="%{card}"></s:param>
		<s:param name="remark" value="%{remark}"></s:param>
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
  </tr>
  </s:iterator>
</table>
</html>
