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
<div id="banner1"><h1 align="center"><br>添加专利信息</h1>

<p align="center">&nbsp;</p></div>
<form id="form1" name="form1" method="post" action="add_patent">	
  <table >
    <tr>
      <td width="230">著作权名称：</td>
      <td width="250"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    <tr>
      <td width="230">专利名称：</td>
      <td width="250"><label>
        <input name="name" type="text" id="name" />
      </label></td>
    </tr>
    <tr>
      <td>专利编号：</td>
      <td><label>
        <input name="number" type="text" id="number" />
      </label></td>
    </tr>
    <tr>
      <td>专利权人：</td>
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
      <td>专利类型：</td>
      <td><label>
        <select name="type" id="type" style="width:173px">
          <option value="国际发明专利授权">国际发明专利授权</option>
          <option value="国内发明专利授权">国内发明专利授权</option>
          <option value="其它专利授权">其它专利授权</option>
        </select>
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
