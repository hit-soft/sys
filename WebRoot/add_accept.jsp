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
<<<<<<< HEAD
	<script>
	now = new Date()
	function writeYears(obj, date)
	{
	var years = date.getYear()+10
	for (var i=2000; i<3000; i++){
		var opt = document.createElement("option")
		opt.text = opt.value = i
		obj.add(opt)
	}
	}
	</script>
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
<div id="banner1"><h1 align="center"><br>添加科研项目验收信息</h1>

<p align="center">&nbsp;</p></div>
<form id="form1" name="form1" method="post" action="add_accept">	
  <table >
    <tr>
      <td width="198">项目名称：</td>
      <td width="293"><label>
        <input name="name" type="text" id="name" size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目来源：</td>
      <td><label>
        <input name="source" type="text" id="source"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目负责人：</td>
      <td><label>
        <input name="person" type="text" id="person"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>开始时间：</td>
      <td><label>
        <input name="start" type="text" id="start"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>结束时间：</td>
      <td><label>
        <input name="end" type="text" id="end"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>合同额：</td>
      <td><label>
        <input name="contract" type="text" id="contract"  size="32"/>
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
        <div align="right"></div>
      </label></td>
    </tr>

	<tr>
	  <td>验收时间：</td>
      <td><label>
        <input name="time" type="text" id="time"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>验收单位：</td>
      <td><label>
        <input name="org" type="text" id="org"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>课题合同号：</td>
      <td><label>
        <input name="number" type="text" id="number"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>经费卡号：</td>
      <td><label>
        <input name="card" type="text" id="card"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目人员1：</td>
      <td><label>
        <input name="person" type="text" id="person"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目人员2：</td>
      <td><label>
        <input name="person" type="text" id="person"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目人员3：</td>
      <td><label>
        <input name="person" type="text" id="person"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目人员4：</td>
      <td><label>
        <input name="person" type="text" id="person"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>项目人员5：</td>
      <td><label>
        <input name="person" type="text" id="person"  size="32"/>
      </label></td>
    </tr>
    <tr>
      <td>备注：</td>
      <td><label>
        <input name="remark" type="text" id="remark"  size="32"/>
      </label></td>
    </tr>
<<<<<<< HEAD
   	
   	
   	
   	时间：
    <select name="year" onchange="changeDate()">
    </select>
              年 
       </nobr></td>
            <script language="javascript" type="text/javascript">
   		writeYears(document.forms[0].year, now)
		document.forms[0].year.selectedIndex = 0
		writeDate(document.forms[0].date, now.getYear(), now.getMonth()+1)
		document.forms[0].date.selectedIndex = now.getDate()-1
 	</script>
   	
   	
   	
   	
=======
   
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
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
