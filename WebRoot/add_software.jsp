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
    
    <title>My JSP 'software.jsp' starting page</title>
   
	<link href="style1.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="banner1">&nbsp;<h1 align="center">软件著作权查询界面</h1>
</div>
 
<form id="form1" name="form1" method="post" action="add_software">	
  <table>
    <tr>
      <td width="198">著作权名称：</td>
      <td width="292"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
      <td>著作权登记号：</td>
      <td><label>
        <input name="number" type="text" id="number" />
      </label></td>
    </tr>
    <tr>
      <td>著作权人：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>授予单位：</td>
      <td><label>
        <input name="org" type="text" id="org" />
      </label></td>
    </tr>
    <tr>
      <td>授予时间：</td>
      <td><label>
        <input name="time" type="text" id="time" />
      </label></td>
    </tr>
    <tr>
      <td>人员1：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>人员2：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>人员3：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>人员4：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    
    
    
    <tr>
      <td></td>
      <td><label>
        <input type="submit" name="Submit" value="提交" />
      </label>
        <label>
        <input type="reset" name="Submit2" value="重置" />
        </label>
        <p>&nbsp;</p><a href="index.jsp" style="float: right">
	返回系统首页
	</a></td>
    </tr>
  </table>
</form>
</body>
</html>
