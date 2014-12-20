<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Book Management System starting page</title>
	<style type="text/css">
body {
	background-color: #FFF;
	margin :0px;
	padding:0px;
}

#banner {
	
	margin: 0px auto;
	padding: 0px;
	width: 1200px;
	background-color:#FFF;
}
#banner1 {
	margin: 0px auto;
	width: 1200px;
	height:200px;
	background-image: url(550c471cb80028a2d51e31ecb9a0f23a.jpg);
	font-family: "宋体";
	color: #F00;
}
table {
	margin: 0px auto;
	width: 1200px;
	background-color: #390;
	text-align: center;
}
td {
	text-align: left;
	margin: 0px;
	padding: 0px;
}
</style>
</head>

<body>

<div id="banner1">&nbsp;<h1 align="center">更新国内外进修信息</h1>
</div>
<p>&nbsp;</p>
<form id="form1" name="form1" method="post" action="update_study">	
  <table >
    <tr>
      <td width="692" rowspan="17">&nbsp;</td>
      <tr>
     <tr>
      <td width="110">进修学习单位：</td>
      <td width="179"><label>
        <input name="org" type="text" id="org" value="${org}" readonly/>
      </label></td>
    </tr>
    <tr>
      <td>进修学习内容：</td>
      <td><label>
        <input name="substance" type="text" id="substance" value="${substance}"/>
      </label></td>
    </tr>
    <tr>
      <td>开始时间：</td>
      <td><label>
        <input name="start" type="text" id="start" value="${start}"/>
      </label></td>
    </tr>
    <tr>
      <td>结束时间：</td>
      <td><label>
        <input name="end" type="text" id="end" value="${end}"/>
      </label></td>
    </tr>
    <tr>
      <td>人员姓名：</td>
      <td><label>
        <input name="person" type="text" id="person" value="${person}" readonly/>
      </label></td>
    </tr>
    <tr>
      <td></td>
      <td><label>
      <input type="submit" name="Submit3" value="提交" />
      <input type="reset" name="Submit22" value="重置" />
      </label><p>&nbsp;</p><a href="index.jsp" style="float: right">
	返回系统首页
	</a></td>
    </tr>
  </table>
</form>
</body>
</html>
