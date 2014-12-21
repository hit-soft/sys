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
	<title>无标题文档</title>
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

<div id="banner1">&nbsp;<h1 align="center">更新学术团体信息</h1>
</div>
<p>&nbsp;</p>
<form id="form1" name="form1" method="post" action="update_team">
  <table >
    <tr>
      <td width="692" rowspan="17">&nbsp;</td>
      <tr>
     <tr>
      <td width="110">学术团体名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" value="${name}"  readonly size="37"/>
      </label></td>
    </tr>
    <tr>
      <td>担任职务：</td>
      <td><label>
        <input name="post" type="text" id="post" value="${post}" readonly size="37"/>
      </label></td>
    </tr>
    <tr>
      <td>任职开始时间：</td>
      <td><label>
        <input name="start" type="text" id="start" value="${start}" size="37"/>
      </label></td>
    </tr>
    <tr>
      <td>任职结束时间：</td>
      <td><label>
        <input name="end" type="text" id="end" value="${end}" size="37"/>
      </label></td>
    </tr>
    <tr>
      <td>兼职人员姓名：</td>
      <td><label>
        <input name="person" type="text" id="person" value="${person}" size="37"/>
      </label></td>
    </tr>
    
    <tr>
    <td>职务类型：</td>
      <td><label>
    <select name="type" id="type">
      <option value="国际学术组织理事以上职务">国际学术组织理事以上职务</option>
      <option value="全国一级学会常务理事以上职务或专委会主任">全国一级学会常务理事以上职务或专委会主任</option>
      <option value="全国一级学会理事或专委会副主任">全国一级学会理事或专委会副主任</option>
      <option value="省学会常务理事以上职务或专委会主任">省学会常务理事以上职务或专委会主任</option>
      <option value="省学会理事或专委会副主任">省学会理事或专委会副主任</option>
      <option value="国家863主题专家组专家">国家863主题专家组专家</option>
      <option value="其他国家专家">其他国家专家</option>
    </select>
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
      <input type="submit" name="Submit3" value="提交" />
      <input type="reset" name="Submit22" value="重置" />
      </label><p>&nbsp;</p><a href="index.jsp" style="float: right">
	返回系统首页
	</a></td>
    </tr>
  </table>
</form>
</body>
</html>
