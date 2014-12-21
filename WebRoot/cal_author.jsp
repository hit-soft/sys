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
    <style type="text/css">
body {
	background-color: #6FF;
	margin :0px;
	padding:0px;
}
#banner {
	background-color:#FFF;
	margin: 0px auto;
	padding: 0px;
	width: 1200px;
}
#banner li {
	list-style:none;
	float:left;
	padding:0;
	margin:0;
}
#nav li a {
	text-decoration: none;
	display:block;
	height: 27px;
	width: 118px;
	font-family: "宋体";
	font-size: 14px;
	color: #000;
	background-color: #f7bc5c;
	text-align: center;
	margin-right: 2px;
	padding-top: 8px;
}
#nav li a:hover{
	background-color:#F30;
	color:#FFF;
}
#banner ul{
	padding:0px;
	margin:0px;
}
#banner1 {
	margin: 0px auto;
	padding: 0px;
	width: 1200px;
	height:200px;
	background-image: url(550c471cb80028a2d51e31ecb9a0f23a.jpg);
}
#banner2 a{
	text-decoration: none;
	height: 22px;
	width: 175px;
	font-family: "宋体";
	font-size: 14px;
	color: #000;
	text-align: center;
	margin-right: 2px;
	padding-top: 8px;
}
#banner2 a:hover{
	background-color:#F30;
	color:#FFF;
	}
#banner2 {
	background-color: #0F6;
	float: right;
	height: 40px;
	width: 200px;
	background-image: url(550c471cb80028a2d51e31ecb9a0f23a.jpg);
	margin-top: 0px;
}
</style>
	</head>

 <SCRIPT LANGUAGE="JavaScript">
	function goTo()
	{
		if(confirm("确认要跳转么?"))
		{
			history.go(-1)
		}
	}
 </SCRIPT>


<body>
<div id="banner1"><h1 align="center"><br>个人科研成绩</h1>
<p align="center">&nbsp;</p>
</div>
<table border="1" align="center" width="1200">
  <tr>
    <td width="91" nowrap="nowrap">人员姓名</td>
    <td width="91" nowrap="nowrap">科研总分</td>

  </tr>
  <tr>
    <td><input type=text value="${per}"></td>
    <td><input type=text value="${score}"></td>
  </tr>
</table>
<div id="banner">
<ul id="nav">
    <li><s:url id="editURL" action="query_funds">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">科研经费到款情况</s:a></li>
    <li><s:url id="editURL" action="query_accept">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">科研项目验收情况</s:a></li>
    <li><s:url id="editURL" action="query_software">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">软件著作权管理</s:a></li>
    <li><s:url id="editURL" action="query_patent">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">专利管理</s:a></li>
    <li><s:url id="editURL" action="query_priz">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">获奖情况管理</s:a></li>
    <li><s:url id="editURL" action="query_publ">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">出版专著管理</s:a></li>
    <li><s:url id="editURL" action="query_team">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">学术团体兼职情况</s:a></li>
    <li><s:url id="editURL" action="query_study">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">国内外进修情况</s:a></li>
    <li><s:url id="editURL" action="query_coope">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="flag" value="1"></s:param>
		</s:url>
		<s:a href="%{editURL}">国际合作情况管理</s:a></li>
    <li> <a href="index.jsp">
	返回系统首页
	</a></li>
  </ul>
</div>
<table width="1201" border="0" align="center">
  
  <tr>
  	<a href="javascript:goTo()">返回查询其他人员总分</a>
  </tr>
  
  <tr>
    <td align="center"><div id ="banner2"><a href="index.jsp">
	返回系统首页
	</a></div></td>
  </tr>
</table>
</body>
</html>
