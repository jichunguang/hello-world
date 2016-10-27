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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="<%=path %>/js/jquery-1.9.1.min.js"></script>


<script type="text/javascript">
/* $(document).ready(function(){


	


}); */
 


</script>

<style type="text/css">
#first{

width: 100%;
height:100%;

background: url(C:\Documents and Settings\Administrator\桌面\我要查看的项目\SpringMVCAdvance\WebRoot\img\neuQuery.JPG) center top no-repeat;
margin:0 inherit;
overflow:hidden
}

#query{
	margin-left: 350;margin-top: 127

}

#table{ 
	margin-top:-15px;

}
#page{
	font-size: 20px;
	font-weight: 800;

}
#add{
	margin-top: -22;
	margin-left: 455;
	color: green;
	font-size:18;
}
#other{
	font-size: 20px;
	font-weight: 800;
	margin-left: 790;
}



</style>


  </head>
  
  <body>
  <div id="first">
  
  	<div id="query"><form action="<%=path %>/classInfo/queryClassFullName" method="post">
  		<input type="text" name=classInfo.classfullname >
  		<input type="submit"  value="查询">
  <div id="add">	<a href="jsp/add.jsp" style="font-size: 20 ;font-weight: 900">添加班级</a>
    		&nbsp;&nbsp;&nbsp;&nbsp;
    		&nbsp;&nbsp;&nbsp;&nbsp;
    		&nbsp;&nbsp;&nbsp;&nbsp;
    		&nbsp;&nbsp;&nbsp;&nbsp;
    		&nbsp;&nbsp;&nbsp;&nbsp;
    		&nbsp;&nbsp;&nbsp;&nbsp;
    		 ${Tbuser.username}</div>
  	</form>
  	
  	
  	
  	</div>
  	
  	
  	
    <div id="table"><table border="3" align="center" width="71%" >
    
    	
    	
    	<tr >
    		<th>编号</th>
    		<th>操作人</th>
    		<th>创建日期</th>
    		<th>班级全名</th>
    		<th>班级简称</th>
    		<th>班级类型</th>
    		<th>开班时间</th>
    		<th>闭班时间</th>
    		<th>班级状态</th>
    		<th>删除</th>
    		<th>修改</th>
    	</tr>
    	
    	<c:forEach var="classInfo"  items="${list}">
    	<tr>
    	
    	<td>${classInfo.id}</td>
    	<td>${classInfo.cid}</td>
    	<td>${classInfo.createdata}</td>
    	<td>${classInfo.classfullname}</td>
    	<td>${classInfo.classeasyname}</td>
    	<td>${classInfo.classnaturename}</td>
    	<td>${classInfo.startclass}</td>
    	<td>${classInfo.endclass}</td>
    	<td>${classInfo.statename}</td>
    	<td><a href="removeClassInfo?id=${classInfo.id}">删除</a></td>
    	<td><a href="modifyClassInfoById?id=${classInfo.id}">修改</a></td>
    	</tr>
    	
    
    </c:forEach>
    
    </table>
    </div>
    
    <div id="page">
    <center>
    
    <c:if test="${pageIndex>0}">
    	<a href="<%=path %>/classInfo/queryAllUsedInfoPage?pageIndex=0">首页</a>
    	<a href="<%=path %>/classInfo/queryAllUsedInfoPage?pageIndex=${pageIndex-1}">上一页</a>
    </c:if>	
     <c:if test="${pageIndex<totalPage-1}">
    	<a href="<%=path %>/classInfo/queryAllUsedInfoPage?pageIndex=${pageIndex+1}">下一页</a>
    	<a href="<%=path %>/classInfo/queryAllUsedInfoPage?pageIndex=${totalPage-1}">尾页</a>
    </c:if>	
    
    </center>
    </div>
    	
    <div id="other">
    	
    	<a href="queryAllInfo" >查询全部数据</a>&nbsp;&nbsp;
    	<a href="queryAllUsedInfo" >查询可用数据</a>&nbsp;&nbsp;
    	<a style="color:red" href="<%=path %>/jsp/login.jsp">返回登录页面</a>
    
    </div>
    
 
  </div>
  </body>
</html>
