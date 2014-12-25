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
	background-color: #CCC;
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
	background-image: url(cal_author.jpg);
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
<table width="1217" border="0" align="center">
  <tr>
    <td width="129">&nbsp;</td>
    <td width="911">&nbsp;</td>
    <td width="155">&nbsp;</td>
  </tr>
  <tr>
    <td height="188">&nbsp;</td>
    <td bgcolor="#FFFFFF"><div id="banner1"><h1 align="center"><br>工作人员汇总</h1>
<p align="center">&nbsp;</p>
</div>
${year}年工作人员:</br>
<s:iterator value="l10"><s:url id="editURL" action="cal_author">
		<s:param name="per" value="%{per}"></s:param>
		<s:param name="year" value="%{year}"></s:param>
		</s:url>
		<s:a href="%{editURL}">${per}</s:a></s:iterator>
</script>
</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="172">&nbsp;</td>
    <td bgcolor="#FFFFFF" align = "center"><h4><a href ="add_induct.jsp">填写规则</a>|<a href ="concract.jsp">联系我们</a>|<a href="javascript:goTo()">返回查询其他人员总分</a></h4></td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>