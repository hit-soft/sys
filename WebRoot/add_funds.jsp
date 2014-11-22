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
<div id="banner1"><h1 align="center"><br>添加科研经费信息</h1>
<p align="center">&nbsp;</p></div>
<form id="form1" name="form1" method="post" action="add_funds">	
  <table>
  <tr>
    <td width="624" rowspan="27">请在右侧添加科研项目经费到款情况，请从人员1开始按照先后顺序填写人员名单，最多只能填写5人，若不足5人则不需填写剩余作者栏。</td>
    <td width="200">项目名称：</td>
    <td width="245"><label>
        <input name="name" type="text" id="name" size="32"/>
      </label></td>
  </tr>
  
  <tr>
    <td>项目来源：</td>
    <td><label>
        <input name="person" type="text" id="person" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>项目负责人：</td>
    <td width="245"><label>
        <input name="person" type="text" id="person" size="32" />
      </label></td>
  </tr>
  <tr>
    <td>开始时间：</td>
    <td><label>
        <input name="start" type="text" id="start" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>结束时间：</td>
    <td><label>
        <input name="end" type="text" id="end" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>合同额：</td>
    <td><label>
        <input name="contract" type="text" id="contract" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>当年已到款：</td>
    <td><label>
        <input name="already" type="text" id="already" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>未到款：</td>
    <td><label>
        <input name="non" type="text" id="non" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>课题合同号：</td>
    <td><label>
        <input name="number" type="text" id="number" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>人员1：</td>
    <td><label>
        <input name="person" type="text" id="person" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>人员2：</td>
    <td><label>
        <input name="person" type="text" id="person" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>人员3：</td>
    <td><label>
        <input name="person" type="text" id="person" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>人员4</td>
    <td><label>
        <input name="person" type="text" id="person" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>人员5：</td>
    <td><label>
        <input name="person" type="text" id="person" size="32"/>
      </label></td>
  </tr>
  <tr>
    <td>项目类型：</td>
    <td><label>
      <select name="type" id="type">
        <option value="国家973项目">国家973项目</option>
        <option value="国家科技重大专项">国家科技重大专项</option>
        <option value="国家自然科学基金	重大/重点">国家自然科学基金	重大/重点</option>
        <option value="国家自然科学基金	面上">国家自然科学基金	面上</option>
        <option value="863项目、国家科技支撑项目	重大/重点">863项目、国家科技支撑项目	重大/重点</option>
        <option value="863项目、国家科技支撑项目	863面上">863项目、国家科技支撑项目	863面上</option>
        <option value="部委重大/重点项目">部委重大/重点项目</option>
        <option value="国防类及其它部委项目">国防类及其它部委项目</option>
        <option value="国际合作项目">国际合作项目</option>
        <option value="其它科研项目">其它科研项目</option>
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
