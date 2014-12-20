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

<body>
<h1 align="center">下面表格是您所查询的内容</h1>
<hr />
<p align="center">&nbsp;</p>
<table border="1" align="center" id="table1">
  <tr>
    <td width="91">专利名称</td>
    <td width="91">专利编号</td>
    <td width="91">专利权人</td>
    <td width="91">授予单位</td>
    <td width="91">授予时间</td>
    <td width="91">人员名单</td>
    <td width="91">排名顺序</td>
    <td width="91">专利类型</td>
<<<<<<< HEAD
    <td width="53">年份</td>
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
    <td width="51">操作1</td>
    <td width="53">操作2</td>
  </tr>
   <s:iterator value="l4"> <!-- l 为action 中 list -->
  <tr>
    <td><input type=text value="${name}" size="10" readonly="readonly"></td>
    <td><input type=text value="${number}" size="10" readonly="readonly"></td>
    <td><input type=text value="${owner}" size="10" readonly="readonly"></td>
    <td><input type=text value="${org}" size="10" readonly="readonly"></td>
    <td><input type=text value="${time}" size="10" readonly="readonly"></td>
    <td><input type=text value="${person}" size="10" readonly="readonly"></td>
    <td><input type=text value="${per_level}" size="10" readonly="readonly"></td>
    <td><input type=text value="${type}" size="10" readonly="readonly"></td>
<<<<<<< HEAD
    <td><input type=text value="${year}" size="10" readonly="readonly"></td>
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
    <td><s:url id="editURL" action="del_patent">
		<s:param name="number" value="%{number}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
    <td><s:url id="editURL" action="upp_patent">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="number" value="%{number}"></s:param>
		<s:param name="owner" value="%{owner}"></s:param>
		<s:param name="org" value="%{org}"></s:param>
		<s:param name="time" value="%{time}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
		<s:param name="per_level" value="%{per_level}"></s:param>
		<s:param name="type" value="%{type}"></s:param>
<<<<<<< HEAD
		<s:param name="year" value="%{year}"></s:param>
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
  </tr>
  </s:iterator>
</table>
</body>
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

