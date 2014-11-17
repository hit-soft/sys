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
    
    <title>My JSP 'patent.jsp' starting page</title>
   /*dhjabhdbahj*/
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
<h1 align="center">查sdff息</h1>
<hr />
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="query_funds">	
  <table width="299" border="0" align="right">
    <tr>
      <td width="110">称ahghgadhhahs：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
      <td>项</td>
      <td><label>
        <input name="source" type="text" id="source" />
      </label></td>
    </tr>
    <tr>
      <td>项目负责gzfggfagfg人：</td>
      <td><label>
        <input name="leader" type="text" id="leader" />
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
      <td>合同额：</td>
      <td><label>
        <input name="contract" type="text" id="contract" />
      </label></td>
    </tr>
    <tr>
      <td>已到款：</td>
      <td><label>
        <input name="already" type="text" id="already" />
      </label></td>
    </tr>
    <tr>
      <td>未到款：</td>
      <td><label>
        <input name="non" type="text" id="non" />
      </label></td>
    </tr>
    <tr>
      <td>项目号：</td>
      <td><label>
        <input name="number" type="text" id="number" />
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
<h2 align="center">	请详细正确的填写您要查询的科研经费信息，以避免造成不必要的错误。</h2>
</body>
</html>
