<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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

		<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js">
</script>
		<script type="text/javascript">

/*	window.onload=function(){


var seft = document.getElementById("seft")
var government = document.getElementById("government")




alert("checked")


}
 */

//ajax 判断全名是否为可用值
function checkFullname() {
	var classfullname = document.getElementById("classfullname").value;

	document.getElementById("exixtMsgId").style.display = "none";
if("${classInfo.classfullname }"!=classfullname){
	
	
	$.ajax({
				type:'post',
				url:"<%=path%>/classInfo/checkUsername?classInfo.classfullname="+classfullname,
				success:function (data){
				
					if(data==1){
					
						document.getElementById("exixtMsgId").innerHTML="<font color ='red'>请输入一个新的班级全名或者不更换班级全名</font>";
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
		}
	//ajax 判断简称是否为可用值
	function checkEasyname(){
			var classeasyname = document.getElementById("classeasyname").value;
	
	document.getElementById("exixtMsgId").style.display="none";
	if("${classInfo.classeasyname}"!=classeasyname){
	
	
	$.ajax({
				type:'post',
				url:"<%=path%>/classInfo/checkEasyName?classInfo.classeasyname="+classeasyname,
				success:function (data){
				
					if(data==1){
					
						document.getElementById("exixtMsgId").innerHTML="<font color ='red'>请输入一个新的班级简称或者不更换班级简称</font>";
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
		}  
	
	
	
	
	
	
		//单选按钮判断，赋予初始化
		

	
	
		$(document).ready(function(){
		
		/*alert("${classInfo.classnature}");*/
		
		if("${classInfo.classnature}"==1){
		//alert("${classInfo.classnature}");
			$("#seft").attr("checked",true)
		}
		if("${classInfo.classnature}"==2){
			$("#government").attr("checked",true)
		}
		//alert($(#seft :checked="checked));
			
		if("${classInfo.state}"==1){
		
			$("#no").attr("checked",true)
		}
		if("${classInfo.state}"==2){
			$("#yes").attr("checked",true)
		}
		
		
		
		});
		
		
		
		
		//非空和日期格式检查
		
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
		
	
	
	</script>
<style type="text/css">

#first{

width: 100%;
height:100%;
background: url(C:\Documents and Settings\Administrator\桌面\我要查看的项目\SpringMVCAdvance\WebRoot\img\modify.jpg) center top no-repeat;
margin:0 auto;


}

</style>
	</head>

	<body>
		<div id="first">
		
		<div style="margin-left: 1000;margin-top: 125;color: green">${Tbuser.username}</div>
		<div style="margin-top: 100;margin-left: 150;"><table align="center"  >

			<form action="<%=path%>/classInfo/modifyClassInfo" method="post"
				onsubmit="return NotNUllCheck()">
				<caption>
					
				</caption>




				<tr>
					<input type="hidden" name=classInfo.id value="${classInfo.id }">
					<td>
						班级全名
						<input type="text" id="classfullname" name=classInfo.classfullname
							value="${classInfo.classfullname }" onblur="checkFullname()">
						

					</td>
				</tr>
				<tr>
					<td>
						班级简称
						<input type="text" id="classeasyname" name=classInfo.classeasyname
							value="${classInfo.classeasyname }" onblur="checkEasyname()">
					</td>
				</tr>
				<tr>
					<td>
						班级类型
						<input id=seft type="radio" name=classInfo.classnature value="1">
						个体班
						<input id=government type="radio" name=classInfo.classnature
							value="2">
						政府班
					</td>
				</tr>
				<td>
					班级状态
					<input id=no type="radio" name=classInfo.state value="1">
					有效 &nbsp;&nbsp;&nbsp;
					<input id=yes type="radio" name=classInfo.state value="2">
					无效
				</td>
				</tr>
				<tr>
					<td>
						开班时间
						<input type="text" id="startclass" name=classInfo.startclass
							value="${classInfo.startclass}">
						请输入格式YY-MM-DD
					</td>
				</tr>
				<tr>
					<td>
						闭班时间
						<input type="text" id="endclass" name=classInfo.endclass
							value="${classInfo.endclass }">
						请输入格式YY-MM-DD
					</td>
				</tr>
				<tr>
					<td>
						<div style="margin-left: 110"><input type="submit" value="提交"></div>
					</td>
				</tr>
			</form>

		</table>
		 <div id="exixtMsgId" style="margin-left: 655;margin-top: -184">
    		</div>
		</div>
	</div>
	</body>
</html>
