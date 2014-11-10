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
    
    <title>My JSP 'study.jsp' starting page</title>
   /*hudsfahdhjfasgfdhjf*/
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
<h1 align="center">查询国内外进修信息</h1>
<hr />
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="query_study">	
  <table width="299" border="0" align="right">
    <tr>
      <td width="110">进修学习单位：</td>
      <td width="179"><label>
        <input name="org" type="text" id="org" />
      </label></td>
    </tr>
    <tr>
      <td>进修学习内容：</td>
      <td><label>
        <input name="substance" type="text" id="substance" />
      </label></td>
    </tr>
    <tr>
      <td>开始时间：</td>
      <td><label>
        <input name="start" type="text" id="start" />
      </label></td>
    </tr>
    <tr>
      <td>结束时间：</td>
      <td><label>
        <input name="end" type="text" id="end" />
      </label></td>
    </tr>
    <tr>
      <td>人员姓名：</td>
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
<h2 align="center">	请详细正确的填写您要查询的国内外进修信息，以避免造成不必要的错误。</h2>
</body>
</html>
