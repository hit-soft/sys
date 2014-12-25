<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<head>
    <base href="<%=basePath%>">
	<link href="style3.css" rel="stylesheet" type="text/css" />
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
<table width="1049" height="586" border="0" align="center" cellpadding="5" cellspacing="5" id = table1>
  <tr>
    <td height="38" colspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td width="74" height="443">&nbsp;</td>
    <td width="913"><form id="form1" name="form1" method="post" action="update_coope">
      <table width="937" height="399" border="0" 

align="center" cellpadding="2" cellspacing="0" id="table2" >
      <tr>
        <td height="40" colspan="3" align="left" id ="td1"><h2>欢迎来到国际合作管理界面</h2></td>
        </tr>
      <tr>
        <td width="159" height="42"> 类别：</td>
        <td width="301" height="42"><input name="type" type="text" id="textfield1" size = "32" value="${type}"/></td>
        <td width="465" rowspan="9"><label for="end"><img src="add1.jpg" width="450" height="378" /></label></td>
        </tr>
      <tr>
        <td height="42">来访人员名单：</td>
        <td height="42"><input name="in_pe" type="text" id="textfield1" size="32" value="${in_pe}"/></td>
        </tr>
      <tr>
        <td height="42">人数：</td>
        <td height="42"><input name="num" type="text" id="textfield1" size="32" value="${num}"/></td>
        </tr>
      <tr>
        <td height="42">开始时间：</td>
        <td height="42"><input name="start" type="text" id="textfield1" size="32" value="${start}"/></td>
        </tr>
      <tr>
        <td height="42">结束时间：</td>
        <td height="42"><input name="end" type="text" id="textfield1" size="32" value="${end}"/></td>
        </tr>
      <tr>
        <td height="42">来访地：</td>
        <td height="42"><input name="in_pl" type="text" id="textfield1"  size="32" value="${in_pl}"/></td>
        </tr>
      <tr>
        <td height="42">访问目的：</td>
        <td height="42"><input name="goal"  type="text" id="textfield1" size="32" value="${goal}"/></td>
        </tr>
      <tr>
        <td height="42">报告名称：</td>
        <td height="42"><input name="name" type="text" id="textfield1"  size="32" value="${name}" readonly/></td>
        </tr>
      <tr>
        <td height="42">邀请人：</td>
         <td height="42"><input name="invi_by"  type="text" id="textfield1"  size="32" value="${invi_by}" readonly/></td>
        </tr>
      
      <tr>
        <td height="42">年份：</td>
        <td height="42"><input name="year"  type="text" id="textfield1"  size="32" value="${year}"  readonly/></td>
        </tr>
      <tr>
        <td height="42">&nbsp;</td>
        <td height="42"><input type="submit" name="button3" id="button1" value="提交" />          <input type="reset" name="button2" id="button1" value="重置" /></td>
      </tr>
      </table>
    </form></td>
    <td width="12">&nbsp;</td>
  </tr>
  <tr>
    <td height="50" colspan="3" align="center"><h4><a href ="add_induct.jsp">填写规则</a>|<a href ="concract.jsp">联系我们</a>|<a href="index.jsp" >返回系统首页
    </a></h4></td>
  </tr>
  <tr>
    <td height="23" colspan="3">&nbsp;</td>
  </tr>
</table>
</body>
</html>
