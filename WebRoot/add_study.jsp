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
  <link href="style1.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div id="banner1">&nbsp;<h1 align="center">添加国内外进修信息</h1>
</div>
<form id="form1" name="form1" method="post" action="add_study">	
  <table >
    <tr>
      <td width="718" rowspan="7">&nbsp;</td>
     <tr>
      <td width="110">进修学习单位：</td>
      <td width="179"><label>
        <input name="org" type="text" id="org" />
      </label></td>
    </tr>
    <tr>
      <td>进修学习内容：</td>
      <td><label>
        <input name="substance" type="text" id="substance" />
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
      <td>人员姓名：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
   
    <tr>
      <td> <a href="index.jsp">
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
