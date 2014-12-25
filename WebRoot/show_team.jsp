<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <title>My JSP 'show_by_author.jsp' starting page</title>
    <link href="style2.css" rel="stylesheet" type="text/css" />
    
	</head>
<SCRIPT LANGUAGE="JavaScript">
	function goTo()
	{
		if(confirm("确认要跳转么?"))
		{
			history.go(-2)
		}
	}
	
	function goTo1()
	{
		if(confirm("确认要跳转么?"))
		{
			history.go(-1)
		}
	}
	
 </SCRIPT>

<body>
<table width="1049" height="620" border="0" align="center" cellpadding="5" cellspacing="5" id = table1>
  <tr>
    <td height="38" colspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td width="51" height="477" nowrap="nowrap">&nbsp;</td>
    <td width="939" nowrap="nowrap"><table width="1545" border="1" align="center">
      <tr id =tr1>
        <td colspan="18">学术团体信息</td>
        </tr>
      <tr id =tr2 >
        <td width="104" nowrap="nowrap">学术团体名称</td>
        <td width="113" nowrap="nowrap">担任职务</td>
        <td width="97" nowrap="nowrap">任职开始时间</td>
        <td width="96" nowrap="nowrap">任职结束时间</td>
        <td width="90" nowrap="nowrap">兼职人员姓名</td>
        <td width="90" nowrap="nowrap">职务类型</td>
        <td width="16" nowrap="nowrap">年份</td>
        <td width="22" nowrap="nowrap">操作1</td>
        <td width="22" nowrap="nowrap">操作2</td>
        </tr>
<s:iterator value="l9"> <!-- l 为action 中 list -->
      <tr id =tr3>
        <td nowrap="nowrap">${name}</td>
        <td nowrap="nowrap">${post}</td>
        <td nowrap="nowrap">${start}</td>
        <td nowrap="nowrap">${end}</td>
        <td nowrap="nowrap">${person}</td>
        <td nowrap="nowrap">${type}</td>
        <td nowrap="nowrap">${year}</td>
        <td>
        <s:url id="editURL" action="del_team">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="year" value="%{year}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
		
        <td><s:url id="editURL" action="upp_team">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="post" value="%{post}"></s:param>
		<s:param name="start" value="%{start}"></s:param>
		<s:param name="end" value="%{end}"></s:param>
		<s:param name="person" value="%{person}"></s:param>
		<s:param name="type" value="%{type}"></s:param>
		<s:param name="year" value="%{year}"></s:param>
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
        </tr>
</s:iterator>
    </table></td>
    <td width="9" nowrap="nowrap">&nbsp;</td>
  </tr>
  <tr>
    <td height="50" colspan="3" align="center"><h4><a href ="add_induct.jsp">填写规则</a>|<a href ="concract.jsp">联系我们</a>|<a href="javascript:goTo1()">
  	返回查询${person}其他项目工作</a>|<a href="javascript:goTo()">返回查询其他人员总分</a>|<a href="index.jsp" >返回系统首页
    </a></h4></td>
  </tr>
  <tr>
    <td height="23" colspan="3">&nbsp;</td>
  </tr>
</table>
</body>
</html>
