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
    
	
	</head>
<link href="style2.css" rel="stylesheet" type="text/css" />
<link href="style3.css" rel="stylesheet" type="text/css" />
<body>
<table id="table1" border="1" id="table1">
  <tr>
    <td>项目名称</td>
    <td>项目来源</td>
    <td>项目负责人</td>
    <td>开始时间</td>
    <td>结束时间</td>
    <td>合同额</td>
    <td>类型</td>
    <td>验收时间</td>
    <td>验收单位</td>
    <td>课题合同号</td>
    <td>经费卡号</td>
    <td>人员</td>
    <td>排名顺序</td>
    <td>备注</td>
    <td>操作1</td>
    <td>操作2</td>
  </tr>
  <s:iterator value="l1"> <!-- l 为action 中 list -->
  <tr>
    <td><input type=text value="${name}" size="10" readonly="readonly" ></td>
    <td><input type=text value="${source}" size="10" readonly="readonly" ></td>
    <td><input type=text value="${leader}" size="10" readonly="readonly" ></td>
    <td><input type=text value="${start}" size="10" readonly="readonly"></td>
    <td><input type=text value="${end}" size="10" readonly="readonly"></td>
    <td><input type=text value="${contract}" size="10" readonly="readonly"></td>
    <td><input type=text value="${type}" size="10" readonly="readonly"></td>
    <td><input type=text value="${time}" size="10" readonly="readonly"></td>
    <td><input type=text value="${org}" size="10" readonly="readonly"></td>
    <td><input type=text value="${number}" size="10" readonly="readonly"></td>
    <td><input type=text value="${card}" size="10" readonly="readonly"></td>
    <td><input type=text value="${person}" size="10" readonly="readonly"></td>
    <td><input type=text value="${per_level}" size="10" readonly="readonly"></td>
 	<td><input type=text value="${remark}" size="10" readonly="readonly"></td>
    <td><s:url id="editURL" action="del_accept">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
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
		<s:param name="person" value="%{person}"></s:param>
		<s:param name="per_level" value="%{per_level}"></s:param>
		<s:param name="remark" value="%{remark}"></s:param>
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
