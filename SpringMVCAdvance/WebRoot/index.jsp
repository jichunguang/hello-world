<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  <table>
  	<form action="login">
  	
  	<tr><td>�û���<input name=username /></td></tr>
  	<tr><td>��&nbsp;&nbsp;��<input name=pwd /></td></tr>
  	<tr><td><input type = "submit" value="ȷ��"></td></tr>  	
  	
  	
  	</form>
  	<tr><td><a href="jsp/add.jsp">ע��</a></td></tr>
 </table>   
  </body>
</html>
