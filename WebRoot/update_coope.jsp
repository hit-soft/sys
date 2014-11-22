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
<h1 align="center">更新国际合作asdfasfsafasdfdsa情况信息</h1>
<hr />
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="update_coope">	
  <table width="299" border="0" align="right">
    <tr>
      <td width="110">类别：</td>
      <td width="179"><label>
        <input name="type" type="text" id="type" value="${type}"/>
      </label></td>
    </tr>
    <tr>
      <td>出访人员名单：</td>
      <td><label>
        <input name="out_pe" type="text" id="out_pe" value="${out_pe}"/>
      </label></td>
    </tr>
    <tr>
      <td>来访人员名单：</td>
      <td><label>
        <input name="in_pe" type="text" id="in_pe" value="${in_pe}"/>
      </label></td>
    </tr>
    <tr>
      <td>开始时间：</td>
      <td><label>
        <input name="start" type="text" id="start" value="${num}"/>
      </label></td>
    </tr>
    <tr>
      <td>结束时间：</td>
      <td><label>
        <input name="end" type="text" id="end" value="${start}"/>
      </label></td>
    </tr>
    <tr>
      <td>出访地：</td>
      <td><label>
        <input name="out_pl" type="text" id="out_pl" value="${out_pl}"/>
      </label></td>
    </tr>
    <tr>
      <td>来访地：</td>
      <td><label>
        <input name="in_pl" type="text" id="in_pl" value="${in_pl}"/>
      </label></td>
    </tr>
    <tr>
      <td>访问目的：</td>
      <td><label>
        <input name="goal" type="text" id="goal" value="${goal}"/>
      </label></td>
    </tr>
    <tr>
      <td>报告名称：</td>
      <td><label>
        <input name="name" type="text" id="name" value="${name}"/>
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
<h2 align="center">	请详细正确的填写您况信息，以避免造成不必要的错误。</h2>
</body>
</html>
