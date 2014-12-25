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
    <td width="913"><form id="form1" name="form1" method="post" action="add_accept">
      <table width="937" height="399" border="0" 

align="center" cellpadding="2" cellspacing="0" id="table2" >
      <tr>
        <td height="40" colspan="3" align="left" id ="td1"><h2>欢迎来到科研项目管理界面</h2></td>
        </tr>
      <tr>
        <td width="159" height="42"> 项目名称：</td>
        <td width="301" height="42"><input name="name" type="text" id="textfield1" size="32" /></td>
        <td width="465" rowspan="9"><label for="end"><img src="add1.jpg" width="450" height="378" /></label></td>
        </tr>
      <tr>
        <td height="42">项目来源：</td>
        <td height="42"><input name="source" type="text" id="textfield1" size="32" /></td>
        </tr>
      <tr>
        <td height="42">项目负责人：</td>
        <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">开始时间：</td>
        <td height="42"><input name="start" type="text" id="textfield1" size="32" /></td>
        </tr>
      <tr>
        <td height="42">结束时间：</td>
        <td height="42"><input name="end" type="text" id="textfield1" size="32" /></td>
        </tr>
      <tr>
        <td height="42">合同额(万元)：</td>
        <td height="42"><input name="contract" type="text" id="textfield1" size="32" /></td>
        </tr>
      <tr>
      <tr>
        <td height="42">验收时间：</td>
        <td height="42"><input name="time" type="text" id="textfield1" size="32" /></td>
        </tr>
      <tr>
        <td height="42">验收单位：</td>
        <td height="42"><input name="org" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">课题合同号：</td>
        <td height="42"><input name="number" type="text" id="textfield1" size="32" /></td>
        </tr>
      <tr>
        <td height="42">经费卡号：</td>
        <td height="42"><input name="card" type="text" id="textfield1" size="32" /></td>
        </tr>
      <tr>
        <td height="42">备注：</td>
        <td height="42"><input name="remark" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">项目人员1：</td>
        <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">项目人员2：</td>
         <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">项目人员3：</td>
        <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">项目人员4：</td>
        <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      <tr>
        <td height="42">项目人员5：</td>
        <td height="42"><input name="person" type="text" id="textfield1"  size="32"/></td>
        </tr>
      
      <tr>
        <td height="42">项目类型:</td>
        <td height="42"><select name="type" id="type">
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
