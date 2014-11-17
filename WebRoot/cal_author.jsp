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
<h1 align="center">查询个人科研总分</h1>
<hr />
<p align="center">&nbsp;</p>




<table border="1" align="center">
  <tr>
    <td width="91" nowrap="nowrap">人员姓名</td>
    <td width="91" nowrap="nowrap">科研总分</td>

  </tr>
  <tr>
    <td><input type=text value="${per}"></td>
    <td><input type=text value="${score}"></td>
  </tr>
  
  
</table>



    
    <br>
    <a href="show_author.jsp">
	返回查询其他人员总分
	</a>
    
    
    <br>
    <a href="index.jsp">
	返回系统首页
	</a>
    
  </table>
  <div align="right"></div>
  <div align="center"></div>
</form>
<h2 align="center">	请详细正确的填写您要添加的科研项目验收信息，以避免造成不必要的错误。</h2>
</body>
</html>
