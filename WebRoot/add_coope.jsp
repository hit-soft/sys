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
=======
<<<<<<< HEAD
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
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
<<<<<<< HEAD
=======
=======

>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
<div id="banner1">&nbsp;<h1 align="center">添加国际合作情况信息</h1>
</div>
<form id="form1" name="form1" method="post" action="add_coope">	
  <table >
    <tr>
      <td width="692" rowspan="13">&nbsp;</td>
      <tr>
      <tr>
      <td width="110">类别：</td>
      <td width="179"><label>
        <input name="type" type="text" id="type" />
      </label></td>
    </tr>

    <tr>
      <td>来访人员名单：</td>
      <td><label>
        <input name="in_pe" type="text" id="in_pe" />
      </label></td>
    </tr>
    <tr>
      <td>人数：</td>
      <td><label>
        <input name="num" type="text" id="num" />
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
      <td>来访地：</td>
      <td><label>
        <input name="in_pl" type="text" id="in_pl" />
      </label></td>
    </tr>
    <tr>
      <td>访问目的：</td>
      <td><label>
        <input name="goal" type="text" id="goal" />
      </label></td>
    </tr>
    <tr>
      <td>报告名称：</td>
      <td><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
    <tr>
      <td>邀请人：</td>
      <td><label>
        <input name="invi_by" type="text" id="invi_by" />
      </label></td>
    </tr>
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
    
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
 	
 	
<<<<<<< HEAD
=======
=======
>>>>>>> 5995d5dce10e02545e1585ab4da3133cde9cb8be
>>>>>>> a45f2dc9aa1fdb9dee81d45388fc1bba9677a378
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
