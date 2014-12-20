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
<link href="style2.css" rel="stylesheet" type="text/css" />
<link href="style3.css" rel="stylesheet" type="text/css" /></head>
<table border="1" align="center" id="table1">
  <tr>
    <td>类别</td>
    <td>来访人员名单</td>
   	<td>人数</td> 
    <td>开始时间</td>
    <td>结束时间</td>
    <td>来访地</td>
    <td>访问目的</td>
    <td>报告名称</td>
    <td>邀请人</td>
    <td>年份</td>
    <td>操作1</td>
    <td>操作2</td>
    
  </tr>
  <s:iterator value="l2"> <!-- l 为action 中 list -->
  <tr>
    <td><input type=text value="${type}" size="10" readonly="readonly"></td>
    
    <td><input type=text value="${in_pe}" size="10" readonly="readonly"></td>
    <td><input type=text value="${num}" size="10" readonly="readonly"></td>
    <td><input type=text value="${start}" size="10" readonly="readonly"></td>
    <td><input type=text value="${end}" size="10" readonly="readonly"></td>
    
    <td><input type=text value="${in_pl}" size="10" readonly="readonly"></td>
    <td><input type=text value="${goal}" size="10" readonly="readonly"></td>
    <td><input type=text value="${name}" size="10" readonly="readonly"></td>
    <td><input type=text value="${invi_by}" size="10" readonly="readonly"></td>
    <td><input type=text value="${year}" size="10" readonly="readonly"></td>
    <td><s:url id="editURL" action="del_coope">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="invi_by" value="%{invi_by}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
    <td><s:url id="editURL" action="upp_coope">
		<s:param name="type" value="%{type}"></s:param>
		<s:param name="in_pe" value="%{in_pe}"></s:param>
		<s:param name="num" value="%{num}"></s:param>
		<s:param name="start" value="%{start}"></s:param>
		<s:param name="end" value="%{end}"></s:param>
		<s:param name="in_pl" value="%{in_pl}"></s:param>
		<s:param name="goal" value="%{goal}"></s:param>
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="invi_by" value="%{invi_by}"></s:param>
		<s:param name="year" value="%{year}"></s:param>
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
  </tr>
  </s:iterator>
</table>
<p>&nbsp; </p>
<table border="0" id = "table2"  >
  <tr>
    <td width="200" align="center"><div id ="banner2"><s:url id="editURL" action="action3">
		</s:url>
		<s:a href="%{editURL}">返回查询其他人员总分</s:a></div></td>
  </tr>
  <tr>
    <td align="center"><div id ="banner2"><a href="index.jsp">
	返回系统首页
	</a></div></td>
  </tr>
</table>
</html>
