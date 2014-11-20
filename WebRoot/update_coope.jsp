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

<div id="banner1">&nbsp;<h1 align="center">更新国际合作情况信息</h1>
</div>
<p>&nbsp;</p>
<form id="form1" name="form1" method="post" action="update_coope">	
  <table >
    <tr>
      <td width="783" rowspan="17">&nbsp;</td>
      <tr>
     <tr>
      <td width="185">类别：</td>
      <td width="216"><label>
        <input name="type" type="text" id="type" value="${type}"/>
      </label></td>
    </tr>
   
    <tr>
      <td>来访人员名单：</td>
      <td><label>
        <input name="in_pe" type="text" id="in_pe" value="${in_pe}"/>
      </label></td>
    </tr>
    <tr>
      <td>人数：</td>
      <td><label>
        <input name="num" type="text" id="num" value="${num}"/>
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
        <input name="name" type="text" id="name" value="${name}" readonly/>
      </label></td>
    </tr>
    <tr>
      <td>邀请人：</td>
      <td><label>
        <input name="invi_by" type="text" id="invi_by" value="${invi_by}" readonly/>
      </label></td>
    </tr>
    <tr>
      <td></td>
      <td><label>
      <input type="submit" name="Submit3" value="提交" />
      <input type="reset" name="Submit22" value="重置" />
      </label>
      <p>&nbsp;</p><a href="index.jsp" style="float: right">
	返回系统首页
	</a></td>
    </tr>
  </table>
</form>
</body>
</html>
