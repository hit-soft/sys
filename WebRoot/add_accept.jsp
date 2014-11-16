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
<h1 align="center">添加科研项目验收信息</h1>
<hr />
<p align="center">&nbsp;</p>
<form id="form1" name="form1" method="post" action="add_accept">	
  <table width="299" border="0" align="right">
    <tr>
      <td width="110">项目名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
      <td>项目来源：</td>
      <td><label>
        <input name="source" type="text" id="source" />
      </label></td>
    </tr>
    <tr>
      <td>项目负责人：</td>
      <td><label>
        <input name="person" type="text" id="person" />
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
      <td>项目类型：</td>
      <td><label>
  <div align="right">
    <select name="type" id="type">
		<option value="国家973项目">国家973项目</option>
		<option value="国家科技重大专项">国家科技重大专项</option>
		<option value="国家自然科学基金	重大/重点">国家自然科学基金	重大/重点</option>
		<option value="国家自然科学基金	面上">国家自然科学基金	面上</option>
		<option value="863项目、国家科技支撑项目	重大/重点">863项目、国家科技支撑项目	重大/重点</option>
		<option value="863项目、国家科技支撑项目	863面上">863项目、国家科技支撑项目	863面上</option>
		<option value="部委重大/重点项目">部委重大/重点项目</option>
		<option value="国防类及其它部委项目">国防类及其它部委项目</option>
		<option value="国际合作项目">国际合作项目</option>
		<option value="其它科研项目">其它科研项目</option>
    </select>
  </div>
      </label></td>
    </tr>

	<tr>
      <td>验收时间：</td>
      <td><label>
        <input name="time" type="text" id="time" />
      </label></td>
    </tr>
    <tr>
      <td>验收单位：</td>
      <td><label>
        <input name="org" type="text" id="org" />
      </label></td>
    </tr>
    <tr>
      <td>课题合同号：</td>
      <td><label>
        <input name="number" type="text" id="number" />
      </label></td>
    </tr>
    <tr>
      <td>经费卡号：</td>
      <td><label>
        <input name="card" type="text" id="card" />
      </label></td>
    </tr>
    <tr>
      <td>项目人员1：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>项目人员2：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>项目人员3：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>项目人员4：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>项目人员5：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>备注：</td>
      <td><label>
        <input name="remark" type="text" id="remark" />
      </label></td>
    </tr>
    <br>
    <a href="index.jsp">
	返回系统首页
	</a>
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
<h2 align="center">	请详细正确的填写您要添加的科研项目验收信息，以避免造成不必要的错误。</h2>
</body>
</html>
