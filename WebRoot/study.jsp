<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3//DTD HTML 4.01 Transitional//EN">
<html>/*jdbdhjshfafavfdasj*/
  <head>
    <base href="<%=basePath%>">
    <title>Book Management System starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  </head>
  <style type="text/css">
<!--
body {
	background-color: #CCCCCC;
}
-->
</style></head>
  
  <body>
<h1 align="center">欢迎来到图书gdfsgdfsgdsg查询系统</h1>
<hr />
<p align="center">&nbsp;</p>
<p align="center">通过该页面您可以查询gdfgdsgdgdgdfgd国内外进修情况信息同时也可以向系统中添加一个国内外gsdgsfdgsdf进修情况信息</p>
<hr />
<p align="center">&nbsp;</p>
<p align="right">请选择您所需要的服fdgfdgds务：</p>
<form id="form1" name="form1" method="post" action="study">
  <label>
  <div align="right">
    <select name="study" id="study">
      <option value="1">添加国内外进修情fdgdsg况信息</option>
      <option value="2">查询国内外进修dfsgdsfgds情况信息</option>
      </select>
  </div>
  </label>
  <p>
    <label></label>
    <label>
    <div align="right">
    	<input type="submit" name="Submit" value="提交" />
      <input type="reset" name="Submit2" value="重置" />
      
    </div>
    </label>
    <label></label>
  </p>
  <p align="right">&nbsp; </p>
</form>
<p align="center">&nbsp;</p>
</body>
</html>