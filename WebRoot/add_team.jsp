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
<h1 align="center">添加学术团体信息</h1>
<hr />
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="add_team">	
  <table width="299" border="0" align="right">
    <tr>
      <td width="110">学术团体名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
      <td>担任职务：</td>
      <td><label>
        <input name="post" type="text" id="post" />
      </label></td>
    </tr>
    <tr>
    <td>职务类型：</td>
      <td><label>
  <div align="right">  
    <select name="type" id="type">
      <option value="国际学术组织理事以上职务">国际学术组织理事以上职务</option>
      <option value="全国一级学会常务理事以上职务或专委会主任">全国一级学会常务理事以上职务或专委会主任</option>
      <option value="全国一级学会理事或专委会副主任">全国一级学会理事或专委会副主任</option>
      <option value="省学会常务理事以上职务或专委会主任">省学会常务理事以上职务或专委会主任</option>
      <option value="省学会理事或专委会副主任">省学会理事或专委会副主任</option>
      <option value="国家863主题专家组专家">国家863主题专家组专家</option>
      <option value="其他国家专家">其他国家专家</option>
    </select>
  </div>
      </label></td>
    </tr>
    <tr>
      <td>任职开始时间：</td>
      <td><label>
        <input name="start" type="text" id="start" />
      </label></td>
    </tr>
    <tr>
      <td>任职结束时间：</td>
      <td><label>
        <input name="end" type="text" id="end" />
      </label></td>
    </tr>
    <tr>
      <td>兼职人员姓名：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <br>
    <a href="index.jsp">
	返回系统首页
	</a>
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
<h2 align="center">	请详细正确的填写您要添加的学术团体信息，以避免造成不必要的错误。</h2>
</body>
</html>
