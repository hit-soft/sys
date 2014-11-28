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
  <link href="style1.css" rel="stylesheet" type="text/css" /></head>

<body>
<div id="banner1">&nbsp;<h1 align="center">添加出版专著信息</h1></div>
<form id="form1" name="form1" method="post" action="add_publ">	
  <table >
    <tr>
      <td width="224">专著名称：</td>
      <td width="295"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
      <td>出版社名称：</td>
      <td><label>
        <input name="press" type="text" id="press" />
      </label></td>
    </tr>
    <tr>
      <td>出版时间：</td>
      <td><label>
        <input name="time" type="text" id="time" />
      </label></td>
    </tr>
    <tr>
      <td>著者1：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>著者2：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>著者3：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>著者4：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>著者5：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>出版类型：</td>
      <td><label>
        <select name="type" id="type" style="width:173px">
          <option value="外文版专著">外文版专著</option>
          <option value="中文版专著">中文版专著</option>
          <option value="译著">译著</option>
        </select>
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
