<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    
    <title>My JSP 'patent.jsp' starting page</title>
   
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
<h1 align="center">添加获奖信息</h1>
<hr />
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="add_priz">	
  <table width="299" border="0" align="right">
    <tr>
      <td width="110">项目名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
      <td>获奖类型：</td>
      <td><label>
        <input name="type" type="text" id="type" />
      </label></td>
    </tr>
    <tr>
      <td>获奖等级：</td>
      <td><label>
        <input name="level" type="text" id="level" />
      </label></td>
    </tr>
    <tr>
      <td>获奖时间：</td>
      <td><label>
        <input name="time" type="text" id="time" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员名单：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><label>
      <input type="submit" name="Submit3" value="提交" />
      <input type="reset" name="Submit22" value="重置" />
      </label></td>
    </tr>
  </table>
  <div align="right"></div>
  <div align="center"></div>
</form>
<h2 align="center">	请详细正确的填写您要添加的获奖信息，以避免造成不必要的错误。</h2>
</body>
</html>
