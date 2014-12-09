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
<h1 align="center">更新信息</h1>
<hr />
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="update_accept">	
  <table width="299" border="0" align="right">
    <tr>
      <td width="110">项目cccccccccccccccccccccccccccccc名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" value="${name}" disabled="true"/>
      </label></td>
    </tr>
    <tr>
      <td>项源：</td>
      <td><label>
        <input name="source" type="text" id="source" value="${source}"/>
      </label></td>
    </tr>
    <tr>
      <td>项责人：</td>
      <td><label>
        <input name="leader" type="text" id="leader" value="${leader}"/>
      </label></td>
    </tr>
    <tr>
      <td>开始：</td>
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
      <td>合同额：</td>
      <td><label>
        <input name="contract" type="text" id="contract" value="${constract}"/>
      </label></td>
    </tr>
    <tr>
      <td>类型：</td>
      <td><label>
        <input name="type" type="text" id="type" value="${type}"/>
      </label></td>
    </tr>
    <tr>
      <td>验收时cccccccccccccccccccccccccc间：</td>
      <td><label>
        <input name="time" type="text" id="time" value="${time}"/>
      </label></td>
    </tr>
    <tr>
      <td>验收单位ssssssssssssssssssssssss：</td>
      <td><label>
        <input name="org" type="text" id="org" value="${org}"/>
      </label></td>
    </tr>
    <tr>
      <td>课题合同号：</td>
      <td><label>
        <input name="number" type="text" id="number" value="${number}"/>
      </label></td>
    </tr>
    <tr>
      <td>经费卡dddddddddddddddddddddd号：</td>
      <td><label>
        <input name="card" type="text" id="card" value="${card}"/>
      </label></td>
    </tr>
    <tr>
      <td>备注dddddddddddddddddddddddddddd：</td>
      <td><label>
        <input name="remark" type="text" id="remark" value="${remark}"/>
      </label></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><label>
        <input type="submit" name="Submit" value="提交" />
      </label>
        <label>
        <input type="reset" name="Submit2" value="重置" />
        </label></td>
    </tr>
  </table>
  <div align="right"></div>
  <div align="center"></div>
</form>
<h2 align="center">	请详细正确的填写fsdaasfsafa您要更新的科研经费信息，以避免造成不必要的错误。</h2>
</body>
</html>
