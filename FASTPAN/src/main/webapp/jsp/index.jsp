<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		
  </head>
  
  <body>
  
  <c:forEach var="list" items="${list}">
  		<tr>
  			<td>${list.id}</td>
  			<td>${list.name}</td>
  		
  		</tr>
  
  </c:forEach>
  <form action="test3">
  	<tr>
  			<td><input type="text" name="id" ></td>
  			<td><input type="text" name="name" ></td>
  			<td><input type="submit" value="提交" ></td>
  		</tr>
  	</form>	
  hhhhh!!${test.id},,${test.name}
  </body>
</html>
