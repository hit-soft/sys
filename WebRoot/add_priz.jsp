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

<div id="banner1">&nbsp;<h1 align="center">添加获奖信息</h1>
</div>
<form id="form1" name="form1" method="post" action="add_priz">	
  <table>
    <tr>
      <td width="674" rowspan="15">&nbsp;</td>
      <td width="110">项目名称：</td>
      <td width="179"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
      <td>获奖类型：</td>
      <td><label>
        <input name="type" type="text" id="type" />
      </label></td>
    </tr>
    <tr>
      <td>获奖等级：</td>
      <td><label>
    <select name="level" id="level" style="width:173px"> 
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
        <input name="time" type="text" id="time" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员1：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员2：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员3：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员4：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员5：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员6：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员7：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员8：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员9：</td>
      <td><label>
        <input name="person" type="text" id="person" />
      </label></td>
    </tr>
    <tr>
      <td>获奖人员10：</td>
      <td><label>
        <input name="person" type="text" id="person" />
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
