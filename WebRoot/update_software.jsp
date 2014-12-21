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
	<title>无标题文档</title>
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

<div id="banner1">&nbsp;<h1 align="center">更新软件著作权</h1>
</div>
<p>&nbsp;</p>
<form id="form1" name="form1" method="post" action="update_software">	
  <table >
    <tr>
      <td width="692" rowspan="16">&nbsp;</td>
      <tr>
     <tr>
      <td width="110">著作权名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" value="${name}"/>
      </label></td>
    </tr>
    <tr>
      <td>著作权登记号：</td>
      <td><label>
        <input name="number" type="text" id="number" value="${number}" readonly/>
      </label></td>
    </tr>
    <tr>
      <td>著作权人：</td>
      <td><label>
        <input name="owner" type="text" id="owner" value="${owner}"/>
      </label></td>
    </tr>
    <tr>
      <td>授予单位：</td>
      <td><label>
        <input name="org" type="text" id="org" value="${org}"/>
      </label></td>
    </tr>
    <tr>
      <td>授予时间：</td>
      <td><label>
        <input name="time" type="text" id="time" value="${time}"/>
      </label></td>
    </tr>
    <tr>
      <td>人员：</td>
      <td><label>
        <input name="person" type="text" id="person" value="${person}" readonly/>
      </label></td>
    </tr>
    <tr>
      <td>排名顺序：</td>
      <td><label>
        <input name="per_level" type="text" id="per_level" value="${per_level}"/>
      </label></td>
    </tr>
    
    <tr>
      <td>年份：</td>
      <td><label>
        <input name="year" type="text" id="year" value="${year}"  readonly size="32"/>
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
