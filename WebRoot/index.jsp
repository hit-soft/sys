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
    
    <title>My JSP 'failure.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>

	
<script language="JavaScript">
var mmenus = new Array();
var misShow = new Boolean(); 
misShow=false;
var misdown = new Boolean();
misdown=false;
var mnumberofsub=0;
var musestatus=false;
var mpopTimer = 0;
mmenucolor='#89CB10';mfontcolor='MenuText';mmenuoutcolor='#ADEF34';mmenuincolor='#B5E74E';mmenuoutbordercolor='#ECFA3A';mmenuinbordercolor='#5A2614';mmidoutcolor='#A9DA1D';mmidincolor='#799310';mmenuovercolor='#004080';mitemedge='0';msubedge='1';mmenuunitwidth=66;mmenuitemwidth=140;mmenuheight=25;mmenuwidth='100%';mmenuadjust=0;mmenuadjustV=0;mfonts='font-family: 宋体; font-size: 9pt; color: MenuText; ';mcursor='hand';
var swipeSteps = 4;
var swipemsec = 25;
var swipeArray = new Array();
function swipe(el, dir, steps, msec) {
if (steps == null) steps = swipeSteps;
if (msec == null) msec = swipemsec;
if (el.swipeIndex == null)
el.swipeIndex = swipeArray.length;
if (el.swipeTimer != null)
window.clearTimeout(el.swipeTimer);
swipeArray[el.swipeIndex] = el;
el.style.clip = "rect(-99999, 99999, 99999, -99999)";
if (el.swipeCounter == null || el.swipeCounter == 0) {
el.orgLeft = el.offsetLeft;
el.orgTop = el.offsetTop;
el.orgWidth = el.offsetWidth;
el.orgHeight = el.offsetHeight;
}
el.swipeCounter = steps;
el.style.clip = "rect(0,0,0,0)";
window.setTimeout("repeat(" + dir + "," + el.swipeIndex + "," + steps + "," + msec + ")", msec);
}
function repeat(dir, index, steps, msec) {
el = swipeArray[index];
var left = el.orgLeft;
var top = el.orgTop;
var width = el.orgWidth;
var height = el.orgHeight;
if (el.swipeCounter == 0) {
el.style.clip = "rect(-99999, 99999, 99999, -99999)";
return;
}
else {
el.swipeCounter--;
el.style.visibility = "visible";
switch (dir) {
case 2:
el.style.clip = "rect(" + height*el.swipeCounter/steps + "," + width + "," + height + "," + 0 + ")";
el.style.top = top - height*el.swipeCounter/steps;
break;
case 8:
el.style.clip = "rect(" + 0 + "," + width + "," + height*(steps-el.swipeCounter)/steps + "," + 0 + ")";
el.style.top = top + height*el.swipeCounter/steps;
break;
case 6:
el.style.clip = "rect(" + 0 + "," + width + "," + height + "," + width*(el.swipeCounter)/steps + ")";
el.style.left = left - width*el.swipeCounter/steps;
break;
case 4:
el.style.clip = "rect(" + 0 + "," + width*(swipeSteps - el.swipeCounter)/steps + "," + height + "," + 0 + ")";
el.style.left = left + width*el.swipeCounter/steps;
break;
}

el.swipeTimer = window.setTimeout("repeat(" + dir + "," + index + "," + steps + "," + msec + ")", msec);
}
}
var mtmpleft="";
var mtmptop="";
function hideSwipe(el) {
window.clearTimeout(el.swipeTimer);
el.style.visibility = "hidden";
el.style.clip = "rect(-99999, 99999, 99999, -99999)";
el.swipeCounter = 0;
if(mtmpleft!="")el.style.left = mtmpleft;
if(mtmptop!="")el.style.top = mtmptop;
}

function stoperror(){
return true;
}
window.onerror=stoperror;
function mpopOut() {
mpopTimer = setTimeout('mallhide()', 500);
}
function getReal(el, type, value) {
temp = el;
while ((temp != null) && (temp.tagName != "BODY")) {
if (eval("temp." + type) == value) {
el = temp;
return el;
}
temp = temp.parentElement;
}
return el;
}


function mMenuRegister(menu) 
{
mmenus[mmenus.length] = menu;
return (mmenus.length - 1);
}

function mMenuItem(caption,command,target,isline,statustxt,level,img,sizex,sizey,pos){
this.items = new Array();
this.caption=caption;
this.command=command;
this.target=target;
this.isline=isline;
this.statustxt=statustxt;
if(level!=null){mnumberofsub++;
this.hasc=mnumberofsub;}
this.level=level;
this.img=img;
this.sizex=sizex;
this.sizey=sizey;
this.pos=pos;
}

function mMenu(caption,command,target,img,sizex,sizey,pos){
this.items = new Array();
this.caption=caption;
this.command=command;
this.target=target;
this.img=img;
this.sizex=sizex;
this.sizey=sizey;
this.pos=pos;
this.id=mMenuRegister(this);
}
function mMenuAddItem(item)
{
this.items[this.items.length] = item;
item.parent = this.id;
this.children=true;
}

mMenu.prototype.addItem = mMenuAddItem;
mMenuItem.prototype.addsubItem = mMenuAddItem;

function mtoout(src){

src.style.borderLeftColor=mmenuoutbordercolor;
src.style.borderRightColor=mmenuinbordercolor;
src.style.borderTopColor=mmenuoutbordercolor;
src.style.borderBottomColor=mmenuinbordercolor;
src.style.backgroundColor=mmenuoutcolor;
src.style.color=mmenuovercolor;
}
function mtoin(src){

src.style.borderLeftColor=mmenuinbordercolor;
src.style.borderRightColor=mmenuoutbordercolor;
src.style.borderTopColor=mmenuinbordercolor;
src.style.borderBottomColor=mmenuoutbordercolor;
src.style.backgroundColor=mmenuincolor;
src.style.color=mmenuovercolor;
}
function mnochange(src){
src.style.borderLeftColor=mmenucolor;
src.style.borderRightColor=mmenucolor;
src.style.borderTopColor=mmenucolor;
src.style.borderBottomColor=mmenucolor;
src.style.backgroundColor='';
src.style.color=mfontcolor;

}
function mallhide(){
for(var nummenu=0;nummenu<mmenus.length;nummenu++){
var themenu=document.all['mMenu'+nummenu];
var themenudiv=document.all['mmenudiv'+nummenu];
mnochange(themenu);
mmenuhide(themenudiv);
}
for(nummenu=1;nummenu<=mnumberofsub;nummenu++){ 
var thesub=document.all['msubmenudiv'+nummenu];
msubmenuhide(thesub);
mnochange(document.all['mp'+nummenu]);
document.all["mitem"+nummenu].style.color=mfontcolor;
}
}
function mmenuhide(menuid){
menuid.style.filter='Alpha(Opacity=100)';
hideSwipe(menuid);
misShow=false;
}
function msubmenuhide(menuid){
menuid.style.filter='Alpha(Opacity=100)';
menuid.style.visibility='hidden';
}
function mmenushow(menuid,pid){
menuid.style.filter='Alpha(Opacity=80)';
menuid.style.left=mposflag.offsetLeft+pid.offsetLeft+mmenuadjust;menuid.style.top=mposflag.offsetTop+mmenutable.offsetHeight+mmenuadjustV;
if(mmenuitemwidth+parseInt(menuid.style.left)>document.body.clientWidth+document.body.scrollLeft)
menuid.style.left=document.body.clientWidth+document.body.scrollLeft-mmenuitemwidth;
mtmpleft=menuid.style.left;mtmptop=menuid.style.top;swipe(menuid,2,4);
misShow=true;
}
function mshowsubmenu(menuid,pid,rid){
menuid.style.filter='Alpha(Opacity=80)';
menuid.style.left=pid.offsetWidth+rid.offsetLeft;
menuid.style.top=pid.offsetTop+rid.offsetTop-3;
if(mmenuitemwidth+parseInt(menuid.style.left)>document.body.clientWidth+document.body.scrollLeft)
menuid.style.left=document.body.clientWidth+document.body.scrollLeft-mmenuitemwidth;
menuid.style.visibility='visible';
}
function mmenu_over(menuid,x){
toel = getReal(window.event.toElement, "className", "coolButton");
fromel = getReal(window.event.fromElement, "className", "coolButton");
if (toel == fromel) return;
if(x<0){
misShow = false;
mallhide();
mtoout(eval("mMenu"+x));
}else{

mallhide();
mtoin(eval("mMenu"+x));
mmenushow(menuid,eval("mMenu"+x));

}
clearTimeout(mpopTimer);
}
function mmenu_out(x){
toel = getReal(window.event.toElement, "className", "coolButton");
fromel = getReal(window.event.fromElement, "className", "coolButton");
if (toel == fromel) return;
if (misShow){
mtoin(eval("mMenu"+x));
}else{
mnochange(eval("mMenu"+x));
}
mpopOut();
}
function mmenu_down(menuid,x){
if(misShow){
mmenuhide(menuid);
mtoout(eval("mMenu"+x));
}
else{
mtoin(eval("mMenu"+x));
mmenushow(menuid,eval("mMenu"+x));
misdown=true;
}
}
function mmenu_up(){
misdown=false;
}
function mmenuitem_over(menuid,item,x,j,i){
toel = getReal(window.event.toElement, "className", "coolButton");
fromel = getReal(window.event.fromElement, "className", "coolButton");
if (toel == fromel) return;
srcel = getReal(window.event.srcElement, "className", "coolButton");
for(nummenu=1;nummenu<=mnumberofsub;nummenu++){ 
var thesub=document.all['msubmenudiv'+nummenu] ;
if(!(menuid==thesub||menuid.style.tag>=thesub.style.tag)){
msubmenuhide(thesub);
mnochange(document.all['mp'+nummenu]);
document.all["mitem"+nummenu].style.color=mfontcolor;
}
}
if(item)document.all["mitem"+item].style.color=mmenuovercolor;
if(misdown||item){
mtoin(srcel);
}
else{
mtoout(srcel);
}
if(x==-1)mthestatus=eval("msub"+j).items[i].statustxt;
if(j==-1)mthestatus=mmenus[x].items[i].statustxt;
if(mthestatus!=""){
musestatus=true;
window.status=mthestatus;
}
clearTimeout(mpopTimer);
}
function mmenuitem_out(hassub){
toel = getReal(window.event.toElement, "className", "coolButton");
fromel = getReal(window.event.fromElement, "className", "coolButton");
if (toel == fromel) return;
srcel = getReal(window.event.srcElement, "className", "coolButton");
if(!hassub)mnochange(srcel);
if(musestatus)window.status="";
mpopOut();
}
function mmenuitem_down(){
srcel = getReal(window.event.srcElement, "className", "coolButton");
mtoin(srcel);
misdown=true;
}
function mmenuitem_up(){
srcel = getReal(window.event.srcElement, "className", "coolButton");
mtoout(srcel);
misdown=false;
}
function mexec3(j,i){
var cmd;
if(eval("msub"+j).items[i].target=="blank"){
cmd = "window.open('"+eval("msub"+j).items[i].command+"')";
}else{
cmd = eval("msub"+j).items[i].target+".location=\""+eval("msub"+j).items[i].command+"\"";
}
eval(cmd);
}
function mexec2(x){
var cmd;
if(mmenus[x].target=="blank"){
cmd = "window.open('"+mmenus[x].command+"')";
}else{
cmd = mmenus[x].target+".location=\""+mmenus[x].command+"\"";
}
eval(cmd);
}
function mexec(x,i){
var cmd;
if(mmenus[x].items[i].target=="blank"){
cmd = "window.open('"+mmenus[x].items[i].command+"')";
}else{
cmd = mmenus[x].items[i].target+".location=\""+mmenus[x].items[i].command+"\"";
}
eval(cmd);
}
function mbody_click(){

if (misShow){
srcel = getReal(window.event.srcElement, "className", "coolButton");
for(var x=0;x<=mmenus.length;x++){
if(srcel.id=="mMenu"+x)
return;
}
for(x=1;x<=mnumberofsub;x++){
if(srcel.id=="mp"+x)
return;
}
mallhide();
}
}
document.onclick=mbody_click;

function mwritetodocument(){
var mwb=1;
var stringx='<div id="mposflag" style="position:absolute;"></div><table id=mmenutable border=0 cellpadding=3 cellspacing=2 width='+mmenuwidth+' height='+mmenuheight+' bgcolor='+mmenucolor+
' onselectstart="event.returnValue=false"'+
' style="filter:Alpha(Opacity=80);cursor:'+mcursor+';'+mfonts+
' border-left: '+mwb+'px solid '+mmenuoutbordercolor+';'+
' border-right: '+mwb+'px solid '+mmenuinbordercolor+'; '+
'border-top: '+mwb+'px solid '+mmenuoutbordercolor+'; '+
'border-bottom: '+mwb+'px solid '+mmenuinbordercolor+'; padding:0px"><tr>' ;
for(var x=0;x<mmenus.length;x++){
var thismenu=mmenus[x];
var imgsize="";
if(thismenu.sizex!="0"||thismenu.sizey!="0")imgsize=" width="+thismenu.sizex+" height="+thismenu.sizey;
var ifspace="";
if(thismenu.caption!="")ifspace=" ";
stringx += "<td nowrap class=coolButton id=mMenu"+x+" style='border: "+mitemedge+"px solid "+mmenucolor+
"' width="+mmenuunitwidth+"px onmouseover=mmenu_over(mmenudiv"+x+
","+x+") onmouseout=mmenu_out("+x+
") onmousedown=mmenu_down(mmenudiv"+x+","+x+")";
if(thismenu.command!=""){
stringx += " onmouseup=mmenu_up();mexec2("+x+");";
}else{
stringx += " onmouseup=mmenu_up()";
}
if(thismenu.pos=="0"){
stringx += " align=center><img align=absmiddle src='"+thismenu.img+"'"+imgsize+">"+ifspace+thismenu.caption+"</td>"; 
}else if(thismenu.pos=="1"){
stringx += " align=center>"+thismenu.caption+ifspace+"<img align=absmiddle src='"+thismenu.img+"'"+imgsize+"></td>"; 
}else if(thismenu.pos=="2"){
stringx += " align=center background='"+thismenu.img+"'> "+thismenu.caption+" </td>"; 
}else{
stringx += " align=center> "+thismenu.caption+" </td>";
}
stringx += "";
}
stringx+="<td width=*> </td></tr></table>";


for(var x=0;x<mmenus.length;x++){
thismenu=mmenus[x];
if(x<0){
stringx+='<div id=mmenudiv'+x+' style="visiable:none"></div>';
}else{
stringx+='<div id=mmenudiv'+x+
' style="filter:Alpha(Opacity=80);cursor:'+mcursor+';position:absolute;'+
'width:'+mmenuitemwidth+'px; z-index:'+(x+100);
if(mmenuinbordercolor!=mmenuoutbordercolor&&msubedge=="0"){
stringx+=';border-left: 1px solid '+mmidoutcolor+
';border-top: 1px solid '+mmidoutcolor;}
stringx+=';border-right: 1px solid '+mmenuinbordercolor+
';border-bottom: 1px solid '+mmenuinbordercolor+';visibility:hidden" onselectstart="event.returnValue=false">\n'+
'<table width="100%" border="0" height="100%" align="center" cellpadding="0" cellspacing="2" '+
'style="'+mfonts+' border-left: 1px solid '+mmenuoutbordercolor;
if(mmenuinbordercolor!=mmenuoutbordercolor&&msubedge=="0"){
stringx+=';border-right: 1px solid '+mmidincolor+
';border-bottom: 1px solid '+mmidincolor;}
stringx+=';border-top: 1px solid '+mmenuoutbordercolor+
';padding: 4px" bgcolor='+mmenucolor+'>\n';
for(var i=0;i<thismenu.items.length;i++){
var thismenuitem=thismenu.items[i];
var imgsize="";
if(thismenuitem.sizex!="0"||thismenuitem.sizey!="0")imgsize=" width="+thismenuitem.sizex+" height="+thismenuitem.sizey;
var ifspace="";
if(thismenu.caption!="")ifspace=" ";
if(thismenuitem.hasc!=null){
stringx += "<tr><td id=mp"+thismenuitem.hasc+" class=coolButton style='border: "+mitemedge+"px solid "+mmenucolor+
"' width=100% onmouseout=mmenuitem_out(true) onmouseover=\"mmenuitem_over(mmenudiv"+x+
",'"+thismenuitem.hasc+"',"+x+",-1,"+i+");mshowsubmenu(msubmenudiv"+thismenuitem.hasc+",mp"+thismenuitem.hasc+",mmenudiv"+x+");\""+
"><table id=mitem"+thismenuitem.hasc+" cellspacing='0' cellpadding='0' border='0' width='100%' style='"+mfonts+"'><tr><td ";
if(thismenuitem.pos=="0"){
stringx += "><img align=absmiddle src='"+thismenuitem.img+"'"+imgsize+">"+ifspace+thismenuitem.caption+"</td><td"; 
}else if(thismenuitem.pos=="1"){
stringx += ">"+thismenuitem.caption+ifspace+"<img align=absmiddle src='"+thismenuitem.img+"'"+imgsize+"></td><td";
}else if(thismenuitem.pos=="2"){
stringx += "background='"+thismenuitem.img+"'>"+thismenuitem.caption+"</td><td background='"+thismenuitem.img+"'"; 
}else{
stringx += ">"+thismenuitem.caption+"</td><td";
}
stringx += " align=right width='1'><font face='Webdings' style='font-size: 6pt'>4</font></td></tr></table></td></tr>\n"; 
}else if(!thismenuitem.isline){
stringx += "<tr><td class=coolButton style='border: "+mitemedge+"px solid "+mmenucolor+
"' width=100% height=15px onmouseover=\"mmenuitem_over(mmenudiv"+x+
",false,"+x+",-1,"+i+");\" onmouseout=mmenuitem_out() onmousedown=mmenuitem_down() onmouseup=";
stringx += "mmenuitem_up();mexec("+x+","+i+"); ";
if(thismenuitem.pos=="0"){
stringx += "><img align=absmiddle src='"+thismenuitem.img+"'"+imgsize+">"+ifspace+thismenuitem.caption+"</td></tr>"; 
}else if(thismenuitem.pos=="1"){
stringx += ">"+thismenuitem.caption+ifspace+"<img align=absmiddle src='"+thismenuitem.img+"'"+imgsize+"></td></tr>"; 
}else if(thismenuitem.pos=="2"){
stringx += "background='"+thismenuitem.img+"'>"+thismenuitem.caption+"</td></tr>"; 
}else{
stringx += ">"+thismenuitem.caption+"</td></tr>";
}
}else{
stringx+='<tr><td height="1" background="/images/hr.gif" onmousemove="clearTimeout(mpopTimer);"><img height="1" width="1" src="none.gif" border="0"></td></tr>\n';
}
}stringx+='</table>\n</div>';
}
}

for(var j=1;j<=mnumberofsub;j++){ 
thisitem=eval("msub"+j);
stringx+='<div id=msubmenudiv'+j+
' style="filter:Alpha(Opacity=80);tag:'+thisitem.level+';cursor:'+mcursor+';position:absolute;'+
'width:'+mmenuitemwidth+'px; z-index:'+(j+200);
if(mmenuinbordercolor!=mmenuoutbordercolor&&msubedge=="0"){
stringx+=';border-left: 1px solid '+mmidoutcolor+
';border-top: 1px solid '+mmidoutcolor;}
stringx+=';border-right: 1px solid '+mmenuinbordercolor+
';border-bottom: 1px solid '+mmenuinbordercolor+';visibility:hidden" onselectstart="event.returnValue=false">\n'+
'<table width="100%" border="0" height="100%" align="center" cellpadding="0" cellspacing="2" '+
'style="'+mfonts+' border-left: 1px solid '+mmenuoutbordercolor;
if(mmenuinbordercolor!=mmenuoutbordercolor&&msubedge=="0"){
stringx+=';border-right: 1px solid '+mmidincolor+
';border-bottom: 1px solid '+mmidincolor;}
stringx+=';border-top: 1px solid '+mmenuoutbordercolor+
';padding: 4px" bgcolor='+mmenucolor+'>\n';
for(var i=0;i<thisitem.items.length;i++){
var thismenuitem=thisitem.items[i];
var imgsize="";
if(thismenuitem.sizex!="0"||thismenuitem.sizey!="0")imgsize=" width="+thismenuitem.sizex+" height="+thismenuitem.sizey;
var ifspace="";
if(thismenu.caption!="")ifspace=" ";
if(thismenuitem.hasc!=null){
stringx += "<tr><td id=mp"+thismenuitem.hasc+" class=coolButton style='border: "+mitemedge+"px solid "+mmenucolor+
"' width=100% onmouseout=mmenuitem_out(true) onmouseover=\"mmenuitem_over(msubmenudiv"+j+
",'"+thismenuitem.hasc+"',-1,"+j+","+i+");mshowsubmenu(msubmenudiv"+thismenuitem.hasc+",mp"+thismenuitem.hasc+",msubmenudiv"+j+");\""+
"><table id=mitem"+thismenuitem.hasc+" cellspacing='0' cellpadding='0' border='0' width='100%' style='"+mfonts+"'><tr><td ";
if(thismenuitem.pos=="0"){
stringx += "><img align=absmiddle src='"+thismenuitem.img+"'"+imgsize+">"+ifspace+thismenuitem.caption+"</td><td"; 
}else if(thismenuitem.pos=="1"){
stringx += ">"+thismenuitem.caption+ifspace+"<img align=absmiddle src='"+thismenuitem.img+"'"+imgsize+"></td><td";
}else if(thismenuitem.pos=="2"){
stringx += "background='"+thismenuitem.img+"'>"+thismenuitem.caption+"</td><td background='"+thismenuitem.img+"'"; 
}else{
stringx += ">"+thismenuitem.caption+"</td><td";
}
stringx += " align=right width='1'><font face='Webdings' style='font-size: 6pt'>4</font></td></tr></table></td></tr>\n"; 
}else if(!thismenuitem.isline){
stringx += "<tr><td class=coolButton style='border: "+mitemedge+"px solid "+mmenucolor+
"' width=100% height=15px onmouseover=\"mmenuitem_over(msubmenudiv"+j+
",false,-1,"+j+","+i+");\" onmouseout=mmenuitem_out() onmousedown=mmenuitem_down() onmouseup=";
stringx += "mmenuitem_up();mexec3("+j+","+i+"); ";
if(thismenuitem.pos=="0"){
stringx += "><img align=absmiddle src='"+thismenuitem.img+"'"+imgsize+">"+ifspace+thismenuitem.caption+"</td></tr>"; 
}else if(thismenuitem.pos=="1"){
stringx += ">"+thismenuitem.caption+ifspace+"<img align=absmiddle src='"+thismenuitem.img+"'"+imgsize+"></td></tr>"; 
}else if(thismenuitem.pos=="2"){
stringx += "background='"+thismenuitem.img+"'>"+thismenuitem.caption+"</td></tr>"; 
}else{
stringx += ">"+thismenuitem.caption+"</td></tr>";
}
}else{
stringx+='<tr><td height="1" background="/images/hr.gif" onmousemove="clearTimeout(mpopTimer);"><img height="1" width="1" src="none.gif" border="0"></td></tr>\n';
}
}
stringx+='</table>\n</div>';
}
document.write("<div align='center' id='JsMenuCSS'>"+stringx+"</div>");
}


mpmenu1=new mMenu('科研经费管理','/','self','','','','');
mpmenu1.addItem(new mMenuItem(' 添加科研经费信息','http://hua-pc:8080/my_wlh/add_funds.jsp','self',false,'用户注册',null,'','','',''));
mpmenu1.addItem(new mMenuItem(' 更新科研经费信息','http://hua-pc:8080/my_wlh/query_funds.action','self',false,'用户登录',null,'','','',''));

mpmenu2=new mMenu('科研项目验收管理','/','self','','','','');
mpmenu2.addItem(new mMenuItem(' 添加科研项目验收信息','http://hua-pc:8080/my_wlh/add_accept.jsp','self',false,'用户注册',null,'','','',''));
mpmenu2.addItem(new mMenuItem(' 更新科研项目验收信息','http://hua-pc:8080/my_wlh/query_accept.action','self',false,'用户登录',null,'','','',''));


mpmenu3=new mMenu('软件著作权管理','/SoftSchool/','self','','','','');
mpmenu3.addItem(new mMenuItem(' 添加软件著作权','http://hua-pc:8080/my_wlh/add_software.jsp','self',false,'软件瞭望',null,'','','',''));
mpmenu3.addItem(new mMenuItem(' 更新软件著作权','http://hua-pc:8080/my_wlh/query_software.action','self',false,'精文荟萃',null,'','','',''));

mpmenu4=new mMenu(' 专利管理','/Develop/','self','','','','');
mpmenu4.addItem(new mMenuItem(' 添加专利','http://hua-pc:8080/my_wlh/add_patent.jsp','self',false,'网页设计',null,'','','',''));
mpmenu4.addItem(new mMenuItem(' 更新专利','http://hua-pc:8080/my_wlh/query_patent.action','self',false,'.Net专栏',null,'','','',''));

mpmenu5=new mMenu('获奖情况管理','/Lunwen/','self','','','','');
mpmenu5.addItem(new mMenuItem(' 增加获奖情况','http://hua-pc:8080/my_wlh/add_priz.jsp','self',false,'学科教学',null,'','','',''));
mpmenu5.addItem(new mMenuItem(' 更新获奖情况','http://hua-pc:8080/my_wlh/query_priz.action','self',false,'教学管理',null,'','','',''));


mpmenu6=new mMenu('出版专著管理','/bbs/','self','','','','');
mpmenu6.addItem(new mMenuItem(' 增加出版专著','http://hua-pc:8080/my_wlh/add_publ.jsp','self',false,'用户短消息',null,'','','',''));
mpmenu6.addItem(new mMenuItem(' 修改出版专著','http://hua-pc:8080/my_wlh/query_publ.action','self',false,'',null,'','','',''));


mpmenu7=new mMenu('学术团体兼职情况管理','','self','','','','');
mpmenu7.addItem(new mMenuItem(' 增加学术团体兼职情况','http://hua-pc:8080/my_wlh/add_team.jsp','self',false,'e 时代银行',null,'','','',''));
mpmenu7.addItem(new mMenuItem(' 修改学术团体兼职情况','http://hua-pc:8080/my_wlh/query_team.action','self',false,'赛马',null,'','','',''));

mpmenu8=new mMenu('国内外进修及学习管理','/iimy/','self','','','','');
mpmenu8.addItem(new mMenuItem(' 增加国内外进修及学习信息','http://hua-pc:8080/my_wlh/add_study.jsp','self',false,'历史知识',null,'','','',''));
mpmenu8.addItem(new mMenuItem(' 修改国内外进修及学习信息','http://hua-pc:8080/my_wlh/query_study.action','self',false,'电脑知识',null,'','','',''));

mpmenu9=new mMenu('国际合作情况管理','','self','','','','');
mpmenu9.addItem(new mMenuItem(' 增加国际合作情况信息','http://hua-pc:8080/my_wlh/add_coope.jsp','self',false,'',null,'','','',''));
mpmenu9.addItem(new mMenuItem(' 修改国际合作情况信息','http://hua-pc:8080/my_wlh/query_coope.action','self',false,'',null,'','','',''));

mpmenu10=new mMenu('其他系统功能','','self','','','','');
mpmenu10.addItem(new mMenuItem(' 工作量综合分析','http://hua-pc:8080/my_wlh/getyear.jsp','self',false,'互联网工具',null,'','','',''));
mpmenu10.addItem(new mMenuItem(' 导出到excel','http://hua-pc:8080/my_wlh/action4.action','self',false,'常用工具',null,'','','',''));



mwritetodocument();
</script>





  </body>
</html>
