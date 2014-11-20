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

<div id="banner1">&nbsp;<h1 align="center">添加学术团体信息</h1>
</div>
<form id="form1" name="form1" method="post" action="add_team">	
  <table >
    <tr>
      <td width="692" rowspan="8">&nbsp;</td>
      <tr>
      <td width="177">学术团体名称：</td>
      <td width="315"><label>
        <input name="name" type="text" id="name" size="37"/>
      </label></td>
    </tr>
    <tr>
      <td>担任职务：</td>
      <td><label>
        <input name="post" type="text" id="post" size="37"/>
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
      <td>任职开始时间：</td>
      <td><label>
        <input name="start" type="text" id="start" size="37"/>
      </label></td>
    </tr>
    <tr>
      <td>任职结束时间：</td>
      <td><label>
        <input name="end" type="text" id="end" size="37"/>
      </label></td>
    </tr>
    <tr>
      <td>兼职人员姓名：</td>
      <td><label>
        <input name="person" type="text" id="person" size="37"/>
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
