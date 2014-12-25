<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html >
<head>
<title>无标题文档</title>
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
    <td width="913"><form id="form1" name="form1" method="post" action="add_publ">
      <table width="937" height="399" border="0" 

align="center" cellpadding="2" cellspacing="0" id="table2" >
      <tr>
        <td height="40" colspan="3" align="left" id ="td1"><h2>欢迎来到出版专著管理界面</h2></td>
        </tr>
      <tr>
        <td width="159" height="42">专著名称：</td>
        <td width="301" height="42"><input name="name" type="text" id="textfield1" size = "32"/></td>
        <td width="465" rowspan="9"><label for="end"><img src="add1.jpg" width="450" height="378" /></label></td>
        </tr>
      <tr>
        <td height="42">出版社名称：</td>
        <td height="42"><input name="press" type="text" id="textfield1" size="32" /></td>
        </tr>
      <tr>
        <td height="42">出版时间：</td>
        <td height="42"><input name="time" type="text" id="textfield1" size="32"/></td>
        </tr>
      <tr>
        <td height="42">著者1：</td>
        <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">著者2：</td>
         <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">著者3：</td>
        <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">著者4：</td>
        <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">著者5：</td>
         <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">出版类型：</td>
         <td height="42"><select name="type" id="select1" style="width:173px">
          <option value="外文版专著">外文版专著</option>
          <option value="中文版专著">中文版专著</option>
          <option value="译著">译著</option>
        </select></td>
        </tr>
      <tr>
        <td height="42">时间：</td>
        <td height="42"><select name="year" onchange="changeDate()">
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
