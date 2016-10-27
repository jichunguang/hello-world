<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

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
	
	function checkUsername(){
			var classfullname = document.getElementById("classfullname").value;
			
			$.ajax({
				type:'post',
				url:"<%=path%>/classInfo/checkUsername?classInfo.classfullname="+classfullname,
				success:function (data){
				
					if(data==1){
					
						document.getElementById("exixtMsgId").innerHTML="<font color ='red'>班级全名重复</font>";
						document.getElementById("exixtMsgId").style.display="block";
						
								document.getElementById("classfullname").focus();
					} else {
						document.getElementById("exixtMsgId").style.display="none";
					}
				}, 
			    error:function(){
			      	alert("error");
			    }  
			});
		}
	function checkEasyname(){
			
			var classeasyname = document.getElementById("classeasyname").value;
			
			$.ajax({
				type:'post',
				url:"<%=path%>/classInfo/checkEasyName?classInfo.classeasyname="+classeasyname,
				success:function (data){
				
					if(data==1){
					
						document.getElementById("exixtMsgId").innerHTML="<font color ='red'>班级简称重复</font>";
						document.getElementById("exixtMsgId").style.display="block";
						
								document.getElementById("classeasyname").focus();
					} else {
						document.getElementById("exixtMsgId").style.display="none";
					}
				}, 
			    error:function(){
			      	alert("error");
			    }  
			});
		}
		
	function NotNUllCheck(){
	var classfullname = document.getElementById("classfullname").value;
	var classeasyname = document.getElementById("classeasyname").value;
	if(classfullname==""){
		
		document.getElementById("exixtMsgId").innerHTML="<font color ='red'>班级全称不能为空</font>";
						document.getElementById("exixtMsgId").style.display="block";
						return false;
	}
	if(classeasyname==""){
		
		document.getElementById("exixtMsgId").innerHTML="<font color ='red'>班级简称不能为空</font>";
						document.getElementById("exixtMsgId").style.display="block";
						return false;
	}
	
	 
var startclass = document.getElementById("startclass").value;

var endclass = document.getElementById("endclass").value;




var objRegExp =/^\d{4}(\-|\/|\.)\d{1,2}\1\d{1,2}$/


	if(!objRegExp.test(startclass)) {
	document.getElementById("exixtMsgId").innerHTML="<font color ='red'>开班日期格式不对</font>";
						document.getElementById("exixtMsgId").style.display="block";
		
			return false;  
	}
	
	if(!objRegExp.test(endclass)) {
	document.getElementById("exixtMsgId").innerHTML="<font color ='red'>闭班日期格式不对</font>";
						document.getElementById("exixtMsgId").style.display="block";
		
			return false;  
	}
	
	}
		
		
	
	
	/* 	$(document).ready(function(){
		
		alert("11");
		//alert($(#seft :checked="checked));
			
		
		
		
		
		}); */
	
	
	</script>
	
	<style type="text/css">
	
	#first{

width: 100%;
height:100%;
background: url(C:\Documents and Settings\Administrator\桌面\我要查看的项目\SpringMVCAdvance\WebRoot\img\add.jpg) center top no-repeat;
margin:0 inherit;
overflow:hidden
}
	
	
	</style>
	
	
  </head>
  
  <body>
  <div id="first">
  <div style="margin-left: 1040;margin-top: 130;color: green">${Tbuser.username}</div>
 
  	<div style="margin-left:175;margin-top:100"><table align="center" >
  	
    <form action="<%=path %>/classInfo/createClass"  method="post" onsubmit="return NotNUllCheck()">
    	
    
    	
    	
    	
  		
    	<tr>
    	
    	<td>班级全名<input type="text" id="classfullname" name=classInfo.classfullname onblur="checkUsername()">
    		
    	</td>
    	</tr>
    	<tr>
    	<td>班级简称<input type="text" id="classeasyname" name=classInfo.classeasyname onblur="checkEasyname()"></td>
    	</tr>
    	<tr>
    	<td>班级类型<input id=seft type="radio"  name=classInfo.classnature  value="1" checked="checked">个体班
    				<input id=government type="radio"  name=classInfo.classnature  value="2">政府班</td>
    	</tr>
    	<tr>
    	<td >开班时间<input type="text" id="startclass" name=classInfo.startclass >请输入格式YYYY-MM-DD</td>
    	</tr>
    	<tr>
    	<td>闭班时间<input  type="text"  id="endclass" name=classInfo.endclass >请输入格式YYYY-MM-DD</td>
    	</tr>
    <tr><td><input type="submit" value="提交"></td></tr>
    </form>
    
 </table>
  <div id="exixtMsgId" style="margin-left: 651;margin-top: -160">
    		</div>
 </div>
  </div>
  </body>
</html>
