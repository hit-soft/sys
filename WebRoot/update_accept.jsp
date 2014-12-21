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

<div id="banner1">&nbsp;<h1 align="center">更新科研项目验收情况</h1>
</div>
<p>&nbsp;</p>
<form id="form1" name="form1" method="post" action="update_accept">	
  <table >
    <tr>
      <td width="692" rowspan="17">&nbsp;</td>
      <tr>
      <tr>
      <td width="110">项目名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" value="${name}" readonly size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目来源：</td>
      <td><label>
        <input name="source" type="text" id="source" value="${source}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目负责人：</td>
      <td><label>
        <input name="leader" type="text" id="leader" value="${leader}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>开始时间：</td>
      <td><label>
        <input name="start" type="text" id="start" value="${start}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>结束时间：</td>
      <td><label>
        <input name="end" type="text" id="end" value="${end}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>合同额：</td>
      <td><label>
        <input name="contract" type="text" id="contract" value="${contract}" size="32"/>
      </label></td>
    </tr>
            <tr>
      <td>项目类型：</td>
      <td><label>
    <select name="type" id="type" >
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
      </label></td>
    </tr>
    <tr>
      <td>验收时间：</td>
      <td><label>
        <input name="time" type="text" id="time" value="${time}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>验收单位：</td>
      <td><label>
        <input name="org" type="text" id="org" value="${org}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>课题合同号：</td>
      <td><label>
        <input name="number" type="text" id="number" value="${number}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>经费卡号：</td>
      <td><label>
        <input name="card" type="text" id="card" value="${card}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>人员：</td>
      <td><label>
        <input name="person" type="text" id="person" value="${person}" readonly size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>排名顺序：</td>
      <td><label>
        <input name="per_level" type="text" id="per_level" value="${per_level}" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>备注：</td>
      <td><label>
        <input name="remark" type="text" id="remark" value="${remark}" size="32"/>
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
        <input type="submit" name="Submit" value="提交" />
      </label>
        <label>
        <input type="reset" name="Submit2" value="重置" />
        </label><p>&nbsp;</p><a href="index.jsp" style="float: right">
	返回系统首页
	</a></td>
    </tr>
  </table>
</form>
</body>
</html>
