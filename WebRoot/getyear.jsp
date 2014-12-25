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
   
	
</head>

<body>
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
<table width="571" border="0" align="center">
  <tr>
    <td width="159" height="82">&nbsp;</td>
    <td width="252">&nbsp;</td>
    <td width="159">&nbsp;</td>
  </tr>
  <tr>
    <td height="314">&nbsp;</td>
    <td><form id="form1" name="form1" method="post" action="getyear">
      <table width="254" height="80" border="1" align="center">
        <tr align="center" >
          <td width="120">时间</td>
          <td width="116"><select name="year" onchange="changeDate()">
    </select>
              年 
       </nobr></td>
            <script language="javascript" type="text/javascript">
   		writeYears(document.forms[0].year, now)
		document.forms[0].year.selectedIndex = 0
		writeDate(document.forms[0].date, now.getYear(), now.getMonth()+1)
		document.forms[0].date.selectedIndex = now.getDate()-1
 	</script></td>
        </tr>
        <tr >
          <td align="center" valign="middle"><input type="submit" name="Submit" value="提交" /></td>
          <td align="center"><input type="reset" name="Submit2" value="重置" /></td>
        </tr>
      </table>
    </form></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="97">&nbsp;</td>
    <td height="50" align="center"><h4><a href ="concract.jsp">联系我们</a>        <a href="index.jsp" >返回系统首页
    </a></h4></td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>
