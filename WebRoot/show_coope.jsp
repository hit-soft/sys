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
        <td colspan="18">国际合作情况</td>
        </tr>
      <tr id =tr2 >
        <td width="104" nowrap="nowrap">类别</td>
        <td width="113" nowrap="nowrap">来访人员名单</td>
        <td width="97" nowrap="nowrap">人数</td>
        <td width="96" nowrap="nowrap">开始时间</td>
        <td width="90" nowrap="nowrap">结束时间</td>
        <td width="55" nowrap="nowrap">来访地</td>
        <td width="37" nowrap="nowrap">访问目的</td>
        <td width="73" nowrap="nowrap">报告名称</td>
        <td width="17" nowrap="nowrap">邀请人</td>
        <td width="16" nowrap="nowrap">年份</td>
        <td width="22" nowrap="nowrap">操作1</td>
        <td width="22" nowrap="nowrap">操作2</td>
        </tr>
<s:iterator value="l2"> <!-- l 为action 中 list -->
      <tr id =tr3>
        <td nowrap="nowrap">${type}</td>
        <td nowrap="nowrap">${in_pe}</td>
        <td nowrap="nowrap">${num}</td>
        <td nowrap="nowrap">${start}</td>
        <td nowrap="nowrap">${end}</td>
        <td nowrap="nowrap">${in_pl}</td>
        <td nowrap="nowrap">${goal}</td>
        <td nowrap="nowrap">${name}</td>
        <td nowrap="nowrap">${invi_by}</td>
        <td nowrap="nowrap">${year}</td>
        <td nowrap="nowrap"><s:url id="editURL" action="del_coope">
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="invi_by" value="%{invi_by}"></s:param>
		<s:param name="year" value="%{year}"></s:param>
		</s:url>
		<s:a href="%{editURL}">删除</s:a></td>
		
        <td><s:url id="editURL" action="upp_coope">
		<s:param name="type" value="%{type}"></s:param>
		<s:param name="in_pe" value="%{in_pe}"></s:param>
		<s:param name="num" value="%{num}"></s:param>
		<s:param name="start" value="%{start}"></s:param>
		<s:param name="end" value="%{end}"></s:param>
		<s:param name="in_pl" value="%{in_pl}"></s:param>
		<s:param name="goal" value="%{goal}"></s:param>
		<s:param name="name" value="%{name}"></s:param>
		<s:param name="invi_by" value="%{invi_by}"></s:param>
		<s:param name="year" value="%{year}"></s:param>
		</s:url>
		<s:a href="%{editURL}">更新</s:a></td>
       
</s:iterator>
    </table></td>
    <td width="9" nowrap="nowrap">&nbsp;</td>
  </tr>
  <tr>
    <td height="50" colspan="3" align="center"><h4><a href ="add_induct.jsp">填写规则</a>|<a href ="concract.jsp">联系我们</a>|<a href="javascript:goTo1()">
  	返回查询其他${in_by}项目工作</a>|<a href="javascript:goTo()">返回查询其他人员总分</a>|<a href="index.jsp" >返回系统首页
    </a></h4></td>
  </tr>
  <tr>
    <td height="23" colspan="3">&nbsp;</td>
  </tr>
</table>
</body>
</html>
