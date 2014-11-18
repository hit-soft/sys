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

<div id="banner1">&nbsp;<h1 align="center">更新获奖信息</h1>
</div>
<p>&nbsp;</p>
<form id="form1" name="form1" method="post" action="update_priz">	
  <table >
    <tr>
      <td width="692" rowspan="17">&nbsp;</td>
      <tr>
     <tr>
      <td width="110">项目名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" value="${name}" readonly/>
      </label></td>
    </tr>
    <tr>
      <td>获奖类型：</td>
      <td><label>
        <input name="type" type="text" id="type" value="${type}"/>
      </label></td>
    </tr>
    <tr>
      <td>获奖等级：</td>
      <td><label>
    <select name="level" id="level">
      <option value="国家级一等奖">国家级一等奖</option>
      <option value="国家级二等奖">国家级二等奖</option>
      <option value="省部级一等奖">省部级一等奖</option>
      <option value="省部级二等奖">省部级二等奖</option>
      <option value="国际专项奖">国际专项奖</option>
      <option value="国内专项奖">国内专项奖</option>
    </select>
      </label></td>
    </tr>
    <tr>
      <td>获奖时间：</td>
      <td><label>
        <input name="time" type="text" id="time" value="${time}"/>
      </label></td>
    </tr>
    <tr>
      <td>获奖人员名单：</td>
      <td><label>
        <input name="person" type="text" id="person" value="${person}" readonly/>
      </label></td>
    </tr>
    <tr>
      <td>排名顺序：</td>
      <td><label>
        <input name="per_level" type="text" id="per_level" value="${per_level}"/>
      </label></td>
    </tr>
    <tr>
      <td><a href="index.jsp">
	返回系统首页
	</a></td>
      <td><label>
      <input type="submit" name="Submit3" value="提交" />
      <input type="reset" name="Submit22" value="重置" />
      </label></td>
    </tr>
  </table>
</form>
</body>
</html>
